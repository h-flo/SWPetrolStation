/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.othr.heid.swheidflotankstelle.service;

import de.othr.heid.swheidflotankstelle.entity.Fuel;
import de.othr.heid.swheidflotankstelle.entity.FuelTank;
import de.othr.heid.swheidflotankstelle.entity.OilCompany;
import de.othr.heid.swheidflotankstelle.entity.PSOrder;
import de.othr.heid.swheidflotankstelle.order.FuelDTO;
import de.othr.heid.swheidflotankstelle.order.OCfuel;
import de.othr.heid.swheidflotankstelle.order.OCorder;
import de.othr.heid.swheidflotankstelle.order.OrderDTO;
import de.othr.heid.swheidflotankstelle.order.OrderService;
import de.othr.heid.swheidflotankstelle.order.OrderService_Service;
import de.othr.heid.swheidflotankstelle.resources.Environment;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import javax.xml.ws.WebServiceRef;

/**
 *
 * @author Flo
 */
@RequestScoped
@WebService
public class FuelService {

    Environment environment = TestOrderService.environment;

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/im-lamport_8080/SWStelzer-0.3/OrderService.wsdl")
    private OrderService_Service orderService;

    @Inject
    private TestOrderService testOrderService;

    @Inject
    private CRMService crmService;

    @PersistenceContext(unitName = "swHeidPU")
    private EntityManager entityManager;

    private static final Long OWNID = 39L;
    private Random rnjesus = new Random();

    @Transactional
    @WebMethod(exclude = true)
    public List<Fuel> getAllFuels() {
        TypedQuery<Fuel> query = entityManager.createQuery("SELECT f FROM Fuel AS f", Fuel.class);
        List<Fuel> list = query.getResultList();
        return list;
    }

    @Transactional
    public Fuel addFuel(Fuel fuel) {
        entityManager.persist(fuel);
        return fuel;
    }

    @Transactional
    public void removeFuelById(long id) {
        Fuel f = entityManager.find(Fuel.class, id);
        f = entityManager.merge(f);
        entityManager.remove(f);
    }

    @Transactional
    public void removeFuel(Fuel f) {
        f = entityManager.merge(f);
        entityManager.remove(f);
    }

    @Transactional
    public void changeFuelPriceById(long Id, double price) {
        Fuel f = entityManager.find(Fuel.class, Id);
        f.setPrice(price);
        entityManager.merge(f);
    }

    @Transactional
    public void changeFuelPrice(Fuel newFuel) {
        entityManager.merge(newFuel);
    }

    @Transactional
    @WebMethod(exclude = true)
    public List<FuelTank> getAllFuelTanks() {
        TypedQuery<FuelTank> query = entityManager.createQuery("SELECT f FROM FuelTank AS f", FuelTank.class);
        List<FuelTank> list = query.getResultList();
        return list;
    }

    @Transactional
    public FuelTank getFuelTankById(long Id) {
        FuelTank f = entityManager.find(FuelTank.class, Id);
        return f;
    }

    @Transactional
    public FuelTank addFuelTank(FuelTank fuelTank) {
        entityManager.persist(fuelTank);
        return fuelTank;
    }

    @Transactional
    public FuelTank removeFuelTank(long id) {
        FuelTank f = entityManager.find(FuelTank.class, id);
        entityManager.remove(f);
        return f;
    }

    @Transactional
    public void orderFuel(long amount, String fuelType) {
        //Order Fuel von Tom

        try { // Call Web Service Operation
            OrderService port = orderService.getOrderServicePort();
            // TODO initialize WS operation arguments here
            OrderDTO arg0 = new OrderDTO();
            arg0.setAmount(amount);
            arg0.setFuelType(fuelType);
            arg0.setCustomerId(OWNID);
            OCorder result = null;
            //Distinguish modes
            if (environment.equals(Environment.PROD)) {
                result = port.createOrder(arg0);
            } else if (environment.equals(Environment.TEST)) {
                result = testOrderService.createOrder(arg0);
            }
            //Persistierung der eigenen Order
            PSOrder psorder = new PSOrder();
            psorder.setOrderPrice(result.getOrderPrice());
            psorder.setAmount(result.getAmount());
            Fuel fuel = this.getFuelByType(fuelType);
            entityManager.persist(fuel);
            psorder.setFuel(fuel);
            OilCompany oilCompany = crmService.getOilCompanyById(19l);
            entityManager.persist(oilCompany);
            psorder.setOilCompany(oilCompany);
            psorder.setOilCompanyOrderId(result.getTransportId());
            psorder.setOrderDate(new Date());
            entityManager.persist(psorder);
        } catch (Exception ex) {
            throw new RuntimeException("Could not order fuel", ex);
        }
    }

    @Transactional
    public void refuel(long tankId, double amount) {
        FuelTank f = entityManager.find(FuelTank.class, tankId);
        double filling = f.getFillLevel();
        Long orderAmount = ThreadLocalRandom.current().nextLong(2000, 3000);
        if ((filling >= 1500.00) && ((filling - amount) < 1500.00)) {
            //Ordering Fuel if Fill level goes beyond 1500 Liters
            this.orderFuel(orderAmount, f.getFuel().getFueltype());
        } else if ((filling - amount) < 0) {
            return;
        } else {
            orderAmount = 0L; //Für Testfall
        }
        filling -= amount;
        filling = (double) Math.round(filling * 100) / 100;
        //f.setFillLevel(filling);
        //Zu Testzwecken: Auffüllen des Tanks solange Josef in Uganda chillt
        f.setFillLevel(filling + (double) (Math.round(orderAmount * 100) / 100));
        entityManager.merge(f);
        //System.out.println("" + amount + " Liter " + f.getFuel().getFueltype() + " getankt. ");
    }

    @Transactional
    public void updatePrices(String fuelType) {

        try { // Call Web Service Operation
            OrderService port = orderService.getOrderServicePort();
            // TODO initialize WS operation arguments here
            FuelDTO arg0 = new FuelDTO();
            arg0.setFueltype(fuelType);
            OCfuel result = null;
            if (environment.equals(Environment.PROD)) {
                result = port.getFuelByDTO(arg0);
            } else if (environment.equals(Environment.TEST)) {
                result = testOrderService.getFuelByDTO(arg0);
            }

            //Getting and Persisting Prices
            Fuel fuel = this.getFuelByType(fuelType);
            fuel.setPrice((double) Math.round(result.getPrice() * 100)/100);
            entityManager.persist(fuel);
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
    }

    @Transactional
    public void fillUpTank(long tankId, double amount) {
        //Runden auf 2 Nachkommastellen
        amount = (double) Math.round(amount * 100) / 100;

        FuelTank f = entityManager.find(FuelTank.class, tankId);
        double filling = f.getFillLevel();
        filling += amount;
        f.setFillLevel(filling);
        entityManager.merge(f);
    }

    @Transactional
    public Fuel getFuelByType(String fuelType) {
        TypedQuery<Fuel> query = entityManager.createQuery("Select f from Fuel f Where f.fueltype = :param1", Fuel.class);
        query.setParameter("param1", fuelType);
        Fuel fuel = query.getSingleResult();
        return fuel;
    }

}

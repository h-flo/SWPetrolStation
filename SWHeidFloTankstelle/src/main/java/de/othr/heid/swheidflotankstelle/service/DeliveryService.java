/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.othr.heid.swheidflotankstelle.service;

import de.othr.heid.swheidflotankstelle.entity.DeliveryNote;
import de.othr.heid.swheidflotankstelle.entity.Fuel;
import de.othr.heid.swheidflotankstelle.entity.PSOrder;
import de.othr.heid.swheidflotankstelle.entity.ShippingCompany;
import java.util.Date;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

/**
 *
 * @author Flo
 */
@RequestScoped
@WebService
public class DeliveryService {

    @PersistenceContext(unitName = "swHeidPU")
    private EntityManager entityManager;

    @Inject
    FuelService fuelService;

    //ShippingCompany erstellt DeliveryNote mit fuelType, amount, ShippingCompanyId
    @Transactional
    public DeliveryNote createDeliveryNote(DeliveryNote note) {
        ShippingCompany sc = entityManager.find(ShippingCompany.class, note.getShippingCompany().getId());
        note.setShippingCompany(sc);
        Fuel fuel = fuelService.getFuelByType(note.getFuel().getFueltype());
        note.setFuel(fuel);
        note.setDeliveryDate(new Date());
        entityManager.persist(note);
        return note;
    }

    @Transactional
    @WebMethod(exclude = true)
    public List<DeliveryNote> getAllDeliveries() {
        TypedQuery<DeliveryNote> query = entityManager.createQuery("SELECT d FROM DeliveryNote AS d", DeliveryNote.class);
        List<DeliveryNote> list = query.getResultList();
        return list;
    }

    @Transactional
    @WebMethod(exclude = true)
    public List<PSOrder> getAllOrders() {
        TypedQuery<PSOrder> query = entityManager.createQuery("SELECT o FROM PSOrder AS o", PSOrder.class);
        List<PSOrder> list = query.getResultList();
        return list;
    }

    @Transactional
    public PSOrder addOrder(PSOrder order) {
        entityManager.persist(order);
        return order;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.othr.heid.swheidflotankstelle.service;

import de.othr.heid.swheidflotankstelle.entity.Fuel;
import de.othr.heid.swheidflotankstelle.entity.FuelTank;
import de.othr.heid.swheidflotankstelle.entity.Student;
import java.util.List;
import java.util.Random;
import javax.enterprise.context.RequestScoped;
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
public class FuelService {

    @PersistenceContext(unitName = "swHeidPU")
    private EntityManager entityManager;

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
    public void refuel(long fuelId, double amount) {

    }

    @Transactional
    public void fillUpTank(long tankId, double amount) {
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

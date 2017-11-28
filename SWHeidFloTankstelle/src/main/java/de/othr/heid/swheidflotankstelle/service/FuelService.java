/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.othr.heid.swheidflotankstelle.service;

import de.othr.heid.swheidflotankstelle.entity.Fuel;
import de.othr.heid.swheidflotankstelle.entity.FuelTank;
import de.othr.heid.swheidflotankstelle.entity.Student;
import java.util.Random;
import javax.enterprise.context.RequestScoped;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

/**
 *
 * @author Flo
 */

@RequestScoped
@WebService
public class FuelService {
    
    @PersistenceContext(unitName="swHeidPU")
    private EntityManager entityManager;
    
    private String updatePriceQuery = "Update Fuel SET Price = :param1 where Id = :param2";
    
    @Transactional
    public Fuel addFuel(Fuel fuel) {
        entityManager.persist(fuel);
        return fuel;
    }
    
    @Transactional
    public Fuel removeFuel(long id) {
        Fuel f = entityManager.find(Fuel.class, id);
        entityManager.remove(f);
        return f;
    }
    
    @Transactional
    public void changeFuelPrice(long id, double price) {
        Query query = entityManager.createQuery(updatePriceQuery);
        query.setParameter("param1", price).setParameter("param2", id).executeUpdate();
        
    }
    
    public FuelTank addFuelTank(FuelTank fuelTank) {
        //To Do: Fuel Tank methods
        return null;
    }
    
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.othr.heid.swheidflotankstelle.service;

import de.othr.heid.swheidflotankstelle.entity.DeliveryNote;
import de.othr.heid.swheidflotankstelle.entity.Fuel;
import de.othr.heid.swheidflotankstelle.entity.ShippingCompany;
import java.util.Date;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
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
     
    @PersistenceContext(unitName="swHeidPU")
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
    
    
}

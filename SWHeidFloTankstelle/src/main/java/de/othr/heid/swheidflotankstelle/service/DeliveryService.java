/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.othr.heid.swheidflotankstelle.service;

import de.othr.heid.swheidflotankstelle.entity.DeliveryNote;
import de.othr.heid.swheidflotankstelle.entity.Fuel;
import javax.enterprise.context.RequestScoped;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
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
    
    @Transactional
    public DeliveryNote createDeliveryNote(DeliveryNote note) {
        
        return note;
    }
    
    
}

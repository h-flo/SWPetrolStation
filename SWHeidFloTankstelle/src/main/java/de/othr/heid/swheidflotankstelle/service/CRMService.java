/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.othr.heid.swheidflotankstelle.service;

import de.othr.heid.swheidflotankstelle.entity.OilCompany;
import de.othr.heid.swheidflotankstelle.entity.ShippingCompany;
import java.util.Random;
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
public class CRMService {
    
    @PersistenceContext(unitName="swHeidPU")
    private EntityManager entityManager;
    
    
    @Transactional
    public OilCompany addOilCompany(OilCompany oc) {
        
        //Anwendungslogik
        
        
        //....
        
      return oc;  
    }
    
    @Transactional
    public ShippingCompany addShippingCompany(ShippingCompany sc) {
        
        //Anwendungslogik
        
        
        //....
        
      return sc;  
    }
    
    
    @Transactional
    public void deleteShippingCompany(long scId) {
        
        //Anwendungslogik
        
        
        //....
          
    }
    
    
    
    
}

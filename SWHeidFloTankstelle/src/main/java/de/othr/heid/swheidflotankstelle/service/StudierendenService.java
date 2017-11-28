/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.othr.heid.swheidflotankstelle.service;

import de.othr.heid.swheidflotankstelle.entity.Student;
import java.util.Random;
import javax.enterprise.context.RequestScoped;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@RequestScoped
@WebService
public class StudierendenService {
    
    //EntityManager schaut über unit name im persistance.xml nach richtigem Link zur data source
    @PersistenceContext(unitName="swHeidPU")
    private EntityManager entityManager;
    
    
    
    
    //Entity als Input&Output
    //Alle schreibaktionen müssen von Transaktionsmanager überwacht werden.
    @Transactional
    public Student immatrikulieren(Student neu) {
        
        //Anwendungslogik
        neu.setMatrikelNr(new Random().nextInt(9999999));
        
        //....
        
        System.out.println("MatrikelNummer Eingetragen");
        entityManager.persist(neu);
        System.out.println("In DB Geschrieben");
        return neu;
    }
}

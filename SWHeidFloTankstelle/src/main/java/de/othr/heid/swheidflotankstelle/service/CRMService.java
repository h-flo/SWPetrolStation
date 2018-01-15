/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.othr.heid.swheidflotankstelle.service;

import de.othr.heid.swheidflotankstelle.entity.OilCompany;
import de.othr.heid.swheidflotankstelle.entity.ShippingCompany;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.jws.WebMethod;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

/**
 *
 * @author Flo
 */
@RequestScoped
public class CRMService {

    @PersistenceContext(unitName = "swHeidPU")
    private EntityManager entityManager;

    @Transactional
    public OilCompany addOilCompany(OilCompany oc) {
        entityManager.persist(oc);
        return oc;
    }

    @Transactional
    public ShippingCompany addShippingCompany(ShippingCompany sc) {
        entityManager.persist(sc);
        return sc;
    }

    @Transactional
    public ShippingCompany alterShippingCompany(ShippingCompany newSC) {
        ShippingCompany oldSC = entityManager.find(ShippingCompany.class, newSC.getId());
        oldSC.setHouseNr(newSC.getHouseNr());
        oldSC.setName(newSC.getName());
        oldSC.setStreet(newSC.getStreet());
        oldSC.setZipCode(newSC.getZipCode());
        entityManager.merge(oldSC);
        return oldSC;
    }

    @Transactional
    public OilCompany alterOilCompany(OilCompany newOC) {
        OilCompany oldOC = entityManager.find(OilCompany.class, newOC.getId());
        oldOC.setHouseNr(newOC.getHouseNr());
        oldOC.setName(newOC.getName());
        oldOC.setStreet(newOC.getStreet());
        oldOC.setZipCode(newOC.getZipCode());
        entityManager.merge(oldOC);
        return oldOC;
    }

    @Transactional
    public void removeOilCompanyById(long ocId) {
        OilCompany oc = entityManager.find(OilCompany.class, ocId);
        oc = entityManager.merge(oc);
        entityManager.remove(oc);
    }

    @Transactional
    public void removeOilCompany(OilCompany oc) {
        oc = entityManager.merge(oc);
        entityManager.remove(oc);
    }

    @Transactional
    public void removeShippingCompanyById(long scId) {
        ShippingCompany sc = entityManager.find(ShippingCompany.class, scId);
        sc = entityManager.merge(sc);
        entityManager.remove(sc);
    }

    @Transactional
    public void removeShippingCompany(ShippingCompany sc) {
        sc = entityManager.merge(sc);
        entityManager.remove(sc);
    }

    @Transactional
    @WebMethod(exclude = true)
    public List<ShippingCompany> getAllShippingCompanies() {
        TypedQuery<ShippingCompany> query = entityManager.createQuery("SELECT s FROM ShippingCompany AS s", ShippingCompany.class);
        List<ShippingCompany> list = query.getResultList();
        return list;
    }

    @Transactional
    @WebMethod(exclude = true)
    public List<OilCompany> getAllOilCompanies() {
        TypedQuery<OilCompany> query = entityManager.createQuery("SELECT s FROM OilCompany AS s", OilCompany.class);
        List<OilCompany> list = query.getResultList();
        return list;
    }

    @Transactional
    @WebMethod(exclude = true)
    public ShippingCompany getShippingCompany(ShippingCompany sc) {
        return entityManager.find(ShippingCompany.class, sc.getId());
    }

    @Transactional
    @WebMethod(exclude = true)
    public OilCompany getOilCompany(OilCompany oc) {
        return entityManager.find(OilCompany.class, oc.getId());
    }

    @Transactional
    @WebMethod(exclude = true)
    public ShippingCompany getShippingCompanyById(long Id) {
        return entityManager.find(ShippingCompany.class, Id);
    }

    @Transactional
    @WebMethod(exclude = true)
    public OilCompany getOilCompanyById(long Id) {
        return entityManager.find(OilCompany.class, Id);
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.othr.heid.swheidflotankstelle.model;

import de.othr.heid.swheidflotankstelle.entity.DeliveryNote;
import de.othr.heid.swheidflotankstelle.entity.Fuel;
import de.othr.heid.swheidflotankstelle.entity.ShippingCompany;
import de.othr.heid.swheidflotankstelle.service.DeliveryService;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Flo
 */
@Named
@RequestScoped
public class deliveryModel implements Serializable {

    @Inject
    private DeliveryService deliveryService;
    
    private Fuel fuel;
    private ShippingCompany shippingCompany;
    private double amount;
    private Date deliveryDate;

    public List<DeliveryNote> getAllDeliveries() {
        return this.deliveryService.getAllDeliveries();
    }

    public void setFuel(Fuel fuel) {
        this.fuel = fuel;
    }

    public ShippingCompany getShippingCompany() {
        return shippingCompany;
    }

    public void setShippingCompany(ShippingCompany shippingCompany) {
        this.shippingCompany = shippingCompany;
    }

    public double getAmount() {
        return amount;
    }

    public Fuel getFuel() {
        return fuel;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }
 
    
    
    
}

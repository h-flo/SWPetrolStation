/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.othr.heid.swheidflotankstelle.model;

import de.othr.heid.swheidflotankstelle.entity.DeliveryNote;
import de.othr.heid.swheidflotankstelle.entity.Fuel;
import de.othr.heid.swheidflotankstelle.entity.PSOrder;
import de.othr.heid.swheidflotankstelle.entity.ShippingCompany;
import de.othr.heid.swheidflotankstelle.service.DeliveryService;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Flo
 */
@Named
@SessionScoped
public class deliveryModel implements Serializable {

    @Inject
    private DeliveryService deliveryService;
    
    private Fuel fuel;
    private ShippingCompany shippingCompany;
    private double amount;
    private Date deliveryDate;

    public Collection<DeliveryNote> getAllDeliveries() {
        return this.deliveryService.getAllDeliveries();
    }
    
    public Fuel getFuel() {
        return fuel;
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.othr.heid.swheidflotankstelle.entity;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

/**
 *
 * @author Flo
 */
@Entity
public class DeliveryNote extends SingleIdEntity{
    
    @ManyToOne
    private Fuel fuel;
    @ManyToOne
    private ShippingCompany shippingCompany;
    private double amount;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date deliveryDate;

    public DeliveryNote() {
    }

    
    public DeliveryNote(Fuel fuel, ShippingCompany shippingCompany, double amount, Date deliveryDate) {
        this.fuel = fuel;
        this.shippingCompany = shippingCompany;
        this.amount = amount;
        this.deliveryDate = deliveryDate;
    }

    public Fuel getFuel() {
        return fuel;
    }

    public ShippingCompany getShippingCompany() {
        return shippingCompany;
    }

    public double getAmount() {
        return amount;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setFuel(Fuel fuel) {
        this.fuel = fuel;
    }

    public void setShippingCompany(ShippingCompany shippingCompany) {
        this.shippingCompany = shippingCompany;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }
    
}

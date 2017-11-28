/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.othr.heid.swheidflotankstelle.entity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 *
 * @author Flo
 */
@Entity
public class Refueling extends SingleIdEntity{
    
    @ManyToOne
    private Fuel fuel;
    private double amount;
    private double pricePerLiter;
    private double sumPrice;

    public Refueling() {
    }

    public Refueling(Fuel fuel, double amount, double pricePerLiter, double sumPrice) {
        this.fuel = fuel;
        this.amount = amount;
        this.pricePerLiter = pricePerLiter;
        this.sumPrice = sumPrice;
    }

    public Fuel getFuel() {
        return fuel;
    }

    public double getAmount() {
        return amount;
    }

    public double getPricePerLiter() {
        return pricePerLiter;
    }

    public double getSumPrice() {
        return sumPrice;
    }

    public void setFuel(Fuel fuel) {
        this.fuel = fuel;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setPricePerLiter(double pricePerLiter) {
        this.pricePerLiter = pricePerLiter;
    }

    public void setSumPrice(double sumPrice) {
        this.sumPrice = sumPrice;
    }
    
}

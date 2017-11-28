/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.othr.heid.swheidflotankstelle.entity;

import java.io.Serializable;
import javax.persistence.Entity;

/**
 *
 * @author Flo
 */

@Entity
public class Fuel extends SingleIdEntity{
    
    private String fueltype;
    private double price;

    public String getFueltype() {
        return fueltype;
    }

    public double getPrice() {
        return price;
    }

    public void setFueltype(String fueltype) {
        this.fueltype = fueltype;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Fuel() {
    }

    public Fuel(String fueltype, double price) {
        this.fueltype = fueltype;
        this.price = price;
    }
    
    
    
}

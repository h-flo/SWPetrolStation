/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.othr.heid.swheidflotankstelle.entity;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

/**
 *
 * @author Flo
 */
@Entity
public class FuelTank extends SingleIdEntity {
    
    @OneToOne
    private Fuel fuel;
    private double fillLevel;

    public FuelTank() {
    }

    public FuelTank(Fuel fuel, double fillLevel) {
        this.fuel = fuel;
        this.fillLevel = fillLevel;
    }

    public Fuel getFuel() {
        return fuel;
    }

    public double getFillLevel() {
        return fillLevel;
    }

    public void setFuel(Fuel fuel) {
        this.fuel = fuel;
    }

    public void setFillLevel(double fillLevel) {
        this.fillLevel = fillLevel;
    }
    
    
    
    
}

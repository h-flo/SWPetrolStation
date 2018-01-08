/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.othr.heid.swheidflotankstelle.model;

import de.othr.heid.swheidflotankstelle.entity.Fuel;
import de.othr.heid.swheidflotankstelle.entity.FuelTank;
import de.othr.heid.swheidflotankstelle.service.FuelService;
import java.io.Serializable;
import java.util.Collection;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Flo
 */

@Named
@RequestScoped
public class fuelTankModel implements Serializable {

    @Inject
    private FuelService fuelService;
    
    private Fuel fuel;

    public Fuel getFuel() {
        return fuel;
    }

    public void setFuel(Fuel fuel) {
        this.fuel = fuel;
    }

    public double getFillLevel() {
        return fillLevel;
    }

    public void setFillLevel(double fillLevel) {
        this.fillLevel = fillLevel;
    }
    private double fillLevel;

    public Collection<FuelTank> getAllFuelTanks() {
        return this.fuelService.getAllFuelTanks();
    }
    
    
}

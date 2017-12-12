/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.othr.heid.swheidflotankstelle.model;

import de.othr.heid.swheidflotankstelle.entity.Fuel;
import de.othr.heid.swheidflotankstelle.service.FuelService;
import java.io.Serializable;
import java.util.Collection;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Flo
 */
@Named
@SessionScoped
public class fuelModel implements Serializable {

    @Inject
    private FuelService fuelService;

    private String fueltype;
    private double price;
    private double newPrice;

    private Fuel chosenFuel;

    public Collection<Fuel> getAllFuels() {
        return this.fuelService.getAllFuels();
    }

    public String changeFuelPrice() {
        chosenFuel.setPrice(newPrice);
        fuelService.changeFuelPrice(chosenFuel);
        resetFuelAttributes();
        return "ChangeFuel";
    }

    public String insertFuel() {
        Fuel fuel = new Fuel();
        fuel.setFueltype(fueltype);
        fuel.setPrice(price);
        fuelService.addFuel(fuel);
        resetFuelAttributes();
        return "AddFuel";
    }

    public String removeFuel() {
        fuelService.removeFuel(chosenFuel);
        return "RemoveFuel";
    }

    public void resetFuelAttributes() {
        this.fueltype = "";
        this.price = 0.0;
        this.newPrice = 0.0;
    }

    public String getFueltype() {
        return fueltype;
    }

    public void setFueltype(String fueltype) {
        this.fueltype = fueltype;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getNewPrice() {
        return newPrice;
    }

    public void setNewPrice(double newPrice) {
        this.newPrice = newPrice;
    }

    public Fuel getChosenFuel() {
        return chosenFuel;
    }

    public void setChosenFuel(Fuel chosenFuel) {
        this.chosenFuel = chosenFuel;
    }

}

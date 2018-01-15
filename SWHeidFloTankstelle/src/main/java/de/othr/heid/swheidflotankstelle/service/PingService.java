/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.othr.heid.swheidflotankstelle.service;

import de.othr.heid.swheidflotankstelle.entity.Fuel;
import de.othr.heid.swheidflotankstelle.entity.FuelTank;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import javax.ejb.Schedule;
import javax.ejb.Singleton;
import javax.inject.Inject;


/**
 *
 * @author Flo
 */

//Singleton, da 
@Singleton 
public class PingService {
    
    @Inject
    private FuelService fuelService;
    private List<FuelTank> tankList;
    private List<Fuel> fuelList;
    private int size;
    private Random rng = new Random();
    private int tankNr;

    public List<FuelTank> getTankList() {
        return tankList;
    }

    public void setTankList(List<FuelTank> tankList) {
        this.tankList = tankList;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public long getTankNr() {
        return tankNr;
    }

    public void setTankNr(int tankNr) {
        this.tankNr = tankNr;
    }

    @Schedule(second = "*/30", minute = "*", hour = "*", persistent = false)
    public void refuelPing() {
        tankList = fuelService.getAllFuelTanks();
        size = tankList.size();
        tankNr = rng.nextInt(size);
        FuelTank f = tankList.get(tankNr);
        double temp = ThreadLocalRandom.current().nextDouble(30.0, 60.0);    //Zwischen 5 und 10 Litern tanken
        temp = (double) Math.round(temp * 100)/100;     //Runden auf 2 Nachkommastellen
        fuelService.refuel(f.getId(), temp);
    }
    
    
    @Schedule(minute = "*/10", hour = "*", persistent = false)
    public void pricePing() {
        fuelList = fuelService.getAllFuels();
        for (Fuel f: fuelList) {
            fuelService.updatePrices(f.getFueltype());
        }   
    }
}


    

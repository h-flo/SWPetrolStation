/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.othr.heid.swheidflotankstelle.entity;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 *
 * @author Flo
 */
@Entity
public class PSOrder extends SingleIdEntity{
    
    private long oilCompanyOrderId;
    @ManyToOne
    private OilCompany oilCompany;
    @ManyToOne
    private Fuel fuel;
    private double amount;
    private double orderPrice;
    private Date orderDate;

    public PSOrder() {
    }

    public PSOrder(long oilCompanyOrderId, OilCompany oilCompany, Fuel fuel, double amount, double orderPrice, Date orderDate) {
        this.oilCompanyOrderId = oilCompanyOrderId;
        this.oilCompany = oilCompany;
        this.fuel = fuel;
        this.amount = amount;
        this.orderPrice = orderPrice;
        this.orderDate = orderDate;
    }

    public long getOilCompanyOrderId() {
        return oilCompanyOrderId;
    }

    public OilCompany getOilCompany() {
        return oilCompany;
    }

    public Fuel getFuel() {
        return fuel;
    }

    public double getAmount() {
        return amount;
    }

    public double getOrderPrice() {
        return orderPrice;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOilCompanyOrderId(long oilCompanyOrderId) {
        this.oilCompanyOrderId = oilCompanyOrderId;
    }

    public void setOilCompany(OilCompany oilCompany) {
        this.oilCompany = oilCompany;
    }

    public void setFuel(Fuel fuel) {
        this.fuel = fuel;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setOrderPrice(double orderPrice) {
        this.orderPrice = orderPrice;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
    
    
    
    
    
}

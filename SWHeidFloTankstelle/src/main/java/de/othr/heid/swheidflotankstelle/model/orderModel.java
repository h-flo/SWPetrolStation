/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.othr.heid.swheidflotankstelle.model;

import de.othr.heid.swheidflotankstelle.entity.Fuel;
import de.othr.heid.swheidflotankstelle.entity.OilCompany;
import de.othr.heid.swheidflotankstelle.entity.PSOrder;
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
public class orderModel implements Serializable {

    @Inject
    private DeliveryService deliveryService;
    
    private long oilCompanyOrderId;
    private OilCompany oilCompany;
    private Fuel fuel;
    private double amount;
    private double orderPrice;
    private Date orderDate;

    public Collection<PSOrder> getAllOrders() {
        return this.deliveryService.getAllOrders();
    }

    public long getOilCompanyOrderId() {
        return oilCompanyOrderId;
    }

    public void setOilCompanyOrderId(long oilCompanyOrderId) {
        this.oilCompanyOrderId = oilCompanyOrderId;
    }

    public OilCompany getOilCompany() {
        return oilCompany;
    }

    public void setOilCompany(OilCompany oilCompany) {
        this.oilCompany = oilCompany;
    }

    public Fuel getFuel() {
        return fuel;
    }

    public void setFuel(Fuel fuel) {
        this.fuel = fuel;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(double orderPrice) {
        this.orderPrice = orderPrice;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

}

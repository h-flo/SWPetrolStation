/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.othr.heid.swheidflotankstelle.entity;

import javax.persistence.Entity;

/**
 *
 * @author Flo
 */
@Entity
class OilCompany extends SingleIdEntity {
    
    private String name;
    private long zipCode;
    private String street;
    private String houseNr;

    public OilCompany() {
    }

    public OilCompany(String name, long zipCode, String street, String houseNr) {
        this.name = name;
        this.zipCode = zipCode;
        this.street = street;
        this.houseNr = houseNr;
    }

    public String getName() {
        return name;
    }

    public long getZipCode() {
        return zipCode;
    }

    public String getStreet() {
        return street;
    }

    public String getHouseNr() {
        return houseNr;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setZipCode(long zipCode) {
        this.zipCode = zipCode;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setHouseNr(String houseNr) {
        this.houseNr = houseNr;
    }
    
    
}
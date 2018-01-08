/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.othr.heid.swheidflotankstelle.model;

/**
 *
 * @author Flo
 */
import de.othr.heid.swheidflotankstelle.entity.ShippingCompany;
import de.othr.heid.swheidflotankstelle.service.CRMService;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class shippingCompModel implements Serializable {

    @Inject
    private CRMService crmService;

    private String name;
    private String description;
    private String zipCode;
    private String street;
    private String houseNr;

    private Map<ShippingCompany, Boolean> checked = new HashMap<>();

    public Collection<ShippingCompany> getAllShippingCompanies() {
        return this.crmService.getAllShippingCompanies();
    }

    public String removeShippingCompany() {
        for (Map.Entry<ShippingCompany, Boolean> entry : checked.entrySet()) {
            if (entry.getValue()) {
                crmService.removeShippingCompany(entry.getKey());
            }
        }
        checked.clear();
        return "ShippingComp";
    }

    public String verifyShippingCompany() {
        ShippingCompany sc = new ShippingCompany();
        sc.setName(this.name);
        sc.setDescription(this.description);
        sc.setZipCode(this.zipCode);
        sc.setStreet(this.street);
        sc.setHouseNr(this.houseNr);
        crmService.addShippingCompany(sc);
        resetShippingCompAttributes();
        return "ShippingComp";
    }

    public void resetShippingCompAttributes() {
        this.name = "";
        this.description = "";
        this.zipCode = "";
        this.houseNr = "";
        this.street = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouseNr() {
        return houseNr;
    }

    public void setHouseNr(String houseNr) {
        this.houseNr = houseNr;
    }

    public Map<ShippingCompany, Boolean> getChecked() {
        return checked;
    }

    public void setChecked(Map<ShippingCompany, Boolean> checked) {
        this.checked = checked;
    }

}

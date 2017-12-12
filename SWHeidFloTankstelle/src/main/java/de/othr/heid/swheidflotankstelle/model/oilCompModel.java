
import de.othr.heid.swheidflotankstelle.entity.OilCompany;
import de.othr.heid.swheidflotankstelle.service.CRMService;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
@Named
@SessionScoped
public class oilCompModel implements Serializable {

    @Inject
    private CRMService crmService;

    private String name;
    private String zipCode;
    private String street;
    private String houseNr;

    private Map<OilCompany, Boolean> checked = new HashMap<>();

    public Collection<OilCompany> getAllOilCompanies() {
        return this.crmService.getAllOilCompanies();
    }

    public String removeOilCompany() {
        for (Map.Entry<OilCompany, Boolean> entry : checked.entrySet()) {
            if (entry.getValue()) {
                crmService.removeOilCompany(entry.getKey());
            }
        }
        checked.clear();
        return "OilComp";
    }

    public String verifyOilCompany() {
        OilCompany oc = new OilCompany();
        oc.setName(this.name);
        oc.setZipCode(this.zipCode);
        oc.setStreet(this.street);
        oc.setHouseNr(this.houseNr);
        crmService.addOilCompany(oc);
        resetOilCompAttributes();
        return "OilComp";
    }

    public void resetOilCompAttributes() {
        this.name = "";
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

    public Map<OilCompany, Boolean> getChecked() {
        return checked;
    }

    public void setChecked(Map<OilCompany, Boolean> checked) {
        this.checked = checked;
    }

}

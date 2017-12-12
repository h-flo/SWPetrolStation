/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.othr.heid.swheidflotankstelle.converter;

import de.othr.heid.swheidflotankstelle.entity.Fuel;
import de.othr.heid.swheidflotankstelle.service.FuelService;
import javax.enterprise.context.RequestScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Flo
 */
@RequestScoped
@Named
public class FuelConverter implements Converter {

    @Inject
    private FuelService fuelService;

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        if (value == null) {
            return "";
        }
        Fuel fuel = fuelService.getFuelByType(value);
        if (fuel == null) {
            return "";
        }
        return fuel;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        if (value == null) {
            return null;
        }
        if (!value.getClass().equals(Fuel.class)) {
            return null;
        }
        return ((Fuel) value).getFueltype();
    }

}

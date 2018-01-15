/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.othr.heid.swheidflotankstelle.service;

import de.othr.heid.swheidflotankstelle.order.FuelDTO;
import de.othr.heid.swheidflotankstelle.order.OCfuel;
import de.othr.heid.swheidflotankstelle.order.OCorder;
import de.othr.heid.swheidflotankstelle.order.OrderDTO;
import de.othr.heid.swheidflotankstelle.resources.Environment;
import java.io.Serializable;
import java.util.concurrent.ThreadLocalRandom;
import javax.enterprise.context.RequestScoped;
import testing.IOrderService;

/**
 *
 * @author Flo
 */

@RequestScoped
public class TestOrderService implements IOrderService, Serializable {

    public static Environment environment = Environment.PROD;
    private Double price;
    private Double newPrice;

    @Override
    public OCorder createOrder(OrderDTO orderDTO) {
//        System.out.println("Test Method for Create order");
        OCorder order = null;
        try {
            order = new OCorder();
            order.setAmount(orderDTO.getAmount());
            order.setTransportId(333L);
            price = orderDTO.getAmount() * 1.3;
            order.setOrderPrice(price);

        } catch (Exception ex) {
            throw new RuntimeException("Failed to create order", ex);
        }
        return order;

    }

    @Override
    public OCfuel getFuelByDTO(FuelDTO fuelDTO) {
//        System.out.println("Test Method for Changing Fuel");
        OCfuel fuel = null;
        try {
            fuel = new OCfuel();
            fuel.setFuelType(fuelDTO.getFueltype());
            //Random Price between 1.0 and 2.0
            newPrice = ThreadLocalRandom.current().nextDouble(1.0, 2.0);
            fuel.setPrice((double) Math.round(newPrice * 100) / 100);

        } catch (Exception ex) {
            throw new RuntimeException("Failed to update fuelprice", ex);
        }
        return fuel;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testing;

import de.othr.heid.swheidflotankstelle.order.FuelDTO;
import de.othr.heid.swheidflotankstelle.order.OCfuel;
import de.othr.heid.swheidflotankstelle.order.OCorder;
import de.othr.heid.swheidflotankstelle.order.OrderDTO;

/**
 *
 * @author Flo
 */
public interface IOrderService {
     OCorder createOrder(OrderDTO orderDTO);
     OCfuel getFuelByDTO(FuelDTO fuelDTO);
}


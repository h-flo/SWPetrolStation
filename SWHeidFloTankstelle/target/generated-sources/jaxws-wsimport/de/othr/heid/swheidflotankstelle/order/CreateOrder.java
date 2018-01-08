
package de.othr.heid.swheidflotankstelle.order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für createOrder complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="createOrder">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="orderDTO" type="{http://service.swstelzer.stelzer.oth.de/}orderDTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createOrder", propOrder = {
    "orderDTO"
})
public class CreateOrder {

    protected OrderDTO orderDTO;

    /**
     * Ruft den Wert der orderDTO-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OrderDTO }
     *     
     */
    public OrderDTO getOrderDTO() {
        return orderDTO;
    }

    /**
     * Legt den Wert der orderDTO-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderDTO }
     *     
     */
    public void setOrderDTO(OrderDTO value) {
        this.orderDTO = value;
    }

}


package de.othr.heid.swheidflotankstelle.order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java-Klasse für oCorder complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="oCorder">
 *   &lt;complexContent>
 *     &lt;extension base="{http://service.swstelzer.stelzer.oth.de/}oCsingleIdEntity">
 *       &lt;sequence>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="transportId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="orderDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="statusDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orderPrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="customer" type="{http://service.swstelzer.stelzer.oth.de/}oCcustomer" minOccurs="0"/>
 *         &lt;element name="fuel" type="{http://service.swstelzer.stelzer.oth.de/}oCfuel" minOccurs="0"/>
 *         &lt;element name="status" type="{http://service.swstelzer.stelzer.oth.de/}oCstatus" minOccurs="0"/>
 *         &lt;element name="forwardingCompany" type="{http://service.swstelzer.stelzer.oth.de/}oCforwardingCompany" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "oCorder", propOrder = {
    "amount",
    "transportId",
    "orderDate",
    "statusDescription",
    "orderPrice",
    "customer",
    "fuel",
    "status",
    "forwardingCompany"
})
public class OCorder
    extends OCsingleIdEntity
{

    protected Long amount;
    protected Long transportId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar orderDate;
    protected String statusDescription;
    protected Double orderPrice;
    protected OCcustomer customer;
    protected OCfuel fuel;
    protected OCstatus status;
    protected OCforwardingCompany forwardingCompany;

    /**
     * Ruft den Wert der amount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAmount() {
        return amount;
    }

    /**
     * Legt den Wert der amount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAmount(Long value) {
        this.amount = value;
    }

    /**
     * Ruft den Wert der transportId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTransportId() {
        return transportId;
    }

    /**
     * Legt den Wert der transportId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTransportId(Long value) {
        this.transportId = value;
    }

    /**
     * Ruft den Wert der orderDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrderDate() {
        return orderDate;
    }

    /**
     * Legt den Wert der orderDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrderDate(XMLGregorianCalendar value) {
        this.orderDate = value;
    }

    /**
     * Ruft den Wert der statusDescription-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusDescription() {
        return statusDescription;
    }

    /**
     * Legt den Wert der statusDescription-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusDescription(String value) {
        this.statusDescription = value;
    }

    /**
     * Ruft den Wert der orderPrice-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOrderPrice() {
        return orderPrice;
    }

    /**
     * Legt den Wert der orderPrice-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOrderPrice(Double value) {
        this.orderPrice = value;
    }

    /**
     * Ruft den Wert der customer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OCcustomer }
     *     
     */
    public OCcustomer getCustomer() {
        return customer;
    }

    /**
     * Legt den Wert der customer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OCcustomer }
     *     
     */
    public void setCustomer(OCcustomer value) {
        this.customer = value;
    }

    /**
     * Ruft den Wert der fuel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OCfuel }
     *     
     */
    public OCfuel getFuel() {
        return fuel;
    }

    /**
     * Legt den Wert der fuel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OCfuel }
     *     
     */
    public void setFuel(OCfuel value) {
        this.fuel = value;
    }

    /**
     * Ruft den Wert der status-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OCstatus }
     *     
     */
    public OCstatus getStatus() {
        return status;
    }

    /**
     * Legt den Wert der status-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OCstatus }
     *     
     */
    public void setStatus(OCstatus value) {
        this.status = value;
    }

    /**
     * Ruft den Wert der forwardingCompany-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OCforwardingCompany }
     *     
     */
    public OCforwardingCompany getForwardingCompany() {
        return forwardingCompany;
    }

    /**
     * Legt den Wert der forwardingCompany-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OCforwardingCompany }
     *     
     */
    public void setForwardingCompany(OCforwardingCompany value) {
        this.forwardingCompany = value;
    }

}

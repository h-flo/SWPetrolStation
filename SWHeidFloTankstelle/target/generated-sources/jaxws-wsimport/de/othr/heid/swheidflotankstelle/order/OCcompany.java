
package de.othr.heid.swheidflotankstelle.order;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für oCcompany complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="oCcompany">
 *   &lt;complexContent>
 *     &lt;extension base="{http://service.swstelzer.stelzer.oth.de/}oCsingleIdEntity">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="address" type="{http://service.swstelzer.stelzer.oth.de/}oCaddress" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "oCcompany", propOrder = {
    "rest"
})
@XmlSeeAlso({
    OCforwardingCompany.class,
    OCcustomer.class
})
public abstract class OCcompany
    extends OCsingleIdEntity
{

    @XmlElementRefs({
        @XmlElementRef(name = "name", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "address", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "id", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> rest;

    /**
     * Ruft das restliche Contentmodell ab. 
     * 
     * <p>
     * Sie rufen diese "catch-all"-Eigenschaft aus folgendem Grund ab: 
     * Der Feldname "Id" wird von zwei verschiedenen Teilen eines Schemas verwendet. Siehe: 
     * Zeile 105 von file:/C:/Users/Flo/Documents/SWPetrolStation/SWHeidFloTankstelle/src/wsdl/im-lamport_8080/SWStelzer-0.3/OrderService.wsdl
     * Zeile 89 von file:/C:/Users/Flo/Documents/SWPetrolStation/SWHeidFloTankstelle/src/wsdl/im-lamport_8080/SWStelzer-0.3/OrderService.wsdl
     * <p>
     * Um diese Eigenschaft zu entfernen, wenden Sie eine Eigenschaftenanpassung für eine
     * der beiden folgenden Deklarationen an, um deren Namen zu ändern: 
     * Gets the value of the rest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link OCaddress }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getRest() {
        if (rest == null) {
            rest = new ArrayList<JAXBElement<?>>();
        }
        return this.rest;
    }

}

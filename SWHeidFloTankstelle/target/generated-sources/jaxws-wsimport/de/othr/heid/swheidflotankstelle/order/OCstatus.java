
package de.othr.heid.swheidflotankstelle.order;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für oCstatus.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="oCstatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PROCESSING"/>
 *     &lt;enumeration value="SHIPPED"/>
 *     &lt;enumeration value="FINISHED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "oCstatus")
@XmlEnum
public enum OCstatus {

    PROCESSING,
    SHIPPED,
    FINISHED;

    public String value() {
        return name();
    }

    public static OCstatus fromValue(String v) {
        return valueOf(v);
    }

}

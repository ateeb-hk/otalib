//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.07.11 at 07:19:31 PM IST 
//


package org.opentravel.ota;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for List_GroundServiceProvided_Base.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="List_GroundServiceProvided_Base">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AirportTransfer"/>
 *     &lt;enumeration value="SharedTransportation"/>
 *     &lt;enumeration value="Hourly"/>
 *     &lt;enumeration value="Mileage"/>
 *     &lt;enumeration value="SimpleTransfer"/>
 *     &lt;enumeration value="Shuttle"/>
 *     &lt;enumeration value="Other_"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "List_GroundServiceProvided_Base")
@XmlEnum
public enum ListGroundServiceProvidedBase {

    @XmlEnumValue("AirportTransfer")
    AIRPORT_TRANSFER("AirportTransfer"),
    @XmlEnumValue("SharedTransportation")
    SHARED_TRANSPORTATION("SharedTransportation"),
    @XmlEnumValue("Hourly")
    HOURLY("Hourly"),
    @XmlEnumValue("Mileage")
    MILEAGE("Mileage"),
    @XmlEnumValue("SimpleTransfer")
    SIMPLE_TRANSFER("SimpleTransfer"),
    @XmlEnumValue("Shuttle")
    SHUTTLE("Shuttle"),

    /**
     * Use: Select this enumeration to exchange a value that is not in the enumerated list by entering the value information in the Code Extension fields.
     * 
     */
    @XmlEnumValue("Other_")
    OTHER("Other_");
    private final String value;

    ListGroundServiceProvidedBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ListGroundServiceProvidedBase fromValue(String v) {
        for (ListGroundServiceProvidedBase c: ListGroundServiceProvidedBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

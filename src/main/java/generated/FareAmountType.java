//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.07.11 at 07:19:31 PM IST 
//


package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FareAmountType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FareAmountType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NOADC"/>
 *     &lt;enumeration value="Bulk"/>
 *     &lt;enumeration value="IT"/>
 *     &lt;enumeration value="Additional_Collection"/>
 *     &lt;enumeration value="Charter_Fare"/>
 *     &lt;enumeration value="No_Fare"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FareAmountType")
@XmlEnum
public enum FareAmountType {

    NOADC("NOADC"),
    @XmlEnumValue("Bulk")
    BULK("Bulk"),
    IT("IT"),

    /**
     * This amount represents an additional collection.
     * 
     */
    @XmlEnumValue("Additional_Collection")
    ADDITIONAL_COLLECTION("Additional_Collection"),

    /**
     * This amount represents a fare for a charter flight.
     * 
     */
    @XmlEnumValue("Charter_Fare")
    CHARTER_FARE("Charter_Fare"),

    /**
     * No fare applies.
     * 
     */
    @XmlEnumValue("No_Fare")
    NO_FARE("No_Fare");
    private final String value;

    FareAmountType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FareAmountType fromValue(String v) {
        for (FareAmountType c: FareAmountType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

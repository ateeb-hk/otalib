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
 * <p>Java class for OnLocationServiceID_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OnLocationServiceID_Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ComputerDrivingDirections"/>
 *     &lt;enumeration value="ExpressReturnService"/>
 *     &lt;enumeration value="SpecialNeeds"/>
 *     &lt;enumeration value="FrequentRenter"/>
 *     &lt;enumeration value="Miscellaneous"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OnLocationServiceID_Type")
@XmlEnum
public enum OnLocationServiceIDType {


    /**
     * Indicates that the associated information describes computerized driving directions services, such as availability of maps, turn-by-turn directions, etc.
     * 
     */
    @XmlEnumValue("ComputerDrivingDirections")
    COMPUTER_DRIVING_DIRECTIONS("ComputerDrivingDirections"),

    /**
     * Indicates that the associated information describes express return servies, such as leaving the vehicle in the return lot without the need to return to the rental counter. 
     * 
     */
    @XmlEnumValue("ExpressReturnService")
    EXPRESS_RETURN_SERVICE("ExpressReturnService"),

    /**
     * Indicates that the associated information describes services ofered to those with special needs, such as physically impaired.
     * 
     */
    @XmlEnumValue("SpecialNeeds")
    SPECIAL_NEEDS("SpecialNeeds"),

    /**
     * Indicates that the associated information describes those services offered to members of the company's frequent renter program.  Such services may include covered collection of vehicle, bypassing the rental counter, etc.
     * 
     */
    @XmlEnumValue("FrequentRenter")
    FREQUENT_RENTER("FrequentRenter"),

    /**
     * Indicates that the associated information describes the miscellaneous services that are offered at the rental facility.
     * 
     */
    @XmlEnumValue("Miscellaneous")
    MISCELLANEOUS("Miscellaneous");
    private final String value;

    OnLocationServiceIDType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OnLocationServiceIDType fromValue(String v) {
        for (OnLocationServiceIDType c: OnLocationServiceIDType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

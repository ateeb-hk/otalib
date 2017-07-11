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
 * <p>Java class for List_OfferBookingMethod.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="List_OfferBookingMethod">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CorporateTravelPlanner"/>
 *     &lt;enumeration value="Online"/>
 *     &lt;enumeration value="TravelAgency"/>
 *     &lt;enumeration value="TravelAgent"/>
 *     &lt;enumeration value="Other_"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "List_OfferBookingMethod")
@XmlEnum
public enum ListOfferBookingMethod {

    @XmlEnumValue("CorporateTravelPlanner")
    CORPORATE_TRAVEL_PLANNER("CorporateTravelPlanner"),
    @XmlEnumValue("Online")
    ONLINE("Online"),
    @XmlEnumValue("TravelAgency")
    TRAVEL_AGENCY("TravelAgency"),
    @XmlEnumValue("TravelAgent")
    TRAVEL_AGENT("TravelAgent"),

    /**
     * This is a string list of enumerations with an "Other_" literal to support an open enumeration list. Use the "Other_" value in combination with the @OtherType attribute to exchange a literal that is not in the list and is known to your trading partners.
     * 
     */
    @XmlEnumValue("Other_")
    OTHER("Other_");
    private final String value;

    ListOfferBookingMethod(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ListOfferBookingMethod fromValue(String v) {
        for (ListOfferBookingMethod c: ListOfferBookingMethod.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

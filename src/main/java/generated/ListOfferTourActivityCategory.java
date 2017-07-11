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
 * <p>Java class for List_OfferTourActivityCategory.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="List_OfferTourActivityCategory">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Accessible"/>
 *     &lt;enumeration value="Adventure"/>
 *     &lt;enumeration value="Cultural"/>
 *     &lt;enumeration value="EcoAdventure"/>
 *     &lt;enumeration value="Educational"/>
 *     &lt;enumeration value="Family"/>
 *     &lt;enumeration value="FoodAndBeverage"/>
 *     &lt;enumeration value="Group"/>
 *     &lt;enumeration value="Romantic"/>
 *     &lt;enumeration value="SportsAndRecreation"/>
 *     &lt;enumeration value="Other_"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "List_OfferTourActivityCategory")
@XmlEnum
public enum ListOfferTourActivityCategory {

    @XmlEnumValue("Accessible")
    ACCESSIBLE("Accessible"),
    @XmlEnumValue("Adventure")
    ADVENTURE("Adventure"),
    @XmlEnumValue("Cultural")
    CULTURAL("Cultural"),
    @XmlEnumValue("EcoAdventure")
    ECO_ADVENTURE("EcoAdventure"),
    @XmlEnumValue("Educational")
    EDUCATIONAL("Educational"),

    /**
     * The tour and/or activity content and extertion level are family friendly for children, adults and seniors.
     * 
     */
    @XmlEnumValue("Family")
    FAMILY("Family"),
    @XmlEnumValue("FoodAndBeverage")
    FOOD_AND_BEVERAGE("FoodAndBeverage"),

    /**
     * A day tour or activity that is well-suited for larger parties, e.g. 8+ attendees within a group.
     * 
     */
    @XmlEnumValue("Group")
    GROUP("Group"),
    @XmlEnumValue("Romantic")
    ROMANTIC("Romantic"),
    @XmlEnumValue("SportsAndRecreation")
    SPORTS_AND_RECREATION("SportsAndRecreation"),

    /**
     * This is a string list of enumerations with an "Other_" literal to support an open enumeration list. Use the "Other_" value in combination with the @OtherType attribute to exchange a literal that is not in the list and is known to your trading partners.
     * 
     */
    @XmlEnumValue("Other_")
    OTHER("Other_");
    private final String value;

    ListOfferTourActivityCategory(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ListOfferTourActivityCategory fromValue(String v) {
        for (ListOfferTourActivityCategory c: ListOfferTourActivityCategory.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

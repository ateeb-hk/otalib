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
 * <p>Java class for List_GolferType_Base.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="List_GolferType_Base">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ClubMember"/>
 *     &lt;enumeration value="GuestOfMember"/>
 *     &lt;enumeration value="GuestOfResort"/>
 *     &lt;enumeration value="LocalResident"/>
 *     &lt;enumeration value="LoyaltyProgramMember"/>
 *     &lt;enumeration value="Other_"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "List_GolferType_Base")
@XmlEnum
public enum ListGolferTypeBase {


    /**
     * Member of a golf course.
     * 
     */
    @XmlEnumValue("ClubMember")
    CLUB_MEMBER("ClubMember"),

    /**
     * Guest of a golf course member.
     * 
     */
    @XmlEnumValue("GuestOfMember")
    GUEST_OF_MEMBER("GuestOfMember"),

    /**
     * Guest at a resort.
     * 
     */
    @XmlEnumValue("GuestOfResort")
    GUEST_OF_RESORT("GuestOfResort"),

    /**
     * Local area resident.
     * 
     */
    @XmlEnumValue("LocalResident")
    LOCAL_RESIDENT("LocalResident"),

    /**
     * Member of a golf course loyalty program.
     * 
     */
    @XmlEnumValue("LoyaltyProgramMember")
    LOYALTY_PROGRAM_MEMBER("LoyaltyProgramMember"),

    /**
     * Use: Select this enumeration to exchange a value that is not in the enumerated list by entering the value information in the Code Extension fields.
     * 
     */
    @XmlEnumValue("Other_")
    OTHER("Other_");
    private final String value;

    ListGolferTypeBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ListGolferTypeBase fromValue(String v) {
        for (ListGolferTypeBase c: ListGolferTypeBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

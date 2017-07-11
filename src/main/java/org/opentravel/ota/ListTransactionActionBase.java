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
 * <p>Java class for List_TransactionAction_Base.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="List_TransactionAction_Base">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Book"/>
 *     &lt;enumeration value="Cancel"/>
 *     &lt;enumeration value="Commit"/>
 *     &lt;enumeration value="CommitOverrideEdits"/>
 *     &lt;enumeration value="Hold"/>
 *     &lt;enumeration value="Initiate"/>
 *     &lt;enumeration value="Ignore"/>
 *     &lt;enumeration value="Modify"/>
 *     &lt;enumeration value="Ticket"/>
 *     &lt;enumeration value="Quote"/>
 *     &lt;enumeration value="VerifyPrice"/>
 *     &lt;enumeration value="Other_"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "List_TransactionAction_Base")
@XmlEnum
public enum ListTransactionActionBase {

    @XmlEnumValue("Book")
    BOOK("Book"),
    @XmlEnumValue("Cancel")
    CANCEL("Cancel"),
    @XmlEnumValue("Commit")
    COMMIT("Commit"),

    /**
     * Commit the transaction and override the end transaction edits.
     * 
     */
    @XmlEnumValue("CommitOverrideEdits")
    COMMIT_OVERRIDE_EDITS("CommitOverrideEdits"),
    @XmlEnumValue("Hold")
    HOLD("Hold"),
    @XmlEnumValue("Initiate")
    INITIATE("Initiate"),
    @XmlEnumValue("Ignore")
    IGNORE("Ignore"),
    @XmlEnumValue("Modify")
    MODIFY("Modify"),

    /**
     * A ticket for an event, such as a show or theme park.
     * 
     */
    @XmlEnumValue("Ticket")
    TICKET("Ticket"),
    @XmlEnumValue("Quote")
    QUOTE("Quote"),

    /**
     * Perform a price verification.
     * 
     */
    @XmlEnumValue("VerifyPrice")
    VERIFY_PRICE("VerifyPrice"),

    /**
     * Use: Select this enumeration to exchange a value that is not in the enumerated list by entering the value information in the Code Extension fields.
     * 
     */
    @XmlEnumValue("Other_")
    OTHER("Other_");
    private final String value;

    ListTransactionActionBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ListTransactionActionBase fromValue(String v) {
        for (ListTransactionActionBase c: ListTransactionActionBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

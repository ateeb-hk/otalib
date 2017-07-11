//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.07.11 at 07:19:31 PM IST 
//


package generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 *  This is used by OTA_HotelRFP_TransientNotifRQ schema. This accommodates detailed transient RFP information.
 * 
 * <p>Java class for RFP_TransientDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RFP_TransientDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RFP_TransientResponses" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RFP_TransientResponse" type="{}RFP_TransientResponseType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="MessageID" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{}UniqueID_Type">
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RFP_TransientDetailsType", propOrder = {
    "rfpTransientResponses",
    "messageID"
})
public class RFPTransientDetailsType {

    @XmlElement(name = "RFP_TransientResponses")
    protected RFPTransientDetailsType.RFPTransientResponses rfpTransientResponses;
    @XmlElement(name = "MessageID")
    protected RFPTransientDetailsType.MessageID messageID;

    /**
     * Gets the value of the rfpTransientResponses property.
     * 
     * @return
     *     possible object is
     *     {@link RFPTransientDetailsType.RFPTransientResponses }
     *     
     */
    public RFPTransientDetailsType.RFPTransientResponses getRFPTransientResponses() {
        return rfpTransientResponses;
    }

    /**
     * Sets the value of the rfpTransientResponses property.
     * 
     * @param value
     *     allowed object is
     *     {@link RFPTransientDetailsType.RFPTransientResponses }
     *     
     */
    public void setRFPTransientResponses(RFPTransientDetailsType.RFPTransientResponses value) {
        this.rfpTransientResponses = value;
    }

    /**
     * Gets the value of the messageID property.
     * 
     * @return
     *     possible object is
     *     {@link RFPTransientDetailsType.MessageID }
     *     
     */
    public RFPTransientDetailsType.MessageID getMessageID() {
        return messageID;
    }

    /**
     * Sets the value of the messageID property.
     * 
     * @param value
     *     allowed object is
     *     {@link RFPTransientDetailsType.MessageID }
     *     
     */
    public void setMessageID(RFPTransientDetailsType.MessageID value) {
        this.messageID = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{}UniqueID_Type">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class MessageID
        extends UniqueIDType
    {


    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="RFP_TransientResponse" type="{}RFP_TransientResponseType" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "rfpTransientResponse"
    })
    public static class RFPTransientResponses {

        @XmlElement(name = "RFP_TransientResponse", required = true)
        protected List<RFPTransientResponseType> rfpTransientResponse;

        /**
         * Gets the value of the rfpTransientResponse property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the rfpTransientResponse property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRFPTransientResponse().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RFPTransientResponseType }
         * 
         * 
         */
        public List<RFPTransientResponseType> getRFPTransientResponse() {
            if (rfpTransientResponse == null) {
                rfpTransientResponse = new ArrayList<RFPTransientResponseType>();
            }
            return this.rfpTransientResponse;
        }

    }

}

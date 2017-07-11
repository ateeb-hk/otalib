//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.07.11 at 07:19:31 PM IST 
//


package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Defines how an account will be settled at checkout.
 * 
 * <p>Java class for HotelPaymentFormType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotelPaymentFormType">
 *   &lt;complexContent>
 *     &lt;extension base="{}PaymentFormType">
 *       &lt;sequence>
 *         &lt;element name="MasterAccountUsage" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{}BillingType"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelPaymentFormType", propOrder = {
    "masterAccountUsage"
})
@XmlSeeAlso({
    generated.HotelRoomListType.Guests.Guest.GuaranteePayment.class
})
public class HotelPaymentFormType
    extends PaymentFormType
{

    @XmlElement(name = "MasterAccountUsage")
    protected HotelPaymentFormType.MasterAccountUsage masterAccountUsage;

    /**
     * Gets the value of the masterAccountUsage property.
     * 
     * @return
     *     possible object is
     *     {@link HotelPaymentFormType.MasterAccountUsage }
     *     
     */
    public HotelPaymentFormType.MasterAccountUsage getMasterAccountUsage() {
        return masterAccountUsage;
    }

    /**
     * Sets the value of the masterAccountUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelPaymentFormType.MasterAccountUsage }
     *     
     */
    public void setMasterAccountUsage(HotelPaymentFormType.MasterAccountUsage value) {
        this.masterAccountUsage = value;
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
     *       &lt;attGroup ref="{}BillingType"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class MasterAccountUsage {

        @XmlAttribute(name = "BillingType")
        protected String billingType;
        @XmlAttribute(name = "SignFoodAndBev")
        protected Boolean signFoodAndBev;

        /**
         * Gets the value of the billingType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBillingType() {
            return billingType;
        }

        /**
         * Sets the value of the billingType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBillingType(String value) {
            this.billingType = value;
        }

        /**
         * Gets the value of the signFoodAndBev property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isSignFoodAndBev() {
            return signFoodAndBev;
        }

        /**
         * Sets the value of the signFoodAndBev property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSignFoodAndBev(Boolean value) {
            this.signFoodAndBev = value;
        }

    }

}

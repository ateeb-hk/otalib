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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Defines the information used to fully describe a rail reservation.
 * 
 * <p>Java class for RailReservationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RailReservationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UniqueID" type="{}UniqueID_Type"/>
 *         &lt;element name="Itinerary">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="OriginAndDestination" maxOccurs="9">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="OriginLocation" type="{}LocationType"/>
 *                             &lt;element name="DestinationLocation" type="{}LocationType"/>
 *                             &lt;element name="TrainSegment" type="{}BookedTrainSegmentType" maxOccurs="9"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="RailCharges" type="{}RailChargesType" minOccurs="0"/>
 *                   &lt;element name="VendorMessages" type="{}VendorMessagesType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PassengerInfo" type="{}RailPassengerCategoryDetailType" maxOccurs="99" minOccurs="0"/>
 *         &lt;element name="PaymentRules" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PaymentRule" type="{}MonetaryRuleType" maxOccurs="9"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Fulfillment" type="{}CompanyNameType" minOccurs="0"/>
 *         &lt;element ref="{}TPA_Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="LastHoldDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RailReservationType", propOrder = {
    "uniqueID",
    "itinerary",
    "passengerInfo",
    "paymentRules",
    "fulfillment",
    "tpaExtensions"
})
public class RailReservationType {

    @XmlElement(name = "UniqueID", required = true)
    protected UniqueIDType uniqueID;
    @XmlElement(name = "Itinerary", required = true)
    protected RailReservationType.Itinerary itinerary;
    @XmlElement(name = "PassengerInfo")
    protected List<RailPassengerCategoryDetailType> passengerInfo;
    @XmlElement(name = "PaymentRules")
    protected RailReservationType.PaymentRules paymentRules;
    @XmlElement(name = "Fulfillment")
    protected CompanyNameType fulfillment;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType tpaExtensions;
    @XmlAttribute(name = "LastHoldDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastHoldDate;

    /**
     * Gets the value of the uniqueID property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueIDType }
     *     
     */
    public UniqueIDType getUniqueID() {
        return uniqueID;
    }

    /**
     * Sets the value of the uniqueID property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueIDType }
     *     
     */
    public void setUniqueID(UniqueIDType value) {
        this.uniqueID = value;
    }

    /**
     * Gets the value of the itinerary property.
     * 
     * @return
     *     possible object is
     *     {@link RailReservationType.Itinerary }
     *     
     */
    public RailReservationType.Itinerary getItinerary() {
        return itinerary;
    }

    /**
     * Sets the value of the itinerary property.
     * 
     * @param value
     *     allowed object is
     *     {@link RailReservationType.Itinerary }
     *     
     */
    public void setItinerary(RailReservationType.Itinerary value) {
        this.itinerary = value;
    }

    /**
     * Gets the value of the passengerInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passengerInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassengerInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RailPassengerCategoryDetailType }
     * 
     * 
     */
    public List<RailPassengerCategoryDetailType> getPassengerInfo() {
        if (passengerInfo == null) {
            passengerInfo = new ArrayList<RailPassengerCategoryDetailType>();
        }
        return this.passengerInfo;
    }

    /**
     * Gets the value of the paymentRules property.
     * 
     * @return
     *     possible object is
     *     {@link RailReservationType.PaymentRules }
     *     
     */
    public RailReservationType.PaymentRules getPaymentRules() {
        return paymentRules;
    }

    /**
     * Sets the value of the paymentRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link RailReservationType.PaymentRules }
     *     
     */
    public void setPaymentRules(RailReservationType.PaymentRules value) {
        this.paymentRules = value;
    }

    /**
     * Gets the value of the fulfillment property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyNameType }
     *     
     */
    public CompanyNameType getFulfillment() {
        return fulfillment;
    }

    /**
     * Sets the value of the fulfillment property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyNameType }
     *     
     */
    public void setFulfillment(CompanyNameType value) {
        this.fulfillment = value;
    }

    /**
     * Gets the value of the tpaExtensions property.
     * 
     * @return
     *     possible object is
     *     {@link TPAExtensionsType }
     *     
     */
    public TPAExtensionsType getTPAExtensions() {
        return tpaExtensions;
    }

    /**
     * Sets the value of the tpaExtensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link TPAExtensionsType }
     *     
     */
    public void setTPAExtensions(TPAExtensionsType value) {
        this.tpaExtensions = value;
    }

    /**
     * Gets the value of the lastHoldDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastHoldDate() {
        return lastHoldDate;
    }

    /**
     * Sets the value of the lastHoldDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastHoldDate(XMLGregorianCalendar value) {
        this.lastHoldDate = value;
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
     *         &lt;element name="OriginAndDestination" maxOccurs="9">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="OriginLocation" type="{}LocationType"/>
     *                   &lt;element name="DestinationLocation" type="{}LocationType"/>
     *                   &lt;element name="TrainSegment" type="{}BookedTrainSegmentType" maxOccurs="9"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="RailCharges" type="{}RailChargesType" minOccurs="0"/>
     *         &lt;element name="VendorMessages" type="{}VendorMessagesType" minOccurs="0"/>
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
        "originAndDestination",
        "railCharges",
        "vendorMessages"
    })
    public static class Itinerary {

        @XmlElement(name = "OriginAndDestination", required = true)
        protected List<RailReservationType.Itinerary.OriginAndDestination> originAndDestination;
        @XmlElement(name = "RailCharges")
        protected RailChargesType railCharges;
        @XmlElement(name = "VendorMessages")
        protected VendorMessagesType vendorMessages;

        /**
         * Gets the value of the originAndDestination property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the originAndDestination property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOriginAndDestination().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RailReservationType.Itinerary.OriginAndDestination }
         * 
         * 
         */
        public List<RailReservationType.Itinerary.OriginAndDestination> getOriginAndDestination() {
            if (originAndDestination == null) {
                originAndDestination = new ArrayList<RailReservationType.Itinerary.OriginAndDestination>();
            }
            return this.originAndDestination;
        }

        /**
         * Gets the value of the railCharges property.
         * 
         * @return
         *     possible object is
         *     {@link RailChargesType }
         *     
         */
        public RailChargesType getRailCharges() {
            return railCharges;
        }

        /**
         * Sets the value of the railCharges property.
         * 
         * @param value
         *     allowed object is
         *     {@link RailChargesType }
         *     
         */
        public void setRailCharges(RailChargesType value) {
            this.railCharges = value;
        }

        /**
         * Gets the value of the vendorMessages property.
         * 
         * @return
         *     possible object is
         *     {@link VendorMessagesType }
         *     
         */
        public VendorMessagesType getVendorMessages() {
            return vendorMessages;
        }

        /**
         * Sets the value of the vendorMessages property.
         * 
         * @param value
         *     allowed object is
         *     {@link VendorMessagesType }
         *     
         */
        public void setVendorMessages(VendorMessagesType value) {
            this.vendorMessages = value;
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
         *         &lt;element name="OriginLocation" type="{}LocationType"/>
         *         &lt;element name="DestinationLocation" type="{}LocationType"/>
         *         &lt;element name="TrainSegment" type="{}BookedTrainSegmentType" maxOccurs="9"/>
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
            "originLocation",
            "destinationLocation",
            "trainSegment"
        })
        public static class OriginAndDestination {

            @XmlElement(name = "OriginLocation", required = true)
            protected LocationType originLocation;
            @XmlElement(name = "DestinationLocation", required = true)
            protected LocationType destinationLocation;
            @XmlElement(name = "TrainSegment", required = true)
            protected List<BookedTrainSegmentType> trainSegment;

            /**
             * Gets the value of the originLocation property.
             * 
             * @return
             *     possible object is
             *     {@link LocationType }
             *     
             */
            public LocationType getOriginLocation() {
                return originLocation;
            }

            /**
             * Sets the value of the originLocation property.
             * 
             * @param value
             *     allowed object is
             *     {@link LocationType }
             *     
             */
            public void setOriginLocation(LocationType value) {
                this.originLocation = value;
            }

            /**
             * Gets the value of the destinationLocation property.
             * 
             * @return
             *     possible object is
             *     {@link LocationType }
             *     
             */
            public LocationType getDestinationLocation() {
                return destinationLocation;
            }

            /**
             * Sets the value of the destinationLocation property.
             * 
             * @param value
             *     allowed object is
             *     {@link LocationType }
             *     
             */
            public void setDestinationLocation(LocationType value) {
                this.destinationLocation = value;
            }

            /**
             * Gets the value of the trainSegment property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the trainSegment property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getTrainSegment().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link BookedTrainSegmentType }
             * 
             * 
             */
            public List<BookedTrainSegmentType> getTrainSegment() {
                if (trainSegment == null) {
                    trainSegment = new ArrayList<BookedTrainSegmentType>();
                }
                return this.trainSegment;
            }

        }

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
     *         &lt;element name="PaymentRule" type="{}MonetaryRuleType" maxOccurs="9"/>
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
        "paymentRule"
    })
    public static class PaymentRules {

        @XmlElement(name = "PaymentRule", required = true)
        protected List<MonetaryRuleType> paymentRule;

        /**
         * Gets the value of the paymentRule property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the paymentRule property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPaymentRule().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MonetaryRuleType }
         * 
         * 
         */
        public List<MonetaryRuleType> getPaymentRule() {
            if (paymentRule == null) {
                paymentRule = new ArrayList<MonetaryRuleType>();
            }
            return this.paymentRule;
        }

    }

}

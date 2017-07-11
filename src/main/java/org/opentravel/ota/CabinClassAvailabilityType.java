//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.07.11 at 07:19:31 PM IST 
//


package org.opentravel.ota;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * A listing of each seat within a cabin and the seat availability.
 * 
 * <p>Java class for CabinClassAvailabilityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CabinClassAvailabilityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="SeatNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AdvancePurchaseInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="AvailableInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="InoperativeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="OccupiedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="PremiumInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CabinClassAvailabilityType")
public class CabinClassAvailabilityType {

    @XmlAttribute(name = "SeatNumber")
    protected String seatNumber;
    @XmlAttribute(name = "AdvancePurchaseInd")
    protected Boolean advancePurchaseInd;
    @XmlAttribute(name = "AvailableInd")
    protected Boolean availableInd;
    @XmlAttribute(name = "InoperativeInd")
    protected Boolean inoperativeInd;
    @XmlAttribute(name = "OccupiedInd")
    protected Boolean occupiedInd;
    @XmlAttribute(name = "PremiumInd")
    protected Boolean premiumInd;

    /**
     * Gets the value of the seatNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatNumber() {
        return seatNumber;
    }

    /**
     * Sets the value of the seatNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeatNumber(String value) {
        this.seatNumber = value;
    }

    /**
     * Gets the value of the advancePurchaseInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdvancePurchaseInd() {
        return advancePurchaseInd;
    }

    /**
     * Sets the value of the advancePurchaseInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdvancePurchaseInd(Boolean value) {
        this.advancePurchaseInd = value;
    }

    /**
     * Gets the value of the availableInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAvailableInd() {
        return availableInd;
    }

    /**
     * Sets the value of the availableInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAvailableInd(Boolean value) {
        this.availableInd = value;
    }

    /**
     * Gets the value of the inoperativeInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInoperativeInd() {
        return inoperativeInd;
    }

    /**
     * Sets the value of the inoperativeInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInoperativeInd(Boolean value) {
        this.inoperativeInd = value;
    }

    /**
     * Gets the value of the occupiedInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOccupiedInd() {
        return occupiedInd;
    }

    /**
     * Sets the value of the occupiedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOccupiedInd(Boolean value) {
        this.occupiedInd = value;
    }

    /**
     * Gets the value of the premiumInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPremiumInd() {
        return premiumInd;
    }

    /**
     * Sets the value of the premiumInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPremiumInd(Boolean value) {
        this.premiumInd = value;
    }

}

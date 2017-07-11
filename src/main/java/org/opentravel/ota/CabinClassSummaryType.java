//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.07.11 at 07:19:31 PM IST 
//


package org.opentravel.ota;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * Summary information about a cabin class.
 * 
 * <p>Java class for CabinClassSummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CabinClassSummaryType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>CabinType">
 *       &lt;attribute name="Name" use="required" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
 *       &lt;attribute name="CabinCapacity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="RowQty" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to3" />
 *       &lt;attribute name="StartingRow" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to3" />
 *       &lt;attribute name="EndingRow" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to3" />
 *       &lt;attribute name="AvailableSeatQty" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CabinClassSummaryType", propOrder = {
    "value"
})
public class CabinClassSummaryType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "Name", required = true)
    protected String name;
    @XmlAttribute(name = "CabinCapacity")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger cabinCapacity;
    @XmlAttribute(name = "RowQty")
    protected Integer rowQty;
    @XmlAttribute(name = "StartingRow")
    protected Integer startingRow;
    @XmlAttribute(name = "EndingRow")
    protected Integer endingRow;
    @XmlAttribute(name = "AvailableSeatQty")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger availableSeatQty;
    @XmlAttribute(name = "RPH")
    protected String rph;

    /**
     * Specifies the cabin type (e.g. first, business, economy).
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the cabinCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCabinCapacity() {
        return cabinCapacity;
    }

    /**
     * Sets the value of the cabinCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCabinCapacity(BigInteger value) {
        this.cabinCapacity = value;
    }

    /**
     * Gets the value of the rowQty property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRowQty() {
        return rowQty;
    }

    /**
     * Sets the value of the rowQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRowQty(Integer value) {
        this.rowQty = value;
    }

    /**
     * Gets the value of the startingRow property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStartingRow() {
        return startingRow;
    }

    /**
     * Sets the value of the startingRow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStartingRow(Integer value) {
        this.startingRow = value;
    }

    /**
     * Gets the value of the endingRow property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEndingRow() {
        return endingRow;
    }

    /**
     * Sets the value of the endingRow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEndingRow(Integer value) {
        this.endingRow = value;
    }

    /**
     * Gets the value of the availableSeatQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAvailableSeatQty() {
        return availableSeatQty;
    }

    /**
     * Sets the value of the availableSeatQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAvailableSeatQty(BigInteger value) {
        this.availableSeatQty = value;
    }

    /**
     * Gets the value of the rph property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRPH() {
        return rph;
    }

    /**
     * Sets the value of the rph property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRPH(String value) {
        this.rph = value;
    }

}

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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.Duration;


/**
 * Identifies a preference for a type of ticket distribution.
 * 
 * <p>Java class for TicketDistribPrefType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TicketDistribPrefType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;>StringLength0to64">
 *       &lt;attGroup ref="{}PreferLevelGroup"/>
 *       &lt;attribute name="DistribType" type="{}OTA_CodeType" />
 *       &lt;attribute name="TicketTime" type="{http://www.w3.org/2001/XMLSchema}duration" />
 *       &lt;attribute name="Remark" type="{}StringLength1to128" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TicketDistribPrefType", propOrder = {
    "value"
})
@XmlSeeAlso({
    generated.AirSearchPrefsType.TicketDistribPref.class
})
public class TicketDistribPrefType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "DistribType")
    protected String distribType;
    @XmlAttribute(name = "TicketTime")
    protected Duration ticketTime;
    @XmlAttribute(name = "Remark")
    protected String remark;
    @XmlAttribute(name = "PreferLevel")
    protected PreferLevelType preferLevel;

    /**
     * Used for Character Strings, length 0 to 64.
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
     * Gets the value of the distribType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistribType() {
        return distribType;
    }

    /**
     * Sets the value of the distribType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistribType(String value) {
        this.distribType = value;
    }

    /**
     * Gets the value of the ticketTime property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getTicketTime() {
        return ticketTime;
    }

    /**
     * Sets the value of the ticketTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setTicketTime(Duration value) {
        this.ticketTime = value;
    }

    /**
     * Gets the value of the remark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemark() {
        return remark;
    }

    /**
     * Sets the value of the remark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemark(String value) {
        this.remark = value;
    }

    /**
     * Gets the value of the preferLevel property.
     * 
     * @return
     *     possible object is
     *     {@link PreferLevelType }
     *     
     */
    public PreferLevelType getPreferLevel() {
        return preferLevel;
    }

    /**
     * Sets the value of the preferLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreferLevelType }
     *     
     */
    public void setPreferLevel(PreferLevelType value) {
        this.preferLevel = value;
    }

}

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
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * Rail Passenger Occupation with an associated attribute to capture additional enumerated values as agreed upon between trading partners.
 * 
 * <p>Java class for RailPassengerOccupationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RailPassengerOccupationType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;>RailPassengerOccupationEnum">
 *       &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RailPassengerOccupationType", propOrder = {
    "value"
})
public class RailPassengerOccupationType {

    @XmlValue
    protected RailPassengerOccupationEnum value;
    @XmlAttribute(name = "extension")
    protected String extension;

    /**
     * Used to specifiy occupation of person
     * 
     * @return
     *     possible object is
     *     {@link RailPassengerOccupationEnum }
     *     
     */
    public RailPassengerOccupationEnum getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link RailPassengerOccupationEnum }
     *     
     */
    public void setValue(RailPassengerOccupationEnum value) {
        this.value = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtension(String value) {
        this.extension = value;
    }

}

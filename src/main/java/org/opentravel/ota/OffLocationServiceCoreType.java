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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * The OffLocationServiceCoreType complex type defines the core data that is used to describe an off-location service.
 * 
 * <p>Java class for OffLocationServiceCoreType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OffLocationServiceCoreType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Address" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AddressType">
 *                 &lt;attribute name="SiteID" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *                 &lt;attribute name="SiteName" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="Type" use="required" type="{http://www.opentravel.org/OTA/2003/05}OffLocationServiceID_Type" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OffLocationServiceCoreType", propOrder = {
    "address"
})
@XmlSeeAlso({
    OffLocationServiceType.class
})
public class OffLocationServiceCoreType {

    @XmlElement(name = "Address")
    protected OffLocationServiceCoreType.Address address;
    @XmlAttribute(name = "Type", required = true)
    protected OffLocationServiceIDType type;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link OffLocationServiceCoreType.Address }
     *     
     */
    public OffLocationServiceCoreType.Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link OffLocationServiceCoreType.Address }
     *     
     */
    public void setAddress(OffLocationServiceCoreType.Address value) {
        this.address = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link OffLocationServiceIDType }
     *     
     */
    public OffLocationServiceIDType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link OffLocationServiceIDType }
     *     
     */
    public void setType(OffLocationServiceIDType value) {
        this.type = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AddressType">
     *       &lt;attribute name="SiteID" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
     *       &lt;attribute name="SiteName" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Address
        extends AddressType
    {

        @XmlAttribute(name = "SiteID")
        protected String siteID;
        @XmlAttribute(name = "SiteName")
        protected String siteName;

        /**
         * Gets the value of the siteID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSiteID() {
            return siteID;
        }

        /**
         * Sets the value of the siteID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSiteID(String value) {
            this.siteID = value;
        }

        /**
         * Gets the value of the siteName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSiteName() {
            return siteName;
        }

        /**
         * Sets the value of the siteName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSiteName(String value) {
            this.siteName = value;
        }

    }

}

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
 * The VehicleAvailRSType complex type identifies the data that is considered common when describing the availability and rates of rental vehicles.
 * 
 * <p>Java class for VehicleAvailRSCoreType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleAvailRSCoreType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VehRentalCore" type="{}VehicleRentalCoreType"/>
 *         &lt;element name="VehVendorAvails">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="VehVendorAvail" type="{}VehicleVendorAvailabilityType" maxOccurs="20"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
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
@XmlType(name = "VehicleAvailRSCoreType", propOrder = {
    "vehRentalCore",
    "vehVendorAvails"
})
public class VehicleAvailRSCoreType {

    @XmlElement(name = "VehRentalCore", required = true)
    protected VehicleRentalCoreType vehRentalCore;
    @XmlElement(name = "VehVendorAvails", required = true)
    protected VehicleAvailRSCoreType.VehVendorAvails vehVendorAvails;

    /**
     * Gets the value of the vehRentalCore property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleRentalCoreType }
     *     
     */
    public VehicleRentalCoreType getVehRentalCore() {
        return vehRentalCore;
    }

    /**
     * Sets the value of the vehRentalCore property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleRentalCoreType }
     *     
     */
    public void setVehRentalCore(VehicleRentalCoreType value) {
        this.vehRentalCore = value;
    }

    /**
     * Gets the value of the vehVendorAvails property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleAvailRSCoreType.VehVendorAvails }
     *     
     */
    public VehicleAvailRSCoreType.VehVendorAvails getVehVendorAvails() {
        return vehVendorAvails;
    }

    /**
     * Sets the value of the vehVendorAvails property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleAvailRSCoreType.VehVendorAvails }
     *     
     */
    public void setVehVendorAvails(VehicleAvailRSCoreType.VehVendorAvails value) {
        this.vehVendorAvails = value;
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
     *         &lt;element name="VehVendorAvail" type="{}VehicleVendorAvailabilityType" maxOccurs="20"/>
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
        "vehVendorAvail"
    })
    public static class VehVendorAvails {

        @XmlElement(name = "VehVendorAvail", required = true)
        protected List<VehicleVendorAvailabilityType> vehVendorAvail;

        /**
         * Gets the value of the vehVendorAvail property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the vehVendorAvail property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVehVendorAvail().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link VehicleVendorAvailabilityType }
         * 
         * 
         */
        public List<VehicleVendorAvailabilityType> getVehVendorAvail() {
            if (vehVendorAvail == null) {
                vehVendorAvail = new ArrayList<VehicleVendorAvailabilityType>();
            }
            return this.vehVendorAvail;
        }

    }

}

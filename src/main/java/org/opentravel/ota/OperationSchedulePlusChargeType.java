//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.07.11 at 07:19:31 PM IST 
//


package org.opentravel.ota;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * This allows a charge to be associated with operating times (e.g. a golf tee time may be more expensive during peak hours v. off peak hours).
 * 
 * <p>Java class for OperationSchedulePlusChargeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OperationSchedulePlusChargeType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}OperationScheduleType">
 *       &lt;sequence>
 *         &lt;element name="Charge" type="{http://www.opentravel.org/OTA/2003/05}FeeType" maxOccurs="5" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperationSchedulePlusChargeType", propOrder = {
    "charge"
})
@XmlSeeAlso({
    OperationSchedulesPlusChargeType.OperationSchedule.class
})
public class OperationSchedulePlusChargeType
    extends OperationScheduleType
{

    @XmlElement(name = "Charge")
    protected List<FeeType> charge;

    /**
     * Gets the value of the charge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the charge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCharge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeeType }
     * 
     * 
     */
    public List<FeeType> getCharge() {
        if (charge == null) {
            charge = new ArrayList<FeeType>();
        }
        return this.charge;
    }

}

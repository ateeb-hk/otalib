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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Types of accommodations and services available for passenger purchase on a train.
 * 
 * <p>Java class for AccommodationServiceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccommodationServiceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccommodationDetail" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{}RailAccommDetailType">
 *                 &lt;attribute name="ReferenceTravelerRPH" type="{}RPH_Type" />
 *                 &lt;attribute name="ReferenceInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{}AncillaryService" maxOccurs="99" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccommodationServiceType", propOrder = {
    "accommodationDetail",
    "ancillaryService"
})
@XmlSeeAlso({
    generated.BookedTrainSegmentType.Assignment.class
})
public class AccommodationServiceType {

    @XmlElement(name = "AccommodationDetail")
    protected AccommodationServiceType.AccommodationDetail accommodationDetail;
    @XmlElement(name = "AncillaryService")
    protected List<AncillaryService> ancillaryService;

    /**
     * Gets the value of the accommodationDetail property.
     * 
     * @return
     *     possible object is
     *     {@link AccommodationServiceType.AccommodationDetail }
     *     
     */
    public AccommodationServiceType.AccommodationDetail getAccommodationDetail() {
        return accommodationDetail;
    }

    /**
     * Sets the value of the accommodationDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccommodationServiceType.AccommodationDetail }
     *     
     */
    public void setAccommodationDetail(AccommodationServiceType.AccommodationDetail value) {
        this.accommodationDetail = value;
    }

    /**
     * Gets the value of the ancillaryService property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ancillaryService property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAncillaryService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AncillaryService }
     * 
     * 
     */
    public List<AncillaryService> getAncillaryService() {
        if (ancillaryService == null) {
            ancillaryService = new ArrayList<AncillaryService>();
        }
        return this.ancillaryService;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{}RailAccommDetailType">
     *       &lt;attribute name="ReferenceTravelerRPH" type="{}RPH_Type" />
     *       &lt;attribute name="ReferenceInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AccommodationDetail
        extends RailAccommDetailType
    {

        @XmlAttribute(name = "ReferenceTravelerRPH")
        protected String referenceTravelerRPH;
        @XmlAttribute(name = "ReferenceInd")
        protected Boolean referenceInd;

        /**
         * Gets the value of the referenceTravelerRPH property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReferenceTravelerRPH() {
            return referenceTravelerRPH;
        }

        /**
         * Sets the value of the referenceTravelerRPH property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReferenceTravelerRPH(String value) {
            this.referenceTravelerRPH = value;
        }

        /**
         * Gets the value of the referenceInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isReferenceInd() {
            return referenceInd;
        }

        /**
         * Sets the value of the referenceInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setReferenceInd(Boolean value) {
            this.referenceInd = value;
        }

    }

}

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
 * A collection of ResGuest objects, identifying the guests associated with this reservation. Which guests are in which room is determined by each RoomStays ResGuestRPHs collection.
 * 
 * <p>Java class for ResGuestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResGuestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Profiles" type="{}ProfilesType" minOccurs="0"/>
 *         &lt;element name="SpecialRequests" type="{}SpecialRequestType" minOccurs="0"/>
 *         &lt;element name="Comments" type="{}CommentType" minOccurs="0"/>
 *         &lt;element name="ServiceRPHs" type="{}ServiceRPHsType" minOccurs="0"/>
 *         &lt;element name="ProfileRPHs" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ProfileRPH" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="RPH" type="{}RPH_Type" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ArrivalTransport" type="{}TransportInfoType" minOccurs="0"/>
 *         &lt;element name="DepartureTransport" type="{}TransportInfoType" minOccurs="0"/>
 *         &lt;element name="GuestCounts" type="{}GuestCountType" minOccurs="0"/>
 *         &lt;element name="InHouseTimeSpan" type="{}DateTimeSpanType" minOccurs="0"/>
 *         &lt;element ref="{}TPA_Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{}LocationGroup"/>
 *       &lt;attribute name="ResGuestRPH" type="{}RPH_Type" />
 *       &lt;attribute name="AgeQualifyingCode" type="{}OTA_CodeType" />
 *       &lt;attribute name="ArrivalTime" type="{http://www.w3.org/2001/XMLSchema}time" />
 *       &lt;attribute name="DepartureTime" type="{http://www.w3.org/2001/XMLSchema}time" />
 *       &lt;attribute name="GroupEventCode" type="{}StringLength1to16" />
 *       &lt;attribute name="VIP" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="PrimaryIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Age" type="{}Numeric0to999" />
 *       &lt;attribute name="Action" type="{}ActionType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResGuestType", propOrder = {
    "profiles",
    "specialRequests",
    "comments",
    "serviceRPHs",
    "profileRPHs",
    "arrivalTransport",
    "departureTransport",
    "guestCounts",
    "inHouseTimeSpan",
    "tpaExtensions"
})
public class ResGuestType {

    @XmlElement(name = "Profiles")
    protected ProfilesType profiles;
    @XmlElement(name = "SpecialRequests")
    protected SpecialRequestType specialRequests;
    @XmlElement(name = "Comments")
    protected CommentType comments;
    @XmlElement(name = "ServiceRPHs")
    protected ServiceRPHsType serviceRPHs;
    @XmlElement(name = "ProfileRPHs")
    protected ResGuestType.ProfileRPHs profileRPHs;
    @XmlElement(name = "ArrivalTransport")
    protected TransportInfoType arrivalTransport;
    @XmlElement(name = "DepartureTransport")
    protected TransportInfoType departureTransport;
    @XmlElement(name = "GuestCounts")
    protected GuestCountType guestCounts;
    @XmlElement(name = "InHouseTimeSpan")
    protected DateTimeSpanType inHouseTimeSpan;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType tpaExtensions;
    @XmlAttribute(name = "ResGuestRPH")
    protected String resGuestRPH;
    @XmlAttribute(name = "AgeQualifyingCode")
    protected String ageQualifyingCode;
    @XmlAttribute(name = "ArrivalTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar arrivalTime;
    @XmlAttribute(name = "DepartureTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar departureTime;
    @XmlAttribute(name = "GroupEventCode")
    protected String groupEventCode;
    @XmlAttribute(name = "VIP")
    protected Boolean vip;
    @XmlAttribute(name = "PrimaryIndicator")
    protected Boolean primaryIndicator;
    @XmlAttribute(name = "Age")
    protected Integer age;
    @XmlAttribute(name = "Action")
    protected ActionType action;
    @XmlAttribute(name = "LocationCode")
    protected String locationCode;
    @XmlAttribute(name = "CodeContext")
    protected String codeContext;

    /**
     * Gets the value of the profiles property.
     * 
     * @return
     *     possible object is
     *     {@link ProfilesType }
     *     
     */
    public ProfilesType getProfiles() {
        return profiles;
    }

    /**
     * Sets the value of the profiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfilesType }
     *     
     */
    public void setProfiles(ProfilesType value) {
        this.profiles = value;
    }

    /**
     * Gets the value of the specialRequests property.
     * 
     * @return
     *     possible object is
     *     {@link SpecialRequestType }
     *     
     */
    public SpecialRequestType getSpecialRequests() {
        return specialRequests;
    }

    /**
     * Sets the value of the specialRequests property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialRequestType }
     *     
     */
    public void setSpecialRequests(SpecialRequestType value) {
        this.specialRequests = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link CommentType }
     *     
     */
    public CommentType getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommentType }
     *     
     */
    public void setComments(CommentType value) {
        this.comments = value;
    }

    /**
     * Gets the value of the serviceRPHs property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceRPHsType }
     *     
     */
    public ServiceRPHsType getServiceRPHs() {
        return serviceRPHs;
    }

    /**
     * Sets the value of the serviceRPHs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceRPHsType }
     *     
     */
    public void setServiceRPHs(ServiceRPHsType value) {
        this.serviceRPHs = value;
    }

    /**
     * Gets the value of the profileRPHs property.
     * 
     * @return
     *     possible object is
     *     {@link ResGuestType.ProfileRPHs }
     *     
     */
    public ResGuestType.ProfileRPHs getProfileRPHs() {
        return profileRPHs;
    }

    /**
     * Sets the value of the profileRPHs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResGuestType.ProfileRPHs }
     *     
     */
    public void setProfileRPHs(ResGuestType.ProfileRPHs value) {
        this.profileRPHs = value;
    }

    /**
     * Gets the value of the arrivalTransport property.
     * 
     * @return
     *     possible object is
     *     {@link TransportInfoType }
     *     
     */
    public TransportInfoType getArrivalTransport() {
        return arrivalTransport;
    }

    /**
     * Sets the value of the arrivalTransport property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportInfoType }
     *     
     */
    public void setArrivalTransport(TransportInfoType value) {
        this.arrivalTransport = value;
    }

    /**
     * Gets the value of the departureTransport property.
     * 
     * @return
     *     possible object is
     *     {@link TransportInfoType }
     *     
     */
    public TransportInfoType getDepartureTransport() {
        return departureTransport;
    }

    /**
     * Sets the value of the departureTransport property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportInfoType }
     *     
     */
    public void setDepartureTransport(TransportInfoType value) {
        this.departureTransport = value;
    }

    /**
     * Gets the value of the guestCounts property.
     * 
     * @return
     *     possible object is
     *     {@link GuestCountType }
     *     
     */
    public GuestCountType getGuestCounts() {
        return guestCounts;
    }

    /**
     * Sets the value of the guestCounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link GuestCountType }
     *     
     */
    public void setGuestCounts(GuestCountType value) {
        this.guestCounts = value;
    }

    /**
     * Gets the value of the inHouseTimeSpan property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeSpanType }
     *     
     */
    public DateTimeSpanType getInHouseTimeSpan() {
        return inHouseTimeSpan;
    }

    /**
     * Sets the value of the inHouseTimeSpan property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeSpanType }
     *     
     */
    public void setInHouseTimeSpan(DateTimeSpanType value) {
        this.inHouseTimeSpan = value;
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
     * Gets the value of the resGuestRPH property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResGuestRPH() {
        return resGuestRPH;
    }

    /**
     * Sets the value of the resGuestRPH property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResGuestRPH(String value) {
        this.resGuestRPH = value;
    }

    /**
     * Gets the value of the ageQualifyingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgeQualifyingCode() {
        return ageQualifyingCode;
    }

    /**
     * Sets the value of the ageQualifyingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgeQualifyingCode(String value) {
        this.ageQualifyingCode = value;
    }

    /**
     * Gets the value of the arrivalTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getArrivalTime() {
        return arrivalTime;
    }

    /**
     * Sets the value of the arrivalTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setArrivalTime(XMLGregorianCalendar value) {
        this.arrivalTime = value;
    }

    /**
     * Gets the value of the departureTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDepartureTime() {
        return departureTime;
    }

    /**
     * Sets the value of the departureTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDepartureTime(XMLGregorianCalendar value) {
        this.departureTime = value;
    }

    /**
     * Gets the value of the groupEventCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupEventCode() {
        return groupEventCode;
    }

    /**
     * Sets the value of the groupEventCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupEventCode(String value) {
        this.groupEventCode = value;
    }

    /**
     * Gets the value of the vip property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVIP() {
        return vip;
    }

    /**
     * Sets the value of the vip property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVIP(Boolean value) {
        this.vip = value;
    }

    /**
     * Gets the value of the primaryIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrimaryIndicator() {
        return primaryIndicator;
    }

    /**
     * Sets the value of the primaryIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrimaryIndicator(Boolean value) {
        this.primaryIndicator = value;
    }

    /**
     * Gets the value of the age property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAge() {
        return age;
    }

    /**
     * Sets the value of the age property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAge(Integer value) {
        this.age = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link ActionType }
     *     
     */
    public ActionType getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionType }
     *     
     */
    public void setAction(ActionType value) {
        this.action = value;
    }

    /**
     * Gets the value of the locationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationCode() {
        return locationCode;
    }

    /**
     * Sets the value of the locationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationCode(String value) {
        this.locationCode = value;
    }

    /**
     * Gets the value of the codeContext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeContext() {
        return codeContext;
    }

    /**
     * Sets the value of the codeContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeContext(String value) {
        this.codeContext = value;
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
     *         &lt;element name="ProfileRPH" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="RPH" type="{}RPH_Type" />
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
    @XmlType(name = "", propOrder = {
        "profileRPH"
    })
    public static class ProfileRPHs {

        @XmlElement(name = "ProfileRPH", required = true)
        protected List<ResGuestType.ProfileRPHs.ProfileRPH> profileRPH;

        /**
         * Gets the value of the profileRPH property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the profileRPH property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProfileRPH().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ResGuestType.ProfileRPHs.ProfileRPH }
         * 
         * 
         */
        public List<ResGuestType.ProfileRPHs.ProfileRPH> getProfileRPH() {
            if (profileRPH == null) {
                profileRPH = new ArrayList<ResGuestType.ProfileRPHs.ProfileRPH>();
            }
            return this.profileRPH;
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
         *       &lt;attribute name="RPH" type="{}RPH_Type" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class ProfileRPH {

            @XmlAttribute(name = "RPH")
            protected String rph;

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

    }

}

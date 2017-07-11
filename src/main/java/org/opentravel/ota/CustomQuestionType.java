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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomQuestionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomQuestionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="QuestionText" type="{http://www.opentravel.org/OTA/2003/05}FormattedTextTextType" minOccurs="0"/>
 *         &lt;element name="ProvidedAnswerChoices" maxOccurs="10" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>FormattedTextTextType">
 *                 &lt;attribute name="AnswerID" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AnswerText" type="{http://www.opentravel.org/OTA/2003/05}FormattedTextTextType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="QuestionID" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *       &lt;attribute name="QuestionTypeCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *       &lt;attribute name="QuestionCategoryCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *       &lt;attribute name="AnswerRequiredInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomQuestionType", propOrder = {
    "questionText",
    "providedAnswerChoices",
    "answerText"
})
public class CustomQuestionType {

    @XmlElement(name = "QuestionText")
    protected FormattedTextTextType questionText;
    @XmlElement(name = "ProvidedAnswerChoices")
    protected List<CustomQuestionType.ProvidedAnswerChoices> providedAnswerChoices;
    @XmlElement(name = "AnswerText")
    protected FormattedTextTextType answerText;
    @XmlAttribute(name = "QuestionID")
    protected String questionID;
    @XmlAttribute(name = "QuestionTypeCode")
    protected String questionTypeCode;
    @XmlAttribute(name = "QuestionCategoryCode")
    protected String questionCategoryCode;
    @XmlAttribute(name = "AnswerRequiredInd")
    protected Boolean answerRequiredInd;

    /**
     * Gets the value of the questionText property.
     * 
     * @return
     *     possible object is
     *     {@link FormattedTextTextType }
     *     
     */
    public FormattedTextTextType getQuestionText() {
        return questionText;
    }

    /**
     * Sets the value of the questionText property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormattedTextTextType }
     *     
     */
    public void setQuestionText(FormattedTextTextType value) {
        this.questionText = value;
    }

    /**
     * Gets the value of the providedAnswerChoices property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the providedAnswerChoices property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProvidedAnswerChoices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomQuestionType.ProvidedAnswerChoices }
     * 
     * 
     */
    public List<CustomQuestionType.ProvidedAnswerChoices> getProvidedAnswerChoices() {
        if (providedAnswerChoices == null) {
            providedAnswerChoices = new ArrayList<CustomQuestionType.ProvidedAnswerChoices>();
        }
        return this.providedAnswerChoices;
    }

    /**
     * Gets the value of the answerText property.
     * 
     * @return
     *     possible object is
     *     {@link FormattedTextTextType }
     *     
     */
    public FormattedTextTextType getAnswerText() {
        return answerText;
    }

    /**
     * Sets the value of the answerText property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormattedTextTextType }
     *     
     */
    public void setAnswerText(FormattedTextTextType value) {
        this.answerText = value;
    }

    /**
     * Gets the value of the questionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuestionID() {
        return questionID;
    }

    /**
     * Sets the value of the questionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuestionID(String value) {
        this.questionID = value;
    }

    /**
     * Gets the value of the questionTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuestionTypeCode() {
        return questionTypeCode;
    }

    /**
     * Sets the value of the questionTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuestionTypeCode(String value) {
        this.questionTypeCode = value;
    }

    /**
     * Gets the value of the questionCategoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuestionCategoryCode() {
        return questionCategoryCode;
    }

    /**
     * Sets the value of the questionCategoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuestionCategoryCode(String value) {
        this.questionCategoryCode = value;
    }

    /**
     * Gets the value of the answerRequiredInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAnswerRequiredInd() {
        return answerRequiredInd;
    }

    /**
     * Sets the value of the answerRequiredInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAnswerRequiredInd(Boolean value) {
        this.answerRequiredInd = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>FormattedTextTextType">
     *       &lt;attribute name="AnswerID" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ProvidedAnswerChoices
        extends FormattedTextTextType
    {

        @XmlAttribute(name = "AnswerID")
        protected String answerID;

        /**
         * Gets the value of the answerID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAnswerID() {
            return answerID;
        }

        /**
         * Sets the value of the answerID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAnswerID(String value) {
            this.answerID = value;
        }

    }

}

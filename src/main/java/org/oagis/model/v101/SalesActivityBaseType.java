//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 05:03:50 PM CST 
//


package org.oagis.model.v101;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Sales Activity Base Type for detailing the minimum information needed for a sales event or activity
 * 
 * <p>Java class for SalesActivityBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SalesActivityBaseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}IdentificationType">
 *       &lt;sequence>
 *         &lt;element name="DateTime" type="{http://www.openapplications.org/oagis/10}OpenDateTimeType" minOccurs="0"/>
 *         &lt;element name="MaterialRequested" type="{http://www.openapplications.org/oagis/10}TextType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MaterialSent" type="{http://www.openapplications.org/oagis/10}TextType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EmailResultCode" type="{http://www.openapplications.org/oagis/10}CodeType" minOccurs="0"/>
 *         &lt;element name="RequestContactIndicator" type="{http://www.openapplications.org/oagis/10}IndicatorType" minOccurs="0"/>
 *         &lt;element name="Result" type="{http://www.openapplications.org/oagis/10}TextType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.openapplications.org/oagis/10}FreeFormTextGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalesActivityBaseType", propOrder = {
    "dateTime",
    "materialRequested",
    "materialSent",
    "emailResultCode",
    "requestContactIndicator",
    "result",
    "description",
    "note"
})
@XmlSeeAlso({
    SalesActivityType.class
})
public class SalesActivityBaseType
    extends IdentificationType
{

    @XmlElement(name = "DateTime")
    protected OpenDateTimeType dateTime;
    @XmlElement(name = "MaterialRequested")
    protected List<TextType> materialRequested;
    @XmlElement(name = "MaterialSent")
    protected List<TextType> materialSent;
    @XmlElement(name = "EmailResultCode")
    protected CodeType emailResultCode;
    @XmlElement(name = "RequestContactIndicator")
    protected Boolean requestContactIndicator;
    @XmlElement(name = "Result")
    protected List<TextType> result;
    @XmlElement(name = "Description")
    protected List<DescriptionType> description;
    @XmlElement(name = "Note")
    protected List<NoteType> note;

    /**
     * Gets the value of the dateTime property.
     * 
     * @return
     *     possible object is
     *     {@link OpenDateTimeType }
     *     
     */
    public OpenDateTimeType getDateTime() {
        return dateTime;
    }

    /**
     * Sets the value of the dateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenDateTimeType }
     *     
     */
    public void setDateTime(OpenDateTimeType value) {
        this.dateTime = value;
    }

    /**
     * Gets the value of the materialRequested property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the materialRequested property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaterialRequested().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextType }
     * 
     * 
     */
    public List<TextType> getMaterialRequested() {
        if (materialRequested == null) {
            materialRequested = new ArrayList<TextType>();
        }
        return this.materialRequested;
    }

    /**
     * Gets the value of the materialSent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the materialSent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaterialSent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextType }
     * 
     * 
     */
    public List<TextType> getMaterialSent() {
        if (materialSent == null) {
            materialSent = new ArrayList<TextType>();
        }
        return this.materialSent;
    }

    /**
     * Gets the value of the emailResultCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getEmailResultCode() {
        return emailResultCode;
    }

    /**
     * Sets the value of the emailResultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setEmailResultCode(CodeType value) {
        this.emailResultCode = value;
    }

    /**
     * Gets the value of the requestContactIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequestContactIndicator() {
        return requestContactIndicator;
    }

    /**
     * Sets the value of the requestContactIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequestContactIndicator(Boolean value) {
        this.requestContactIndicator = value;
    }

    /**
     * Gets the value of the result property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the result property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextType }
     * 
     * 
     */
    public List<TextType> getResult() {
        if (result == null) {
            result = new ArrayList<TextType>();
        }
        return this.result;
    }

    /**
     * Gets the value of the description property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescriptionType }
     * 
     * 
     */
    public List<DescriptionType> getDescription() {
        if (description == null) {
            description = new ArrayList<DescriptionType>();
        }
        return this.description;
    }

    /**
     * Gets the value of the note property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the note property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NoteType }
     * 
     * 
     */
    public List<NoteType> getNote() {
        if (note == null) {
            note = new ArrayList<NoteType>();
        }
        return this.note;
    }

}
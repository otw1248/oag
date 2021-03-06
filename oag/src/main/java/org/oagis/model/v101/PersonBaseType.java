//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 05:00:59 PM CST 
//


package org.oagis.model.v101;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Person ABIE Type is the base type for person. Person and Party are logically related. PersonABIEType is logically derived from UN/CEFACT TBG17 ABIE PersonType as defined in the Reusable Aggregate Business Information Entity (RUABIE) XML Schema file.
 * 
 * <p>Java class for PersonBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonBaseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}IdentificationType">
 *       &lt;sequence>
 *         &lt;element name="PersonName" type="{http://www.openapplications.org/oagis/10}PersonNameType" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.openapplications.org/oagis/10}DescriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="GenderCode" type="{http://www.openapplications.org/oagis/10}GenderCodeType" minOccurs="0"/>
 *         &lt;element name="MaritalStatusCode" type="{http://www.openapplications.org/oagis/10}MaritalStatusCodeType" minOccurs="0"/>
 *         &lt;element name="BirthDateTime" type="{http://www.openapplications.org/oagis/10}DateTimeType" minOccurs="0"/>
 *         &lt;element name="DeathDateTime" type="{http://www.openapplications.org/oagis/10}DateTimeType" minOccurs="0"/>
 *         &lt;element name="AgeMeasure" type="{http://www.openapplications.org/oagis/10}MeasureType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="LanguageCode" type="{http://www.openapplications.org/oagis/10}LanguageCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="NationalityCountryCode" type="{http://www.openapplications.org/oagis/10}CountryCodeType" minOccurs="0"/>
 *         &lt;element name="Address" type="{http://www.openapplications.org/oagis/10}AddressType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Communication" type="{http://www.openapplications.org/oagis/10}CommunicationType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonBaseType", propOrder = {
    "personName",
    "description",
    "genderCode",
    "maritalStatusCode",
    "birthDateTime",
    "deathDateTime",
    "ageMeasure",
    "languageCode",
    "nationalityCountryCode",
    "address",
    "communication"
})
@XmlSeeAlso({
    EmployeeBaseType.class
})
public abstract class PersonBaseType
    extends IdentificationType
{

    @XmlElement(name = "PersonName")
    protected PersonNameType personName;
    @XmlElement(name = "Description")
    protected List<DescriptionType> description;
    @XmlElement(name = "GenderCode")
    protected GenderCodeType genderCode;
    @XmlElement(name = "MaritalStatusCode")
    protected MaritalStatusCodeType maritalStatusCode;
    @XmlElement(name = "BirthDateTime")
    @XmlSchemaType(name = "anySimpleType")
    protected String birthDateTime;
    @XmlElement(name = "DeathDateTime")
    @XmlSchemaType(name = "anySimpleType")
    protected String deathDateTime;
    @XmlElement(name = "AgeMeasure")
    protected List<MeasureType> ageMeasure;
    @XmlElement(name = "LanguageCode")
    protected List<LanguageCodeType> languageCode;
    @XmlElement(name = "NationalityCountryCode")
    protected CountryCodeType nationalityCountryCode;
    @XmlElement(name = "Address")
    protected List<AddressType> address;
    @XmlElement(name = "Communication")
    protected List<CommunicationType> communication;

    /**
     * Gets the value of the personName property.
     * 
     * @return
     *     possible object is
     *     {@link PersonNameType }
     *     
     */
    public PersonNameType getPersonName() {
        return personName;
    }

    /**
     * Sets the value of the personName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameType }
     *     
     */
    public void setPersonName(PersonNameType value) {
        this.personName = value;
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
     * Gets the value of the genderCode property.
     * 
     * @return
     *     possible object is
     *     {@link GenderCodeType }
     *     
     */
    public GenderCodeType getGenderCode() {
        return genderCode;
    }

    /**
     * Sets the value of the genderCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenderCodeType }
     *     
     */
    public void setGenderCode(GenderCodeType value) {
        this.genderCode = value;
    }

    /**
     * Gets the value of the maritalStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link MaritalStatusCodeType }
     *     
     */
    public MaritalStatusCodeType getMaritalStatusCode() {
        return maritalStatusCode;
    }

    /**
     * Sets the value of the maritalStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaritalStatusCodeType }
     *     
     */
    public void setMaritalStatusCode(MaritalStatusCodeType value) {
        this.maritalStatusCode = value;
    }

    /**
     * Gets the value of the birthDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthDateTime() {
        return birthDateTime;
    }

    /**
     * Sets the value of the birthDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthDateTime(String value) {
        this.birthDateTime = value;
    }

    /**
     * Gets the value of the deathDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeathDateTime() {
        return deathDateTime;
    }

    /**
     * Sets the value of the deathDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeathDateTime(String value) {
        this.deathDateTime = value;
    }

    /**
     * Gets the value of the ageMeasure property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ageMeasure property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAgeMeasure().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasureType }
     * 
     * 
     */
    public List<MeasureType> getAgeMeasure() {
        if (ageMeasure == null) {
            ageMeasure = new ArrayList<MeasureType>();
        }
        return this.ageMeasure;
    }

    /**
     * Gets the value of the languageCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the languageCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLanguageCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LanguageCodeType }
     * 
     * 
     */
    public List<LanguageCodeType> getLanguageCode() {
        if (languageCode == null) {
            languageCode = new ArrayList<LanguageCodeType>();
        }
        return this.languageCode;
    }

    /**
     * Gets the value of the nationalityCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link CountryCodeType }
     *     
     */
    public CountryCodeType getNationalityCountryCode() {
        return nationalityCountryCode;
    }

    /**
     * Sets the value of the nationalityCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryCodeType }
     *     
     */
    public void setNationalityCountryCode(CountryCodeType value) {
        this.nationalityCountryCode = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the address property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddressType }
     * 
     * 
     */
    public List<AddressType> getAddress() {
        if (address == null) {
            address = new ArrayList<AddressType>();
        }
        return this.address;
    }

    /**
     * Gets the value of the communication property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the communication property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommunication().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommunicationType }
     * 
     * 
     */
    public List<CommunicationType> getCommunication() {
        if (communication == null) {
            communication = new ArrayList<CommunicationType>();
        }
        return this.communication;
    }

}

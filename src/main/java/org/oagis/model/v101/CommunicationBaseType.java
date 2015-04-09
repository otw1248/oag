//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 05:04:55 PM CST 
//


package org.oagis.model.v101;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * CommunicationABIEType is logically derived from UN/CEFACT TBG17 ABIE CommunicationType as defined in the Reusable Aggregate Business Information Entity (RUABIE) XML Schema file.
 * 
 * <p>Java class for CommunicationBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommunicationBaseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}IdentificationType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.openapplications.org/oagis/10}OpenNameType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ChannelCode" type="{http://www.openapplications.org/oagis/10}CodeType" minOccurs="0"/>
 *         &lt;element name="UseCode" type="{http://www.openapplications.org/oagis/10}CodeType" minOccurs="0"/>
 *         &lt;element name="CountryDialingCode" type="{http://www.openapplications.org/oagis/10}CodeType" minOccurs="0"/>
 *         &lt;element name="AreaDialingCode" type="{http://www.openapplications.org/oagis/10}CodeType" minOccurs="0"/>
 *         &lt;element name="DialNumber" type="{http://www.openapplications.org/oagis/10}TextType" minOccurs="0"/>
 *         &lt;element name="PhoneExtension" type="{http://www.openapplications.org/oagis/10}TextType" minOccurs="0"/>
 *         &lt;element name="Access" type="{http://www.openapplications.org/oagis/10}TextType" minOccurs="0"/>
 *         &lt;element name="Address" type="{http://www.openapplications.org/oagis/10}AddressType" minOccurs="0"/>
 *         &lt;element name="URI" type="{http://www.openapplications.org/oagis/10}URIType" minOccurs="0"/>
 *         &lt;element name="HTMLPreferredIndicator" type="{http://www.openapplications.org/oagis/10}IndicatorType" minOccurs="0"/>
 *         &lt;element name="Text" type="{http://www.openapplications.org/oagis/10}OpenTextType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EffectiveTimePeriod" type="{http://www.openapplications.org/oagis/10}TimePeriodType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Preference" type="{http://www.openapplications.org/oagis/10}PreferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="sequenceNumber" type="{http://www.openapplications.org/oagis/10}NumberType_B98233" />
 *       &lt;attribute name="preferredIndicator" type="{http://www.openapplications.org/oagis/10}IndicatorType_CVW231" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommunicationBaseType", propOrder = {
    "name",
    "channelCode",
    "useCode",
    "countryDialingCode",
    "areaDialingCode",
    "dialNumber",
    "phoneExtension",
    "access",
    "address",
    "uri",
    "htmlPreferredIndicator",
    "text",
    "effectiveTimePeriod",
    "preference"
})
@XmlSeeAlso({
    CommunicationType.class
})
public class CommunicationBaseType
    extends IdentificationType
{

    @XmlElement(name = "Name")
    protected List<OpenNameType> name;
    @XmlElement(name = "ChannelCode")
    protected CodeType channelCode;
    @XmlElement(name = "UseCode")
    protected CodeType useCode;
    @XmlElement(name = "CountryDialingCode")
    protected CodeType countryDialingCode;
    @XmlElement(name = "AreaDialingCode")
    protected CodeType areaDialingCode;
    @XmlElement(name = "DialNumber")
    protected TextType dialNumber;
    @XmlElement(name = "PhoneExtension")
    protected TextType phoneExtension;
    @XmlElement(name = "Access")
    protected TextType access;
    @XmlElement(name = "Address")
    protected AddressType address;
    @XmlElement(name = "URI")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String uri;
    @XmlElement(name = "HTMLPreferredIndicator")
    protected Boolean htmlPreferredIndicator;
    @XmlElement(name = "Text")
    protected List<OpenTextType> text;
    @XmlElement(name = "EffectiveTimePeriod")
    protected List<TimePeriodType> effectiveTimePeriod;
    @XmlElement(name = "Preference")
    protected List<PreferenceType> preference;
    @XmlAttribute(name = "sequenceNumber")
    protected BigInteger sequenceNumber;
    @XmlAttribute(name = "preferredIndicator")
    protected Boolean preferredIndicator;

    /**
     * Gets the value of the name property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the name property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpenNameType }
     * 
     * 
     */
    public List<OpenNameType> getName() {
        if (name == null) {
            name = new ArrayList<OpenNameType>();
        }
        return this.name;
    }

    /**
     * Gets the value of the channelCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getChannelCode() {
        return channelCode;
    }

    /**
     * Sets the value of the channelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setChannelCode(CodeType value) {
        this.channelCode = value;
    }

    /**
     * Gets the value of the useCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getUseCode() {
        return useCode;
    }

    /**
     * Sets the value of the useCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setUseCode(CodeType value) {
        this.useCode = value;
    }

    /**
     * Gets the value of the countryDialingCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getCountryDialingCode() {
        return countryDialingCode;
    }

    /**
     * Sets the value of the countryDialingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setCountryDialingCode(CodeType value) {
        this.countryDialingCode = value;
    }

    /**
     * Gets the value of the areaDialingCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getAreaDialingCode() {
        return areaDialingCode;
    }

    /**
     * Sets the value of the areaDialingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setAreaDialingCode(CodeType value) {
        this.areaDialingCode = value;
    }

    /**
     * Gets the value of the dialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getDialNumber() {
        return dialNumber;
    }

    /**
     * Sets the value of the dialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setDialNumber(TextType value) {
        this.dialNumber = value;
    }

    /**
     * Gets the value of the phoneExtension property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getPhoneExtension() {
        return phoneExtension;
    }

    /**
     * Sets the value of the phoneExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setPhoneExtension(TextType value) {
        this.phoneExtension = value;
    }

    /**
     * Gets the value of the access property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getAccess() {
        return access;
    }

    /**
     * Sets the value of the access property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setAccess(TextType value) {
        this.access = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setAddress(AddressType value) {
        this.address = value;
    }

    /**
     * Gets the value of the uri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURI() {
        return uri;
    }

    /**
     * Sets the value of the uri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURI(String value) {
        this.uri = value;
    }

    /**
     * Gets the value of the htmlPreferredIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHTMLPreferredIndicator() {
        return htmlPreferredIndicator;
    }

    /**
     * Sets the value of the htmlPreferredIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHTMLPreferredIndicator(Boolean value) {
        this.htmlPreferredIndicator = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the text property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpenTextType }
     * 
     * 
     */
    public List<OpenTextType> getText() {
        if (text == null) {
            text = new ArrayList<OpenTextType>();
        }
        return this.text;
    }

    /**
     * Gets the value of the effectiveTimePeriod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the effectiveTimePeriod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEffectiveTimePeriod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimePeriodType }
     * 
     * 
     */
    public List<TimePeriodType> getEffectiveTimePeriod() {
        if (effectiveTimePeriod == null) {
            effectiveTimePeriod = new ArrayList<TimePeriodType>();
        }
        return this.effectiveTimePeriod;
    }

    /**
     * Gets the value of the preference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the preference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PreferenceType }
     * 
     * 
     */
    public List<PreferenceType> getPreference() {
        if (preference == null) {
            preference = new ArrayList<PreferenceType>();
        }
        return this.preference;
    }

    /**
     * Gets the value of the sequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Sets the value of the sequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSequenceNumber(BigInteger value) {
        this.sequenceNumber = value;
    }

    /**
     * Gets the value of the preferredIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPreferredIndicator() {
        return preferredIndicator;
    }

    /**
     * Sets the value of the preferredIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreferredIndicator(Boolean value) {
        this.preferredIndicator = value;
    }

}
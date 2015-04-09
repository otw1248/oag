//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 05:00:45 PM CST 
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
 * <p>Java class for PartyScreenBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartyScreenBaseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}IdentificationType">
 *       &lt;sequence>
 *         &lt;element name="ScreeningSearchTypeCode" type="{http://www.openapplications.org/oagis/10}CodeType" minOccurs="0"/>
 *         &lt;element name="ScreeningSearchTypeQualifierCode" type="{http://www.openapplications.org/oagis/10}CodeType" minOccurs="0"/>
 *         &lt;element name="SearchSanction" type="{http://www.openapplications.org/oagis/10}SearchSanctionType" minOccurs="0"/>
 *         &lt;element name="ScreeningListRecordValue" type="{http://www.openapplications.org/oagis/10}RecordFieldValueType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ScreeningListQualifierValue" type="{http://www.openapplications.org/oagis/10}RecordFieldValueType" minOccurs="0"/>
 *         &lt;element name="ScreenParty" type="{http://www.openapplications.org/oagis/10}ScreenPartyType" minOccurs="0"/>
 *         &lt;element name="Party" type="{http://www.openapplications.org/oagis/10}PartyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyScreenBaseType", propOrder = {
    "screeningSearchTypeCode",
    "screeningSearchTypeQualifierCode",
    "searchSanction",
    "screeningListRecordValue",
    "screeningListQualifierValue",
    "screenParty",
    "party"
})
@XmlSeeAlso({
    PartyScreenType.class
})
public class PartyScreenBaseType
    extends IdentificationType
{

    @XmlElement(name = "ScreeningSearchTypeCode")
    protected CodeType screeningSearchTypeCode;
    @XmlElement(name = "ScreeningSearchTypeQualifierCode")
    protected CodeType screeningSearchTypeQualifierCode;
    @XmlElement(name = "SearchSanction")
    protected SearchSanctionType searchSanction;
    @XmlElement(name = "ScreeningListRecordValue")
    protected List<RecordFieldValueType> screeningListRecordValue;
    @XmlElement(name = "ScreeningListQualifierValue")
    protected RecordFieldValueType screeningListQualifierValue;
    @XmlElement(name = "ScreenParty")
    protected ScreenPartyType screenParty;
    @XmlElement(name = "Party")
    protected List<PartyType> party;

    /**
     * Gets the value of the screeningSearchTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getScreeningSearchTypeCode() {
        return screeningSearchTypeCode;
    }

    /**
     * Sets the value of the screeningSearchTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setScreeningSearchTypeCode(CodeType value) {
        this.screeningSearchTypeCode = value;
    }

    /**
     * Gets the value of the screeningSearchTypeQualifierCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getScreeningSearchTypeQualifierCode() {
        return screeningSearchTypeQualifierCode;
    }

    /**
     * Sets the value of the screeningSearchTypeQualifierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setScreeningSearchTypeQualifierCode(CodeType value) {
        this.screeningSearchTypeQualifierCode = value;
    }

    /**
     * Gets the value of the searchSanction property.
     * 
     * @return
     *     possible object is
     *     {@link SearchSanctionType }
     *     
     */
    public SearchSanctionType getSearchSanction() {
        return searchSanction;
    }

    /**
     * Sets the value of the searchSanction property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchSanctionType }
     *     
     */
    public void setSearchSanction(SearchSanctionType value) {
        this.searchSanction = value;
    }

    /**
     * Gets the value of the screeningListRecordValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the screeningListRecordValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScreeningListRecordValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RecordFieldValueType }
     * 
     * 
     */
    public List<RecordFieldValueType> getScreeningListRecordValue() {
        if (screeningListRecordValue == null) {
            screeningListRecordValue = new ArrayList<RecordFieldValueType>();
        }
        return this.screeningListRecordValue;
    }

    /**
     * Gets the value of the screeningListQualifierValue property.
     * 
     * @return
     *     possible object is
     *     {@link RecordFieldValueType }
     *     
     */
    public RecordFieldValueType getScreeningListQualifierValue() {
        return screeningListQualifierValue;
    }

    /**
     * Sets the value of the screeningListQualifierValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordFieldValueType }
     *     
     */
    public void setScreeningListQualifierValue(RecordFieldValueType value) {
        this.screeningListQualifierValue = value;
    }

    /**
     * Gets the value of the screenParty property.
     * 
     * @return
     *     possible object is
     *     {@link ScreenPartyType }
     *     
     */
    public ScreenPartyType getScreenParty() {
        return screenParty;
    }

    /**
     * Sets the value of the screenParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScreenPartyType }
     *     
     */
    public void setScreenParty(ScreenPartyType value) {
        this.screenParty = value;
    }

    /**
     * Gets the value of the party property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the party property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyType }
     * 
     * 
     */
    public List<PartyType> getParty() {
        if (party == null) {
            party = new ArrayList<PartyType>();
        }
        return this.party;
    }

}

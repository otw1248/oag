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
 * <p>Java class for SalesLeadHeaderBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SalesLeadHeaderBaseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}CRMHeaderBaseType">
 *       &lt;sequence>
 *         &lt;element name="EffectiveTimePeriod" type="{http://www.openapplications.org/oagis/10}TimePeriodType" minOccurs="0"/>
 *         &lt;element name="AcceptedIndicator" type="{http://www.openapplications.org/oagis/10}IndicatorType" minOccurs="0"/>
 *         &lt;element name="QualifiedIndicator" type="{http://www.openapplications.org/oagis/10}IndicatorType" minOccurs="0"/>
 *         &lt;element name="PriorityCode" type="{http://www.openapplications.org/oagis/10}CodeType" minOccurs="0"/>
 *         &lt;element name="RankCode" type="{http://www.openapplications.org/oagis/10}CodeType" minOccurs="0"/>
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
@XmlType(name = "SalesLeadHeaderBaseType", propOrder = {
    "effectiveTimePeriod",
    "acceptedIndicator",
    "qualifiedIndicator",
    "priorityCode",
    "rankCode",
    "party"
})
@XmlSeeAlso({
    SalesLeadHeaderType.class
})
public class SalesLeadHeaderBaseType
    extends CRMHeaderBaseType
{

    @XmlElement(name = "EffectiveTimePeriod")
    protected TimePeriodType effectiveTimePeriod;
    @XmlElement(name = "AcceptedIndicator")
    protected Boolean acceptedIndicator;
    @XmlElement(name = "QualifiedIndicator")
    protected Boolean qualifiedIndicator;
    @XmlElement(name = "PriorityCode")
    protected CodeType priorityCode;
    @XmlElement(name = "RankCode")
    protected CodeType rankCode;
    @XmlElement(name = "Party")
    protected List<PartyType> party;

    /**
     * Gets the value of the effectiveTimePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodType }
     *     
     */
    public TimePeriodType getEffectiveTimePeriod() {
        return effectiveTimePeriod;
    }

    /**
     * Sets the value of the effectiveTimePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodType }
     *     
     */
    public void setEffectiveTimePeriod(TimePeriodType value) {
        this.effectiveTimePeriod = value;
    }

    /**
     * Gets the value of the acceptedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAcceptedIndicator() {
        return acceptedIndicator;
    }

    /**
     * Sets the value of the acceptedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAcceptedIndicator(Boolean value) {
        this.acceptedIndicator = value;
    }

    /**
     * Gets the value of the qualifiedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isQualifiedIndicator() {
        return qualifiedIndicator;
    }

    /**
     * Sets the value of the qualifiedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setQualifiedIndicator(Boolean value) {
        this.qualifiedIndicator = value;
    }

    /**
     * Gets the value of the priorityCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getPriorityCode() {
        return priorityCode;
    }

    /**
     * Sets the value of the priorityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setPriorityCode(CodeType value) {
        this.priorityCode = value;
    }

    /**
     * Gets the value of the rankCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getRankCode() {
        return rankCode;
    }

    /**
     * Sets the value of the rankCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setRankCode(CodeType value) {
        this.rankCode = value;
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

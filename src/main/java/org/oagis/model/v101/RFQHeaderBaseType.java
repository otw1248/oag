//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 05:03:36 PM CST 
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
 * <p>Java class for RFQHeaderBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RFQHeaderBaseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}ProcurementHeaderBaseType">
 *       &lt;sequence>
 *         &lt;element name="BuyerParty" type="{http://www.openapplications.org/oagis/10}CustomerPartyType" minOccurs="0"/>
 *         &lt;element name="RequesterParty" type="{http://www.openapplications.org/oagis/10}PartyType" minOccurs="0"/>
 *         &lt;element name="PriorityCode" type="{http://www.openapplications.org/oagis/10}CodeType" minOccurs="0"/>
 *         &lt;element name="EffectiveTimePeriod" type="{http://www.openapplications.org/oagis/10}TimePeriodType" minOccurs="0"/>
 *         &lt;element name="SupplierSelectionTimePeriod" type="{http://www.openapplications.org/oagis/10}TimePeriodType" minOccurs="0"/>
 *         &lt;element name="BiddingTimePeriod" type="{http://www.openapplications.org/oagis/10}TimePeriodType" minOccurs="0"/>
 *         &lt;element name="QualificationTerm" type="{http://www.openapplications.org/oagis/10}QualificationTermType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Message" type="{http://www.openapplications.org/oagis/10}MessageType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RFQHeaderBaseType", propOrder = {
    "buyerParty",
    "requesterParty",
    "priorityCode",
    "effectiveTimePeriod",
    "supplierSelectionTimePeriod",
    "biddingTimePeriod",
    "qualificationTerm",
    "message"
})
@XmlSeeAlso({
    RFQHeaderType.class
})
public class RFQHeaderBaseType
    extends ProcurementHeaderBaseType
{

    @XmlElement(name = "BuyerParty")
    protected CustomerPartyType buyerParty;
    @XmlElement(name = "RequesterParty")
    protected PartyType requesterParty;
    @XmlElement(name = "PriorityCode")
    protected CodeType priorityCode;
    @XmlElement(name = "EffectiveTimePeriod")
    protected TimePeriodType effectiveTimePeriod;
    @XmlElement(name = "SupplierSelectionTimePeriod")
    protected TimePeriodType supplierSelectionTimePeriod;
    @XmlElement(name = "BiddingTimePeriod")
    protected TimePeriodType biddingTimePeriod;
    @XmlElement(name = "QualificationTerm")
    protected List<QualificationTermType> qualificationTerm;
    @XmlElement(name = "Message")
    protected List<MessageType> message;

    /**
     * Gets the value of the buyerParty property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerPartyType }
     *     
     */
    public CustomerPartyType getBuyerParty() {
        return buyerParty;
    }

    /**
     * Sets the value of the buyerParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerPartyType }
     *     
     */
    public void setBuyerParty(CustomerPartyType value) {
        this.buyerParty = value;
    }

    /**
     * Gets the value of the requesterParty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getRequesterParty() {
        return requesterParty;
    }

    /**
     * Sets the value of the requesterParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setRequesterParty(PartyType value) {
        this.requesterParty = value;
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
     * Gets the value of the supplierSelectionTimePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodType }
     *     
     */
    public TimePeriodType getSupplierSelectionTimePeriod() {
        return supplierSelectionTimePeriod;
    }

    /**
     * Sets the value of the supplierSelectionTimePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodType }
     *     
     */
    public void setSupplierSelectionTimePeriod(TimePeriodType value) {
        this.supplierSelectionTimePeriod = value;
    }

    /**
     * Gets the value of the biddingTimePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodType }
     *     
     */
    public TimePeriodType getBiddingTimePeriod() {
        return biddingTimePeriod;
    }

    /**
     * Sets the value of the biddingTimePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodType }
     *     
     */
    public void setBiddingTimePeriod(TimePeriodType value) {
        this.biddingTimePeriod = value;
    }

    /**
     * Gets the value of the qualificationTerm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the qualificationTerm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQualificationTerm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QualificationTermType }
     * 
     * 
     */
    public List<QualificationTermType> getQualificationTerm() {
        if (qualificationTerm == null) {
            qualificationTerm = new ArrayList<QualificationTermType>();
        }
        return this.qualificationTerm;
    }

    /**
     * Gets the value of the message property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the message property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MessageType }
     * 
     * 
     */
    public List<MessageType> getMessage() {
        if (message == null) {
            message = new ArrayList<MessageType>();
        }
        return this.message;
    }

}

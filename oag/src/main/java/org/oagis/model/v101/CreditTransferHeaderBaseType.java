//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 04:58:16 PM CST 
//


package org.oagis.model.v101;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditTransferHeaderBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditTransferHeaderBaseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}StatusHeaderBaseType">
 *       &lt;sequence>
 *         &lt;element name="AuthorizationID" type="{http://www.openapplications.org/oagis/10}IDType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BatchBookingIndicator" type="{http://www.openapplications.org/oagis/10}IndicatorType" minOccurs="0"/>
 *         &lt;element name="TotalTransactionsNumber" type="{http://www.openapplications.org/oagis/10}PositiveIntegerNumberType" minOccurs="0"/>
 *         &lt;element name="GroupingIndicator" type="{http://www.openapplications.org/oagis/10}IndicatorType" minOccurs="0"/>
 *         &lt;element name="InitiatingParty" type="{http://www.openapplications.org/oagis/10}PartyType" minOccurs="0"/>
 *         &lt;element name="ForwardingAgentParty" type="{http://www.openapplications.org/oagis/10}FinancialPartyType" minOccurs="0"/>
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
@XmlType(name = "CreditTransferHeaderBaseType", propOrder = {
    "authorizationID",
    "batchBookingIndicator",
    "totalTransactionsNumber",
    "groupingIndicator",
    "initiatingParty",
    "forwardingAgentParty",
    "party"
})
@XmlSeeAlso({
    CreditTransferHeaderType.class
})
public class CreditTransferHeaderBaseType
    extends StatusHeaderBaseType
{

    @XmlElement(name = "AuthorizationID")
    protected List<IDType> authorizationID;
    @XmlElement(name = "BatchBookingIndicator")
    protected Boolean batchBookingIndicator;
    @XmlElement(name = "TotalTransactionsNumber")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger totalTransactionsNumber;
    @XmlElement(name = "GroupingIndicator")
    protected Boolean groupingIndicator;
    @XmlElement(name = "InitiatingParty")
    protected PartyType initiatingParty;
    @XmlElement(name = "ForwardingAgentParty")
    protected FinancialPartyType forwardingAgentParty;
    @XmlElement(name = "Party")
    protected List<PartyType> party;

    /**
     * Gets the value of the authorizationID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authorizationID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthorizationID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IDType }
     * 
     * 
     */
    public List<IDType> getAuthorizationID() {
        if (authorizationID == null) {
            authorizationID = new ArrayList<IDType>();
        }
        return this.authorizationID;
    }

    /**
     * Gets the value of the batchBookingIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBatchBookingIndicator() {
        return batchBookingIndicator;
    }

    /**
     * Sets the value of the batchBookingIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBatchBookingIndicator(Boolean value) {
        this.batchBookingIndicator = value;
    }

    /**
     * Gets the value of the totalTransactionsNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalTransactionsNumber() {
        return totalTransactionsNumber;
    }

    /**
     * Sets the value of the totalTransactionsNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalTransactionsNumber(BigInteger value) {
        this.totalTransactionsNumber = value;
    }

    /**
     * Gets the value of the groupingIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGroupingIndicator() {
        return groupingIndicator;
    }

    /**
     * Sets the value of the groupingIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGroupingIndicator(Boolean value) {
        this.groupingIndicator = value;
    }

    /**
     * Gets the value of the initiatingParty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getInitiatingParty() {
        return initiatingParty;
    }

    /**
     * Sets the value of the initiatingParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setInitiatingParty(PartyType value) {
        this.initiatingParty = value;
    }

    /**
     * Gets the value of the forwardingAgentParty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialPartyType }
     *     
     */
    public FinancialPartyType getForwardingAgentParty() {
        return forwardingAgentParty;
    }

    /**
     * Sets the value of the forwardingAgentParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialPartyType }
     *     
     */
    public void setForwardingAgentParty(FinancialPartyType value) {
        this.forwardingAgentParty = value;
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
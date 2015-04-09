//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 05:02:00 PM CST 
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
 * Specifies actions to be taken with a check such as PmtInf/PmtTx/ChqInstr
 * 
 * <p>Java class for CheckInstructionBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckInstructionBaseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}IdentificationType">
 *       &lt;sequence>
 *         &lt;element name="CheckNumberID" type="{http://www.openapplications.org/oagis/10}IDType" minOccurs="0"/>
 *         &lt;element name="DeliveryMethodCode" type="{http://www.openapplications.org/oagis/10}CheckDeliveryMethodCodeType" minOccurs="0"/>
 *         &lt;element name="CheckFromParty" type="{http://www.openapplications.org/oagis/10}PartyType" minOccurs="0"/>
 *         &lt;element name="DeliverToParty" type="{http://www.openapplications.org/oagis/10}PartyType" minOccurs="0"/>
 *         &lt;element name="Party" type="{http://www.openapplications.org/oagis/10}PartyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PriorityCode" type="{http://www.openapplications.org/oagis/10}CodeType" minOccurs="0"/>
 *         &lt;element name="CheckMaturityDate" type="{http://www.openapplications.org/oagis/10}DateType" minOccurs="0"/>
 *         &lt;element name="CheckFormsCode" type="{http://www.openapplications.org/oagis/10}CodeType" minOccurs="0"/>
 *         &lt;element name="CheckMemoFieldText" type="{http://www.openapplications.org/oagis/10}TextType" minOccurs="0"/>
 *         &lt;element name="RegionalClearingZoneID" type="{http://www.openapplications.org/oagis/10}IDType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckInstructionBaseType", propOrder = {
    "checkNumberID",
    "deliveryMethodCode",
    "checkFromParty",
    "deliverToParty",
    "party",
    "priorityCode",
    "checkMaturityDate",
    "checkFormsCode",
    "checkMemoFieldText",
    "regionalClearingZoneID"
})
@XmlSeeAlso({
    CheckInstructionType.class
})
public class CheckInstructionBaseType
    extends IdentificationType
{

    @XmlElement(name = "CheckNumberID")
    protected IDType checkNumberID;
    @XmlElement(name = "DeliveryMethodCode")
    protected CheckDeliveryMethodCodeType deliveryMethodCode;
    @XmlElement(name = "CheckFromParty")
    protected PartyType checkFromParty;
    @XmlElement(name = "DeliverToParty")
    protected PartyType deliverToParty;
    @XmlElement(name = "Party")
    protected List<PartyType> party;
    @XmlElement(name = "PriorityCode")
    protected CodeType priorityCode;
    @XmlElement(name = "CheckMaturityDate")
    @XmlSchemaType(name = "anySimpleType")
    protected String checkMaturityDate;
    @XmlElement(name = "CheckFormsCode")
    protected CodeType checkFormsCode;
    @XmlElement(name = "CheckMemoFieldText")
    protected TextType checkMemoFieldText;
    @XmlElement(name = "RegionalClearingZoneID")
    protected IDType regionalClearingZoneID;

    /**
     * Gets the value of the checkNumberID property.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getCheckNumberID() {
        return checkNumberID;
    }

    /**
     * Sets the value of the checkNumberID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setCheckNumberID(IDType value) {
        this.checkNumberID = value;
    }

    /**
     * Gets the value of the deliveryMethodCode property.
     * 
     * @return
     *     possible object is
     *     {@link CheckDeliveryMethodCodeType }
     *     
     */
    public CheckDeliveryMethodCodeType getDeliveryMethodCode() {
        return deliveryMethodCode;
    }

    /**
     * Sets the value of the deliveryMethodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckDeliveryMethodCodeType }
     *     
     */
    public void setDeliveryMethodCode(CheckDeliveryMethodCodeType value) {
        this.deliveryMethodCode = value;
    }

    /**
     * Gets the value of the checkFromParty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getCheckFromParty() {
        return checkFromParty;
    }

    /**
     * Sets the value of the checkFromParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setCheckFromParty(PartyType value) {
        this.checkFromParty = value;
    }

    /**
     * Gets the value of the deliverToParty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getDeliverToParty() {
        return deliverToParty;
    }

    /**
     * Sets the value of the deliverToParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setDeliverToParty(PartyType value) {
        this.deliverToParty = value;
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
     * Gets the value of the checkMaturityDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckMaturityDate() {
        return checkMaturityDate;
    }

    /**
     * Sets the value of the checkMaturityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckMaturityDate(String value) {
        this.checkMaturityDate = value;
    }

    /**
     * Gets the value of the checkFormsCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getCheckFormsCode() {
        return checkFormsCode;
    }

    /**
     * Sets the value of the checkFormsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setCheckFormsCode(CodeType value) {
        this.checkFormsCode = value;
    }

    /**
     * Gets the value of the checkMemoFieldText property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getCheckMemoFieldText() {
        return checkMemoFieldText;
    }

    /**
     * Sets the value of the checkMemoFieldText property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setCheckMemoFieldText(TextType value) {
        this.checkMemoFieldText = value;
    }

    /**
     * Gets the value of the regionalClearingZoneID property.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getRegionalClearingZoneID() {
        return regionalClearingZoneID;
    }

    /**
     * Sets the value of the regionalClearingZoneID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setRegionalClearingZoneID(IDType value) {
        this.regionalClearingZoneID = value;
    }

}

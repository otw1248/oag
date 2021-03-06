//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 04:51:06 PM CST 
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
 * <p>Java class for ReceivableHeaderBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReceivableHeaderBaseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}LedgerEntryHeaderBaseType">
 *       &lt;sequence>
 *         &lt;element name="BillToParty" type="{http://www.openapplications.org/oagis/10}CustomerPartyType" minOccurs="0"/>
 *         &lt;element name="ShipToParty" type="{http://www.openapplications.org/oagis/10}ShipToPartyType" minOccurs="0"/>
 *         &lt;group ref="{http://www.openapplications.org/oagis/10}TaxesGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReceivableHeaderBaseType", propOrder = {
    "billToParty",
    "shipToParty",
    "tax",
    "totalTax"
})
@XmlSeeAlso({
    ReceivableHeaderType.class
})
public class ReceivableHeaderBaseType
    extends LedgerEntryHeaderBaseType
{

    @XmlElement(name = "BillToParty")
    protected CustomerPartyType billToParty;
    @XmlElement(name = "ShipToParty")
    protected ShipToPartyType shipToParty;
    @XmlElement(name = "Tax")
    protected List<TaxType> tax;
    @XmlElement(name = "TotalTax")
    protected TaxType totalTax;

    /**
     * Gets the value of the billToParty property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerPartyType }
     *     
     */
    public CustomerPartyType getBillToParty() {
        return billToParty;
    }

    /**
     * Sets the value of the billToParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerPartyType }
     *     
     */
    public void setBillToParty(CustomerPartyType value) {
        this.billToParty = value;
    }

    /**
     * Gets the value of the shipToParty property.
     * 
     * @return
     *     possible object is
     *     {@link ShipToPartyType }
     *     
     */
    public ShipToPartyType getShipToParty() {
        return shipToParty;
    }

    /**
     * Sets the value of the shipToParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipToPartyType }
     *     
     */
    public void setShipToParty(ShipToPartyType value) {
        this.shipToParty = value;
    }

    /**
     * Gets the value of the tax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxType }
     * 
     * 
     */
    public List<TaxType> getTax() {
        if (tax == null) {
            tax = new ArrayList<TaxType>();
        }
        return this.tax;
    }

    /**
     * Gets the value of the totalTax property.
     * 
     * @return
     *     possible object is
     *     {@link TaxType }
     *     
     */
    public TaxType getTotalTax() {
        return totalTax;
    }

    /**
     * Sets the value of the totalTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxType }
     *     
     */
    public void setTotalTax(TaxType value) {
        this.totalTax = value;
    }

}

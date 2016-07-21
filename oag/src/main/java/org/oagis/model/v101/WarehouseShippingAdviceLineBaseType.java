//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 05:04:42 PM CST 
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
 * <p>Java class for WarehouseShippingAdviceLineBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WarehouseShippingAdviceLineBaseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}StatusLineBaseType">
 *       &lt;sequence>
 *         &lt;element name="ContainerID" type="{http://www.openapplications.org/oagis/10}IDType" minOccurs="0"/>
 *         &lt;element name="OrderQuantity" type="{http://www.openapplications.org/oagis/10}QuantityType" minOccurs="0"/>
 *         &lt;element name="Quantity" type="{http://www.openapplications.org/oagis/10}OpenQuantityType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Amount" type="{http://www.openapplications.org/oagis/10}OpenAmountType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Allowance" type="{http://www.openapplications.org/oagis/10}AllowanceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Charge" type="{http://www.openapplications.org/oagis/10}ChargeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Party" type="{http://www.openapplications.org/oagis/10}PartyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ItemInstance" type="{http://www.openapplications.org/oagis/10}ItemInstanceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Facility" type="{http://www.openapplications.org/oagis/10}FacilityType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WarehouseShippingAdviceLineBaseType", propOrder = {
    "containerID",
    "orderQuantity",
    "quantity",
    "amount",
    "allowance",
    "charge",
    "party",
    "itemInstance",
    "facility"
})
@XmlSeeAlso({
    WarehouseShippingAdviceLineType.class
})
public class WarehouseShippingAdviceLineBaseType
    extends StatusLineBaseType
{

    @XmlElement(name = "ContainerID")
    protected IDType containerID;
    @XmlElement(name = "OrderQuantity")
    protected QuantityType orderQuantity;
    @XmlElement(name = "Quantity")
    protected List<OpenQuantityType> quantity;
    @XmlElement(name = "Amount")
    protected List<OpenAmountType> amount;
    @XmlElement(name = "Allowance")
    protected List<AllowanceType> allowance;
    @XmlElement(name = "Charge")
    protected List<ChargeType> charge;
    @XmlElement(name = "Party")
    protected List<PartyType> party;
    @XmlElement(name = "ItemInstance")
    protected List<ItemInstanceType> itemInstance;
    @XmlElement(name = "Facility")
    protected List<FacilityType> facility;

    /**
     * Gets the value of the containerID property.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getContainerID() {
        return containerID;
    }

    /**
     * Sets the value of the containerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setContainerID(IDType value) {
        this.containerID = value;
    }

    /**
     * Gets the value of the orderQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityType }
     *     
     */
    public QuantityType getOrderQuantity() {
        return orderQuantity;
    }

    /**
     * Sets the value of the orderQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType }
     *     
     */
    public void setOrderQuantity(QuantityType value) {
        this.orderQuantity = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quantity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuantity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpenQuantityType }
     * 
     * 
     */
    public List<OpenQuantityType> getQuantity() {
        if (quantity == null) {
            quantity = new ArrayList<OpenQuantityType>();
        }
        return this.quantity;
    }

    /**
     * Gets the value of the amount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the amount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpenAmountType }
     * 
     * 
     */
    public List<OpenAmountType> getAmount() {
        if (amount == null) {
            amount = new ArrayList<OpenAmountType>();
        }
        return this.amount;
    }

    /**
     * Gets the value of the allowance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allowance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllowance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AllowanceType }
     * 
     * 
     */
    public List<AllowanceType> getAllowance() {
        if (allowance == null) {
            allowance = new ArrayList<AllowanceType>();
        }
        return this.allowance;
    }

    /**
     * Gets the value of the charge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the charge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCharge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChargeType }
     * 
     * 
     */
    public List<ChargeType> getCharge() {
        if (charge == null) {
            charge = new ArrayList<ChargeType>();
        }
        return this.charge;
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
     * Gets the value of the itemInstance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemInstance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemInstance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemInstanceType }
     * 
     * 
     */
    public List<ItemInstanceType> getItemInstance() {
        if (itemInstance == null) {
            itemInstance = new ArrayList<ItemInstanceType>();
        }
        return this.itemInstance;
    }

    /**
     * Gets the value of the facility property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the facility property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFacility().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FacilityType }
     * 
     * 
     */
    public List<FacilityType> getFacility() {
        if (facility == null) {
            facility = new ArrayList<FacilityType>();
        }
        return this.facility;
    }

}
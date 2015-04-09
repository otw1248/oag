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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WarehouseShippingAdviceHeaderBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WarehouseShippingAdviceHeaderBaseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}StatusHeaderBaseType">
 *       &lt;sequence>
 *         &lt;element name="ShipToParty" type="{http://www.openapplications.org/oagis/10}ShipToPartyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DepositorParty" type="{http://www.openapplications.org/oagis/10}PartyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="WarehouseParty" type="{http://www.openapplications.org/oagis/10}PartyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Party" type="{http://www.openapplications.org/oagis/10}PartyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RequestedDeliveryDate" type="{http://www.openapplications.org/oagis/10}DateType" minOccurs="0"/>
 *         &lt;element name="RequestedShipDateTime" type="{http://www.openapplications.org/oagis/10}DateTimeType" minOccurs="0"/>
 *         &lt;element name="WarehouseCarrier" type="{http://www.openapplications.org/oagis/10}WarehouseCarrierType" minOccurs="0"/>
 *         &lt;element name="TotalQuantity" type="{http://www.openapplications.org/oagis/10}QuantityType" minOccurs="0"/>
 *         &lt;element name="TotalDimensions" type="{http://www.openapplications.org/oagis/10}DimensionsType" minOccurs="0"/>
 *         &lt;element name="Classification" type="{http://www.openapplications.org/oagis/10}ClassificationType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WarehouseShippingAdviceHeaderBaseType", propOrder = {
    "shipToParty",
    "depositorParty",
    "warehouseParty",
    "party",
    "requestedDeliveryDate",
    "requestedShipDateTime",
    "warehouseCarrier",
    "totalQuantity",
    "totalDimensions",
    "classification"
})
@XmlSeeAlso({
    WarehouseShippingAdviceHeaderType.class
})
public class WarehouseShippingAdviceHeaderBaseType
    extends StatusHeaderBaseType
{

    @XmlElement(name = "ShipToParty")
    protected List<ShipToPartyType> shipToParty;
    @XmlElement(name = "DepositorParty")
    protected List<PartyType> depositorParty;
    @XmlElement(name = "WarehouseParty")
    protected List<PartyType> warehouseParty;
    @XmlElement(name = "Party")
    protected List<PartyType> party;
    @XmlElement(name = "RequestedDeliveryDate")
    @XmlSchemaType(name = "anySimpleType")
    protected String requestedDeliveryDate;
    @XmlElement(name = "RequestedShipDateTime")
    @XmlSchemaType(name = "anySimpleType")
    protected String requestedShipDateTime;
    @XmlElement(name = "WarehouseCarrier")
    protected WarehouseCarrierType warehouseCarrier;
    @XmlElement(name = "TotalQuantity")
    protected QuantityType totalQuantity;
    @XmlElement(name = "TotalDimensions")
    protected DimensionsType totalDimensions;
    @XmlElement(name = "Classification")
    protected List<ClassificationType> classification;

    /**
     * Gets the value of the shipToParty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipToParty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipToParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShipToPartyType }
     * 
     * 
     */
    public List<ShipToPartyType> getShipToParty() {
        if (shipToParty == null) {
            shipToParty = new ArrayList<ShipToPartyType>();
        }
        return this.shipToParty;
    }

    /**
     * Gets the value of the depositorParty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the depositorParty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDepositorParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyType }
     * 
     * 
     */
    public List<PartyType> getDepositorParty() {
        if (depositorParty == null) {
            depositorParty = new ArrayList<PartyType>();
        }
        return this.depositorParty;
    }

    /**
     * Gets the value of the warehouseParty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the warehouseParty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWarehouseParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyType }
     * 
     * 
     */
    public List<PartyType> getWarehouseParty() {
        if (warehouseParty == null) {
            warehouseParty = new ArrayList<PartyType>();
        }
        return this.warehouseParty;
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
     * Gets the value of the requestedDeliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestedDeliveryDate() {
        return requestedDeliveryDate;
    }

    /**
     * Sets the value of the requestedDeliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestedDeliveryDate(String value) {
        this.requestedDeliveryDate = value;
    }

    /**
     * Gets the value of the requestedShipDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestedShipDateTime() {
        return requestedShipDateTime;
    }

    /**
     * Sets the value of the requestedShipDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestedShipDateTime(String value) {
        this.requestedShipDateTime = value;
    }

    /**
     * Gets the value of the warehouseCarrier property.
     * 
     * @return
     *     possible object is
     *     {@link WarehouseCarrierType }
     *     
     */
    public WarehouseCarrierType getWarehouseCarrier() {
        return warehouseCarrier;
    }

    /**
     * Sets the value of the warehouseCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link WarehouseCarrierType }
     *     
     */
    public void setWarehouseCarrier(WarehouseCarrierType value) {
        this.warehouseCarrier = value;
    }

    /**
     * Gets the value of the totalQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityType }
     *     
     */
    public QuantityType getTotalQuantity() {
        return totalQuantity;
    }

    /**
     * Sets the value of the totalQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType }
     *     
     */
    public void setTotalQuantity(QuantityType value) {
        this.totalQuantity = value;
    }

    /**
     * Gets the value of the totalDimensions property.
     * 
     * @return
     *     possible object is
     *     {@link DimensionsType }
     *     
     */
    public DimensionsType getTotalDimensions() {
        return totalDimensions;
    }

    /**
     * Sets the value of the totalDimensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link DimensionsType }
     *     
     */
    public void setTotalDimensions(DimensionsType value) {
        this.totalDimensions = value;
    }

    /**
     * Gets the value of the classification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the classification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClassification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClassificationType }
     * 
     * 
     */
    public List<ClassificationType> getClassification() {
        if (classification == null) {
            classification = new ArrayList<ClassificationType>();
        }
        return this.classification;
    }

}

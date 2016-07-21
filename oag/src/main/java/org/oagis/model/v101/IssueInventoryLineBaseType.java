//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 04:59:30 PM CST 
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
 * <p>Java class for IssueInventoryLineBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IssueInventoryLineBaseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}LineBaseType">
 *       &lt;sequence>
 *         &lt;element name="MaintenanceOrderReference" type="{http://www.openapplications.org/oagis/10}DocumentReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ProductionOrderReference" type="{http://www.openapplications.org/oagis/10}ProductionOrderReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SalesOrderReference" type="{http://www.openapplications.org/oagis/10}OrderReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ItemInstance" type="{http://www.openapplications.org/oagis/10}ItemInstanceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Quantity" type="{http://www.openapplications.org/oagis/10}OpenQuantityType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.openapplications.org/oagis/10}InventoryTransactionGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IssueInventoryLineBaseType", propOrder = {
    "maintenanceOrderReference",
    "productionOrderReference",
    "salesOrderReference",
    "itemInstance",
    "quantity",
    "glEntityID",
    "facility",
    "status",
    "reasonCode",
    "transactionDateTime",
    "party"
})
@XmlSeeAlso({
    IssueInventoryLineType.class
})
public class IssueInventoryLineBaseType
    extends LineBaseType
{

    @XmlElement(name = "MaintenanceOrderReference")
    protected List<DocumentReferenceType> maintenanceOrderReference;
    @XmlElement(name = "ProductionOrderReference")
    protected List<ProductionOrderReferenceType> productionOrderReference;
    @XmlElement(name = "SalesOrderReference")
    protected List<OrderReferenceType> salesOrderReference;
    @XmlElement(name = "ItemInstance")
    protected List<ItemInstanceType> itemInstance;
    @XmlElement(name = "Quantity")
    protected List<OpenQuantityType> quantity;
    @XmlElement(name = "GLEntityID")
    protected IDType glEntityID;
    @XmlElement(name = "Facility")
    protected List<FacilityType> facility;
    @XmlElement(name = "Status")
    protected StatusType status;
    @XmlElement(name = "ReasonCode")
    protected List<CodeType> reasonCode;
    @XmlElement(name = "TransactionDateTime")
    @XmlSchemaType(name = "anySimpleType")
    protected String transactionDateTime;
    @XmlElement(name = "Party")
    protected List<PartyType> party;

    /**
     * Gets the value of the maintenanceOrderReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the maintenanceOrderReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaintenanceOrderReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentReferenceType }
     * 
     * 
     */
    public List<DocumentReferenceType> getMaintenanceOrderReference() {
        if (maintenanceOrderReference == null) {
            maintenanceOrderReference = new ArrayList<DocumentReferenceType>();
        }
        return this.maintenanceOrderReference;
    }

    /**
     * Gets the value of the productionOrderReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productionOrderReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductionOrderReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductionOrderReferenceType }
     * 
     * 
     */
    public List<ProductionOrderReferenceType> getProductionOrderReference() {
        if (productionOrderReference == null) {
            productionOrderReference = new ArrayList<ProductionOrderReferenceType>();
        }
        return this.productionOrderReference;
    }

    /**
     * Gets the value of the salesOrderReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salesOrderReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSalesOrderReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderReferenceType }
     * 
     * 
     */
    public List<OrderReferenceType> getSalesOrderReference() {
        if (salesOrderReference == null) {
            salesOrderReference = new ArrayList<OrderReferenceType>();
        }
        return this.salesOrderReference;
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
     * Gets the value of the glEntityID property.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getGLEntityID() {
        return glEntityID;
    }

    /**
     * Sets the value of the glEntityID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setGLEntityID(IDType value) {
        this.glEntityID = value;
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

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link StatusType }
     *     
     */
    public StatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType }
     *     
     */
    public void setStatus(StatusType value) {
        this.status = value;
    }

    /**
     * Gets the value of the reasonCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reasonCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReasonCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeType }
     * 
     * 
     */
    public List<CodeType> getReasonCode() {
        if (reasonCode == null) {
            reasonCode = new ArrayList<CodeType>();
        }
        return this.reasonCode;
    }

    /**
     * Gets the value of the transactionDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionDateTime() {
        return transactionDateTime;
    }

    /**
     * Sets the value of the transactionDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionDateTime(String value) {
        this.transactionDateTime = value;
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
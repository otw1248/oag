//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 05:03:55 PM CST 
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
 * Is the SalesOrder Line type that provides the structure of the SalesOrder Line.
 * 
 * <p>Java class for SalesOrderLineBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SalesOrderLineBaseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}OrderLineBaseType">
 *       &lt;sequence>
 *         &lt;element name="BackOrderIndicator" type="{http://www.openapplications.org/oagis/10}IndicatorType" minOccurs="0"/>
 *         &lt;element name="PurchaseOrderReference" type="{http://www.openapplications.org/oagis/10}OrderReferenceType" minOccurs="0"/>
 *         &lt;element name="RouteReference" type="{http://www.openapplications.org/oagis/10}RouteReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BOMReference" type="{http://www.openapplications.org/oagis/10}BOMReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ScheduledDeliveryDateTime" type="{http://www.openapplications.org/oagis/10}DateTimeType" minOccurs="0"/>
 *         &lt;element name="ActualDeliveryDateTime" type="{http://www.openapplications.org/oagis/10}DateTimeType" minOccurs="0"/>
 *         &lt;element name="ActualShipDateTime" type="{http://www.openapplications.org/oagis/10}DateTimeType" minOccurs="0"/>
 *         &lt;element name="DistributionCenterCode" type="{http://www.openapplications.org/oagis/10}CodeType" minOccurs="0"/>
 *         &lt;element name="OrderCommission" type="{http://www.openapplications.org/oagis/10}OrderCommissionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SupplierParty" type="{http://www.openapplications.org/oagis/10}SupplierPartyType" minOccurs="0"/>
 *         &lt;element name="SalesOrderSchedule" type="{http://www.openapplications.org/oagis/10}SalesOrderScheduleType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalesOrderLineBaseType", propOrder = {
    "backOrderIndicator",
    "purchaseOrderReference",
    "routeReference",
    "bomReference",
    "scheduledDeliveryDateTime",
    "actualDeliveryDateTime",
    "actualShipDateTime",
    "distributionCenterCode",
    "orderCommission",
    "supplierParty",
    "salesOrderSchedule"
})
@XmlSeeAlso({
    SalesOrderLineType.class,
    SalesOrderSubLineType.class
})
public class SalesOrderLineBaseType
    extends OrderLineBaseType
{

    @XmlElement(name = "BackOrderIndicator")
    protected Boolean backOrderIndicator;
    @XmlElement(name = "PurchaseOrderReference")
    protected OrderReferenceType purchaseOrderReference;
    @XmlElement(name = "RouteReference")
    protected List<RouteReferenceType> routeReference;
    @XmlElement(name = "BOMReference")
    protected List<BOMReferenceType> bomReference;
    @XmlElement(name = "ScheduledDeliveryDateTime")
    @XmlSchemaType(name = "anySimpleType")
    protected String scheduledDeliveryDateTime;
    @XmlElement(name = "ActualDeliveryDateTime")
    @XmlSchemaType(name = "anySimpleType")
    protected String actualDeliveryDateTime;
    @XmlElement(name = "ActualShipDateTime")
    @XmlSchemaType(name = "anySimpleType")
    protected String actualShipDateTime;
    @XmlElement(name = "DistributionCenterCode")
    protected CodeType distributionCenterCode;
    @XmlElement(name = "OrderCommission")
    protected List<OrderCommissionType> orderCommission;
    @XmlElement(name = "SupplierParty")
    protected SupplierPartyType supplierParty;
    @XmlElement(name = "SalesOrderSchedule")
    protected List<SalesOrderScheduleType> salesOrderSchedule;

    /**
     * Gets the value of the backOrderIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBackOrderIndicator() {
        return backOrderIndicator;
    }

    /**
     * Sets the value of the backOrderIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBackOrderIndicator(Boolean value) {
        this.backOrderIndicator = value;
    }

    /**
     * Gets the value of the purchaseOrderReference property.
     * 
     * @return
     *     possible object is
     *     {@link OrderReferenceType }
     *     
     */
    public OrderReferenceType getPurchaseOrderReference() {
        return purchaseOrderReference;
    }

    /**
     * Sets the value of the purchaseOrderReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderReferenceType }
     *     
     */
    public void setPurchaseOrderReference(OrderReferenceType value) {
        this.purchaseOrderReference = value;
    }

    /**
     * Gets the value of the routeReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the routeReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRouteReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RouteReferenceType }
     * 
     * 
     */
    public List<RouteReferenceType> getRouteReference() {
        if (routeReference == null) {
            routeReference = new ArrayList<RouteReferenceType>();
        }
        return this.routeReference;
    }

    /**
     * Gets the value of the bomReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bomReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBOMReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BOMReferenceType }
     * 
     * 
     */
    public List<BOMReferenceType> getBOMReference() {
        if (bomReference == null) {
            bomReference = new ArrayList<BOMReferenceType>();
        }
        return this.bomReference;
    }

    /**
     * Gets the value of the scheduledDeliveryDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScheduledDeliveryDateTime() {
        return scheduledDeliveryDateTime;
    }

    /**
     * Sets the value of the scheduledDeliveryDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScheduledDeliveryDateTime(String value) {
        this.scheduledDeliveryDateTime = value;
    }

    /**
     * Gets the value of the actualDeliveryDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActualDeliveryDateTime() {
        return actualDeliveryDateTime;
    }

    /**
     * Sets the value of the actualDeliveryDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActualDeliveryDateTime(String value) {
        this.actualDeliveryDateTime = value;
    }

    /**
     * Gets the value of the actualShipDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActualShipDateTime() {
        return actualShipDateTime;
    }

    /**
     * Sets the value of the actualShipDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActualShipDateTime(String value) {
        this.actualShipDateTime = value;
    }

    /**
     * Gets the value of the distributionCenterCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getDistributionCenterCode() {
        return distributionCenterCode;
    }

    /**
     * Sets the value of the distributionCenterCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setDistributionCenterCode(CodeType value) {
        this.distributionCenterCode = value;
    }

    /**
     * Gets the value of the orderCommission property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderCommission property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderCommission().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderCommissionType }
     * 
     * 
     */
    public List<OrderCommissionType> getOrderCommission() {
        if (orderCommission == null) {
            orderCommission = new ArrayList<OrderCommissionType>();
        }
        return this.orderCommission;
    }

    /**
     * Gets the value of the supplierParty property.
     * 
     * @return
     *     possible object is
     *     {@link SupplierPartyType }
     *     
     */
    public SupplierPartyType getSupplierParty() {
        return supplierParty;
    }

    /**
     * Sets the value of the supplierParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplierPartyType }
     *     
     */
    public void setSupplierParty(SupplierPartyType value) {
        this.supplierParty = value;
    }

    /**
     * Gets the value of the salesOrderSchedule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salesOrderSchedule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSalesOrderSchedule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SalesOrderScheduleType }
     * 
     * 
     */
    public List<SalesOrderScheduleType> getSalesOrderSchedule() {
        if (salesOrderSchedule == null) {
            salesOrderSchedule = new ArrayList<SalesOrderScheduleType>();
        }
        return this.salesOrderSchedule;
    }

}

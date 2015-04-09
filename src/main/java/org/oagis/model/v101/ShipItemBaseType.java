//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 05:04:14 PM CST 
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
 * Ship Item Base Type for detailing the minimum generic details of any item (product, service or commodity) that is involved in a logistical action
 * 
 * <p>Java class for ShipItemBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipItemBaseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}ItemInstanceBaseType">
 *       &lt;sequence>
 *         &lt;element name="ItemInstance" type="{http://www.openapplications.org/oagis/10}ItemInstanceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ExportLicense" type="{http://www.openapplications.org/oagis/10}ExportLicenseType" minOccurs="0"/>
 *         &lt;element name="ContainsHazardousMaterialIndicator" type="{http://www.openapplications.org/oagis/10}IndicatorType" minOccurs="0"/>
 *         &lt;element name="HazardousMaterialCodes" type="{http://www.openapplications.org/oagis/10}CodesType" minOccurs="0"/>
 *         &lt;element name="ImportLicenseRequiredIndicator" type="{http://www.openapplications.org/oagis/10}IndicatorType" minOccurs="0"/>
 *         &lt;element name="OrderQuantity" type="{http://www.openapplications.org/oagis/10}QuantityType" minOccurs="0"/>
 *         &lt;element name="ShippedQuantity" type="{http://www.openapplications.org/oagis/10}QuantityType" minOccurs="0"/>
 *         &lt;element name="OpenQuantity" type="{http://www.openapplications.org/oagis/10}QuantityType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BackOrderedQuantity" type="{http://www.openapplications.org/oagis/10}QuantityType" minOccurs="0"/>
 *         &lt;element name="OwnershipCode" type="{http://www.openapplications.org/oagis/10}CodeType" minOccurs="0"/>
 *         &lt;element name="EstimatedWeightMeasure" type="{http://www.openapplications.org/oagis/10}MeasureType" minOccurs="0"/>
 *         &lt;element name="LoadingWeightMeasure" type="{http://www.openapplications.org/oagis/10}MeasureType" minOccurs="0"/>
 *         &lt;group ref="{http://www.openapplications.org/oagis/10}ShippingWeightAndVolumeGroup"/>
 *         &lt;element name="RequisitionReference" type="{http://www.openapplications.org/oagis/10}OrderReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PurchaseOrderReference" type="{http://www.openapplications.org/oagis/10}OrderReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SalesOrderReference" type="{http://www.openapplications.org/oagis/10}OrderReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ItemSubLine" type="{http://www.openapplications.org/oagis/10}ItemSubLineType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipItemBaseType", propOrder = {
    "itemInstance",
    "exportLicense",
    "containsHazardousMaterialIndicator",
    "hazardousMaterialCodes",
    "importLicenseRequiredIndicator",
    "orderQuantity",
    "shippedQuantity",
    "openQuantity",
    "backOrderedQuantity",
    "ownershipCode",
    "estimatedWeightMeasure",
    "loadingWeightMeasure",
    "dunnageWeightMeasure",
    "tareWeightMeasure",
    "netWeightMeasure",
    "grossWeightMeasure",
    "netVolumeMeasure",
    "totalVolumeMeasure",
    "requisitionReference",
    "purchaseOrderReference",
    "salesOrderReference",
    "itemSubLine"
})
@XmlSeeAlso({
    ShipmentUnitItemBaseType.class
})
public class ShipItemBaseType
    extends ItemInstanceBaseType
{

    @XmlElement(name = "ItemInstance")
    protected List<ItemInstanceType> itemInstance;
    @XmlElement(name = "ExportLicense")
    protected ExportLicenseType exportLicense;
    @XmlElement(name = "ContainsHazardousMaterialIndicator")
    protected Boolean containsHazardousMaterialIndicator;
    @XmlElement(name = "HazardousMaterialCodes")
    protected CodesType hazardousMaterialCodes;
    @XmlElement(name = "ImportLicenseRequiredIndicator")
    protected Boolean importLicenseRequiredIndicator;
    @XmlElement(name = "OrderQuantity")
    protected QuantityType orderQuantity;
    @XmlElement(name = "ShippedQuantity")
    protected QuantityType shippedQuantity;
    @XmlElement(name = "OpenQuantity")
    protected List<QuantityType> openQuantity;
    @XmlElement(name = "BackOrderedQuantity")
    protected QuantityType backOrderedQuantity;
    @XmlElement(name = "OwnershipCode")
    protected CodeType ownershipCode;
    @XmlElement(name = "EstimatedWeightMeasure")
    protected MeasureType estimatedWeightMeasure;
    @XmlElement(name = "LoadingWeightMeasure")
    protected MeasureType loadingWeightMeasure;
    @XmlElement(name = "DunnageWeightMeasure")
    protected MeasureType dunnageWeightMeasure;
    @XmlElement(name = "TareWeightMeasure")
    protected MeasureType tareWeightMeasure;
    @XmlElement(name = "NetWeightMeasure")
    protected MeasureType netWeightMeasure;
    @XmlElement(name = "GrossWeightMeasure")
    protected MeasureType grossWeightMeasure;
    @XmlElement(name = "NetVolumeMeasure")
    protected MeasureType netVolumeMeasure;
    @XmlElement(name = "TotalVolumeMeasure")
    protected MeasureType totalVolumeMeasure;
    @XmlElement(name = "RequisitionReference")
    protected List<OrderReferenceType> requisitionReference;
    @XmlElement(name = "PurchaseOrderReference")
    protected List<OrderReferenceType> purchaseOrderReference;
    @XmlElement(name = "SalesOrderReference")
    protected List<OrderReferenceType> salesOrderReference;
    @XmlElement(name = "ItemSubLine")
    protected List<ItemSubLineType> itemSubLine;

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
     * Gets the value of the exportLicense property.
     * 
     * @return
     *     possible object is
     *     {@link ExportLicenseType }
     *     
     */
    public ExportLicenseType getExportLicense() {
        return exportLicense;
    }

    /**
     * Sets the value of the exportLicense property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportLicenseType }
     *     
     */
    public void setExportLicense(ExportLicenseType value) {
        this.exportLicense = value;
    }

    /**
     * Gets the value of the containsHazardousMaterialIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isContainsHazardousMaterialIndicator() {
        return containsHazardousMaterialIndicator;
    }

    /**
     * Sets the value of the containsHazardousMaterialIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContainsHazardousMaterialIndicator(Boolean value) {
        this.containsHazardousMaterialIndicator = value;
    }

    /**
     * Gets the value of the hazardousMaterialCodes property.
     * 
     * @return
     *     possible object is
     *     {@link CodesType }
     *     
     */
    public CodesType getHazardousMaterialCodes() {
        return hazardousMaterialCodes;
    }

    /**
     * Sets the value of the hazardousMaterialCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodesType }
     *     
     */
    public void setHazardousMaterialCodes(CodesType value) {
        this.hazardousMaterialCodes = value;
    }

    /**
     * Gets the value of the importLicenseRequiredIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isImportLicenseRequiredIndicator() {
        return importLicenseRequiredIndicator;
    }

    /**
     * Sets the value of the importLicenseRequiredIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setImportLicenseRequiredIndicator(Boolean value) {
        this.importLicenseRequiredIndicator = value;
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
     * Gets the value of the shippedQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityType }
     *     
     */
    public QuantityType getShippedQuantity() {
        return shippedQuantity;
    }

    /**
     * Sets the value of the shippedQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType }
     *     
     */
    public void setShippedQuantity(QuantityType value) {
        this.shippedQuantity = value;
    }

    /**
     * Gets the value of the openQuantity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the openQuantity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOpenQuantity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuantityType }
     * 
     * 
     */
    public List<QuantityType> getOpenQuantity() {
        if (openQuantity == null) {
            openQuantity = new ArrayList<QuantityType>();
        }
        return this.openQuantity;
    }

    /**
     * Gets the value of the backOrderedQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityType }
     *     
     */
    public QuantityType getBackOrderedQuantity() {
        return backOrderedQuantity;
    }

    /**
     * Sets the value of the backOrderedQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType }
     *     
     */
    public void setBackOrderedQuantity(QuantityType value) {
        this.backOrderedQuantity = value;
    }

    /**
     * Gets the value of the ownershipCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getOwnershipCode() {
        return ownershipCode;
    }

    /**
     * Sets the value of the ownershipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setOwnershipCode(CodeType value) {
        this.ownershipCode = value;
    }

    /**
     * Gets the value of the estimatedWeightMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getEstimatedWeightMeasure() {
        return estimatedWeightMeasure;
    }

    /**
     * Sets the value of the estimatedWeightMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setEstimatedWeightMeasure(MeasureType value) {
        this.estimatedWeightMeasure = value;
    }

    /**
     * Gets the value of the loadingWeightMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getLoadingWeightMeasure() {
        return loadingWeightMeasure;
    }

    /**
     * Sets the value of the loadingWeightMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setLoadingWeightMeasure(MeasureType value) {
        this.loadingWeightMeasure = value;
    }

    /**
     * Gets the value of the dunnageWeightMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getDunnageWeightMeasure() {
        return dunnageWeightMeasure;
    }

    /**
     * Sets the value of the dunnageWeightMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setDunnageWeightMeasure(MeasureType value) {
        this.dunnageWeightMeasure = value;
    }

    /**
     * Gets the value of the tareWeightMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getTareWeightMeasure() {
        return tareWeightMeasure;
    }

    /**
     * Sets the value of the tareWeightMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setTareWeightMeasure(MeasureType value) {
        this.tareWeightMeasure = value;
    }

    /**
     * Gets the value of the netWeightMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getNetWeightMeasure() {
        return netWeightMeasure;
    }

    /**
     * Sets the value of the netWeightMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setNetWeightMeasure(MeasureType value) {
        this.netWeightMeasure = value;
    }

    /**
     * Gets the value of the grossWeightMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getGrossWeightMeasure() {
        return grossWeightMeasure;
    }

    /**
     * Sets the value of the grossWeightMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setGrossWeightMeasure(MeasureType value) {
        this.grossWeightMeasure = value;
    }

    /**
     * Gets the value of the netVolumeMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getNetVolumeMeasure() {
        return netVolumeMeasure;
    }

    /**
     * Sets the value of the netVolumeMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setNetVolumeMeasure(MeasureType value) {
        this.netVolumeMeasure = value;
    }

    /**
     * Gets the value of the totalVolumeMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getTotalVolumeMeasure() {
        return totalVolumeMeasure;
    }

    /**
     * Sets the value of the totalVolumeMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setTotalVolumeMeasure(MeasureType value) {
        this.totalVolumeMeasure = value;
    }

    /**
     * Gets the value of the requisitionReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requisitionReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequisitionReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderReferenceType }
     * 
     * 
     */
    public List<OrderReferenceType> getRequisitionReference() {
        if (requisitionReference == null) {
            requisitionReference = new ArrayList<OrderReferenceType>();
        }
        return this.requisitionReference;
    }

    /**
     * Gets the value of the purchaseOrderReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the purchaseOrderReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPurchaseOrderReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderReferenceType }
     * 
     * 
     */
    public List<OrderReferenceType> getPurchaseOrderReference() {
        if (purchaseOrderReference == null) {
            purchaseOrderReference = new ArrayList<OrderReferenceType>();
        }
        return this.purchaseOrderReference;
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
     * Gets the value of the itemSubLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemSubLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemSubLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemSubLineType }
     * 
     * 
     */
    public List<ItemSubLineType> getItemSubLine() {
        if (itemSubLine == null) {
            itemSubLine = new ArrayList<ItemSubLineType>();
        }
        return this.itemSubLine;
    }

}

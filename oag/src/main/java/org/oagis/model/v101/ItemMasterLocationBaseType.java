//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 04:59:38 PM CST 
//


package org.oagis.model.v101;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemMasterLocationBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemMasterLocationBaseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}ItemBaseType">
 *       &lt;sequence>
 *         &lt;element name="Effectivity" type="{http://www.openapplications.org/oagis/10}EffectivityType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EffectiveTimePeriod" type="{http://www.openapplications.org/oagis/10}TimePeriodType" minOccurs="0"/>
 *         &lt;element name="ExecutionTimePeriod" type="{http://www.openapplications.org/oagis/10}TimePeriodType" minOccurs="0"/>
 *         &lt;element name="FixedQuantityIndicator" type="{http://www.openapplications.org/oagis/10}IndicatorType" minOccurs="0"/>
 *         &lt;element name="MaximumLotSizeQuantity" type="{http://www.openapplications.org/oagis/10}QuantityType" minOccurs="0"/>
 *         &lt;element name="MinimumLotSizeQuantity" type="{http://www.openapplications.org/oagis/10}QuantityType" minOccurs="0"/>
 *         &lt;element name="LotSizeMultiplerNumber" type="{http://www.openapplications.org/oagis/10}NumberType" minOccurs="0"/>
 *         &lt;element name="LeadTimeDuration" type="{http://www.openapplications.org/oagis/10}DurationMeasureType" minOccurs="0"/>
 *         &lt;element name="RequiredPercent" type="{http://www.openapplications.org/oagis/10}PercentType" minOccurs="0"/>
 *         &lt;element name="BackFlushedIndicator" type="{http://www.openapplications.org/oagis/10}IndicatorType" minOccurs="0"/>
 *         &lt;element name="ActualIndicator" type="{http://www.openapplications.org/oagis/10}IndicatorType" minOccurs="0"/>
 *         &lt;element name="TrackingIndicator" type="{http://www.openapplications.org/oagis/10}IndicatorType" minOccurs="0"/>
 *         &lt;element name="ScrapIndicator" type="{http://www.openapplications.org/oagis/10}IndicatorType" minOccurs="0"/>
 *         &lt;element name="ItemStatus" type="{http://www.openapplications.org/oagis/10}StatusType" minOccurs="0"/>
 *         &lt;element name="BaseUOMCode" type="{http://www.openapplications.org/oagis/10}UOMCodeType" minOccurs="0"/>
 *         &lt;element name="StorageUOMCode" type="{http://www.openapplications.org/oagis/10}UOMCodeType" minOccurs="0"/>
 *         &lt;element name="ShippingUOMCode" type="{http://www.openapplications.org/oagis/10}UOMCodeType" minOccurs="0"/>
 *         &lt;element name="RoutingDisposition" type="{http://www.openapplications.org/oagis/10}StatusType" minOccurs="0"/>
 *         &lt;element name="SerialNumberSpecificationDescription" type="{http://www.openapplications.org/oagis/10}DescriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="LotNumberSpecification" type="{http://www.openapplications.org/oagis/10}DescriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="LastModificationDateTime" type="{http://www.openapplications.org/oagis/10}DateTimeType" minOccurs="0"/>
 *         &lt;element name="UnitPackaging" type="{http://www.openapplications.org/oagis/10}PackagingType" minOccurs="0"/>
 *         &lt;element name="OwnerParty" type="{http://www.openapplications.org/oagis/10}PartyType" minOccurs="0"/>
 *         &lt;element name="UOMGroupID" type="{http://www.openapplications.org/oagis/10}IDType" minOccurs="0"/>
 *         &lt;element name="AlternateUOMCode" type="{http://www.openapplications.org/oagis/10}UOMCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="UOMCodeConversionRate" type="{http://www.openapplications.org/oagis/10}UOMCodeConversionRateType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ItemValue" type="{http://www.openapplications.org/oagis/10}ItemValueType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BOMReference" type="{http://www.openapplications.org/oagis/10}BOMReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DrawingAttachment" type="{http://www.openapplications.org/oagis/10}AttachmentType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Quantity" type="{http://www.openapplications.org/oagis/10}OpenQuantityType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemMasterLocationBaseType", propOrder = {
    "effectivity",
    "effectiveTimePeriod",
    "executionTimePeriod",
    "fixedQuantityIndicator",
    "maximumLotSizeQuantity",
    "minimumLotSizeQuantity",
    "lotSizeMultiplerNumber",
    "leadTimeDuration",
    "requiredPercent",
    "backFlushedIndicator",
    "actualIndicator",
    "trackingIndicator",
    "scrapIndicator",
    "itemStatus",
    "baseUOMCode",
    "storageUOMCode",
    "shippingUOMCode",
    "routingDisposition",
    "serialNumberSpecificationDescription",
    "lotNumberSpecification",
    "lastModificationDateTime",
    "unitPackaging",
    "ownerParty",
    "uomGroupID",
    "alternateUOMCode",
    "uomCodeConversionRate",
    "itemValue",
    "bomReference",
    "drawingAttachment",
    "quantity"
})
@XmlSeeAlso({
    ItemMasterBaseType.class,
    LocationItemMasterBaseType.class
})
public class ItemMasterLocationBaseType
    extends ItemBaseType
{

    @XmlElement(name = "Effectivity")
    protected List<EffectivityType> effectivity;
    @XmlElement(name = "EffectiveTimePeriod")
    protected TimePeriodType effectiveTimePeriod;
    @XmlElement(name = "ExecutionTimePeriod")
    protected TimePeriodType executionTimePeriod;
    @XmlElement(name = "FixedQuantityIndicator")
    protected Boolean fixedQuantityIndicator;
    @XmlElement(name = "MaximumLotSizeQuantity")
    protected QuantityType maximumLotSizeQuantity;
    @XmlElement(name = "MinimumLotSizeQuantity")
    protected QuantityType minimumLotSizeQuantity;
    @XmlElement(name = "LotSizeMultiplerNumber")
    protected BigDecimal lotSizeMultiplerNumber;
    @XmlElement(name = "LeadTimeDuration")
    @XmlSchemaType(name = "anySimpleType")
    protected String leadTimeDuration;
    @XmlElement(name = "RequiredPercent")
    protected BigDecimal requiredPercent;
    @XmlElement(name = "BackFlushedIndicator")
    protected Boolean backFlushedIndicator;
    @XmlElement(name = "ActualIndicator")
    protected Boolean actualIndicator;
    @XmlElement(name = "TrackingIndicator")
    protected Boolean trackingIndicator;
    @XmlElement(name = "ScrapIndicator")
    protected Boolean scrapIndicator;
    @XmlElement(name = "ItemStatus")
    protected StatusType itemStatus;
    @XmlElement(name = "BaseUOMCode")
    protected UOMCodeType baseUOMCode;
    @XmlElement(name = "StorageUOMCode")
    protected UOMCodeType storageUOMCode;
    @XmlElement(name = "ShippingUOMCode")
    protected UOMCodeType shippingUOMCode;
    @XmlElement(name = "RoutingDisposition")
    protected StatusType routingDisposition;
    @XmlElement(name = "SerialNumberSpecificationDescription")
    protected List<DescriptionType> serialNumberSpecificationDescription;
    @XmlElement(name = "LotNumberSpecification")
    protected List<DescriptionType> lotNumberSpecification;
    @XmlElement(name = "LastModificationDateTime")
    @XmlSchemaType(name = "anySimpleType")
    protected String lastModificationDateTime;
    @XmlElement(name = "UnitPackaging")
    protected PackagingType unitPackaging;
    @XmlElement(name = "OwnerParty")
    protected PartyType ownerParty;
    @XmlElement(name = "UOMGroupID")
    protected IDType uomGroupID;
    @XmlElement(name = "AlternateUOMCode")
    protected List<UOMCodeType> alternateUOMCode;
    @XmlElement(name = "UOMCodeConversionRate")
    protected List<UOMCodeConversionRateType> uomCodeConversionRate;
    @XmlElement(name = "ItemValue")
    protected List<ItemValueType> itemValue;
    @XmlElement(name = "BOMReference")
    protected List<BOMReferenceType> bomReference;
    @XmlElement(name = "DrawingAttachment")
    protected List<AttachmentType> drawingAttachment;
    @XmlElement(name = "Quantity")
    protected List<OpenQuantityType> quantity;

    /**
     * Gets the value of the effectivity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the effectivity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEffectivity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EffectivityType }
     * 
     * 
     */
    public List<EffectivityType> getEffectivity() {
        if (effectivity == null) {
            effectivity = new ArrayList<EffectivityType>();
        }
        return this.effectivity;
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
     * Gets the value of the executionTimePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodType }
     *     
     */
    public TimePeriodType getExecutionTimePeriod() {
        return executionTimePeriod;
    }

    /**
     * Sets the value of the executionTimePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodType }
     *     
     */
    public void setExecutionTimePeriod(TimePeriodType value) {
        this.executionTimePeriod = value;
    }

    /**
     * Gets the value of the fixedQuantityIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFixedQuantityIndicator() {
        return fixedQuantityIndicator;
    }

    /**
     * Sets the value of the fixedQuantityIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFixedQuantityIndicator(Boolean value) {
        this.fixedQuantityIndicator = value;
    }

    /**
     * Gets the value of the maximumLotSizeQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityType }
     *     
     */
    public QuantityType getMaximumLotSizeQuantity() {
        return maximumLotSizeQuantity;
    }

    /**
     * Sets the value of the maximumLotSizeQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType }
     *     
     */
    public void setMaximumLotSizeQuantity(QuantityType value) {
        this.maximumLotSizeQuantity = value;
    }

    /**
     * Gets the value of the minimumLotSizeQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityType }
     *     
     */
    public QuantityType getMinimumLotSizeQuantity() {
        return minimumLotSizeQuantity;
    }

    /**
     * Sets the value of the minimumLotSizeQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType }
     *     
     */
    public void setMinimumLotSizeQuantity(QuantityType value) {
        this.minimumLotSizeQuantity = value;
    }

    /**
     * Gets the value of the lotSizeMultiplerNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLotSizeMultiplerNumber() {
        return lotSizeMultiplerNumber;
    }

    /**
     * Sets the value of the lotSizeMultiplerNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLotSizeMultiplerNumber(BigDecimal value) {
        this.lotSizeMultiplerNumber = value;
    }

    /**
     * Gets the value of the leadTimeDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeadTimeDuration() {
        return leadTimeDuration;
    }

    /**
     * Sets the value of the leadTimeDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeadTimeDuration(String value) {
        this.leadTimeDuration = value;
    }

    /**
     * Gets the value of the requiredPercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRequiredPercent() {
        return requiredPercent;
    }

    /**
     * Sets the value of the requiredPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRequiredPercent(BigDecimal value) {
        this.requiredPercent = value;
    }

    /**
     * Gets the value of the backFlushedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBackFlushedIndicator() {
        return backFlushedIndicator;
    }

    /**
     * Sets the value of the backFlushedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBackFlushedIndicator(Boolean value) {
        this.backFlushedIndicator = value;
    }

    /**
     * Gets the value of the actualIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActualIndicator() {
        return actualIndicator;
    }

    /**
     * Sets the value of the actualIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActualIndicator(Boolean value) {
        this.actualIndicator = value;
    }

    /**
     * Gets the value of the trackingIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTrackingIndicator() {
        return trackingIndicator;
    }

    /**
     * Sets the value of the trackingIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTrackingIndicator(Boolean value) {
        this.trackingIndicator = value;
    }

    /**
     * Gets the value of the scrapIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isScrapIndicator() {
        return scrapIndicator;
    }

    /**
     * Sets the value of the scrapIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setScrapIndicator(Boolean value) {
        this.scrapIndicator = value;
    }

    /**
     * Gets the value of the itemStatus property.
     * 
     * @return
     *     possible object is
     *     {@link StatusType }
     *     
     */
    public StatusType getItemStatus() {
        return itemStatus;
    }

    /**
     * Sets the value of the itemStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType }
     *     
     */
    public void setItemStatus(StatusType value) {
        this.itemStatus = value;
    }

    /**
     * Gets the value of the baseUOMCode property.
     * 
     * @return
     *     possible object is
     *     {@link UOMCodeType }
     *     
     */
    public UOMCodeType getBaseUOMCode() {
        return baseUOMCode;
    }

    /**
     * Sets the value of the baseUOMCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link UOMCodeType }
     *     
     */
    public void setBaseUOMCode(UOMCodeType value) {
        this.baseUOMCode = value;
    }

    /**
     * Gets the value of the storageUOMCode property.
     * 
     * @return
     *     possible object is
     *     {@link UOMCodeType }
     *     
     */
    public UOMCodeType getStorageUOMCode() {
        return storageUOMCode;
    }

    /**
     * Sets the value of the storageUOMCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link UOMCodeType }
     *     
     */
    public void setStorageUOMCode(UOMCodeType value) {
        this.storageUOMCode = value;
    }

    /**
     * Gets the value of the shippingUOMCode property.
     * 
     * @return
     *     possible object is
     *     {@link UOMCodeType }
     *     
     */
    public UOMCodeType getShippingUOMCode() {
        return shippingUOMCode;
    }

    /**
     * Sets the value of the shippingUOMCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link UOMCodeType }
     *     
     */
    public void setShippingUOMCode(UOMCodeType value) {
        this.shippingUOMCode = value;
    }

    /**
     * Gets the value of the routingDisposition property.
     * 
     * @return
     *     possible object is
     *     {@link StatusType }
     *     
     */
    public StatusType getRoutingDisposition() {
        return routingDisposition;
    }

    /**
     * Sets the value of the routingDisposition property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType }
     *     
     */
    public void setRoutingDisposition(StatusType value) {
        this.routingDisposition = value;
    }

    /**
     * Gets the value of the serialNumberSpecificationDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serialNumberSpecificationDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSerialNumberSpecificationDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescriptionType }
     * 
     * 
     */
    public List<DescriptionType> getSerialNumberSpecificationDescription() {
        if (serialNumberSpecificationDescription == null) {
            serialNumberSpecificationDescription = new ArrayList<DescriptionType>();
        }
        return this.serialNumberSpecificationDescription;
    }

    /**
     * Gets the value of the lotNumberSpecification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lotNumberSpecification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLotNumberSpecification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescriptionType }
     * 
     * 
     */
    public List<DescriptionType> getLotNumberSpecification() {
        if (lotNumberSpecification == null) {
            lotNumberSpecification = new ArrayList<DescriptionType>();
        }
        return this.lotNumberSpecification;
    }

    /**
     * Gets the value of the lastModificationDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastModificationDateTime() {
        return lastModificationDateTime;
    }

    /**
     * Sets the value of the lastModificationDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastModificationDateTime(String value) {
        this.lastModificationDateTime = value;
    }

    /**
     * Gets the value of the unitPackaging property.
     * 
     * @return
     *     possible object is
     *     {@link PackagingType }
     *     
     */
    public PackagingType getUnitPackaging() {
        return unitPackaging;
    }

    /**
     * Sets the value of the unitPackaging property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackagingType }
     *     
     */
    public void setUnitPackaging(PackagingType value) {
        this.unitPackaging = value;
    }

    /**
     * Gets the value of the ownerParty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getOwnerParty() {
        return ownerParty;
    }

    /**
     * Sets the value of the ownerParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setOwnerParty(PartyType value) {
        this.ownerParty = value;
    }

    /**
     * Gets the value of the uomGroupID property.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getUOMGroupID() {
        return uomGroupID;
    }

    /**
     * Sets the value of the uomGroupID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setUOMGroupID(IDType value) {
        this.uomGroupID = value;
    }

    /**
     * Gets the value of the alternateUOMCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alternateUOMCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlternateUOMCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UOMCodeType }
     * 
     * 
     */
    public List<UOMCodeType> getAlternateUOMCode() {
        if (alternateUOMCode == null) {
            alternateUOMCode = new ArrayList<UOMCodeType>();
        }
        return this.alternateUOMCode;
    }

    /**
     * Gets the value of the uomCodeConversionRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uomCodeConversionRate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUOMCodeConversionRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UOMCodeConversionRateType }
     * 
     * 
     */
    public List<UOMCodeConversionRateType> getUOMCodeConversionRate() {
        if (uomCodeConversionRate == null) {
            uomCodeConversionRate = new ArrayList<UOMCodeConversionRateType>();
        }
        return this.uomCodeConversionRate;
    }

    /**
     * Gets the value of the itemValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemValueType }
     * 
     * 
     */
    public List<ItemValueType> getItemValue() {
        if (itemValue == null) {
            itemValue = new ArrayList<ItemValueType>();
        }
        return this.itemValue;
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
     * Gets the value of the drawingAttachment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the drawingAttachment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDrawingAttachment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttachmentType }
     * 
     * 
     */
    public List<AttachmentType> getDrawingAttachment() {
        if (drawingAttachment == null) {
            drawingAttachment = new ArrayList<AttachmentType>();
        }
        return this.drawingAttachment;
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

}
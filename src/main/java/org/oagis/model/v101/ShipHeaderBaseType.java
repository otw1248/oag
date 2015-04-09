//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 05:04:04 PM CST 
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
 * ShipHeader Base Type for detailing the minimum applicable details of a shipment for a Noun
 * 
 * <p>Java class for ShipHeaderBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipHeaderBaseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}StatusHeaderBaseType">
 *       &lt;sequence>
 *         &lt;element name="ShipUnitQuantity" type="{http://www.openapplications.org/oagis/10}QuantityType" minOccurs="0"/>
 *         &lt;element name="WarehouseLocation" type="{http://www.openapplications.org/oagis/10}LocationType" minOccurs="0"/>
 *         &lt;element name="CarrierRouteReference" type="{http://www.openapplications.org/oagis/10}RouteReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BillOfLadingReference" type="{http://www.openapplications.org/oagis/10}DocumentReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DeliveryReference" type="{http://www.openapplications.org/oagis/10}OrderReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ContractReference" type="{http://www.openapplications.org/oagis/10}OrderReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ShipmentReleaseDateTime" type="{http://www.openapplications.org/oagis/10}DateTimeType" minOccurs="0"/>
 *         &lt;element name="ActualShipDateTime" type="{http://www.openapplications.org/oagis/10}DateTimeType" minOccurs="0"/>
 *         &lt;element name="ScheduledDeliveryDateTime" type="{http://www.openapplications.org/oagis/10}DateTimeType" minOccurs="0"/>
 *         &lt;element name="ActualDeliveryDateTime" type="{http://www.openapplications.org/oagis/10}DateTimeType" minOccurs="0"/>
 *         &lt;element name="EstimatedWeightMeasure" type="{http://www.openapplications.org/oagis/10}MeasureType" minOccurs="0"/>
 *         &lt;element name="LoadingWeightMeasure" type="{http://www.openapplications.org/oagis/10}MeasureType" minOccurs="0"/>
 *         &lt;group ref="{http://www.openapplications.org/oagis/10}ShippingWeightAndVolumeGroup"/>
 *         &lt;element name="HazardousMaterialCodes" type="{http://www.openapplications.org/oagis/10}CodesType" minOccurs="0"/>
 *         &lt;element name="CountryOfOriginCode" type="{http://www.openapplications.org/oagis/10}CountryCodeType" minOccurs="0"/>
 *         &lt;element name="DistributionCenterCode" type="{http://www.openapplications.org/oagis/10}CodeType" minOccurs="0"/>
 *         &lt;element name="TransportationMethodCode" type="{http://www.openapplications.org/oagis/10}CodeType" minOccurs="0"/>
 *         &lt;element name="SpecialHandlingNote" type="{http://www.openapplications.org/oagis/10}NoteType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DockID" type="{http://www.openapplications.org/oagis/10}IDType" minOccurs="0"/>
 *         &lt;element name="EstimatedDepartureDateTime" type="{http://www.openapplications.org/oagis/10}DateTimeType" minOccurs="0"/>
 *         &lt;element name="EstimatedArrivalDateTime" type="{http://www.openapplications.org/oagis/10}DateTimeType" minOccurs="0"/>
 *         &lt;element name="ShipFromParty" type="{http://www.openapplications.org/oagis/10}PartyType" minOccurs="0"/>
 *         &lt;element name="CarrierParty" type="{http://www.openapplications.org/oagis/10}PartyType" minOccurs="0"/>
 *         &lt;element name="PurchasingParty" type="{http://www.openapplications.org/oagis/10}CustomerPartyType" minOccurs="0"/>
 *         &lt;element name="SupplierParty" type="{http://www.openapplications.org/oagis/10}SupplierPartyType" minOccurs="0"/>
 *         &lt;element name="SoldToParty" type="{http://www.openapplications.org/oagis/10}SoldToPartyType" minOccurs="0"/>
 *         &lt;element name="FreightTermCode" type="{http://www.openapplications.org/oagis/10}FreightTermCodeType" minOccurs="0"/>
 *         &lt;element name="Party" type="{http://www.openapplications.org/oagis/10}PartyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DistributeCharge" type="{http://www.openapplications.org/oagis/10}DistributeChargeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ShipToParty" type="{http://www.openapplications.org/oagis/10}ShipToPartyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipHeaderBaseType", propOrder = {
    "shipUnitQuantity",
    "warehouseLocation",
    "carrierRouteReference",
    "billOfLadingReference",
    "deliveryReference",
    "contractReference",
    "shipmentReleaseDateTime",
    "actualShipDateTime",
    "scheduledDeliveryDateTime",
    "actualDeliveryDateTime",
    "estimatedWeightMeasure",
    "loadingWeightMeasure",
    "dunnageWeightMeasure",
    "tareWeightMeasure",
    "netWeightMeasure",
    "grossWeightMeasure",
    "netVolumeMeasure",
    "totalVolumeMeasure",
    "hazardousMaterialCodes",
    "countryOfOriginCode",
    "distributionCenterCode",
    "transportationMethodCode",
    "specialHandlingNote",
    "dockID",
    "estimatedDepartureDateTime",
    "estimatedArrivalDateTime",
    "shipFromParty",
    "carrierParty",
    "purchasingParty",
    "supplierParty",
    "soldToParty",
    "freightTermCode",
    "party",
    "distributeCharge",
    "shipToParty"
})
@XmlSeeAlso({
    ShipmentHeaderBaseType.class
})
public class ShipHeaderBaseType
    extends StatusHeaderBaseType
{

    @XmlElement(name = "ShipUnitQuantity")
    protected QuantityType shipUnitQuantity;
    @XmlElement(name = "WarehouseLocation")
    protected LocationType warehouseLocation;
    @XmlElement(name = "CarrierRouteReference")
    protected List<RouteReferenceType> carrierRouteReference;
    @XmlElement(name = "BillOfLadingReference")
    protected List<DocumentReferenceType> billOfLadingReference;
    @XmlElement(name = "DeliveryReference")
    protected List<OrderReferenceType> deliveryReference;
    @XmlElement(name = "ContractReference")
    protected List<OrderReferenceType> contractReference;
    @XmlElement(name = "ShipmentReleaseDateTime")
    @XmlSchemaType(name = "anySimpleType")
    protected String shipmentReleaseDateTime;
    @XmlElement(name = "ActualShipDateTime")
    @XmlSchemaType(name = "anySimpleType")
    protected String actualShipDateTime;
    @XmlElement(name = "ScheduledDeliveryDateTime")
    @XmlSchemaType(name = "anySimpleType")
    protected String scheduledDeliveryDateTime;
    @XmlElement(name = "ActualDeliveryDateTime")
    @XmlSchemaType(name = "anySimpleType")
    protected String actualDeliveryDateTime;
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
    @XmlElement(name = "HazardousMaterialCodes")
    protected CodesType hazardousMaterialCodes;
    @XmlElement(name = "CountryOfOriginCode")
    protected CountryCodeType countryOfOriginCode;
    @XmlElement(name = "DistributionCenterCode")
    protected CodeType distributionCenterCode;
    @XmlElement(name = "TransportationMethodCode")
    protected CodeType transportationMethodCode;
    @XmlElement(name = "SpecialHandlingNote")
    protected List<NoteType> specialHandlingNote;
    @XmlElement(name = "DockID")
    protected IDType dockID;
    @XmlElement(name = "EstimatedDepartureDateTime")
    @XmlSchemaType(name = "anySimpleType")
    protected String estimatedDepartureDateTime;
    @XmlElement(name = "EstimatedArrivalDateTime")
    @XmlSchemaType(name = "anySimpleType")
    protected String estimatedArrivalDateTime;
    @XmlElement(name = "ShipFromParty")
    protected PartyType shipFromParty;
    @XmlElement(name = "CarrierParty")
    protected PartyType carrierParty;
    @XmlElement(name = "PurchasingParty")
    protected CustomerPartyType purchasingParty;
    @XmlElement(name = "SupplierParty")
    protected SupplierPartyType supplierParty;
    @XmlElement(name = "SoldToParty")
    protected SoldToPartyType soldToParty;
    @XmlElement(name = "FreightTermCode")
    protected FreightTermCodeType freightTermCode;
    @XmlElement(name = "Party")
    protected List<PartyType> party;
    @XmlElement(name = "DistributeCharge")
    protected List<DistributeChargeType> distributeCharge;
    @XmlElement(name = "ShipToParty")
    protected List<ShipToPartyType> shipToParty;

    /**
     * Gets the value of the shipUnitQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityType }
     *     
     */
    public QuantityType getShipUnitQuantity() {
        return shipUnitQuantity;
    }

    /**
     * Sets the value of the shipUnitQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType }
     *     
     */
    public void setShipUnitQuantity(QuantityType value) {
        this.shipUnitQuantity = value;
    }

    /**
     * Gets the value of the warehouseLocation property.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getWarehouseLocation() {
        return warehouseLocation;
    }

    /**
     * Sets the value of the warehouseLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setWarehouseLocation(LocationType value) {
        this.warehouseLocation = value;
    }

    /**
     * Gets the value of the carrierRouteReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carrierRouteReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarrierRouteReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RouteReferenceType }
     * 
     * 
     */
    public List<RouteReferenceType> getCarrierRouteReference() {
        if (carrierRouteReference == null) {
            carrierRouteReference = new ArrayList<RouteReferenceType>();
        }
        return this.carrierRouteReference;
    }

    /**
     * Gets the value of the billOfLadingReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billOfLadingReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillOfLadingReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentReferenceType }
     * 
     * 
     */
    public List<DocumentReferenceType> getBillOfLadingReference() {
        if (billOfLadingReference == null) {
            billOfLadingReference = new ArrayList<DocumentReferenceType>();
        }
        return this.billOfLadingReference;
    }

    /**
     * Gets the value of the deliveryReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deliveryReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeliveryReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderReferenceType }
     * 
     * 
     */
    public List<OrderReferenceType> getDeliveryReference() {
        if (deliveryReference == null) {
            deliveryReference = new ArrayList<OrderReferenceType>();
        }
        return this.deliveryReference;
    }

    /**
     * Gets the value of the contractReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contractReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContractReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderReferenceType }
     * 
     * 
     */
    public List<OrderReferenceType> getContractReference() {
        if (contractReference == null) {
            contractReference = new ArrayList<OrderReferenceType>();
        }
        return this.contractReference;
    }

    /**
     * Gets the value of the shipmentReleaseDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipmentReleaseDateTime() {
        return shipmentReleaseDateTime;
    }

    /**
     * Sets the value of the shipmentReleaseDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipmentReleaseDateTime(String value) {
        this.shipmentReleaseDateTime = value;
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
     * Gets the value of the countryOfOriginCode property.
     * 
     * @return
     *     possible object is
     *     {@link CountryCodeType }
     *     
     */
    public CountryCodeType getCountryOfOriginCode() {
        return countryOfOriginCode;
    }

    /**
     * Sets the value of the countryOfOriginCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryCodeType }
     *     
     */
    public void setCountryOfOriginCode(CountryCodeType value) {
        this.countryOfOriginCode = value;
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
     * Gets the value of the transportationMethodCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getTransportationMethodCode() {
        return transportationMethodCode;
    }

    /**
     * Sets the value of the transportationMethodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setTransportationMethodCode(CodeType value) {
        this.transportationMethodCode = value;
    }

    /**
     * Gets the value of the specialHandlingNote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialHandlingNote property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialHandlingNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NoteType }
     * 
     * 
     */
    public List<NoteType> getSpecialHandlingNote() {
        if (specialHandlingNote == null) {
            specialHandlingNote = new ArrayList<NoteType>();
        }
        return this.specialHandlingNote;
    }

    /**
     * Gets the value of the dockID property.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getDockID() {
        return dockID;
    }

    /**
     * Sets the value of the dockID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setDockID(IDType value) {
        this.dockID = value;
    }

    /**
     * Gets the value of the estimatedDepartureDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstimatedDepartureDateTime() {
        return estimatedDepartureDateTime;
    }

    /**
     * Sets the value of the estimatedDepartureDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstimatedDepartureDateTime(String value) {
        this.estimatedDepartureDateTime = value;
    }

    /**
     * Gets the value of the estimatedArrivalDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstimatedArrivalDateTime() {
        return estimatedArrivalDateTime;
    }

    /**
     * Sets the value of the estimatedArrivalDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstimatedArrivalDateTime(String value) {
        this.estimatedArrivalDateTime = value;
    }

    /**
     * Gets the value of the shipFromParty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getShipFromParty() {
        return shipFromParty;
    }

    /**
     * Sets the value of the shipFromParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setShipFromParty(PartyType value) {
        this.shipFromParty = value;
    }

    /**
     * Gets the value of the carrierParty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getCarrierParty() {
        return carrierParty;
    }

    /**
     * Sets the value of the carrierParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setCarrierParty(PartyType value) {
        this.carrierParty = value;
    }

    /**
     * Gets the value of the purchasingParty property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerPartyType }
     *     
     */
    public CustomerPartyType getPurchasingParty() {
        return purchasingParty;
    }

    /**
     * Sets the value of the purchasingParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerPartyType }
     *     
     */
    public void setPurchasingParty(CustomerPartyType value) {
        this.purchasingParty = value;
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
     * Gets the value of the soldToParty property.
     * 
     * @return
     *     possible object is
     *     {@link SoldToPartyType }
     *     
     */
    public SoldToPartyType getSoldToParty() {
        return soldToParty;
    }

    /**
     * Sets the value of the soldToParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoldToPartyType }
     *     
     */
    public void setSoldToParty(SoldToPartyType value) {
        this.soldToParty = value;
    }

    /**
     * Gets the value of the freightTermCode property.
     * 
     * @return
     *     possible object is
     *     {@link FreightTermCodeType }
     *     
     */
    public FreightTermCodeType getFreightTermCode() {
        return freightTermCode;
    }

    /**
     * Sets the value of the freightTermCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreightTermCodeType }
     *     
     */
    public void setFreightTermCode(FreightTermCodeType value) {
        this.freightTermCode = value;
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
     * Gets the value of the distributeCharge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the distributeCharge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDistributeCharge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DistributeChargeType }
     * 
     * 
     */
    public List<DistributeChargeType> getDistributeCharge() {
        if (distributeCharge == null) {
            distributeCharge = new ArrayList<DistributeChargeType>();
        }
        return this.distributeCharge;
    }

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

}

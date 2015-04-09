//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 05:04:19 PM CST 
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
 * Export Declaration Header Base Type for detailing the minimum applicable details of an export declaration Noun
 * 
 * <p>Java class for ExportDeclarationHeaderBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExportDeclarationHeaderBaseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}StatusHeaderBaseType">
 *       &lt;sequence>
 *         &lt;element name="GrossWeightMeasure" type="{http://www.openapplications.org/oagis/10}MeasureType" minOccurs="0"/>
 *         &lt;element name="CustomsExport" type="{http://www.openapplications.org/oagis/10}CustomsExportType" minOccurs="0"/>
 *         &lt;element name="Port" type="{http://www.openapplications.org/oagis/10}PortType" minOccurs="0"/>
 *         &lt;element name="ActualShipDate" type="{http://www.openapplications.org/oagis/10}DateType" minOccurs="0"/>
 *         &lt;element name="ShippingRoute" type="{http://www.openapplications.org/oagis/10}ShippingRouteType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="IntraCompanyTransferIndicator" type="{http://www.openapplications.org/oagis/10}IndicatorType" minOccurs="0"/>
 *         &lt;element name="ContainerQuantity" type="{http://www.openapplications.org/oagis/10}QuantityType" minOccurs="0"/>
 *         &lt;element name="ShipToParty" type="{http://www.openapplications.org/oagis/10}ShipToPartyType" minOccurs="0"/>
 *         &lt;element name="SupplierParty" type="{http://www.openapplications.org/oagis/10}SupplierPartyType" minOccurs="0"/>
 *         &lt;element name="UltimateRecipientParty" type="{http://www.openapplications.org/oagis/10}PartyType" minOccurs="0"/>
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
@XmlType(name = "ExportDeclarationHeaderBaseType", propOrder = {
    "grossWeightMeasure",
    "customsExport",
    "port",
    "actualShipDate",
    "shippingRoute",
    "intraCompanyTransferIndicator",
    "containerQuantity",
    "shipToParty",
    "supplierParty",
    "ultimateRecipientParty",
    "party"
})
@XmlSeeAlso({
    ShippersExportDeclarationHeaderBaseType.class
})
public class ExportDeclarationHeaderBaseType
    extends StatusHeaderBaseType
{

    @XmlElement(name = "GrossWeightMeasure")
    protected MeasureType grossWeightMeasure;
    @XmlElement(name = "CustomsExport")
    protected CustomsExportType customsExport;
    @XmlElement(name = "Port")
    protected PortType port;
    @XmlElement(name = "ActualShipDate")
    @XmlSchemaType(name = "anySimpleType")
    protected String actualShipDate;
    @XmlElement(name = "ShippingRoute")
    protected List<ShippingRouteType> shippingRoute;
    @XmlElement(name = "IntraCompanyTransferIndicator")
    protected Boolean intraCompanyTransferIndicator;
    @XmlElement(name = "ContainerQuantity")
    protected QuantityType containerQuantity;
    @XmlElement(name = "ShipToParty")
    protected ShipToPartyType shipToParty;
    @XmlElement(name = "SupplierParty")
    protected SupplierPartyType supplierParty;
    @XmlElement(name = "UltimateRecipientParty")
    protected PartyType ultimateRecipientParty;
    @XmlElement(name = "Party")
    protected List<PartyType> party;

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
     * Gets the value of the customsExport property.
     * 
     * @return
     *     possible object is
     *     {@link CustomsExportType }
     *     
     */
    public CustomsExportType getCustomsExport() {
        return customsExport;
    }

    /**
     * Sets the value of the customsExport property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomsExportType }
     *     
     */
    public void setCustomsExport(CustomsExportType value) {
        this.customsExport = value;
    }

    /**
     * Gets the value of the port property.
     * 
     * @return
     *     possible object is
     *     {@link PortType }
     *     
     */
    public PortType getPort() {
        return port;
    }

    /**
     * Sets the value of the port property.
     * 
     * @param value
     *     allowed object is
     *     {@link PortType }
     *     
     */
    public void setPort(PortType value) {
        this.port = value;
    }

    /**
     * Gets the value of the actualShipDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActualShipDate() {
        return actualShipDate;
    }

    /**
     * Sets the value of the actualShipDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActualShipDate(String value) {
        this.actualShipDate = value;
    }

    /**
     * Gets the value of the shippingRoute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shippingRoute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShippingRoute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShippingRouteType }
     * 
     * 
     */
    public List<ShippingRouteType> getShippingRoute() {
        if (shippingRoute == null) {
            shippingRoute = new ArrayList<ShippingRouteType>();
        }
        return this.shippingRoute;
    }

    /**
     * Gets the value of the intraCompanyTransferIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIntraCompanyTransferIndicator() {
        return intraCompanyTransferIndicator;
    }

    /**
     * Sets the value of the intraCompanyTransferIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIntraCompanyTransferIndicator(Boolean value) {
        this.intraCompanyTransferIndicator = value;
    }

    /**
     * Gets the value of the containerQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityType }
     *     
     */
    public QuantityType getContainerQuantity() {
        return containerQuantity;
    }

    /**
     * Sets the value of the containerQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType }
     *     
     */
    public void setContainerQuantity(QuantityType value) {
        this.containerQuantity = value;
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
     * Gets the value of the ultimateRecipientParty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getUltimateRecipientParty() {
        return ultimateRecipientParty;
    }

    /**
     * Sets the value of the ultimateRecipientParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setUltimateRecipientParty(PartyType value) {
        this.ultimateRecipientParty = value;
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

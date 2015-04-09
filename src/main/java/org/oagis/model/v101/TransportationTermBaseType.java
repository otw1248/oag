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
 * Usage:  When a seller ships something via common to a buyer in accordance with the Uniform Commercial Code and international legal agreements, you must specify a particular "phrase" that states who assumes the risk of shipment, who is responsible for loading and unloading the goods, where ownership or title to the goods passes, who paid or pays the carrier, etc.
 * 
 * Examples of these "phrases" include:
 * - "FOB Origin Prepaid and Add" (Free On Board - no cost for loading, title passes at seller's dock, seller prepaid freight cost and delivery insurance, seller will freight costs to cost of goods)
 * - "FOB Destination" or "FOB Destination Prepaid" (Free On Board - no cost for loading, title passes at buyer's dock, seller prepaid freight cost and delivery insurance)
 * 
 * In software applications, this phrase is commonly split into two coded pieces, a "legal terms" risk and responsibility component for use with common carriers (FOB Destination) and some kind of qualifying component (Prepaid and Add).
 * 			
 * 
 * <p>Java class for TransportationTermBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransportationTermBaseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}IdentificationType">
 *       &lt;sequence>
 *         &lt;element name="IncotermsCode" type="{http://www.openapplications.org/oagis/10}IncotermsCodeType" minOccurs="0"/>
 *         &lt;element name="PlaceOfOwnershipTransferLocation" type="{http://www.openapplications.org/oagis/10}LocationType" minOccurs="0"/>
 *         &lt;element name="ShipmentServiceLevelCode" type="{http://www.openapplications.org/oagis/10}CodeType" minOccurs="0"/>
 *         &lt;element name="FreightTermCode" type="{http://www.openapplications.org/oagis/10}FreightTermCodeType" minOccurs="0"/>
 *         &lt;group ref="{http://www.openapplications.org/oagis/10}FreeFormTextGroup"/>
 *         &lt;element name="FreightChargeGeographicLocationIndicator" type="{http://www.openapplications.org/oagis/10}IndicatorType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransportationTermBaseType", propOrder = {
    "incotermsCode",
    "placeOfOwnershipTransferLocation",
    "shipmentServiceLevelCode",
    "freightTermCode",
    "description",
    "note",
    "freightChargeGeographicLocationIndicator"
})
@XmlSeeAlso({
    TransportationTermType.class
})
public class TransportationTermBaseType
    extends IdentificationType
{

    @XmlElement(name = "IncotermsCode")
    protected IncotermsCodeType incotermsCode;
    @XmlElement(name = "PlaceOfOwnershipTransferLocation")
    protected LocationType placeOfOwnershipTransferLocation;
    @XmlElement(name = "ShipmentServiceLevelCode")
    protected CodeType shipmentServiceLevelCode;
    @XmlElement(name = "FreightTermCode")
    protected FreightTermCodeType freightTermCode;
    @XmlElement(name = "Description")
    protected List<DescriptionType> description;
    @XmlElement(name = "Note")
    protected List<NoteType> note;
    @XmlElement(name = "FreightChargeGeographicLocationIndicator")
    protected Boolean freightChargeGeographicLocationIndicator;

    /**
     * Gets the value of the incotermsCode property.
     * 
     * @return
     *     possible object is
     *     {@link IncotermsCodeType }
     *     
     */
    public IncotermsCodeType getIncotermsCode() {
        return incotermsCode;
    }

    /**
     * Sets the value of the incotermsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncotermsCodeType }
     *     
     */
    public void setIncotermsCode(IncotermsCodeType value) {
        this.incotermsCode = value;
    }

    /**
     * Gets the value of the placeOfOwnershipTransferLocation property.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getPlaceOfOwnershipTransferLocation() {
        return placeOfOwnershipTransferLocation;
    }

    /**
     * Sets the value of the placeOfOwnershipTransferLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setPlaceOfOwnershipTransferLocation(LocationType value) {
        this.placeOfOwnershipTransferLocation = value;
    }

    /**
     * Gets the value of the shipmentServiceLevelCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getShipmentServiceLevelCode() {
        return shipmentServiceLevelCode;
    }

    /**
     * Sets the value of the shipmentServiceLevelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setShipmentServiceLevelCode(CodeType value) {
        this.shipmentServiceLevelCode = value;
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
     * Gets the value of the description property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescriptionType }
     * 
     * 
     */
    public List<DescriptionType> getDescription() {
        if (description == null) {
            description = new ArrayList<DescriptionType>();
        }
        return this.description;
    }

    /**
     * Gets the value of the note property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the note property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NoteType }
     * 
     * 
     */
    public List<NoteType> getNote() {
        if (note == null) {
            note = new ArrayList<NoteType>();
        }
        return this.note;
    }

    /**
     * Gets the value of the freightChargeGeographicLocationIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFreightChargeGeographicLocationIndicator() {
        return freightChargeGeographicLocationIndicator;
    }

    /**
     * Sets the value of the freightChargeGeographicLocationIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFreightChargeGeographicLocationIndicator(Boolean value) {
        this.freightChargeGeographicLocationIndicator = value;
    }

}

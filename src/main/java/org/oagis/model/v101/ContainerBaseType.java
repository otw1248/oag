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
 * Container Base Type for detailing the minimum details of a container such as serial number and composition
 * 
 * <p>Java class for ContainerBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContainerBaseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}IdentificationType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.openapplications.org/oagis/10}ContainerInstanceIDsGroup"/>
 *         &lt;element name="ContainerGroupID" type="{http://www.openapplications.org/oagis/10}IDType" minOccurs="0"/>
 *         &lt;element name="DocumentReference" type="{http://www.openapplications.org/oagis/10}DocumentReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="GrossWeightMeasure" type="{http://www.openapplications.org/oagis/10}MeasureType" minOccurs="0"/>
 *         &lt;element name="PackingMaterial" type="{http://www.openapplications.org/oagis/10}MaterialType" minOccurs="0"/>
 *         &lt;element name="ShippingMaterial" type="{http://www.openapplications.org/oagis/10}MaterialType" minOccurs="0"/>
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
@XmlType(name = "ContainerBaseType", propOrder = {
    "containerID",
    "rfid",
    "sealID",
    "containerGroupID",
    "documentReference",
    "grossWeightMeasure",
    "packingMaterial",
    "shippingMaterial",
    "quantity"
})
@XmlSeeAlso({
    ShipmentUnitContainerBaseType.class
})
public class ContainerBaseType
    extends IdentificationType
{

    @XmlElement(name = "ContainerID")
    protected List<IDType> containerID;
    @XmlElement(name = "RFID")
    protected IDType rfid;
    @XmlElement(name = "SealID")
    protected IDType sealID;
    @XmlElement(name = "ContainerGroupID")
    protected IDType containerGroupID;
    @XmlElement(name = "DocumentReference")
    protected List<DocumentReferenceType> documentReference;
    @XmlElement(name = "GrossWeightMeasure")
    protected MeasureType grossWeightMeasure;
    @XmlElement(name = "PackingMaterial")
    protected MaterialType packingMaterial;
    @XmlElement(name = "ShippingMaterial")
    protected MaterialType shippingMaterial;
    @XmlElement(name = "Quantity")
    protected List<OpenQuantityType> quantity;

    /**
     * Gets the value of the containerID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the containerID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContainerID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IDType }
     * 
     * 
     */
    public List<IDType> getContainerID() {
        if (containerID == null) {
            containerID = new ArrayList<IDType>();
        }
        return this.containerID;
    }

    /**
     * Gets the value of the rfid property.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getRFID() {
        return rfid;
    }

    /**
     * Sets the value of the rfid property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setRFID(IDType value) {
        this.rfid = value;
    }

    /**
     * Gets the value of the sealID property.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getSealID() {
        return sealID;
    }

    /**
     * Sets the value of the sealID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setSealID(IDType value) {
        this.sealID = value;
    }

    /**
     * Gets the value of the containerGroupID property.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getContainerGroupID() {
        return containerGroupID;
    }

    /**
     * Sets the value of the containerGroupID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setContainerGroupID(IDType value) {
        this.containerGroupID = value;
    }

    /**
     * Gets the value of the documentReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentReferenceType }
     * 
     * 
     */
    public List<DocumentReferenceType> getDocumentReference() {
        if (documentReference == null) {
            documentReference = new ArrayList<DocumentReferenceType>();
        }
        return this.documentReference;
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
     * Gets the value of the packingMaterial property.
     * 
     * @return
     *     possible object is
     *     {@link MaterialType }
     *     
     */
    public MaterialType getPackingMaterial() {
        return packingMaterial;
    }

    /**
     * Sets the value of the packingMaterial property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaterialType }
     *     
     */
    public void setPackingMaterial(MaterialType value) {
        this.packingMaterial = value;
    }

    /**
     * Gets the value of the shippingMaterial property.
     * 
     * @return
     *     possible object is
     *     {@link MaterialType }
     *     
     */
    public MaterialType getShippingMaterial() {
        return shippingMaterial;
    }

    /**
     * Sets the value of the shippingMaterial property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaterialType }
     *     
     */
    public void setShippingMaterial(MaterialType value) {
        this.shippingMaterial = value;
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

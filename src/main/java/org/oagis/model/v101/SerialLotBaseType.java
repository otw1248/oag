//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 05:04:55 PM CST 
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
 * <p>Java class for SerialLotBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SerialLotBaseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}IdentificationType">
 *       &lt;sequence>
 *         &lt;element name="ItemQuantity" type="{http://www.openapplications.org/oagis/10}QuantityType" minOccurs="0"/>
 *         &lt;element name="Quantity" type="{http://www.openapplications.org/oagis/10}OpenQuantityType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Lot" type="{http://www.openapplications.org/oagis/10}LotType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Disposition" type="{http://www.openapplications.org/oagis/10}StatusType" minOccurs="0"/>
 *         &lt;element name="SerialNumberID" type="{http://www.openapplications.org/oagis/10}IDType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ParentSerialNumberID" type="{http://www.openapplications.org/oagis/10}IDType" minOccurs="0"/>
 *         &lt;group ref="{http://www.openapplications.org/oagis/10}FreeFormTextGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SerialLotBaseType", propOrder = {
    "itemQuantity",
    "quantity",
    "lot",
    "disposition",
    "serialNumberID",
    "parentSerialNumberID",
    "description",
    "note"
})
@XmlSeeAlso({
    SerialLotType.class
})
public class SerialLotBaseType
    extends IdentificationType
{

    @XmlElement(name = "ItemQuantity")
    protected QuantityType itemQuantity;
    @XmlElement(name = "Quantity")
    protected List<OpenQuantityType> quantity;
    @XmlElement(name = "Lot")
    protected List<LotType> lot;
    @XmlElement(name = "Disposition")
    protected StatusType disposition;
    @XmlElement(name = "SerialNumberID")
    protected List<IDType> serialNumberID;
    @XmlElement(name = "ParentSerialNumberID")
    protected IDType parentSerialNumberID;
    @XmlElement(name = "Description")
    protected List<DescriptionType> description;
    @XmlElement(name = "Note")
    protected List<NoteType> note;

    /**
     * Gets the value of the itemQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityType }
     *     
     */
    public QuantityType getItemQuantity() {
        return itemQuantity;
    }

    /**
     * Sets the value of the itemQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType }
     *     
     */
    public void setItemQuantity(QuantityType value) {
        this.itemQuantity = value;
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
     * Gets the value of the lot property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lot property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLot().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LotType }
     * 
     * 
     */
    public List<LotType> getLot() {
        if (lot == null) {
            lot = new ArrayList<LotType>();
        }
        return this.lot;
    }

    /**
     * Gets the value of the disposition property.
     * 
     * @return
     *     possible object is
     *     {@link StatusType }
     *     
     */
    public StatusType getDisposition() {
        return disposition;
    }

    /**
     * Sets the value of the disposition property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType }
     *     
     */
    public void setDisposition(StatusType value) {
        this.disposition = value;
    }

    /**
     * Gets the value of the serialNumberID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serialNumberID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSerialNumberID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IDType }
     * 
     * 
     */
    public List<IDType> getSerialNumberID() {
        if (serialNumberID == null) {
            serialNumberID = new ArrayList<IDType>();
        }
        return this.serialNumberID;
    }

    /**
     * Gets the value of the parentSerialNumberID property.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getParentSerialNumberID() {
        return parentSerialNumberID;
    }

    /**
     * Sets the value of the parentSerialNumberID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setParentSerialNumberID(IDType value) {
        this.parentSerialNumberID = value;
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

}

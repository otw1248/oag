//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 05:01:29 PM CST 
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
 * <p>Java class for ManufacturingPersonnelBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManufacturingPersonnelBaseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}IdentificationType">
 *       &lt;sequence>
 *         &lt;element name="PersonnelClassID" type="{http://www.openapplications.org/oagis/10}IDType" minOccurs="0"/>
 *         &lt;element name="PersonID" type="{http://www.openapplications.org/oagis/10}IDType" minOccurs="0"/>
 *         &lt;group ref="{http://www.openapplications.org/oagis/10}FreeFormTextGroup"/>
 *         &lt;element name="Location" type="{http://www.openapplications.org/oagis/10}LocationType" minOccurs="0"/>
 *         &lt;element name="RequiredByRequestedSegmentResponseCode" type="{http://www.openapplications.org/oagis/10}CodeType" minOccurs="0"/>
 *         &lt;element name="LaborActual" type="{http://www.openapplications.org/oagis/10}LaborActualType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManufacturingPersonnelBaseType", propOrder = {
    "personnelClassID",
    "personID",
    "description",
    "note",
    "location",
    "requiredByRequestedSegmentResponseCode",
    "laborActual"
})
@XmlSeeAlso({
    ManufacturingPersonnelType.class
})
public class ManufacturingPersonnelBaseType
    extends IdentificationType
{

    @XmlElement(name = "PersonnelClassID")
    protected IDType personnelClassID;
    @XmlElement(name = "PersonID")
    protected IDType personID;
    @XmlElement(name = "Description")
    protected List<DescriptionType> description;
    @XmlElement(name = "Note")
    protected List<NoteType> note;
    @XmlElement(name = "Location")
    protected LocationType location;
    @XmlElement(name = "RequiredByRequestedSegmentResponseCode")
    protected CodeType requiredByRequestedSegmentResponseCode;
    @XmlElement(name = "LaborActual")
    protected List<LaborActualType> laborActual;

    /**
     * Gets the value of the personnelClassID property.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getPersonnelClassID() {
        return personnelClassID;
    }

    /**
     * Sets the value of the personnelClassID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setPersonnelClassID(IDType value) {
        this.personnelClassID = value;
    }

    /**
     * Gets the value of the personID property.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getPersonID() {
        return personID;
    }

    /**
     * Sets the value of the personID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setPersonID(IDType value) {
        this.personID = value;
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
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setLocation(LocationType value) {
        this.location = value;
    }

    /**
     * Gets the value of the requiredByRequestedSegmentResponseCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getRequiredByRequestedSegmentResponseCode() {
        return requiredByRequestedSegmentResponseCode;
    }

    /**
     * Sets the value of the requiredByRequestedSegmentResponseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setRequiredByRequestedSegmentResponseCode(CodeType value) {
        this.requiredByRequestedSegmentResponseCode = value;
    }

    /**
     * Gets the value of the laborActual property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the laborActual property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLaborActual().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LaborActualType }
     * 
     * 
     */
    public List<LaborActualType> getLaborActual() {
        if (laborActual == null) {
            laborActual = new ArrayList<LaborActualType>();
        }
        return this.laborActual;
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 05:02:09 PM CST 
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
 * <p>Java class for RequisitionLineBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequisitionLineBaseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}RequestLineBaseType">
 *       &lt;sequence>
 *         &lt;element name="RequestedQuantity" type="{http://www.openapplications.org/oagis/10}OpenQuantityType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RequesterParty" type="{http://www.openapplications.org/oagis/10}PartyType" minOccurs="0"/>
 *         &lt;element name="RequisitionSchedule" type="{http://www.openapplications.org/oagis/10}RequistionScheduldeType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequisitionLineBaseType", propOrder = {
    "requestedQuantity",
    "requesterParty",
    "requisitionSchedule"
})
@XmlSeeAlso({
    RequisitionSubLineType.class,
    RequisitionLineType.class
})
public class RequisitionLineBaseType
    extends RequestLineBaseType
{

    @XmlElement(name = "RequestedQuantity")
    protected List<OpenQuantityType> requestedQuantity;
    @XmlElement(name = "RequesterParty")
    protected PartyType requesterParty;
    @XmlElement(name = "RequisitionSchedule")
    protected List<RequistionScheduldeType> requisitionSchedule;

    /**
     * Gets the value of the requestedQuantity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requestedQuantity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequestedQuantity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpenQuantityType }
     * 
     * 
     */
    public List<OpenQuantityType> getRequestedQuantity() {
        if (requestedQuantity == null) {
            requestedQuantity = new ArrayList<OpenQuantityType>();
        }
        return this.requestedQuantity;
    }

    /**
     * Gets the value of the requesterParty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getRequesterParty() {
        return requesterParty;
    }

    /**
     * Sets the value of the requesterParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setRequesterParty(PartyType value) {
        this.requesterParty = value;
    }

    /**
     * Gets the value of the requisitionSchedule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requisitionSchedule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequisitionSchedule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequistionScheduldeType }
     * 
     * 
     */
    public List<RequistionScheduldeType> getRequisitionSchedule() {
        if (requisitionSchedule == null) {
            requisitionSchedule = new ArrayList<RequistionScheduldeType>();
        }
        return this.requisitionSchedule;
    }

}
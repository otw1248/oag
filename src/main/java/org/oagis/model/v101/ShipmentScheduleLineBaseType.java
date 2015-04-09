//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 05:04:10 PM CST 
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
 * <p>Java class for ShipmentScheduleLineBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipmentScheduleLineBaseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}ScheduleLineBaseType">
 *       &lt;sequence>
 *         &lt;element name="RequiredDateTime" type="{http://www.openapplications.org/oagis/10}DateTimeType" minOccurs="0"/>
 *         &lt;element name="PurchaseOrderReference" type="{http://www.openapplications.org/oagis/10}OrderReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SalesOrderReference" type="{http://www.openapplications.org/oagis/10}OrderReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DrawingAttachment" type="{http://www.openapplications.org/oagis/10}AttachmentType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ScheduleException" type="{http://www.openapplications.org/oagis/10}ScheduleExceptionType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipmentScheduleLineBaseType", propOrder = {
    "requiredDateTime",
    "purchaseOrderReference",
    "salesOrderReference",
    "drawingAttachment",
    "scheduleException"
})
@XmlSeeAlso({
    ShipmentScheduleLineType.class
})
public class ShipmentScheduleLineBaseType
    extends ScheduleLineBaseType
{

    @XmlElement(name = "RequiredDateTime")
    @XmlSchemaType(name = "anySimpleType")
    protected String requiredDateTime;
    @XmlElement(name = "PurchaseOrderReference")
    protected List<OrderReferenceType> purchaseOrderReference;
    @XmlElement(name = "SalesOrderReference")
    protected List<OrderReferenceType> salesOrderReference;
    @XmlElement(name = "DrawingAttachment")
    protected List<AttachmentType> drawingAttachment;
    @XmlElement(name = "ScheduleException")
    protected List<ScheduleExceptionType> scheduleException;

    /**
     * Gets the value of the requiredDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequiredDateTime() {
        return requiredDateTime;
    }

    /**
     * Sets the value of the requiredDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequiredDateTime(String value) {
        this.requiredDateTime = value;
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
     * Gets the value of the scheduleException property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scheduleException property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScheduleException().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScheduleExceptionType }
     * 
     * 
     */
    public List<ScheduleExceptionType> getScheduleException() {
        if (scheduleException == null) {
            scheduleException = new ArrayList<ScheduleExceptionType>();
        }
        return this.scheduleException;
    }

}

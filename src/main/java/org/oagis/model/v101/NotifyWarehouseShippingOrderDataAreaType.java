//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 04:38:29 PM CST 
//


package org.oagis.model.v101;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotifyWarehouseShippingOrderDataAreaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotifyWarehouseShippingOrderDataAreaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Notify" type="{http://www.openapplications.org/oagis/10}NotifyType"/>
 *         &lt;element name="WarehouseShippingOrder" type="{http://www.openapplications.org/oagis/10}WarehouseShippingOrderType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotifyWarehouseShippingOrderDataAreaType", propOrder = {
    "notify",
    "warehouseShippingOrder"
})
public class NotifyWarehouseShippingOrderDataAreaType {

    @XmlElement(name = "Notify", required = true)
    protected NotifyType notify;
    @XmlElement(name = "WarehouseShippingOrder", required = true)
    protected List<WarehouseShippingOrderType> warehouseShippingOrder;

    /**
     * Gets the value of the notify property.
     * 
     * @return
     *     possible object is
     *     {@link NotifyType }
     *     
     */
    public NotifyType getNotify() {
        return notify;
    }

    /**
     * Sets the value of the notify property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotifyType }
     *     
     */
    public void setNotify(NotifyType value) {
        this.notify = value;
    }

    /**
     * Gets the value of the warehouseShippingOrder property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the warehouseShippingOrder property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWarehouseShippingOrder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WarehouseShippingOrderType }
     * 
     * 
     */
    public List<WarehouseShippingOrderType> getWarehouseShippingOrder() {
        if (warehouseShippingOrder == null) {
            warehouseShippingOrder = new ArrayList<WarehouseShippingOrderType>();
        }
        return this.warehouseShippingOrder;
    }

}

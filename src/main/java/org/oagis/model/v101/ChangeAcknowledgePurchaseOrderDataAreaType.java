//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 04:15:24 PM CST 
//


package org.oagis.model.v101;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChangeAcknowledgePurchaseOrderDataAreaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeAcknowledgePurchaseOrderDataAreaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ChangeAcknowledge" type="{http://www.openapplications.org/oagis/10}AcknowledgeType"/>
 *         &lt;element name="PurchaseOrder" type="{http://www.openapplications.org/oagis/10}PurchaseOrderType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeAcknowledgePurchaseOrderDataAreaType", propOrder = {
    "changeAcknowledge",
    "purchaseOrder"
})
public class ChangeAcknowledgePurchaseOrderDataAreaType {

    @XmlElement(name = "ChangeAcknowledge", required = true)
    protected AcknowledgeType changeAcknowledge;
    @XmlElement(name = "PurchaseOrder", required = true)
    protected List<PurchaseOrderType> purchaseOrder;

    /**
     * Gets the value of the changeAcknowledge property.
     * 
     * @return
     *     possible object is
     *     {@link AcknowledgeType }
     *     
     */
    public AcknowledgeType getChangeAcknowledge() {
        return changeAcknowledge;
    }

    /**
     * Sets the value of the changeAcknowledge property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcknowledgeType }
     *     
     */
    public void setChangeAcknowledge(AcknowledgeType value) {
        this.changeAcknowledge = value;
    }

    /**
     * Gets the value of the purchaseOrder property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the purchaseOrder property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPurchaseOrder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PurchaseOrderType }
     * 
     * 
     */
    public List<PurchaseOrderType> getPurchaseOrder() {
        if (purchaseOrder == null) {
            purchaseOrder = new ArrayList<PurchaseOrderType>();
        }
        return this.purchaseOrder;
    }

}

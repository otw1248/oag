//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 05:01:20 PM CST 
//


package org.oagis.model.v101;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SyncResponseProductionOrderDataAreaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SyncResponseProductionOrderDataAreaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SyncResponse" type="{http://www.openapplications.org/oagis/10}RespondType"/>
 *         &lt;element name="ProductionOrder" type="{http://www.openapplications.org/oagis/10}ProductionOrderType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SyncResponseProductionOrderDataAreaType", propOrder = {
    "syncResponse",
    "productionOrder"
})
public class SyncResponseProductionOrderDataAreaType {

    @XmlElement(name = "SyncResponse", required = true)
    protected RespondType syncResponse;
    @XmlElement(name = "ProductionOrder", required = true)
    protected List<ProductionOrderType> productionOrder;

    /**
     * Gets the value of the syncResponse property.
     * 
     * @return
     *     possible object is
     *     {@link RespondType }
     *     
     */
    public RespondType getSyncResponse() {
        return syncResponse;
    }

    /**
     * Sets the value of the syncResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link RespondType }
     *     
     */
    public void setSyncResponse(RespondType value) {
        this.syncResponse = value;
    }

    /**
     * Gets the value of the productionOrder property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productionOrder property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductionOrder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductionOrderType }
     * 
     * 
     */
    public List<ProductionOrderType> getProductionOrder() {
        if (productionOrder == null) {
            productionOrder = new ArrayList<ProductionOrderType>();
        }
        return this.productionOrder;
    }

}

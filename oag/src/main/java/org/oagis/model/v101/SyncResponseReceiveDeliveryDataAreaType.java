//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 05:01:47 PM CST 
//


package org.oagis.model.v101;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SyncResponseReceiveDeliveryDataAreaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SyncResponseReceiveDeliveryDataAreaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SyncResponse" type="{http://www.openapplications.org/oagis/10}RespondType"/>
 *         &lt;element name="ReceiveDelivery" type="{http://www.openapplications.org/oagis/10}ReceiveDeliveryType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SyncResponseReceiveDeliveryDataAreaType", propOrder = {
    "syncResponse",
    "receiveDelivery"
})
public class SyncResponseReceiveDeliveryDataAreaType {

    @XmlElement(name = "SyncResponse", required = true)
    protected RespondType syncResponse;
    @XmlElement(name = "ReceiveDelivery", required = true)
    protected List<ReceiveDeliveryType> receiveDelivery;

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
     * Gets the value of the receiveDelivery property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the receiveDelivery property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReceiveDelivery().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReceiveDeliveryType }
     * 
     * 
     */
    public List<ReceiveDeliveryType> getReceiveDelivery() {
        if (receiveDelivery == null) {
            receiveDelivery = new ArrayList<ReceiveDeliveryType>();
        }
        return this.receiveDelivery;
    }

}

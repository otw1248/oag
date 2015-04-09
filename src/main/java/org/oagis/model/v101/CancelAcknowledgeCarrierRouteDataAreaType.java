//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 03:57:47 PM CST 
//


package org.oagis.model.v101;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CancelAcknowledgeCarrierRouteDataAreaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CancelAcknowledgeCarrierRouteDataAreaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CancelAcknowledge" type="{http://www.openapplications.org/oagis/10}AcknowledgeType"/>
 *         &lt;element name="CarrierRoute" type="{http://www.openapplications.org/oagis/10}CarrierRouteType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancelAcknowledgeCarrierRouteDataAreaType", propOrder = {
    "cancelAcknowledge",
    "carrierRoute"
})
public class CancelAcknowledgeCarrierRouteDataAreaType {

    @XmlElement(name = "CancelAcknowledge", required = true)
    protected AcknowledgeType cancelAcknowledge;
    @XmlElement(name = "CarrierRoute", required = true)
    protected List<CarrierRouteType> carrierRoute;

    /**
     * Gets the value of the cancelAcknowledge property.
     * 
     * @return
     *     possible object is
     *     {@link AcknowledgeType }
     *     
     */
    public AcknowledgeType getCancelAcknowledge() {
        return cancelAcknowledge;
    }

    /**
     * Sets the value of the cancelAcknowledge property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcknowledgeType }
     *     
     */
    public void setCancelAcknowledge(AcknowledgeType value) {
        this.cancelAcknowledge = value;
    }

    /**
     * Gets the value of the carrierRoute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carrierRoute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarrierRoute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CarrierRouteType }
     * 
     * 
     */
    public List<CarrierRouteType> getCarrierRoute() {
        if (carrierRoute == null) {
            carrierRoute = new ArrayList<CarrierRouteType>();
        }
        return this.carrierRoute;
    }

}

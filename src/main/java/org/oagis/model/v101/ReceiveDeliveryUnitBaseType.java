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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Provides information that identifies and describes a particular shipping unit being received.  This information usually directly references a DeliveryUnit on an OAGIS Delivery message or other shipping   document.  May also be used to provide context to adequately detail inventory discrepancies or compliance charges for a particular shipping unit
 * 
 * <p>Java class for ReceiveDeliveryUnitBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReceiveDeliveryUnitBaseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}ShipUnitBaseType">
 *       &lt;sequence>
 *         &lt;element name="Container" type="{http://www.openapplications.org/oagis/10}ContainerType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ReceiveDeliveryUnitItem" type="{http://www.openapplications.org/oagis/10}ReceiveDeliveryUnitItemType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReceiveDeliveryUnitBaseType", propOrder = {
    "container",
    "receiveDeliveryUnitItem"
})
@XmlSeeAlso({
    ReceiveDeliveryUnitType.class
})
public class ReceiveDeliveryUnitBaseType
    extends ShipUnitBaseType
{

    @XmlElement(name = "Container")
    protected List<ContainerType> container;
    @XmlElement(name = "ReceiveDeliveryUnitItem")
    protected ReceiveDeliveryUnitItemType receiveDeliveryUnitItem;

    /**
     * Gets the value of the container property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the container property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContainer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContainerType }
     * 
     * 
     */
    public List<ContainerType> getContainer() {
        if (container == null) {
            container = new ArrayList<ContainerType>();
        }
        return this.container;
    }

    /**
     * Gets the value of the receiveDeliveryUnitItem property.
     * 
     * @return
     *     possible object is
     *     {@link ReceiveDeliveryUnitItemType }
     *     
     */
    public ReceiveDeliveryUnitItemType getReceiveDeliveryUnitItem() {
        return receiveDeliveryUnitItem;
    }

    /**
     * Sets the value of the receiveDeliveryUnitItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceiveDeliveryUnitItemType }
     *     
     */
    public void setReceiveDeliveryUnitItem(ReceiveDeliveryUnitItemType value) {
        this.receiveDeliveryUnitItem = value;
    }

}

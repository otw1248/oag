//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 05:04:14 PM CST 
//


package org.oagis.model.v101;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Shipment Unit Container Type for detailing the highest level aggregation of a logistics enabler
 * 
 * <p>Java class for ShipmentUnitContainerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipmentUnitContainerType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}ShipmentUnitContainerBaseType">
 *       &lt;sequence>
 *         &lt;element name="Extension" type="{http://www.openapplications.org/oagis/10}ShipmentUnitContainerExtensionType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipmentUnitContainerType", propOrder = {
    "extension"
})
public class ShipmentUnitContainerType
    extends ShipmentUnitContainerBaseType
{

    @XmlElement(name = "Extension")
    protected List<ShipmentUnitContainerExtensionType> extension;

    /**
     * Gets the value of the extension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShipmentUnitContainerExtensionType }
     * 
     * 
     */
    public List<ShipmentUnitContainerExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<ShipmentUnitContainerExtensionType>();
        }
        return this.extension;
    }

}

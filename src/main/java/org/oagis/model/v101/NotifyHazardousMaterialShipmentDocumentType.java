//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 04:33:26 PM CST 
//


package org.oagis.model.v101;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotifyHazardousMaterialShipmentDocumentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotifyHazardousMaterialShipmentDocumentType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}BusinessObjectDocumentType">
 *       &lt;sequence>
 *         &lt;element name="DataArea" type="{http://www.openapplications.org/oagis/10}NotifyHazardousMaterialShipmentDocumentDataAreaType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotifyHazardousMaterialShipmentDocumentType", propOrder = {
    "dataArea"
})
public class NotifyHazardousMaterialShipmentDocumentType
    extends BusinessObjectDocumentType
{

    @XmlElement(name = "DataArea", required = true)
    protected NotifyHazardousMaterialShipmentDocumentDataAreaType dataArea;

    /**
     * Gets the value of the dataArea property.
     * 
     * @return
     *     possible object is
     *     {@link NotifyHazardousMaterialShipmentDocumentDataAreaType }
     *     
     */
    public NotifyHazardousMaterialShipmentDocumentDataAreaType getDataArea() {
        return dataArea;
    }

    /**
     * Sets the value of the dataArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotifyHazardousMaterialShipmentDocumentDataAreaType }
     *     
     */
    public void setDataArea(NotifyHazardousMaterialShipmentDocumentDataAreaType value) {
        this.dataArea = value;
    }

}

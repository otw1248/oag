//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 03:57:18 PM CST 
//


package org.oagis.model.v101;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AcknowledgeWarrantyClaimType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcknowledgeWarrantyClaimType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}BusinessObjectDocumentType">
 *       &lt;sequence>
 *         &lt;element name="DataArea" type="{http://www.openapplications.org/oagis/10}AcknowledgeWarrantyClaimDataAreaType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcknowledgeWarrantyClaimType", propOrder = {
    "dataArea"
})
public class AcknowledgeWarrantyClaimType
    extends BusinessObjectDocumentType
{

    @XmlElement(name = "DataArea", required = true)
    protected AcknowledgeWarrantyClaimDataAreaType dataArea;

    /**
     * Gets the value of the dataArea property.
     * 
     * @return
     *     possible object is
     *     {@link AcknowledgeWarrantyClaimDataAreaType }
     *     
     */
    public AcknowledgeWarrantyClaimDataAreaType getDataArea() {
        return dataArea;
    }

    /**
     * Sets the value of the dataArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcknowledgeWarrantyClaimDataAreaType }
     *     
     */
    public void setDataArea(AcknowledgeWarrantyClaimDataAreaType value) {
        this.dataArea = value;
    }

}

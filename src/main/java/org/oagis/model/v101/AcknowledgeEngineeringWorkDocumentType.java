//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 03:53:08 PM CST 
//


package org.oagis.model.v101;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AcknowledgeEngineeringWorkDocumentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcknowledgeEngineeringWorkDocumentType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}BusinessObjectDocumentType">
 *       &lt;sequence>
 *         &lt;element name="DataArea" type="{http://www.openapplications.org/oagis/10}AcknowledgeEngineeringWorkDocumentDataAreaType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcknowledgeEngineeringWorkDocumentType", propOrder = {
    "dataArea"
})
public class AcknowledgeEngineeringWorkDocumentType
    extends BusinessObjectDocumentType
{

    @XmlElement(name = "DataArea", required = true)
    protected AcknowledgeEngineeringWorkDocumentDataAreaType dataArea;

    /**
     * Gets the value of the dataArea property.
     * 
     * @return
     *     possible object is
     *     {@link AcknowledgeEngineeringWorkDocumentDataAreaType }
     *     
     */
    public AcknowledgeEngineeringWorkDocumentDataAreaType getDataArea() {
        return dataArea;
    }

    /**
     * Sets the value of the dataArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcknowledgeEngineeringWorkDocumentDataAreaType }
     *     
     */
    public void setDataArea(AcknowledgeEngineeringWorkDocumentDataAreaType value) {
        this.dataArea = value;
    }

}

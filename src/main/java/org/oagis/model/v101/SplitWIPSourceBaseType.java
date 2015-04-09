//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 05:04:28 PM CST 
//


package org.oagis.model.v101;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SplitWIPSourceBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SplitWIPSourceBaseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}IdentificationType">
 *       &lt;sequence>
 *         &lt;element name="ProductionOrderReference" type="{http://www.openapplications.org/oagis/10}ProductionOrderReferenceType" minOccurs="0"/>
 *         &lt;element name="OperationReference" type="{http://www.openapplications.org/oagis/10}OperationReferenceType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SplitWIPSourceBaseType", propOrder = {
    "productionOrderReference",
    "operationReference"
})
@XmlSeeAlso({
    SplitWIPSourceType.class
})
public class SplitWIPSourceBaseType
    extends IdentificationType
{

    @XmlElement(name = "ProductionOrderReference")
    protected ProductionOrderReferenceType productionOrderReference;
    @XmlElement(name = "OperationReference")
    protected OperationReferenceType operationReference;

    /**
     * Gets the value of the productionOrderReference property.
     * 
     * @return
     *     possible object is
     *     {@link ProductionOrderReferenceType }
     *     
     */
    public ProductionOrderReferenceType getProductionOrderReference() {
        return productionOrderReference;
    }

    /**
     * Sets the value of the productionOrderReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductionOrderReferenceType }
     *     
     */
    public void setProductionOrderReference(ProductionOrderReferenceType value) {
        this.productionOrderReference = value;
    }

    /**
     * Gets the value of the operationReference property.
     * 
     * @return
     *     possible object is
     *     {@link OperationReferenceType }
     *     
     */
    public OperationReferenceType getOperationReference() {
        return operationReference;
    }

    /**
     * Sets the value of the operationReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationReferenceType }
     *     
     */
    public void setOperationReference(OperationReferenceType value) {
        this.operationReference = value;
    }

}

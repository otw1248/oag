//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 04:16:45 PM CST 
//


package org.oagis.model.v101;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChangeAcknowledgeShippersExportDeclarationDataAreaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeAcknowledgeShippersExportDeclarationDataAreaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ChangeAcknowledge" type="{http://www.openapplications.org/oagis/10}AcknowledgeType"/>
 *         &lt;element name="ShippersExportDeclaration" type="{http://www.openapplications.org/oagis/10}ShippersExportDeclarationType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeAcknowledgeShippersExportDeclarationDataAreaType", propOrder = {
    "changeAcknowledge",
    "shippersExportDeclaration"
})
public class ChangeAcknowledgeShippersExportDeclarationDataAreaType {

    @XmlElement(name = "ChangeAcknowledge", required = true)
    protected AcknowledgeType changeAcknowledge;
    @XmlElement(name = "ShippersExportDeclaration", required = true)
    protected List<ShippersExportDeclarationType> shippersExportDeclaration;

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
     * Gets the value of the shippersExportDeclaration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shippersExportDeclaration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShippersExportDeclaration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShippersExportDeclarationType }
     * 
     * 
     */
    public List<ShippersExportDeclarationType> getShippersExportDeclaration() {
        if (shippersExportDeclaration == null) {
            shippersExportDeclaration = new ArrayList<ShippersExportDeclarationType>();
        }
        return this.shippersExportDeclaration;
    }

}

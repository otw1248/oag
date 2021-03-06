//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 05:01:37 PM CST 
//


package org.oagis.model.v101;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PurchaseOrderLineType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PurchaseOrderLineType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}PurchaseOrderLineBaseType">
 *       &lt;sequence>
 *         &lt;element name="PurchaseOrderSubLine" type="{http://www.openapplications.org/oagis/10}PurchaseOrderSubLineType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Extension" type="{http://www.openapplications.org/oagis/10}PurchaseOrderLineExtensionType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PurchaseOrderLineType", propOrder = {
    "purchaseOrderSubLine",
    "extension"
})
public class PurchaseOrderLineType
    extends PurchaseOrderLineBaseType
{

    @XmlElement(name = "PurchaseOrderSubLine")
    protected List<PurchaseOrderSubLineType> purchaseOrderSubLine;
    @XmlElement(name = "Extension")
    protected List<PurchaseOrderLineExtensionType> extension;

    /**
     * Gets the value of the purchaseOrderSubLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the purchaseOrderSubLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPurchaseOrderSubLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PurchaseOrderSubLineType }
     * 
     * 
     */
    public List<PurchaseOrderSubLineType> getPurchaseOrderSubLine() {
        if (purchaseOrderSubLine == null) {
            purchaseOrderSubLine = new ArrayList<PurchaseOrderSubLineType>();
        }
        return this.purchaseOrderSubLine;
    }

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
     * {@link PurchaseOrderLineExtensionType }
     * 
     * 
     */
    public List<PurchaseOrderLineExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<PurchaseOrderLineExtensionType>();
        }
        return this.extension;
    }

}

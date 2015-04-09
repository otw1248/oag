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
 * Usage:  When a seller ships something via common to a buyer in accordance with the Uniform Commercial Code and international legal agreements, you must specify a particular "phrase" that states who assumes the risk of shipment, who is responsible for loading and unloading the goods, where ownership or title to the goods passes, who paid or pays the carrier, etc.
 * 
 * Examples of these "phrases" include:
 * - "FOB Origin Prepaid and Add" (Free On Board - no cost for loading, title passes at seller's dock, seller prepaid freight cost and delivery insurance, seller will freight costs to cost of goods)
 * - "FOB Destination" or "FOB Destination Prepaid" (Free On Board - no cost for loading, title passes at buyer's dock, seller prepaid freight cost and delivery insurance)
 * 
 * In software applications, this phrase is commonly split into two coded pieces, a "legal terms" risk and responsibility component for use with common carriers (FOB Destination) and some kind of qualifying component (Prepaid and Add).
 * 			
 * 
 * <p>Java class for TransportationTermType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransportationTermType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}TransportationTermBaseType">
 *       &lt;sequence>
 *         &lt;element name="Extension" type="{http://www.openapplications.org/oagis/10}TransportationTermExtensionType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransportationTermType", propOrder = {
    "extension"
})
public class TransportationTermType
    extends TransportationTermBaseType
{

    @XmlElement(name = "Extension")
    protected List<TransportationTermExtensionType> extension;

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
     * {@link TransportationTermExtensionType }
     * 
     * 
     */
    public List<TransportationTermExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<TransportationTermExtensionType>();
        }
        return this.extension;
    }

}

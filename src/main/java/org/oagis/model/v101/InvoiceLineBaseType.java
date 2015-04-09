//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 04:59:25 PM CST 
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
 * <p>Java class for InvoiceLineBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceLineBaseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}InvoiceLineSubLineBaseType">
 *       &lt;sequence>
 *         &lt;element name="InvoiceSubLine" type="{http://www.openapplications.org/oagis/10}InvoiceSubLineType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceLineBaseType", propOrder = {
    "invoiceSubLine"
})
@XmlSeeAlso({
    InvoiceLineType.class
})
public class InvoiceLineBaseType
    extends InvoiceLineSubLineBaseType
{

    @XmlElement(name = "InvoiceSubLine")
    protected List<InvoiceSubLineType> invoiceSubLine;

    /**
     * Gets the value of the invoiceSubLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invoiceSubLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvoiceSubLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvoiceSubLineType }
     * 
     * 
     */
    public List<InvoiceSubLineType> getInvoiceSubLine() {
        if (invoiceSubLine == null) {
            invoiceSubLine = new ArrayList<InvoiceSubLineType>();
        }
        return this.invoiceSubLine;
    }

}

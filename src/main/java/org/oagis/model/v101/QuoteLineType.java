//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 05:01:42 PM CST 
//


package org.oagis.model.v101;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Defines the Quote Line structure.
 * 
 * <p>Java class for QuoteLineType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuoteLineType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}QuoteLineBaseType">
 *       &lt;sequence>
 *         &lt;element name="QuoteSubLine" type="{http://www.openapplications.org/oagis/10}QuoteSubLineType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Extension" type="{http://www.openapplications.org/oagis/10}QuoteLineExtensionType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuoteLineType", propOrder = {
    "quoteSubLine",
    "extension"
})
public class QuoteLineType
    extends QuoteLineBaseType
{

    @XmlElement(name = "QuoteSubLine")
    protected List<QuoteSubLineType> quoteSubLine;
    @XmlElement(name = "Extension")
    protected List<QuoteLineExtensionType> extension;

    /**
     * Gets the value of the quoteSubLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quoteSubLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuoteSubLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuoteSubLineType }
     * 
     * 
     */
    public List<QuoteSubLineType> getQuoteSubLine() {
        if (quoteSubLine == null) {
            quoteSubLine = new ArrayList<QuoteSubLineType>();
        }
        return this.quoteSubLine;
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
     * {@link QuoteLineExtensionType }
     * 
     * 
     */
    public List<QuoteLineExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<QuoteLineExtensionType>();
        }
        return this.extension;
    }

}

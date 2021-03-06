//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 05:03:36 PM CST 
//


package org.oagis.model.v101;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * ReturnCriteria identifies the content that is to be returned, given query success. In essence, the expression here has the effect of filtering the part(s) of the found element(s) that are to be returned.
 * 
 * ReturnCriteria plays no role in the query itself. That is handled as a match against the request BOD's noun exemplar. 
 * 
 * ReturnCriteria allows the sender of the BOD to indicate which information (down to the field level) is requested to be returned, given that the query has been successful in matching the exemplar to existing nouns. 
 * 
 * That is, in a GetListPurchaseOrder, if one or more PurchaseOrders with a TotalPrice = $1M were found, ReturnCriteria tells the BOD recipient which parts of the PurchaseOrder should be populated with content when the response (ShowPurchaseOrder) is formulated.
 * 
 * The expressionLanguage indicates the expression language being used. In order for the ReturnCriteria expression to be evaluable by the BOD recipient, the recipient must be capable of processing and interpreting the specified expression language. XPath is the default, due to its ubiquity among XML processing technologies. 
 * 
 * <p>Java class for ExpressionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExpressionType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.openapplications.org/oagis/10>TokenType">
 *       &lt;attribute name="expressionLanguage" type="{http://www.openapplications.org/oagis/10}TokenType" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExpressionType", propOrder = {
    "value"
})
public class ExpressionType {

    @XmlValue
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String value;
    @XmlAttribute(name = "expressionLanguage")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String expressionLanguage;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the expressionLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpressionLanguage() {
        return expressionLanguage;
    }

    /**
     * Sets the value of the expressionLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpressionLanguage(String value) {
        this.expressionLanguage = value;
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 05:04:50 PM CST 
//


package org.oagis.model.v101;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Pricing Type for specifying the details of pricing model
 * 
 * <p>Java class for PricingBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PricingBaseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}IdentificationType">
 *       &lt;sequence>
 *         &lt;element name="SourceCode" type="{http://www.openapplications.org/oagis/10}CodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DeltaPercent" type="{http://www.openapplications.org/oagis/10}PercentType" minOccurs="0"/>
 *         &lt;element name="HideIndicator" type="{http://www.openapplications.org/oagis/10}IndicatorType" minOccurs="0"/>
 *         &lt;element name="Price" type="{http://www.openapplications.org/oagis/10}PriceType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PricingBaseType", propOrder = {
    "sourceCode",
    "deltaPercent",
    "hideIndicator",
    "price"
})
@XmlSeeAlso({
    PricingType.class
})
public class PricingBaseType
    extends IdentificationType
{

    @XmlElement(name = "SourceCode")
    protected List<CodeType> sourceCode;
    @XmlElement(name = "DeltaPercent")
    protected BigDecimal deltaPercent;
    @XmlElement(name = "HideIndicator")
    protected Boolean hideIndicator;
    @XmlElement(name = "Price")
    protected List<PriceType> price;

    /**
     * Gets the value of the sourceCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sourceCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSourceCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeType }
     * 
     * 
     */
    public List<CodeType> getSourceCode() {
        if (sourceCode == null) {
            sourceCode = new ArrayList<CodeType>();
        }
        return this.sourceCode;
    }

    /**
     * Gets the value of the deltaPercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDeltaPercent() {
        return deltaPercent;
    }

    /**
     * Sets the value of the deltaPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDeltaPercent(BigDecimal value) {
        this.deltaPercent = value;
    }

    /**
     * Gets the value of the hideIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHideIndicator() {
        return hideIndicator;
    }

    /**
     * Sets the value of the hideIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHideIndicator(Boolean value) {
        this.hideIndicator = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the price property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriceType }
     * 
     * 
     */
    public List<PriceType> getPrice() {
        if (price == null) {
            price = new ArrayList<PriceType>();
        }
        return this.price;
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 05:04:55 PM CST 
//


package org.oagis.model.v101;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A base definition of a rate of exchange between two currencies.
 * 
 * <p>Java class for CurrencyExchangeRateBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CurrencyExchangeRateBaseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}CurrencyExchangeABIEType">
 *       &lt;sequence>
 *         &lt;element name="SourceID" type="{http://www.openapplications.org/oagis/10}IDType" minOccurs="0"/>
 *         &lt;element name="EffectiveTimePeriod" type="{http://www.openapplications.org/oagis/10}TimePeriodType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrencyExchangeRateBaseType", propOrder = {
    "sourceID",
    "effectiveTimePeriod"
})
@XmlSeeAlso({
    CurrencyExchangeRateType.class
})
public class CurrencyExchangeRateBaseType
    extends CurrencyExchangeABIEType
{

    @XmlElement(name = "SourceID")
    protected IDType sourceID;
    @XmlElement(name = "EffectiveTimePeriod")
    protected TimePeriodType effectiveTimePeriod;

    /**
     * Gets the value of the sourceID property.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getSourceID() {
        return sourceID;
    }

    /**
     * Sets the value of the sourceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setSourceID(IDType value) {
        this.sourceID = value;
    }

    /**
     * Gets the value of the effectiveTimePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodType }
     *     
     */
    public TimePeriodType getEffectiveTimePeriod() {
        return effectiveTimePeriod;
    }

    /**
     * Sets the value of the effectiveTimePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodType }
     *     
     */
    public void setEffectiveTimePeriod(TimePeriodType value) {
        this.effectiveTimePeriod = value;
    }

}
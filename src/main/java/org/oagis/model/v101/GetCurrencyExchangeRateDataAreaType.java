//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 04:24:52 PM CST 
//


package org.oagis.model.v101;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetCurrencyExchangeRateDataAreaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCurrencyExchangeRateDataAreaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Get" type="{http://www.openapplications.org/oagis/10}GetType"/>
 *         &lt;element name="CurrencyExchangeRate" type="{http://www.openapplications.org/oagis/10}CurrencyExchangeRateType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCurrencyExchangeRateDataAreaType", propOrder = {
    "get",
    "currencyExchangeRate"
})
public class GetCurrencyExchangeRateDataAreaType {

    @XmlElement(name = "Get", required = true)
    protected GetType get;
    @XmlElement(name = "CurrencyExchangeRate", required = true)
    protected List<CurrencyExchangeRateType> currencyExchangeRate;

    /**
     * Gets the value of the get property.
     * 
     * @return
     *     possible object is
     *     {@link GetType }
     *     
     */
    public GetType getGet() {
        return get;
    }

    /**
     * Sets the value of the get property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetType }
     *     
     */
    public void setGet(GetType value) {
        this.get = value;
    }

    /**
     * Gets the value of the currencyExchangeRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the currencyExchangeRate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurrencyExchangeRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CurrencyExchangeRateType }
     * 
     * 
     */
    public List<CurrencyExchangeRateType> getCurrencyExchangeRate() {
        if (currencyExchangeRate == null) {
            currencyExchangeRate = new ArrayList<CurrencyExchangeRateType>();
        }
        return this.currencyExchangeRate;
    }

}
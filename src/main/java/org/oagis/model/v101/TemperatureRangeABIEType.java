//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 05:04:14 PM CST 
//


package org.oagis.model.v101;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Provides the minimum and maximum temperature that the associated element can be kept.
 * 
 * TemperatureRangeABIEType is logically derived from UN/CEFACT TBG17 ABIE TemperatureRangeType as defined in the Reusable Aggregate Business Information Entity (RUABIE) XML Schema file.
 * 
 * <p>Java class for TemperatureRangeABIEType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TemperatureRangeABIEType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MinimumTemperature" type="{http://www.openapplications.org/oagis/10}TemperatureMeasureType" minOccurs="0"/>
 *         &lt;element name="MaximumTemperature" type="{http://www.openapplications.org/oagis/10}TemperatureMeasureType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TemperatureRangeABIEType", propOrder = {
    "minimumTemperature",
    "maximumTemperature"
})
public class TemperatureRangeABIEType {

    @XmlElement(name = "MinimumTemperature")
    protected TemperatureMeasureType minimumTemperature;
    @XmlElement(name = "MaximumTemperature")
    protected TemperatureMeasureType maximumTemperature;

    /**
     * Gets the value of the minimumTemperature property.
     * 
     * @return
     *     possible object is
     *     {@link TemperatureMeasureType }
     *     
     */
    public TemperatureMeasureType getMinimumTemperature() {
        return minimumTemperature;
    }

    /**
     * Sets the value of the minimumTemperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link TemperatureMeasureType }
     *     
     */
    public void setMinimumTemperature(TemperatureMeasureType value) {
        this.minimumTemperature = value;
    }

    /**
     * Gets the value of the maximumTemperature property.
     * 
     * @return
     *     possible object is
     *     {@link TemperatureMeasureType }
     *     
     */
    public TemperatureMeasureType getMaximumTemperature() {
        return maximumTemperature;
    }

    /**
     * Sets the value of the maximumTemperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link TemperatureMeasureType }
     *     
     */
    public void setMaximumTemperature(TemperatureMeasureType value) {
        this.maximumTemperature = value;
    }

}

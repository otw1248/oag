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
import javax.xml.bind.annotation.XmlType;


/**
 * Size Limit Range Type for specifying the high and low limits for a size
 * 
 * <p>Java class for SizeLimitRangeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SizeLimitRangeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UnderSizeMeasure" type="{http://www.openapplications.org/oagis/10}MeasureType" minOccurs="0"/>
 *         &lt;element name="OverSizeMeasure" type="{http://www.openapplications.org/oagis/10}MeasureType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SizeLimitRangeType", propOrder = {
    "underSizeMeasure",
    "overSizeMeasure"
})
public class SizeLimitRangeType {

    @XmlElement(name = "UnderSizeMeasure")
    protected MeasureType underSizeMeasure;
    @XmlElement(name = "OverSizeMeasure")
    protected MeasureType overSizeMeasure;

    /**
     * Gets the value of the underSizeMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getUnderSizeMeasure() {
        return underSizeMeasure;
    }

    /**
     * Sets the value of the underSizeMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setUnderSizeMeasure(MeasureType value) {
        this.underSizeMeasure = value;
    }

    /**
     * Gets the value of the overSizeMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getOverSizeMeasure() {
        return overSizeMeasure;
    }

    /**
     * Sets the value of the overSizeMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setOverSizeMeasure(MeasureType value) {
        this.overSizeMeasure = value;
    }

}
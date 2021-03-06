//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 05:03:55 PM CST 
//


package org.oagis.model.v101;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TimeToleranceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeToleranceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UnderDuration" type="{http://www.openapplications.org/oagis/10}DurationMeasureType" minOccurs="0"/>
 *         &lt;element name="OverDuration" type="{http://www.openapplications.org/oagis/10}DurationMeasureType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeToleranceType", propOrder = {
    "underDuration",
    "overDuration"
})
public class TimeToleranceType {

    @XmlElement(name = "UnderDuration")
    @XmlSchemaType(name = "anySimpleType")
    protected String underDuration;
    @XmlElement(name = "OverDuration")
    @XmlSchemaType(name = "anySimpleType")
    protected String overDuration;

    /**
     * Gets the value of the underDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnderDuration() {
        return underDuration;
    }

    /**
     * Sets the value of the underDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnderDuration(String value) {
        this.underDuration = value;
    }

    /**
     * Gets the value of the overDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverDuration() {
        return overDuration;
    }

    /**
     * Sets the value of the overDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverDuration(String value) {
        this.overDuration = value;
    }

}

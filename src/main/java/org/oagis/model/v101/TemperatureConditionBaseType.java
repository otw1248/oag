//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 05:04:04 PM CST 
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
 * <p>Java class for TemperatureConditionBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TemperatureConditionBaseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}IdentificationType">
 *       &lt;sequence>
 *         &lt;element name="TemperatureRange" type="{http://www.openapplications.org/oagis/10}TemperatureRangeType" minOccurs="0"/>
 *         &lt;element name="EmergencyTemperature" type="{http://www.openapplications.org/oagis/10}TemperatureMeasureType" minOccurs="0"/>
 *         &lt;element name="ReferenceTemperature" type="{http://www.openapplications.org/oagis/10}TemperatureMeasureType" minOccurs="0"/>
 *         &lt;element name="TransportTemperature" type="{http://www.openapplications.org/oagis/10}TemperatureMeasureType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TemperatureLog" type="{http://www.openapplications.org/oagis/10}TemperatureLogType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TemperatureConditionBaseType", propOrder = {
    "temperatureRange",
    "emergencyTemperature",
    "referenceTemperature",
    "transportTemperature",
    "temperatureLog"
})
@XmlSeeAlso({
    TemperatureConditionType.class
})
public class TemperatureConditionBaseType
    extends IdentificationType
{

    @XmlElement(name = "TemperatureRange")
    protected TemperatureRangeType temperatureRange;
    @XmlElement(name = "EmergencyTemperature")
    protected TemperatureMeasureType emergencyTemperature;
    @XmlElement(name = "ReferenceTemperature")
    protected TemperatureMeasureType referenceTemperature;
    @XmlElement(name = "TransportTemperature")
    protected List<TemperatureMeasureType> transportTemperature;
    @XmlElement(name = "TemperatureLog")
    protected List<TemperatureLogType> temperatureLog;

    /**
     * Gets the value of the temperatureRange property.
     * 
     * @return
     *     possible object is
     *     {@link TemperatureRangeType }
     *     
     */
    public TemperatureRangeType getTemperatureRange() {
        return temperatureRange;
    }

    /**
     * Sets the value of the temperatureRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link TemperatureRangeType }
     *     
     */
    public void setTemperatureRange(TemperatureRangeType value) {
        this.temperatureRange = value;
    }

    /**
     * Gets the value of the emergencyTemperature property.
     * 
     * @return
     *     possible object is
     *     {@link TemperatureMeasureType }
     *     
     */
    public TemperatureMeasureType getEmergencyTemperature() {
        return emergencyTemperature;
    }

    /**
     * Sets the value of the emergencyTemperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link TemperatureMeasureType }
     *     
     */
    public void setEmergencyTemperature(TemperatureMeasureType value) {
        this.emergencyTemperature = value;
    }

    /**
     * Gets the value of the referenceTemperature property.
     * 
     * @return
     *     possible object is
     *     {@link TemperatureMeasureType }
     *     
     */
    public TemperatureMeasureType getReferenceTemperature() {
        return referenceTemperature;
    }

    /**
     * Sets the value of the referenceTemperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link TemperatureMeasureType }
     *     
     */
    public void setReferenceTemperature(TemperatureMeasureType value) {
        this.referenceTemperature = value;
    }

    /**
     * Gets the value of the transportTemperature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transportTemperature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransportTemperature().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TemperatureMeasureType }
     * 
     * 
     */
    public List<TemperatureMeasureType> getTransportTemperature() {
        if (transportTemperature == null) {
            transportTemperature = new ArrayList<TemperatureMeasureType>();
        }
        return this.transportTemperature;
    }

    /**
     * Gets the value of the temperatureLog property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the temperatureLog property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTemperatureLog().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TemperatureLogType }
     * 
     * 
     */
    public List<TemperatureLogType> getTemperatureLog() {
        if (temperatureLog == null) {
            temperatureLog = new ArrayList<TemperatureLogType>();
        }
        return this.temperatureLog;
    }

}
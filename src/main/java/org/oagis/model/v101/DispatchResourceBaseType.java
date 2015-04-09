//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 04:58:36 PM CST 
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
 * <p>Java class for DispatchResourceBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DispatchResourceBaseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}LineBaseType">
 *       &lt;sequence>
 *         &lt;element name="ActivityCode" type="{http://www.openapplications.org/oagis/10}CodeType" minOccurs="0"/>
 *         &lt;element name="ForecastedTimePeriod" type="{http://www.openapplications.org/oagis/10}TimePeriodType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SetupTimePeriod" type="{http://www.openapplications.org/oagis/10}TimePeriodType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TearDownTimePeriod" type="{http://www.openapplications.org/oagis/10}TimePeriodType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ResourceCodes" type="{http://www.openapplications.org/oagis/10}SequencedCodesType" minOccurs="0"/>
 *         &lt;element name="Resources" type="{http://www.openapplications.org/oagis/10}ResourcesType" minOccurs="0"/>
 *         &lt;element name="ResourcesNeededQuantity" type="{http://www.openapplications.org/oagis/10}QuantityType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DispatchResourceBaseType", propOrder = {
    "activityCode",
    "forecastedTimePeriod",
    "setupTimePeriod",
    "tearDownTimePeriod",
    "resourceCodes",
    "resources",
    "resourcesNeededQuantity"
})
@XmlSeeAlso({
    DispatchResourceType.class
})
public class DispatchResourceBaseType
    extends LineBaseType
{

    @XmlElement(name = "ActivityCode")
    protected CodeType activityCode;
    @XmlElement(name = "ForecastedTimePeriod")
    protected List<TimePeriodType> forecastedTimePeriod;
    @XmlElement(name = "SetupTimePeriod")
    protected List<TimePeriodType> setupTimePeriod;
    @XmlElement(name = "TearDownTimePeriod")
    protected List<TimePeriodType> tearDownTimePeriod;
    @XmlElement(name = "ResourceCodes")
    protected SequencedCodesType resourceCodes;
    @XmlElement(name = "Resources")
    protected ResourcesType resources;
    @XmlElement(name = "ResourcesNeededQuantity")
    protected QuantityType resourcesNeededQuantity;

    /**
     * Gets the value of the activityCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getActivityCode() {
        return activityCode;
    }

    /**
     * Sets the value of the activityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setActivityCode(CodeType value) {
        this.activityCode = value;
    }

    /**
     * Gets the value of the forecastedTimePeriod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the forecastedTimePeriod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getForecastedTimePeriod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimePeriodType }
     * 
     * 
     */
    public List<TimePeriodType> getForecastedTimePeriod() {
        if (forecastedTimePeriod == null) {
            forecastedTimePeriod = new ArrayList<TimePeriodType>();
        }
        return this.forecastedTimePeriod;
    }

    /**
     * Gets the value of the setupTimePeriod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the setupTimePeriod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSetupTimePeriod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimePeriodType }
     * 
     * 
     */
    public List<TimePeriodType> getSetupTimePeriod() {
        if (setupTimePeriod == null) {
            setupTimePeriod = new ArrayList<TimePeriodType>();
        }
        return this.setupTimePeriod;
    }

    /**
     * Gets the value of the tearDownTimePeriod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tearDownTimePeriod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTearDownTimePeriod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimePeriodType }
     * 
     * 
     */
    public List<TimePeriodType> getTearDownTimePeriod() {
        if (tearDownTimePeriod == null) {
            tearDownTimePeriod = new ArrayList<TimePeriodType>();
        }
        return this.tearDownTimePeriod;
    }

    /**
     * Gets the value of the resourceCodes property.
     * 
     * @return
     *     possible object is
     *     {@link SequencedCodesType }
     *     
     */
    public SequencedCodesType getResourceCodes() {
        return resourceCodes;
    }

    /**
     * Sets the value of the resourceCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link SequencedCodesType }
     *     
     */
    public void setResourceCodes(SequencedCodesType value) {
        this.resourceCodes = value;
    }

    /**
     * Gets the value of the resources property.
     * 
     * @return
     *     possible object is
     *     {@link ResourcesType }
     *     
     */
    public ResourcesType getResources() {
        return resources;
    }

    /**
     * Sets the value of the resources property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourcesType }
     *     
     */
    public void setResources(ResourcesType value) {
        this.resources = value;
    }

    /**
     * Gets the value of the resourcesNeededQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityType }
     *     
     */
    public QuantityType getResourcesNeededQuantity() {
        return resourcesNeededQuantity;
    }

    /**
     * Sets the value of the resourcesNeededQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType }
     *     
     */
    public void setResourcesNeededQuantity(QuantityType value) {
        this.resourcesNeededQuantity = value;
    }

}

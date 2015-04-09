//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 04:58:05 PM CST 
//


package org.oagis.model.v101;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShopFloorControlBaseResourceBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShopFloorControlBaseResourceBaseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}LineBaseType">
 *       &lt;sequence>
 *         &lt;element name="AllocateResources" type="{http://www.openapplications.org/oagis/10}AllocateResourcesType" minOccurs="0"/>
 *         &lt;element name="ActualResources" type="{http://www.openapplications.org/oagis/10}ActualResourcesType" minOccurs="0"/>
 *         &lt;element name="ExecutionTimePeriod" type="{http://www.openapplications.org/oagis/10}TimePeriodType" minOccurs="0"/>
 *         &lt;element name="LaborTimePeriod" type="{http://www.openapplications.org/oagis/10}TimePeriodType" minOccurs="0"/>
 *         &lt;element name="ForecastedTimePeriod" type="{http://www.openapplications.org/oagis/10}TimePeriodType" minOccurs="0"/>
 *         &lt;element name="SetupTimePeriod" type="{http://www.openapplications.org/oagis/10}TimePeriodType" minOccurs="0"/>
 *         &lt;element name="TearDownTimePeriod" type="{http://www.openapplications.org/oagis/10}TimePeriodType" minOccurs="0"/>
 *         &lt;element name="WorkCenterID" type="{http://www.openapplications.org/oagis/10}IDType" minOccurs="0"/>
 *         &lt;element name="ReasonCode" type="{http://www.openapplications.org/oagis/10}CodeType" minOccurs="0"/>
 *         &lt;element name="PrintIndicator" type="{http://www.openapplications.org/oagis/10}IndicatorType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShopFloorControlBaseResourceBaseType", propOrder = {
    "allocateResources",
    "actualResources",
    "executionTimePeriod",
    "laborTimePeriod",
    "forecastedTimePeriod",
    "setupTimePeriod",
    "tearDownTimePeriod",
    "workCenterID",
    "reasonCode",
    "printIndicator"
})
@XmlSeeAlso({
    ShopFloorControlResourceBaseType.class
})
public class ShopFloorControlBaseResourceBaseType
    extends LineBaseType
{

    @XmlElement(name = "AllocateResources")
    protected AllocateResourcesType allocateResources;
    @XmlElement(name = "ActualResources")
    protected ActualResourcesType actualResources;
    @XmlElement(name = "ExecutionTimePeriod")
    protected TimePeriodType executionTimePeriod;
    @XmlElement(name = "LaborTimePeriod")
    protected TimePeriodType laborTimePeriod;
    @XmlElement(name = "ForecastedTimePeriod")
    protected TimePeriodType forecastedTimePeriod;
    @XmlElement(name = "SetupTimePeriod")
    protected TimePeriodType setupTimePeriod;
    @XmlElement(name = "TearDownTimePeriod")
    protected TimePeriodType tearDownTimePeriod;
    @XmlElement(name = "WorkCenterID")
    protected IDType workCenterID;
    @XmlElement(name = "ReasonCode")
    protected CodeType reasonCode;
    @XmlElement(name = "PrintIndicator")
    protected Boolean printIndicator;

    /**
     * Gets the value of the allocateResources property.
     * 
     * @return
     *     possible object is
     *     {@link AllocateResourcesType }
     *     
     */
    public AllocateResourcesType getAllocateResources() {
        return allocateResources;
    }

    /**
     * Sets the value of the allocateResources property.
     * 
     * @param value
     *     allowed object is
     *     {@link AllocateResourcesType }
     *     
     */
    public void setAllocateResources(AllocateResourcesType value) {
        this.allocateResources = value;
    }

    /**
     * Gets the value of the actualResources property.
     * 
     * @return
     *     possible object is
     *     {@link ActualResourcesType }
     *     
     */
    public ActualResourcesType getActualResources() {
        return actualResources;
    }

    /**
     * Sets the value of the actualResources property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActualResourcesType }
     *     
     */
    public void setActualResources(ActualResourcesType value) {
        this.actualResources = value;
    }

    /**
     * Gets the value of the executionTimePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodType }
     *     
     */
    public TimePeriodType getExecutionTimePeriod() {
        return executionTimePeriod;
    }

    /**
     * Sets the value of the executionTimePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodType }
     *     
     */
    public void setExecutionTimePeriod(TimePeriodType value) {
        this.executionTimePeriod = value;
    }

    /**
     * Gets the value of the laborTimePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodType }
     *     
     */
    public TimePeriodType getLaborTimePeriod() {
        return laborTimePeriod;
    }

    /**
     * Sets the value of the laborTimePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodType }
     *     
     */
    public void setLaborTimePeriod(TimePeriodType value) {
        this.laborTimePeriod = value;
    }

    /**
     * Gets the value of the forecastedTimePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodType }
     *     
     */
    public TimePeriodType getForecastedTimePeriod() {
        return forecastedTimePeriod;
    }

    /**
     * Sets the value of the forecastedTimePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodType }
     *     
     */
    public void setForecastedTimePeriod(TimePeriodType value) {
        this.forecastedTimePeriod = value;
    }

    /**
     * Gets the value of the setupTimePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodType }
     *     
     */
    public TimePeriodType getSetupTimePeriod() {
        return setupTimePeriod;
    }

    /**
     * Sets the value of the setupTimePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodType }
     *     
     */
    public void setSetupTimePeriod(TimePeriodType value) {
        this.setupTimePeriod = value;
    }

    /**
     * Gets the value of the tearDownTimePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodType }
     *     
     */
    public TimePeriodType getTearDownTimePeriod() {
        return tearDownTimePeriod;
    }

    /**
     * Sets the value of the tearDownTimePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodType }
     *     
     */
    public void setTearDownTimePeriod(TimePeriodType value) {
        this.tearDownTimePeriod = value;
    }

    /**
     * Gets the value of the workCenterID property.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getWorkCenterID() {
        return workCenterID;
    }

    /**
     * Sets the value of the workCenterID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setWorkCenterID(IDType value) {
        this.workCenterID = value;
    }

    /**
     * Gets the value of the reasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getReasonCode() {
        return reasonCode;
    }

    /**
     * Sets the value of the reasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setReasonCode(CodeType value) {
        this.reasonCode = value;
    }

    /**
     * Gets the value of the printIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrintIndicator() {
        return printIndicator;
    }

    /**
     * Sets the value of the printIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrintIndicator(Boolean value) {
        this.printIndicator = value;
    }

}

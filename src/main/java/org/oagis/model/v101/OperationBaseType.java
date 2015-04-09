//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 05:04:55 PM CST 
//


package org.oagis.model.v101;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Operation Type for detailing a manufacturing step or operation
 * 
 * <p>Java class for OperationBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OperationBaseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}HeaderBaseType">
 *       &lt;sequence>
 *         &lt;element name="BOMReference" type="{http://www.openapplications.org/oagis/10}BOMReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RouteReference" type="{http://www.openapplications.org/oagis/10}RouteReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CostTypeCode" type="{http://www.openapplications.org/oagis/10}CodeType" minOccurs="0"/>
 *         &lt;element name="ContainerTypeCode" type="{http://www.openapplications.org/oagis/10}CodeType" minOccurs="0"/>
 *         &lt;element name="DepartmentID" type="{http://www.openapplications.org/oagis/10}IDType" minOccurs="0"/>
 *         &lt;element name="CostAmount" type="{http://www.openapplications.org/oagis/10}AmountType" minOccurs="0"/>
 *         &lt;element name="ProcessCode" type="{http://www.openapplications.org/oagis/10}CodeType" minOccurs="0"/>
 *         &lt;element name="MachineSetupDependencyCodes" type="{http://www.openapplications.org/oagis/10}CodesType" minOccurs="0"/>
 *         &lt;element name="MaximumParallelTeamsFactorNumber" type="{http://www.openapplications.org/oagis/10}NumberType" minOccurs="0"/>
 *         &lt;element name="FixedRejectQuantity" type="{http://www.openapplications.org/oagis/10}QuantityType" minOccurs="0"/>
 *         &lt;element name="RejectedQuantity" type="{http://www.openapplications.org/oagis/10}QuantityType" minOccurs="0"/>
 *         &lt;group ref="{http://www.openapplications.org/oagis/10}OperationGroup"/>
 *         &lt;element name="SiteLocation" type="{http://www.openapplications.org/oagis/10}LocationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MultipleRunSaveTimeIndicator" type="{http://www.openapplications.org/oagis/10}IndicatorType" minOccurs="0"/>
 *         &lt;element name="TrackingIndicator" type="{http://www.openapplications.org/oagis/10}IndicatorType" minOccurs="0"/>
 *         &lt;element name="QualifiedResource" type="{http://www.openapplications.org/oagis/10}QualifiedResourceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Charge" type="{http://www.openapplications.org/oagis/10}ChargeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Distribution" type="{http://www.openapplications.org/oagis/10}DistributionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Step" type="{http://www.openapplications.org/oagis/10}StepType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="typeCode" type="{http://www.openapplications.org/oagis/10}CodeType_1E7368" />
 *       &lt;attribute name="actionCode" type="{http://www.openapplications.org/oagis/10}ActionCodeContentType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperationBaseType", propOrder = {
    "bomReference",
    "routeReference",
    "costTypeCode",
    "containerTypeCode",
    "departmentID",
    "costAmount",
    "processCode",
    "machineSetupDependencyCodes",
    "maximumParallelTeamsFactorNumber",
    "fixedRejectQuantity",
    "rejectedQuantity",
    "batchSizeQuantity",
    "perishedInOperationQuantity",
    "perishedBetweenOperationsQuantity",
    "transferLotQuantity",
    "quantity",
    "setupTimeDuration",
    "waitTimeDuration",
    "runTimeDuration",
    "tearDownDuration",
    "batchDuration",
    "queueDuration",
    "moveDuration",
    "fixedDuration",
    "rejectPercent",
    "effectivity",
    "siteLocation",
    "multipleRunSaveTimeIndicator",
    "trackingIndicator",
    "qualifiedResource",
    "charge",
    "distribution",
    "step"
})
@XmlSeeAlso({
    OperationType.class
})
public class OperationBaseType
    extends HeaderBaseType
{

    @XmlElement(name = "BOMReference")
    protected List<BOMReferenceType> bomReference;
    @XmlElement(name = "RouteReference")
    protected List<RouteReferenceType> routeReference;
    @XmlElement(name = "CostTypeCode")
    protected CodeType costTypeCode;
    @XmlElement(name = "ContainerTypeCode")
    protected CodeType containerTypeCode;
    @XmlElement(name = "DepartmentID")
    protected IDType departmentID;
    @XmlElement(name = "CostAmount")
    protected AmountType costAmount;
    @XmlElement(name = "ProcessCode")
    protected CodeType processCode;
    @XmlElement(name = "MachineSetupDependencyCodes")
    protected CodesType machineSetupDependencyCodes;
    @XmlElement(name = "MaximumParallelTeamsFactorNumber")
    protected BigDecimal maximumParallelTeamsFactorNumber;
    @XmlElement(name = "FixedRejectQuantity")
    protected QuantityType fixedRejectQuantity;
    @XmlElement(name = "RejectedQuantity")
    protected QuantityType rejectedQuantity;
    @XmlElement(name = "BatchSizeQuantity")
    protected QuantityType batchSizeQuantity;
    @XmlElement(name = "PerishedInOperationQuantity")
    protected QuantityType perishedInOperationQuantity;
    @XmlElement(name = "PerishedBetweenOperationsQuantity")
    protected QuantityType perishedBetweenOperationsQuantity;
    @XmlElement(name = "TransferLotQuantity")
    protected QuantityType transferLotQuantity;
    @XmlElement(name = "Quantity")
    protected List<OpenQuantityType> quantity;
    @XmlElement(name = "SetupTimeDuration")
    @XmlSchemaType(name = "anySimpleType")
    protected String setupTimeDuration;
    @XmlElement(name = "WaitTimeDuration")
    @XmlSchemaType(name = "anySimpleType")
    protected String waitTimeDuration;
    @XmlElement(name = "RunTimeDuration")
    @XmlSchemaType(name = "anySimpleType")
    protected String runTimeDuration;
    @XmlElement(name = "TearDownDuration")
    @XmlSchemaType(name = "anySimpleType")
    protected String tearDownDuration;
    @XmlElement(name = "BatchDuration")
    @XmlSchemaType(name = "anySimpleType")
    protected String batchDuration;
    @XmlElement(name = "QueueDuration")
    @XmlSchemaType(name = "anySimpleType")
    protected String queueDuration;
    @XmlElement(name = "MoveDuration")
    @XmlSchemaType(name = "anySimpleType")
    protected String moveDuration;
    @XmlElement(name = "FixedDuration")
    @XmlSchemaType(name = "anySimpleType")
    protected String fixedDuration;
    @XmlElement(name = "RejectPercent")
    protected BigDecimal rejectPercent;
    @XmlElement(name = "Effectivity")
    protected List<EffectivityType> effectivity;
    @XmlElement(name = "SiteLocation")
    protected List<LocationType> siteLocation;
    @XmlElement(name = "MultipleRunSaveTimeIndicator")
    protected Boolean multipleRunSaveTimeIndicator;
    @XmlElement(name = "TrackingIndicator")
    protected Boolean trackingIndicator;
    @XmlElement(name = "QualifiedResource")
    protected List<QualifiedResourceType> qualifiedResource;
    @XmlElement(name = "Charge")
    protected List<ChargeType> charge;
    @XmlElement(name = "Distribution")
    protected List<DistributionType> distribution;
    @XmlElement(name = "Step")
    protected List<StepType> step;
    @XmlAttribute(name = "typeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String typeCode;
    @XmlAttribute(name = "actionCode")
    protected String actionCode;

    /**
     * Gets the value of the bomReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bomReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBOMReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BOMReferenceType }
     * 
     * 
     */
    public List<BOMReferenceType> getBOMReference() {
        if (bomReference == null) {
            bomReference = new ArrayList<BOMReferenceType>();
        }
        return this.bomReference;
    }

    /**
     * Gets the value of the routeReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the routeReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRouteReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RouteReferenceType }
     * 
     * 
     */
    public List<RouteReferenceType> getRouteReference() {
        if (routeReference == null) {
            routeReference = new ArrayList<RouteReferenceType>();
        }
        return this.routeReference;
    }

    /**
     * Gets the value of the costTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getCostTypeCode() {
        return costTypeCode;
    }

    /**
     * Sets the value of the costTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setCostTypeCode(CodeType value) {
        this.costTypeCode = value;
    }

    /**
     * Gets the value of the containerTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getContainerTypeCode() {
        return containerTypeCode;
    }

    /**
     * Sets the value of the containerTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setContainerTypeCode(CodeType value) {
        this.containerTypeCode = value;
    }

    /**
     * Gets the value of the departmentID property.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getDepartmentID() {
        return departmentID;
    }

    /**
     * Sets the value of the departmentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setDepartmentID(IDType value) {
        this.departmentID = value;
    }

    /**
     * Gets the value of the costAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getCostAmount() {
        return costAmount;
    }

    /**
     * Sets the value of the costAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setCostAmount(AmountType value) {
        this.costAmount = value;
    }

    /**
     * Gets the value of the processCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getProcessCode() {
        return processCode;
    }

    /**
     * Sets the value of the processCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setProcessCode(CodeType value) {
        this.processCode = value;
    }

    /**
     * Gets the value of the machineSetupDependencyCodes property.
     * 
     * @return
     *     possible object is
     *     {@link CodesType }
     *     
     */
    public CodesType getMachineSetupDependencyCodes() {
        return machineSetupDependencyCodes;
    }

    /**
     * Sets the value of the machineSetupDependencyCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodesType }
     *     
     */
    public void setMachineSetupDependencyCodes(CodesType value) {
        this.machineSetupDependencyCodes = value;
    }

    /**
     * Gets the value of the maximumParallelTeamsFactorNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumParallelTeamsFactorNumber() {
        return maximumParallelTeamsFactorNumber;
    }

    /**
     * Sets the value of the maximumParallelTeamsFactorNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumParallelTeamsFactorNumber(BigDecimal value) {
        this.maximumParallelTeamsFactorNumber = value;
    }

    /**
     * Gets the value of the fixedRejectQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityType }
     *     
     */
    public QuantityType getFixedRejectQuantity() {
        return fixedRejectQuantity;
    }

    /**
     * Sets the value of the fixedRejectQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType }
     *     
     */
    public void setFixedRejectQuantity(QuantityType value) {
        this.fixedRejectQuantity = value;
    }

    /**
     * Gets the value of the rejectedQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityType }
     *     
     */
    public QuantityType getRejectedQuantity() {
        return rejectedQuantity;
    }

    /**
     * Sets the value of the rejectedQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType }
     *     
     */
    public void setRejectedQuantity(QuantityType value) {
        this.rejectedQuantity = value;
    }

    /**
     * Gets the value of the batchSizeQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityType }
     *     
     */
    public QuantityType getBatchSizeQuantity() {
        return batchSizeQuantity;
    }

    /**
     * Sets the value of the batchSizeQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType }
     *     
     */
    public void setBatchSizeQuantity(QuantityType value) {
        this.batchSizeQuantity = value;
    }

    /**
     * Gets the value of the perishedInOperationQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityType }
     *     
     */
    public QuantityType getPerishedInOperationQuantity() {
        return perishedInOperationQuantity;
    }

    /**
     * Sets the value of the perishedInOperationQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType }
     *     
     */
    public void setPerishedInOperationQuantity(QuantityType value) {
        this.perishedInOperationQuantity = value;
    }

    /**
     * Gets the value of the perishedBetweenOperationsQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityType }
     *     
     */
    public QuantityType getPerishedBetweenOperationsQuantity() {
        return perishedBetweenOperationsQuantity;
    }

    /**
     * Sets the value of the perishedBetweenOperationsQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType }
     *     
     */
    public void setPerishedBetweenOperationsQuantity(QuantityType value) {
        this.perishedBetweenOperationsQuantity = value;
    }

    /**
     * Gets the value of the transferLotQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityType }
     *     
     */
    public QuantityType getTransferLotQuantity() {
        return transferLotQuantity;
    }

    /**
     * Sets the value of the transferLotQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType }
     *     
     */
    public void setTransferLotQuantity(QuantityType value) {
        this.transferLotQuantity = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quantity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuantity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpenQuantityType }
     * 
     * 
     */
    public List<OpenQuantityType> getQuantity() {
        if (quantity == null) {
            quantity = new ArrayList<OpenQuantityType>();
        }
        return this.quantity;
    }

    /**
     * Gets the value of the setupTimeDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSetupTimeDuration() {
        return setupTimeDuration;
    }

    /**
     * Sets the value of the setupTimeDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSetupTimeDuration(String value) {
        this.setupTimeDuration = value;
    }

    /**
     * Gets the value of the waitTimeDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWaitTimeDuration() {
        return waitTimeDuration;
    }

    /**
     * Sets the value of the waitTimeDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWaitTimeDuration(String value) {
        this.waitTimeDuration = value;
    }

    /**
     * Gets the value of the runTimeDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRunTimeDuration() {
        return runTimeDuration;
    }

    /**
     * Sets the value of the runTimeDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRunTimeDuration(String value) {
        this.runTimeDuration = value;
    }

    /**
     * Gets the value of the tearDownDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTearDownDuration() {
        return tearDownDuration;
    }

    /**
     * Sets the value of the tearDownDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTearDownDuration(String value) {
        this.tearDownDuration = value;
    }

    /**
     * Gets the value of the batchDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBatchDuration() {
        return batchDuration;
    }

    /**
     * Sets the value of the batchDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBatchDuration(String value) {
        this.batchDuration = value;
    }

    /**
     * Gets the value of the queueDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueueDuration() {
        return queueDuration;
    }

    /**
     * Sets the value of the queueDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueueDuration(String value) {
        this.queueDuration = value;
    }

    /**
     * Gets the value of the moveDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoveDuration() {
        return moveDuration;
    }

    /**
     * Sets the value of the moveDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoveDuration(String value) {
        this.moveDuration = value;
    }

    /**
     * Gets the value of the fixedDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFixedDuration() {
        return fixedDuration;
    }

    /**
     * Sets the value of the fixedDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFixedDuration(String value) {
        this.fixedDuration = value;
    }

    /**
     * Gets the value of the rejectPercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRejectPercent() {
        return rejectPercent;
    }

    /**
     * Sets the value of the rejectPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRejectPercent(BigDecimal value) {
        this.rejectPercent = value;
    }

    /**
     * Gets the value of the effectivity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the effectivity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEffectivity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EffectivityType }
     * 
     * 
     */
    public List<EffectivityType> getEffectivity() {
        if (effectivity == null) {
            effectivity = new ArrayList<EffectivityType>();
        }
        return this.effectivity;
    }

    /**
     * Gets the value of the siteLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the siteLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSiteLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationType }
     * 
     * 
     */
    public List<LocationType> getSiteLocation() {
        if (siteLocation == null) {
            siteLocation = new ArrayList<LocationType>();
        }
        return this.siteLocation;
    }

    /**
     * Gets the value of the multipleRunSaveTimeIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMultipleRunSaveTimeIndicator() {
        return multipleRunSaveTimeIndicator;
    }

    /**
     * Sets the value of the multipleRunSaveTimeIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMultipleRunSaveTimeIndicator(Boolean value) {
        this.multipleRunSaveTimeIndicator = value;
    }

    /**
     * Gets the value of the trackingIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTrackingIndicator() {
        return trackingIndicator;
    }

    /**
     * Sets the value of the trackingIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTrackingIndicator(Boolean value) {
        this.trackingIndicator = value;
    }

    /**
     * Gets the value of the qualifiedResource property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the qualifiedResource property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQualifiedResource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QualifiedResourceType }
     * 
     * 
     */
    public List<QualifiedResourceType> getQualifiedResource() {
        if (qualifiedResource == null) {
            qualifiedResource = new ArrayList<QualifiedResourceType>();
        }
        return this.qualifiedResource;
    }

    /**
     * Gets the value of the charge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the charge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCharge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChargeType }
     * 
     * 
     */
    public List<ChargeType> getCharge() {
        if (charge == null) {
            charge = new ArrayList<ChargeType>();
        }
        return this.charge;
    }

    /**
     * Gets the value of the distribution property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the distribution property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDistribution().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DistributionType }
     * 
     * 
     */
    public List<DistributionType> getDistribution() {
        if (distribution == null) {
            distribution = new ArrayList<DistributionType>();
        }
        return this.distribution;
    }

    /**
     * Gets the value of the step property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the step property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStep().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StepType }
     * 
     * 
     */
    public List<StepType> getStep() {
        if (step == null) {
            step = new ArrayList<StepType>();
        }
        return this.step;
    }

    /**
     * Gets the value of the typeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeCode() {
        return typeCode;
    }

    /**
     * Sets the value of the typeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeCode(String value) {
        this.typeCode = value;
    }

    /**
     * Gets the value of the actionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionCode() {
        return actionCode;
    }

    /**
     * Sets the value of the actionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionCode(String value) {
        this.actionCode = value;
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 05:01:33 PM CST 
//


package org.oagis.model.v101;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A set of tasks with the following attributes: a singular purpose, a start and end date, those that accumulate costs, and those that may have materials and overhead. SYNONYMS: Job, Process Model, Program, Work Breakdown Structure (WBS) element
 * 
 * <p>Java class for ProjectMasterBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProjectMasterBaseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}ProjectReferenceBaseType">
 *       &lt;sequence>
 *         &lt;element name="Status" type="{http://www.openapplications.org/oagis/10}StatusType" minOccurs="0"/>
 *         &lt;element name="DocumentDateTime" type="{http://www.openapplications.org/oagis/10}DateTimeType" minOccurs="0"/>
 *         &lt;element name="EffectiveTimePeriod" type="{http://www.openapplications.org/oagis/10}TimePeriodType" minOccurs="0"/>
 *         &lt;element name="AuthorizationID" type="{http://www.openapplications.org/oagis/10}IDType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BudgetedAmount" type="{http://www.openapplications.org/oagis/10}AmountType" minOccurs="0"/>
 *         &lt;element name="AccruedAmount" type="{http://www.openapplications.org/oagis/10}AmountType" minOccurs="0"/>
 *         &lt;element name="TotalCostAmount" type="{http://www.openapplications.org/oagis/10}AmountType" minOccurs="0"/>
 *         &lt;element name="GLEntityID" type="{http://www.openapplications.org/oagis/10}IDType" minOccurs="0"/>
 *         &lt;element name="ProjectActivity" type="{http://www.openapplications.org/oagis/10}ProjectActivityType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.openapplications.org/oagis/10}ReferencesGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProjectMasterBaseType", propOrder = {
    "status",
    "documentDateTime",
    "effectiveTimePeriod",
    "authorizationID",
    "budgetedAmount",
    "accruedAmount",
    "totalCostAmount",
    "glEntityID",
    "projectActivity",
    "documentReference",
    "attachment"
})
@XmlSeeAlso({
    ProjectMasterType.class
})
public class ProjectMasterBaseType
    extends ProjectReferenceBaseType
{

    @XmlElement(name = "Status")
    protected StatusType status;
    @XmlElement(name = "DocumentDateTime")
    @XmlSchemaType(name = "anySimpleType")
    protected String documentDateTime;
    @XmlElement(name = "EffectiveTimePeriod")
    protected TimePeriodType effectiveTimePeriod;
    @XmlElement(name = "AuthorizationID")
    protected List<IDType> authorizationID;
    @XmlElement(name = "BudgetedAmount")
    protected AmountType budgetedAmount;
    @XmlElement(name = "AccruedAmount")
    protected AmountType accruedAmount;
    @XmlElement(name = "TotalCostAmount")
    protected AmountType totalCostAmount;
    @XmlElement(name = "GLEntityID")
    protected IDType glEntityID;
    @XmlElement(name = "ProjectActivity")
    protected List<ProjectActivityType> projectActivity;
    @XmlElement(name = "DocumentReference")
    protected List<DocumentReferenceType> documentReference;
    @XmlElement(name = "Attachment")
    protected List<AttachmentType> attachment;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link StatusType }
     *     
     */
    public StatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType }
     *     
     */
    public void setStatus(StatusType value) {
        this.status = value;
    }

    /**
     * Gets the value of the documentDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentDateTime() {
        return documentDateTime;
    }

    /**
     * Sets the value of the documentDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentDateTime(String value) {
        this.documentDateTime = value;
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

    /**
     * Gets the value of the authorizationID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authorizationID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthorizationID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IDType }
     * 
     * 
     */
    public List<IDType> getAuthorizationID() {
        if (authorizationID == null) {
            authorizationID = new ArrayList<IDType>();
        }
        return this.authorizationID;
    }

    /**
     * Gets the value of the budgetedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getBudgetedAmount() {
        return budgetedAmount;
    }

    /**
     * Sets the value of the budgetedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setBudgetedAmount(AmountType value) {
        this.budgetedAmount = value;
    }

    /**
     * Gets the value of the accruedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAccruedAmount() {
        return accruedAmount;
    }

    /**
     * Sets the value of the accruedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAccruedAmount(AmountType value) {
        this.accruedAmount = value;
    }

    /**
     * Gets the value of the totalCostAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalCostAmount() {
        return totalCostAmount;
    }

    /**
     * Sets the value of the totalCostAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalCostAmount(AmountType value) {
        this.totalCostAmount = value;
    }

    /**
     * Gets the value of the glEntityID property.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getGLEntityID() {
        return glEntityID;
    }

    /**
     * Sets the value of the glEntityID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setGLEntityID(IDType value) {
        this.glEntityID = value;
    }

    /**
     * Gets the value of the projectActivity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the projectActivity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProjectActivity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProjectActivityType }
     * 
     * 
     */
    public List<ProjectActivityType> getProjectActivity() {
        if (projectActivity == null) {
            projectActivity = new ArrayList<ProjectActivityType>();
        }
        return this.projectActivity;
    }

    /**
     * Gets the value of the documentReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentReferenceType }
     * 
     * 
     */
    public List<DocumentReferenceType> getDocumentReference() {
        if (documentReference == null) {
            documentReference = new ArrayList<DocumentReferenceType>();
        }
        return this.documentReference;
    }

    /**
     * Gets the value of the attachment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttachment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttachmentType }
     * 
     * 
     */
    public List<AttachmentType> getAttachment() {
        if (attachment == null) {
            attachment = new ArrayList<AttachmentType>();
        }
        return this.attachment;
    }

}
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 05:04:55 PM CST 
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
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A base definition of a distribution of the financial credit or debit of the transaction across an organization.
 * 
 * <p>Java class for DistributionBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DistributionBaseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}IdentificationType">
 *       &lt;sequence>
 *         &lt;element name="LedgerID" type="{http://www.openapplications.org/oagis/10}IDType" minOccurs="0"/>
 *         &lt;group ref="{http://www.openapplications.org/oagis/10}ReferencesGroup"/>
 *         &lt;element name="Percentage" type="{http://www.openapplications.org/oagis/10}OpenPercentType" minOccurs="0"/>
 *         &lt;element name="Quantity" type="{http://www.openapplications.org/oagis/10}OpenQuantityType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Amount" type="{http://www.openapplications.org/oagis/10}OpenAmountType" minOccurs="0"/>
 *         &lt;element name="GeneralLedgerNominalAccount" type="{http://www.openapplications.org/oagis/10}NormalizedStringType" minOccurs="0"/>
 *         &lt;element name="GeneralLedgerElement" type="{http://www.openapplications.org/oagis/10}GeneralLedgerElementType" minOccurs="0"/>
 *         &lt;element name="EnterpriseUnit" type="{http://www.openapplications.org/oagis/10}EnterpriseUnitType" minOccurs="0"/>
 *         &lt;element name="ProjectReference" type="{http://www.openapplications.org/oagis/10}ProjectReferenceType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DistributionBaseType", propOrder = {
    "ledgerID",
    "documentReference",
    "attachment",
    "percentage",
    "quantity",
    "amount",
    "generalLedgerNominalAccount",
    "generalLedgerElement",
    "enterpriseUnit",
    "projectReference"
})
@XmlSeeAlso({
    DistributionType.class
})
public class DistributionBaseType
    extends IdentificationType
{

    @XmlElement(name = "LedgerID")
    protected IDType ledgerID;
    @XmlElement(name = "DocumentReference")
    protected List<DocumentReferenceType> documentReference;
    @XmlElement(name = "Attachment")
    protected List<AttachmentType> attachment;
    @XmlElement(name = "Percentage")
    protected OpenPercentType percentage;
    @XmlElement(name = "Quantity")
    protected List<OpenQuantityType> quantity;
    @XmlElement(name = "Amount")
    protected OpenAmountType amount;
    @XmlElement(name = "GeneralLedgerNominalAccount")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String generalLedgerNominalAccount;
    @XmlElement(name = "GeneralLedgerElement")
    protected GeneralLedgerElementType generalLedgerElement;
    @XmlElement(name = "EnterpriseUnit")
    protected EnterpriseUnitType enterpriseUnit;
    @XmlElement(name = "ProjectReference")
    protected ProjectReferenceType projectReference;

    /**
     * Gets the value of the ledgerID property.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getLedgerID() {
        return ledgerID;
    }

    /**
     * Sets the value of the ledgerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setLedgerID(IDType value) {
        this.ledgerID = value;
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

    /**
     * Gets the value of the percentage property.
     * 
     * @return
     *     possible object is
     *     {@link OpenPercentType }
     *     
     */
    public OpenPercentType getPercentage() {
        return percentage;
    }

    /**
     * Sets the value of the percentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenPercentType }
     *     
     */
    public void setPercentage(OpenPercentType value) {
        this.percentage = value;
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
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link OpenAmountType }
     *     
     */
    public OpenAmountType getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenAmountType }
     *     
     */
    public void setAmount(OpenAmountType value) {
        this.amount = value;
    }

    /**
     * Gets the value of the generalLedgerNominalAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeneralLedgerNominalAccount() {
        return generalLedgerNominalAccount;
    }

    /**
     * Sets the value of the generalLedgerNominalAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeneralLedgerNominalAccount(String value) {
        this.generalLedgerNominalAccount = value;
    }

    /**
     * Gets the value of the generalLedgerElement property.
     * 
     * @return
     *     possible object is
     *     {@link GeneralLedgerElementType }
     *     
     */
    public GeneralLedgerElementType getGeneralLedgerElement() {
        return generalLedgerElement;
    }

    /**
     * Sets the value of the generalLedgerElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralLedgerElementType }
     *     
     */
    public void setGeneralLedgerElement(GeneralLedgerElementType value) {
        this.generalLedgerElement = value;
    }

    /**
     * Gets the value of the enterpriseUnit property.
     * 
     * @return
     *     possible object is
     *     {@link EnterpriseUnitType }
     *     
     */
    public EnterpriseUnitType getEnterpriseUnit() {
        return enterpriseUnit;
    }

    /**
     * Sets the value of the enterpriseUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnterpriseUnitType }
     *     
     */
    public void setEnterpriseUnit(EnterpriseUnitType value) {
        this.enterpriseUnit = value;
    }

    /**
     * Gets the value of the projectReference property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectReferenceType }
     *     
     */
    public ProjectReferenceType getProjectReference() {
        return projectReference;
    }

    /**
     * Sets the value of the projectReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectReferenceType }
     *     
     */
    public void setProjectReference(ProjectReferenceType value) {
        this.projectReference = value;
    }

}

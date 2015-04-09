//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 04:48:59 PM CST 
//


package org.oagis.model.v101;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for MatchDocumentHeaderBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MatchDocumentHeaderBaseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}StatusHeaderBaseType">
 *       &lt;sequence>
 *         &lt;element name="DocumentType" type="{http://www.openapplications.org/oagis/10}MatchDocumentCodeType" minOccurs="0"/>
 *         &lt;element name="LedgerID" type="{http://www.openapplications.org/oagis/10}IDType" minOccurs="0"/>
 *         &lt;group ref="{http://www.openapplications.org/oagis/10}LedgerAmountGroup"/>
 *         &lt;element name="AccountingPeriod" type="{http://www.openapplications.org/oagis/10}AccountingPeriodType" minOccurs="0"/>
 *         &lt;element name="GLEntityID" type="{http://www.openapplications.org/oagis/10}IDType" minOccurs="0"/>
 *         &lt;element name="SourceDocumentReference" type="{http://www.openapplications.org/oagis/10}DocumentReferenceType" minOccurs="0"/>
 *         &lt;element name="RemittanceID" type="{http://www.openapplications.org/oagis/10}IDType" minOccurs="0"/>
 *         &lt;element name="PaymentMethodCode" type="{http://www.openapplications.org/oagis/10}PaymentMethodCodeType" minOccurs="0"/>
 *         &lt;element name="SpecialPriceAuthorizationCode" type="{http://www.openapplications.org/oagis/10}CodeType" minOccurs="0"/>
 *         &lt;element name="ContractReference" type="{http://www.openapplications.org/oagis/10}OrderReferenceType" minOccurs="0"/>
 *         &lt;element name="ReleaseNumberID" type="{http://www.openapplications.org/oagis/10}IDType" minOccurs="0"/>
 *         &lt;element name="EntryCreatorUser" type="{http://www.openapplications.org/oagis/10}UserType" minOccurs="0"/>
 *         &lt;element name="SupplierParty" type="{http://www.openapplications.org/oagis/10}SupplierPartyType" minOccurs="0"/>
 *         &lt;element name="PaymentTerm" type="{http://www.openapplications.org/oagis/10}PaymentTermType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Charge" type="{http://www.openapplications.org/oagis/10}ChargeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Distribution" type="{http://www.openapplications.org/oagis/10}DistributionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Party" type="{http://www.openapplications.org/oagis/10}PartyType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "MatchDocumentHeaderBaseType", propOrder = {
    "documentType",
    "ledgerID",
    "amount",
    "debitCreditCode",
    "taxBaseAmount",
    "functionalAmount",
    "taxBaseFunctionalAmount",
    "currencyExchangeRate",
    "accountingPeriod",
    "glEntityID",
    "sourceDocumentReference",
    "remittanceID",
    "paymentMethodCode",
    "specialPriceAuthorizationCode",
    "contractReference",
    "releaseNumberID",
    "entryCreatorUser",
    "supplierParty",
    "paymentTerm",
    "charge",
    "distribution",
    "party"
})
@XmlSeeAlso({
    MatchDocumentHeaderType.class
})
public class MatchDocumentHeaderBaseType
    extends StatusHeaderBaseType
{

    @XmlElement(name = "DocumentType")
    protected MatchDocumentCodeType documentType;
    @XmlElement(name = "LedgerID")
    protected IDType ledgerID;
    @XmlElement(name = "Amount")
    protected OpenAmountType amount;
    @XmlElement(name = "DebitCreditCode")
    protected DebitCreditCodeType debitCreditCode;
    @XmlElement(name = "TaxBaseAmount")
    protected AmountType taxBaseAmount;
    @XmlElement(name = "FunctionalAmount")
    protected AmountType functionalAmount;
    @XmlElement(name = "TaxBaseFunctionalAmount")
    protected AmountType taxBaseFunctionalAmount;
    @XmlElement(name = "CurrencyExchangeRate")
    protected CurrencyExchangeRateType currencyExchangeRate;
    @XmlElement(name = "AccountingPeriod")
    protected AccountingPeriodType accountingPeriod;
    @XmlElement(name = "GLEntityID")
    protected IDType glEntityID;
    @XmlElement(name = "SourceDocumentReference")
    protected DocumentReferenceType sourceDocumentReference;
    @XmlElement(name = "RemittanceID")
    protected IDType remittanceID;
    @XmlElement(name = "PaymentMethodCode")
    protected PaymentMethodCodeType paymentMethodCode;
    @XmlElement(name = "SpecialPriceAuthorizationCode")
    protected CodeType specialPriceAuthorizationCode;
    @XmlElement(name = "ContractReference")
    protected OrderReferenceType contractReference;
    @XmlElement(name = "ReleaseNumberID")
    protected IDType releaseNumberID;
    @XmlElement(name = "EntryCreatorUser")
    protected UserType entryCreatorUser;
    @XmlElement(name = "SupplierParty")
    protected SupplierPartyType supplierParty;
    @XmlElement(name = "PaymentTerm")
    protected List<PaymentTermType> paymentTerm;
    @XmlElement(name = "Charge")
    protected List<ChargeType> charge;
    @XmlElement(name = "Distribution")
    protected List<DistributionType> distribution;
    @XmlElement(name = "Party")
    protected List<PartyType> party;
    @XmlAttribute(name = "typeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String typeCode;
    @XmlAttribute(name = "actionCode")
    protected String actionCode;

    /**
     * Gets the value of the documentType property.
     * 
     * @return
     *     possible object is
     *     {@link MatchDocumentCodeType }
     *     
     */
    public MatchDocumentCodeType getDocumentType() {
        return documentType;
    }

    /**
     * Sets the value of the documentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchDocumentCodeType }
     *     
     */
    public void setDocumentType(MatchDocumentCodeType value) {
        this.documentType = value;
    }

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
     * Gets the value of the debitCreditCode property.
     * 
     * @return
     *     possible object is
     *     {@link DebitCreditCodeType }
     *     
     */
    public DebitCreditCodeType getDebitCreditCode() {
        return debitCreditCode;
    }

    /**
     * Sets the value of the debitCreditCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebitCreditCodeType }
     *     
     */
    public void setDebitCreditCode(DebitCreditCodeType value) {
        this.debitCreditCode = value;
    }

    /**
     * Gets the value of the taxBaseAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTaxBaseAmount() {
        return taxBaseAmount;
    }

    /**
     * Sets the value of the taxBaseAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTaxBaseAmount(AmountType value) {
        this.taxBaseAmount = value;
    }

    /**
     * Gets the value of the functionalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getFunctionalAmount() {
        return functionalAmount;
    }

    /**
     * Sets the value of the functionalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setFunctionalAmount(AmountType value) {
        this.functionalAmount = value;
    }

    /**
     * Gets the value of the taxBaseFunctionalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTaxBaseFunctionalAmount() {
        return taxBaseFunctionalAmount;
    }

    /**
     * Sets the value of the taxBaseFunctionalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTaxBaseFunctionalAmount(AmountType value) {
        this.taxBaseFunctionalAmount = value;
    }

    /**
     * Gets the value of the currencyExchangeRate property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyExchangeRateType }
     *     
     */
    public CurrencyExchangeRateType getCurrencyExchangeRate() {
        return currencyExchangeRate;
    }

    /**
     * Sets the value of the currencyExchangeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyExchangeRateType }
     *     
     */
    public void setCurrencyExchangeRate(CurrencyExchangeRateType value) {
        this.currencyExchangeRate = value;
    }

    /**
     * Gets the value of the accountingPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link AccountingPeriodType }
     *     
     */
    public AccountingPeriodType getAccountingPeriod() {
        return accountingPeriod;
    }

    /**
     * Sets the value of the accountingPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountingPeriodType }
     *     
     */
    public void setAccountingPeriod(AccountingPeriodType value) {
        this.accountingPeriod = value;
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
     * Gets the value of the sourceDocumentReference property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentReferenceType }
     *     
     */
    public DocumentReferenceType getSourceDocumentReference() {
        return sourceDocumentReference;
    }

    /**
     * Sets the value of the sourceDocumentReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentReferenceType }
     *     
     */
    public void setSourceDocumentReference(DocumentReferenceType value) {
        this.sourceDocumentReference = value;
    }

    /**
     * Gets the value of the remittanceID property.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getRemittanceID() {
        return remittanceID;
    }

    /**
     * Sets the value of the remittanceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setRemittanceID(IDType value) {
        this.remittanceID = value;
    }

    /**
     * Gets the value of the paymentMethodCode property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentMethodCodeType }
     *     
     */
    public PaymentMethodCodeType getPaymentMethodCode() {
        return paymentMethodCode;
    }

    /**
     * Sets the value of the paymentMethodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentMethodCodeType }
     *     
     */
    public void setPaymentMethodCode(PaymentMethodCodeType value) {
        this.paymentMethodCode = value;
    }

    /**
     * Gets the value of the specialPriceAuthorizationCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getSpecialPriceAuthorizationCode() {
        return specialPriceAuthorizationCode;
    }

    /**
     * Sets the value of the specialPriceAuthorizationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setSpecialPriceAuthorizationCode(CodeType value) {
        this.specialPriceAuthorizationCode = value;
    }

    /**
     * Gets the value of the contractReference property.
     * 
     * @return
     *     possible object is
     *     {@link OrderReferenceType }
     *     
     */
    public OrderReferenceType getContractReference() {
        return contractReference;
    }

    /**
     * Sets the value of the contractReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderReferenceType }
     *     
     */
    public void setContractReference(OrderReferenceType value) {
        this.contractReference = value;
    }

    /**
     * Gets the value of the releaseNumberID property.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getReleaseNumberID() {
        return releaseNumberID;
    }

    /**
     * Sets the value of the releaseNumberID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setReleaseNumberID(IDType value) {
        this.releaseNumberID = value;
    }

    /**
     * Gets the value of the entryCreatorUser property.
     * 
     * @return
     *     possible object is
     *     {@link UserType }
     *     
     */
    public UserType getEntryCreatorUser() {
        return entryCreatorUser;
    }

    /**
     * Sets the value of the entryCreatorUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserType }
     *     
     */
    public void setEntryCreatorUser(UserType value) {
        this.entryCreatorUser = value;
    }

    /**
     * Gets the value of the supplierParty property.
     * 
     * @return
     *     possible object is
     *     {@link SupplierPartyType }
     *     
     */
    public SupplierPartyType getSupplierParty() {
        return supplierParty;
    }

    /**
     * Sets the value of the supplierParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplierPartyType }
     *     
     */
    public void setSupplierParty(SupplierPartyType value) {
        this.supplierParty = value;
    }

    /**
     * Gets the value of the paymentTerm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentTerm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentTerm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentTermType }
     * 
     * 
     */
    public List<PaymentTermType> getPaymentTerm() {
        if (paymentTerm == null) {
            paymentTerm = new ArrayList<PaymentTermType>();
        }
        return this.paymentTerm;
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
     * Gets the value of the party property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the party property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyType }
     * 
     * 
     */
    public List<PartyType> getParty() {
        if (party == null) {
            party = new ArrayList<PartyType>();
        }
        return this.party;
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
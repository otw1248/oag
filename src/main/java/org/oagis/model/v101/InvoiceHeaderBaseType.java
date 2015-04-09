//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 04:59:25 PM CST 
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
 * The InvoiceHeader type supports summary amounts for line items, charges and allowances.
 * 
 * <p>Java class for InvoiceHeaderBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceHeaderBaseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}StatusHeaderBaseType">
 *       &lt;sequence>
 *         &lt;element name="ExtendedAmount" type="{http://www.openapplications.org/oagis/10}AmountType" minOccurs="0"/>
 *         &lt;element name="TotalAmount" type="{http://www.openapplications.org/oagis/10}AmountType" minOccurs="0"/>
 *         &lt;element name="AmountDiscount" type="{http://www.openapplications.org/oagis/10}AmountDiscountType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SupplierParty" type="{http://www.openapplications.org/oagis/10}SupplierPartyType" minOccurs="0"/>
 *         &lt;element name="CustomerParty" type="{http://www.openapplications.org/oagis/10}CustomerPartyType" minOccurs="0"/>
 *         &lt;element name="RemitToParty" type="{http://www.openapplications.org/oagis/10}RemitToPartyType" minOccurs="0"/>
 *         &lt;element name="ShipToParty" type="{http://www.openapplications.org/oagis/10}ShipToPartyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CarrierParty" type="{http://www.openapplications.org/oagis/10}PartyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BillToParty" type="{http://www.openapplications.org/oagis/10}CustomerPartyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ShipFromParty" type="{http://www.openapplications.org/oagis/10}PartyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Party" type="{http://www.openapplications.org/oagis/10}PartyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ReasonCode" type="{http://www.openapplications.org/oagis/10}CodeType" minOccurs="0"/>
 *         &lt;element name="PurchaseOrderReference" type="{http://www.openapplications.org/oagis/10}OrderReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ContractReference" type="{http://www.openapplications.org/oagis/10}OrderReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PaymentTerm" type="{http://www.openapplications.org/oagis/10}PaymentTermType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Payment" type="{http://www.openapplications.org/oagis/10}PaymentType" minOccurs="0"/>
 *         &lt;element name="Tax" type="{http://www.openapplications.org/oagis/10}TaxType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DistributeCharge" type="{http://www.openapplications.org/oagis/10}DistributeChargeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DistributeTax" type="{http://www.openapplications.org/oagis/10}DistributeTaxType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Distribution" type="{http://www.openapplications.org/oagis/10}DistributionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Charge" type="{http://www.openapplications.org/oagis/10}ChargeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Allowance" type="{http://www.openapplications.org/oagis/10}AllowanceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TransportationMethodCode" type="{http://www.openapplications.org/oagis/10}CodeType" minOccurs="0"/>
 *         &lt;element name="TransportationTerm" type="{http://www.openapplications.org/oagis/10}TransportationTermType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.openapplications.org/oagis/10}ShippingWeightAndVolumeGroup"/>
 *         &lt;element name="Event" type="{http://www.openapplications.org/oagis/10}EventType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceHeaderBaseType", propOrder = {
    "extendedAmount",
    "totalAmount",
    "amountDiscount",
    "supplierParty",
    "customerParty",
    "remitToParty",
    "shipToParty",
    "carrierParty",
    "billToParty",
    "shipFromParty",
    "party",
    "reasonCode",
    "purchaseOrderReference",
    "contractReference",
    "paymentTerm",
    "payment",
    "tax",
    "distributeCharge",
    "distributeTax",
    "distribution",
    "charge",
    "allowance",
    "transportationMethodCode",
    "transportationTerm",
    "dunnageWeightMeasure",
    "tareWeightMeasure",
    "netWeightMeasure",
    "grossWeightMeasure",
    "netVolumeMeasure",
    "totalVolumeMeasure",
    "event"
})
@XmlSeeAlso({
    InvoiceHeaderType.class
})
public class InvoiceHeaderBaseType
    extends StatusHeaderBaseType
{

    @XmlElement(name = "ExtendedAmount")
    protected AmountType extendedAmount;
    @XmlElement(name = "TotalAmount")
    protected AmountType totalAmount;
    @XmlElement(name = "AmountDiscount")
    protected List<AmountDiscountType> amountDiscount;
    @XmlElement(name = "SupplierParty")
    protected SupplierPartyType supplierParty;
    @XmlElement(name = "CustomerParty")
    protected CustomerPartyType customerParty;
    @XmlElement(name = "RemitToParty")
    protected RemitToPartyType remitToParty;
    @XmlElement(name = "ShipToParty")
    protected List<ShipToPartyType> shipToParty;
    @XmlElement(name = "CarrierParty")
    protected List<PartyType> carrierParty;
    @XmlElement(name = "BillToParty")
    protected List<CustomerPartyType> billToParty;
    @XmlElement(name = "ShipFromParty")
    protected List<PartyType> shipFromParty;
    @XmlElement(name = "Party")
    protected List<PartyType> party;
    @XmlElement(name = "ReasonCode")
    protected CodeType reasonCode;
    @XmlElement(name = "PurchaseOrderReference")
    protected List<OrderReferenceType> purchaseOrderReference;
    @XmlElement(name = "ContractReference")
    protected List<OrderReferenceType> contractReference;
    @XmlElement(name = "PaymentTerm")
    protected List<PaymentTermType> paymentTerm;
    @XmlElement(name = "Payment")
    protected PaymentType payment;
    @XmlElement(name = "Tax")
    protected List<TaxType> tax;
    @XmlElement(name = "DistributeCharge")
    protected List<DistributeChargeType> distributeCharge;
    @XmlElement(name = "DistributeTax")
    protected List<DistributeTaxType> distributeTax;
    @XmlElement(name = "Distribution")
    protected List<DistributionType> distribution;
    @XmlElement(name = "Charge")
    protected List<ChargeType> charge;
    @XmlElement(name = "Allowance")
    protected List<AllowanceType> allowance;
    @XmlElement(name = "TransportationMethodCode")
    protected CodeType transportationMethodCode;
    @XmlElement(name = "TransportationTerm")
    protected List<TransportationTermType> transportationTerm;
    @XmlElement(name = "DunnageWeightMeasure")
    protected MeasureType dunnageWeightMeasure;
    @XmlElement(name = "TareWeightMeasure")
    protected MeasureType tareWeightMeasure;
    @XmlElement(name = "NetWeightMeasure")
    protected MeasureType netWeightMeasure;
    @XmlElement(name = "GrossWeightMeasure")
    protected MeasureType grossWeightMeasure;
    @XmlElement(name = "NetVolumeMeasure")
    protected MeasureType netVolumeMeasure;
    @XmlElement(name = "TotalVolumeMeasure")
    protected MeasureType totalVolumeMeasure;
    @XmlElement(name = "Event")
    protected List<EventType> event;

    /**
     * Gets the value of the extendedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getExtendedAmount() {
        return extendedAmount;
    }

    /**
     * Sets the value of the extendedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setExtendedAmount(AmountType value) {
        this.extendedAmount = value;
    }

    /**
     * Gets the value of the totalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets the value of the totalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalAmount(AmountType value) {
        this.totalAmount = value;
    }

    /**
     * Gets the value of the amountDiscount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the amountDiscount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAmountDiscount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountDiscountType }
     * 
     * 
     */
    public List<AmountDiscountType> getAmountDiscount() {
        if (amountDiscount == null) {
            amountDiscount = new ArrayList<AmountDiscountType>();
        }
        return this.amountDiscount;
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
     * Gets the value of the customerParty property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerPartyType }
     *     
     */
    public CustomerPartyType getCustomerParty() {
        return customerParty;
    }

    /**
     * Sets the value of the customerParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerPartyType }
     *     
     */
    public void setCustomerParty(CustomerPartyType value) {
        this.customerParty = value;
    }

    /**
     * Gets the value of the remitToParty property.
     * 
     * @return
     *     possible object is
     *     {@link RemitToPartyType }
     *     
     */
    public RemitToPartyType getRemitToParty() {
        return remitToParty;
    }

    /**
     * Sets the value of the remitToParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemitToPartyType }
     *     
     */
    public void setRemitToParty(RemitToPartyType value) {
        this.remitToParty = value;
    }

    /**
     * Gets the value of the shipToParty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipToParty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipToParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShipToPartyType }
     * 
     * 
     */
    public List<ShipToPartyType> getShipToParty() {
        if (shipToParty == null) {
            shipToParty = new ArrayList<ShipToPartyType>();
        }
        return this.shipToParty;
    }

    /**
     * Gets the value of the carrierParty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carrierParty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarrierParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyType }
     * 
     * 
     */
    public List<PartyType> getCarrierParty() {
        if (carrierParty == null) {
            carrierParty = new ArrayList<PartyType>();
        }
        return this.carrierParty;
    }

    /**
     * Gets the value of the billToParty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billToParty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillToParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerPartyType }
     * 
     * 
     */
    public List<CustomerPartyType> getBillToParty() {
        if (billToParty == null) {
            billToParty = new ArrayList<CustomerPartyType>();
        }
        return this.billToParty;
    }

    /**
     * Gets the value of the shipFromParty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipFromParty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipFromParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyType }
     * 
     * 
     */
    public List<PartyType> getShipFromParty() {
        if (shipFromParty == null) {
            shipFromParty = new ArrayList<PartyType>();
        }
        return this.shipFromParty;
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
     * Gets the value of the purchaseOrderReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the purchaseOrderReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPurchaseOrderReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderReferenceType }
     * 
     * 
     */
    public List<OrderReferenceType> getPurchaseOrderReference() {
        if (purchaseOrderReference == null) {
            purchaseOrderReference = new ArrayList<OrderReferenceType>();
        }
        return this.purchaseOrderReference;
    }

    /**
     * Gets the value of the contractReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contractReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContractReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderReferenceType }
     * 
     * 
     */
    public List<OrderReferenceType> getContractReference() {
        if (contractReference == null) {
            contractReference = new ArrayList<OrderReferenceType>();
        }
        return this.contractReference;
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
     * Gets the value of the payment property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentType }
     *     
     */
    public PaymentType getPayment() {
        return payment;
    }

    /**
     * Sets the value of the payment property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentType }
     *     
     */
    public void setPayment(PaymentType value) {
        this.payment = value;
    }

    /**
     * Gets the value of the tax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxType }
     * 
     * 
     */
    public List<TaxType> getTax() {
        if (tax == null) {
            tax = new ArrayList<TaxType>();
        }
        return this.tax;
    }

    /**
     * Gets the value of the distributeCharge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the distributeCharge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDistributeCharge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DistributeChargeType }
     * 
     * 
     */
    public List<DistributeChargeType> getDistributeCharge() {
        if (distributeCharge == null) {
            distributeCharge = new ArrayList<DistributeChargeType>();
        }
        return this.distributeCharge;
    }

    /**
     * Gets the value of the distributeTax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the distributeTax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDistributeTax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DistributeTaxType }
     * 
     * 
     */
    public List<DistributeTaxType> getDistributeTax() {
        if (distributeTax == null) {
            distributeTax = new ArrayList<DistributeTaxType>();
        }
        return this.distributeTax;
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
     * Gets the value of the allowance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allowance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllowance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AllowanceType }
     * 
     * 
     */
    public List<AllowanceType> getAllowance() {
        if (allowance == null) {
            allowance = new ArrayList<AllowanceType>();
        }
        return this.allowance;
    }

    /**
     * Gets the value of the transportationMethodCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getTransportationMethodCode() {
        return transportationMethodCode;
    }

    /**
     * Sets the value of the transportationMethodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setTransportationMethodCode(CodeType value) {
        this.transportationMethodCode = value;
    }

    /**
     * Gets the value of the transportationTerm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transportationTerm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransportationTerm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportationTermType }
     * 
     * 
     */
    public List<TransportationTermType> getTransportationTerm() {
        if (transportationTerm == null) {
            transportationTerm = new ArrayList<TransportationTermType>();
        }
        return this.transportationTerm;
    }

    /**
     * Gets the value of the dunnageWeightMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getDunnageWeightMeasure() {
        return dunnageWeightMeasure;
    }

    /**
     * Sets the value of the dunnageWeightMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setDunnageWeightMeasure(MeasureType value) {
        this.dunnageWeightMeasure = value;
    }

    /**
     * Gets the value of the tareWeightMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getTareWeightMeasure() {
        return tareWeightMeasure;
    }

    /**
     * Sets the value of the tareWeightMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setTareWeightMeasure(MeasureType value) {
        this.tareWeightMeasure = value;
    }

    /**
     * Gets the value of the netWeightMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getNetWeightMeasure() {
        return netWeightMeasure;
    }

    /**
     * Sets the value of the netWeightMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setNetWeightMeasure(MeasureType value) {
        this.netWeightMeasure = value;
    }

    /**
     * Gets the value of the grossWeightMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getGrossWeightMeasure() {
        return grossWeightMeasure;
    }

    /**
     * Sets the value of the grossWeightMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setGrossWeightMeasure(MeasureType value) {
        this.grossWeightMeasure = value;
    }

    /**
     * Gets the value of the netVolumeMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getNetVolumeMeasure() {
        return netVolumeMeasure;
    }

    /**
     * Sets the value of the netVolumeMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setNetVolumeMeasure(MeasureType value) {
        this.netVolumeMeasure = value;
    }

    /**
     * Gets the value of the totalVolumeMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getTotalVolumeMeasure() {
        return totalVolumeMeasure;
    }

    /**
     * Sets the value of the totalVolumeMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setTotalVolumeMeasure(MeasureType value) {
        this.totalVolumeMeasure = value;
    }

    /**
     * Gets the value of the event property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the event property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EventType }
     * 
     * 
     */
    public List<EventType> getEvent() {
        if (event == null) {
            event = new ArrayList<EventType>();
        }
        return this.event;
    }

}

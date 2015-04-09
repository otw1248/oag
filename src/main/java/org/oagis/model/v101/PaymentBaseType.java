//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 05:03:55 PM CST 
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
 * The  Type for specifying the details of a payment
 * 
 * <p>Java class for PaymentBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentBaseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}IdentificationType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.openapplications.org/oagis/10}FreeFormTextGroup"/>
 *         &lt;element name="PaymentTerm" type="{http://www.openapplications.org/oagis/10}PaymentTermType" minOccurs="0"/>
 *         &lt;element name="Discount" type="{http://www.openapplications.org/oagis/10}PaymentTermType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Penalty" type="{http://www.openapplications.org/oagis/10}PaymentTermType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DeferredTerm" type="{http://www.openapplications.org/oagis/10}DeferredTermType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="LetterOfCredit" type="{http://www.openapplications.org/oagis/10}LetterOfCreditType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentBaseType", propOrder = {
    "description",
    "note",
    "paymentTerm",
    "discount",
    "penalty",
    "deferredTerm",
    "letterOfCredit"
})
@XmlSeeAlso({
    PaymentType.class
})
public class PaymentBaseType
    extends IdentificationType
{

    @XmlElement(name = "Description")
    protected List<DescriptionType> description;
    @XmlElement(name = "Note")
    protected List<NoteType> note;
    @XmlElement(name = "PaymentTerm")
    protected PaymentTermType paymentTerm;
    @XmlElement(name = "Discount")
    protected List<PaymentTermType> discount;
    @XmlElement(name = "Penalty")
    protected List<PaymentTermType> penalty;
    @XmlElement(name = "DeferredTerm")
    protected List<DeferredTermType> deferredTerm;
    @XmlElement(name = "LetterOfCredit")
    protected List<LetterOfCreditType> letterOfCredit;

    /**
     * Gets the value of the description property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescriptionType }
     * 
     * 
     */
    public List<DescriptionType> getDescription() {
        if (description == null) {
            description = new ArrayList<DescriptionType>();
        }
        return this.description;
    }

    /**
     * Gets the value of the note property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the note property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NoteType }
     * 
     * 
     */
    public List<NoteType> getNote() {
        if (note == null) {
            note = new ArrayList<NoteType>();
        }
        return this.note;
    }

    /**
     * Gets the value of the paymentTerm property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTermType }
     *     
     */
    public PaymentTermType getPaymentTerm() {
        return paymentTerm;
    }

    /**
     * Sets the value of the paymentTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTermType }
     *     
     */
    public void setPaymentTerm(PaymentTermType value) {
        this.paymentTerm = value;
    }

    /**
     * Gets the value of the discount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the discount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiscount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentTermType }
     * 
     * 
     */
    public List<PaymentTermType> getDiscount() {
        if (discount == null) {
            discount = new ArrayList<PaymentTermType>();
        }
        return this.discount;
    }

    /**
     * Gets the value of the penalty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the penalty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPenalty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentTermType }
     * 
     * 
     */
    public List<PaymentTermType> getPenalty() {
        if (penalty == null) {
            penalty = new ArrayList<PaymentTermType>();
        }
        return this.penalty;
    }

    /**
     * Gets the value of the deferredTerm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deferredTerm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeferredTerm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeferredTermType }
     * 
     * 
     */
    public List<DeferredTermType> getDeferredTerm() {
        if (deferredTerm == null) {
            deferredTerm = new ArrayList<DeferredTermType>();
        }
        return this.deferredTerm;
    }

    /**
     * Gets the value of the letterOfCredit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the letterOfCredit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLetterOfCredit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LetterOfCreditType }
     * 
     * 
     */
    public List<LetterOfCreditType> getLetterOfCredit() {
        if (letterOfCredit == null) {
            letterOfCredit = new ArrayList<LetterOfCreditType>();
        }
        return this.letterOfCredit;
    }

}

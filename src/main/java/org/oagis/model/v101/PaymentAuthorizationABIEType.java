//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 05:04:04 PM CST 
//


package org.oagis.model.v101;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * The Type from UN/CEFACT to represent a payment authorization
 * 
 * <p>Java class for PaymentAuthorizationABIEType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentAuthorizationABIEType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}AuthorizationABIEType">
 *       &lt;sequence>
 *         &lt;element name="ReferenceOrderNumberID" type="{http://www.openapplications.org/oagis/10}IDType" minOccurs="0"/>
 *         &lt;element name="RevenueSourceID" type="{http://www.openapplications.org/oagis/10}IDType" minOccurs="0"/>
 *         &lt;element name="RemittanceBankID" type="{http://www.openapplications.org/oagis/10}IDType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentAuthorizationABIEType", propOrder = {
    "referenceOrderNumberID",
    "revenueSourceID",
    "remittanceBankID"
})
@XmlSeeAlso({
    PaymentAuthorizationBaseType.class
})
public class PaymentAuthorizationABIEType
    extends AuthorizationABIEType
{

    @XmlElement(name = "ReferenceOrderNumberID")
    protected IDType referenceOrderNumberID;
    @XmlElement(name = "RevenueSourceID")
    protected IDType revenueSourceID;
    @XmlElement(name = "RemittanceBankID")
    protected IDType remittanceBankID;

    /**
     * Gets the value of the referenceOrderNumberID property.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getReferenceOrderNumberID() {
        return referenceOrderNumberID;
    }

    /**
     * Sets the value of the referenceOrderNumberID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setReferenceOrderNumberID(IDType value) {
        this.referenceOrderNumberID = value;
    }

    /**
     * Gets the value of the revenueSourceID property.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getRevenueSourceID() {
        return revenueSourceID;
    }

    /**
     * Sets the value of the revenueSourceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setRevenueSourceID(IDType value) {
        this.revenueSourceID = value;
    }

    /**
     * Gets the value of the remittanceBankID property.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getRemittanceBankID() {
        return remittanceBankID;
    }

    /**
     * Sets the value of the remittanceBankID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setRemittanceBankID(IDType value) {
        this.remittanceBankID = value;
    }

}
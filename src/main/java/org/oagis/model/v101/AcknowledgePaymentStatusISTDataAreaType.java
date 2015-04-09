//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 03:54:58 PM CST 
//


package org.oagis.model.v101;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AcknowledgePaymentStatusISTDataAreaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcknowledgePaymentStatusISTDataAreaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Acknowledge" type="{http://www.openapplications.org/oagis/10}AcknowledgeType"/>
 *         &lt;element name="PaymentStatusIST" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.05}CustomerPaymentStatusReportV05" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcknowledgePaymentStatusISTDataAreaType", propOrder = {
    "acknowledge",
    "paymentStatusIST"
})
public class AcknowledgePaymentStatusISTDataAreaType {

    @XmlElement(name = "Acknowledge", required = true)
    protected AcknowledgeType acknowledge;
    @XmlElement(name = "PaymentStatusIST", required = true)
    protected List<CustomerPaymentStatusReportV05> paymentStatusIST;

    /**
     * Gets the value of the acknowledge property.
     * 
     * @return
     *     possible object is
     *     {@link AcknowledgeType }
     *     
     */
    public AcknowledgeType getAcknowledge() {
        return acknowledge;
    }

    /**
     * Sets the value of the acknowledge property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcknowledgeType }
     *     
     */
    public void setAcknowledge(AcknowledgeType value) {
        this.acknowledge = value;
    }

    /**
     * Gets the value of the paymentStatusIST property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentStatusIST property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentStatusIST().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerPaymentStatusReportV05 }
     * 
     * 
     */
    public List<CustomerPaymentStatusReportV05> getPaymentStatusIST() {
        if (paymentStatusIST == null) {
            paymentStatusIST = new ArrayList<CustomerPaymentStatusReportV05>();
        }
        return this.paymentStatusIST;
    }

}

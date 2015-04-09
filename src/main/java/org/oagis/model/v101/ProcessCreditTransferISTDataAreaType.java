//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 04:40:50 PM CST 
//


package org.oagis.model.v101;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProcessCreditTransferISTDataAreaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProcessCreditTransferISTDataAreaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Process" type="{http://www.openapplications.org/oagis/10}ProcessType"/>
 *         &lt;element name="CreditTransferIST" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.05}CustomerCreditTransferInitiationV05" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessCreditTransferISTDataAreaType", namespace = "http://www.openapplications.org/oagis/10", propOrder = {
    "process",
    "creditTransferIST"
})
public class ProcessCreditTransferISTDataAreaType {

    @XmlElement(name = "Process", required = true)
    protected ProcessType process;
    @XmlElement(name = "CreditTransferIST", required = true)
    protected List<CustomerCreditTransferInitiationV05> creditTransferIST;

    /**
     * Gets the value of the process property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessType }
     *     
     */
    public ProcessType getProcess() {
        return process;
    }

    /**
     * Sets the value of the process property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessType }
     *     
     */
    public void setProcess(ProcessType value) {
        this.process = value;
    }

    /**
     * Gets the value of the creditTransferIST property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creditTransferIST property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreditTransferIST().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerCreditTransferInitiationV05 }
     * 
     * 
     */
    public List<CustomerCreditTransferInitiationV05> getCreditTransferIST() {
        if (creditTransferIST == null) {
            creditTransferIST = new ArrayList<CustomerCreditTransferInitiationV05>();
        }
        return this.creditTransferIST;
    }

}

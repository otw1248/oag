//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 04:48:18 PM CST 
//


package org.oagis.model.v101;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Deprecation of VOUCHER, ORIGREF:
 * From OAGIS 7.2.1:
 * ORIGREF is the link that ties back to a sub ledger transaction entry ID.  It is the identifier of an original transaction or document.  For example, it could be the receipt or the summarized inventory activity.  This is the singular field that refers to an audit record.  Together with the Sender information, the ORIGREF is part of the referencing system, which will enable drill back audit trail functionality.
 * PN: The ORIGREF field represents the voucher or unapproved invoice identifier.
 * VOUCHER is the internal identifier associated with the external supplier's invoice.
 * REMITTANCE refers to a reference identifier to print on remittance advice, for example, supplier invoice number.
 * 
 * In OAGIS 8:
 * All of these can be accomplished with an InvoiceReference. REMITTANCE field in until the RemittanceAdvice BOD is part of OAGIS.
 * 
 * 
 * <p>Java class for InvoiceLedgerEntryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceLedgerEntryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InvoiceLedgerEntryHeader" type="{http://www.openapplications.org/oagis/10}InvoiceLedgerEntryHeaderType" minOccurs="0"/>
 *         &lt;element name="InvoiceLedgerEntryLine" type="{http://www.openapplications.org/oagis/10}InvoiceLedgerEntryLineType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="typeCode" type="{http://www.openapplications.org/oagis/10}CodeType_1E7368" />
 *       &lt;attribute name="actionCode" type="{http://www.openapplications.org/oagis/10}ActionCodeContentType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceLedgerEntryType", propOrder = {
    "invoiceLedgerEntryHeader",
    "invoiceLedgerEntryLine"
})
public class InvoiceLedgerEntryType {

    @XmlElement(name = "InvoiceLedgerEntryHeader")
    protected InvoiceLedgerEntryHeaderType invoiceLedgerEntryHeader;
    @XmlElement(name = "InvoiceLedgerEntryLine")
    protected List<InvoiceLedgerEntryLineType> invoiceLedgerEntryLine;
    @XmlAttribute(name = "typeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String typeCode;
    @XmlAttribute(name = "actionCode")
    protected String actionCode;

    /**
     * Gets the value of the invoiceLedgerEntryHeader property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceLedgerEntryHeaderType }
     *     
     */
    public InvoiceLedgerEntryHeaderType getInvoiceLedgerEntryHeader() {
        return invoiceLedgerEntryHeader;
    }

    /**
     * Sets the value of the invoiceLedgerEntryHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceLedgerEntryHeaderType }
     *     
     */
    public void setInvoiceLedgerEntryHeader(InvoiceLedgerEntryHeaderType value) {
        this.invoiceLedgerEntryHeader = value;
    }

    /**
     * Gets the value of the invoiceLedgerEntryLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invoiceLedgerEntryLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvoiceLedgerEntryLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvoiceLedgerEntryLineType }
     * 
     * 
     */
    public List<InvoiceLedgerEntryLineType> getInvoiceLedgerEntryLine() {
        if (invoiceLedgerEntryLine == null) {
            invoiceLedgerEntryLine = new ArrayList<InvoiceLedgerEntryLineType>();
        }
        return this.invoiceLedgerEntryLine;
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

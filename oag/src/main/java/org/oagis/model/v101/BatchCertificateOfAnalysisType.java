//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 04:57:37 PM CST 
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
 * <p>Java class for BatchCertificateOfAnalysisType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BatchCertificateOfAnalysisType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BatchCertificateOfAnalysisHeader" type="{http://www.openapplications.org/oagis/10}BatchCertificateOfAnalysisHeaderType" minOccurs="0"/>
 *         &lt;element name="BatchCertificateOfAnalysisLine" type="{http://www.openapplications.org/oagis/10}CertificateOfAnalysisLineType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "BatchCertificateOfAnalysisType", propOrder = {
    "batchCertificateOfAnalysisHeader",
    "batchCertificateOfAnalysisLine"
})
public class BatchCertificateOfAnalysisType {

    @XmlElement(name = "BatchCertificateOfAnalysisHeader")
    protected BatchCertificateOfAnalysisHeaderType batchCertificateOfAnalysisHeader;
    @XmlElement(name = "BatchCertificateOfAnalysisLine")
    protected List<CertificateOfAnalysisLineType> batchCertificateOfAnalysisLine;
    @XmlAttribute(name = "typeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String typeCode;
    @XmlAttribute(name = "actionCode")
    protected String actionCode;

    /**
     * Gets the value of the batchCertificateOfAnalysisHeader property.
     * 
     * @return
     *     possible object is
     *     {@link BatchCertificateOfAnalysisHeaderType }
     *     
     */
    public BatchCertificateOfAnalysisHeaderType getBatchCertificateOfAnalysisHeader() {
        return batchCertificateOfAnalysisHeader;
    }

    /**
     * Sets the value of the batchCertificateOfAnalysisHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchCertificateOfAnalysisHeaderType }
     *     
     */
    public void setBatchCertificateOfAnalysisHeader(BatchCertificateOfAnalysisHeaderType value) {
        this.batchCertificateOfAnalysisHeader = value;
    }

    /**
     * Gets the value of the batchCertificateOfAnalysisLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the batchCertificateOfAnalysisLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBatchCertificateOfAnalysisLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CertificateOfAnalysisLineType }
     * 
     * 
     */
    public List<CertificateOfAnalysisLineType> getBatchCertificateOfAnalysisLine() {
        if (batchCertificateOfAnalysisLine == null) {
            batchCertificateOfAnalysisLine = new ArrayList<CertificateOfAnalysisLineType>();
        }
        return this.batchCertificateOfAnalysisLine;
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
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 05:04:55 PM CST 
//


package org.oagis.model.v101;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ActionVerbType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActionVerbType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}VerbType">
 *       &lt;sequence>
 *         &lt;element name="ActionCriteria" type="{http://www.openapplications.org/oagis/10}ActionCriteriaType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="recordSetStartNumber" type="{http://www.openapplications.org/oagis/10}PositiveIntegerNumberType" />
 *       &lt;attribute name="recordSetCountNumber" type="{http://www.openapplications.org/oagis/10}PositiveIntegerNumberType" />
 *       &lt;attribute name="recordSetTotalNumber" type="{http://www.openapplications.org/oagis/10}PositiveIntegerNumberType" />
 *       &lt;attribute name="recordSetCompleteIndicator" type="{http://www.openapplications.org/oagis/10}IndicatorType" />
 *       &lt;attribute name="recordSetReferenceID" type="{http://www.openapplications.org/oagis/10}IDType_B3F14E" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActionVerbType", propOrder = {
    "actionCriteria"
})
@XmlSeeAlso({
    SyncType.class
})
public class ActionVerbType
    extends VerbType
{

    @XmlElement(name = "ActionCriteria")
    protected List<ActionCriteriaType> actionCriteria;
    @XmlAttribute(name = "recordSetStartNumber")
    protected BigInteger recordSetStartNumber;
    @XmlAttribute(name = "recordSetCountNumber")
    protected BigInteger recordSetCountNumber;
    @XmlAttribute(name = "recordSetTotalNumber")
    protected BigInteger recordSetTotalNumber;
    @XmlAttribute(name = "recordSetCompleteIndicator")
    protected Boolean recordSetCompleteIndicator;
    @XmlAttribute(name = "recordSetReferenceID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String recordSetReferenceID;

    /**
     * Gets the value of the actionCriteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the actionCriteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActionCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActionCriteriaType }
     * 
     * 
     */
    public List<ActionCriteriaType> getActionCriteria() {
        if (actionCriteria == null) {
            actionCriteria = new ArrayList<ActionCriteriaType>();
        }
        return this.actionCriteria;
    }

    /**
     * Gets the value of the recordSetStartNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRecordSetStartNumber() {
        return recordSetStartNumber;
    }

    /**
     * Sets the value of the recordSetStartNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRecordSetStartNumber(BigInteger value) {
        this.recordSetStartNumber = value;
    }

    /**
     * Gets the value of the recordSetCountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRecordSetCountNumber() {
        return recordSetCountNumber;
    }

    /**
     * Sets the value of the recordSetCountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRecordSetCountNumber(BigInteger value) {
        this.recordSetCountNumber = value;
    }

    /**
     * Gets the value of the recordSetTotalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRecordSetTotalNumber() {
        return recordSetTotalNumber;
    }

    /**
     * Sets the value of the recordSetTotalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRecordSetTotalNumber(BigInteger value) {
        this.recordSetTotalNumber = value;
    }

    /**
     * Gets the value of the recordSetCompleteIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRecordSetCompleteIndicator() {
        return recordSetCompleteIndicator;
    }

    /**
     * Sets the value of the recordSetCompleteIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRecordSetCompleteIndicator(Boolean value) {
        this.recordSetCompleteIndicator = value;
    }

    /**
     * Gets the value of the recordSetReferenceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordSetReferenceID() {
        return recordSetReferenceID;
    }

    /**
     * Sets the value of the recordSetReferenceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordSetReferenceID(String value) {
        this.recordSetReferenceID = value;
    }

}
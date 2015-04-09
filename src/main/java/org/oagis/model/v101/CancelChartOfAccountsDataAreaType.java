//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 04:04:37 PM CST 
//


package org.oagis.model.v101;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CancelChartOfAccountsDataAreaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CancelChartOfAccountsDataAreaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Cancel" type="{http://www.openapplications.org/oagis/10}ProcessType"/>
 *         &lt;element name="ChartOfAccounts" type="{http://www.openapplications.org/oagis/10}ChartOfAccountsType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancelChartOfAccountsDataAreaType", propOrder = {
    "cancel",
    "chartOfAccounts"
})
public class CancelChartOfAccountsDataAreaType {

    @XmlElement(name = "Cancel", required = true)
    protected ProcessType cancel;
    @XmlElement(name = "ChartOfAccounts", required = true)
    protected List<ChartOfAccountsType> chartOfAccounts;

    /**
     * Gets the value of the cancel property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessType }
     *     
     */
    public ProcessType getCancel() {
        return cancel;
    }

    /**
     * Sets the value of the cancel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessType }
     *     
     */
    public void setCancel(ProcessType value) {
        this.cancel = value;
    }

    /**
     * Gets the value of the chartOfAccounts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chartOfAccounts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChartOfAccounts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChartOfAccountsType }
     * 
     * 
     */
    public List<ChartOfAccountsType> getChartOfAccounts() {
        if (chartOfAccounts == null) {
            chartOfAccounts = new ArrayList<ChartOfAccountsType>();
        }
        return this.chartOfAccounts;
    }

}

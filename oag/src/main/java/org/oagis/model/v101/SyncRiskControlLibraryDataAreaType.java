//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 05:03:41 PM CST 
//


package org.oagis.model.v101;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SyncRiskControlLibraryDataAreaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SyncRiskControlLibraryDataAreaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Sync" type="{http://www.openapplications.org/oagis/10}SyncType"/>
 *         &lt;element name="RiskControlLibrary" type="{http://www.openapplications.org/oagis/10}RiskControlLibraryType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SyncRiskControlLibraryDataAreaType", propOrder = {
    "sync",
    "riskControlLibrary"
})
public class SyncRiskControlLibraryDataAreaType {

    @XmlElement(name = "Sync", required = true)
    protected SyncType sync;
    @XmlElement(name = "RiskControlLibrary", required = true)
    protected List<RiskControlLibraryType> riskControlLibrary;

    /**
     * Gets the value of the sync property.
     * 
     * @return
     *     possible object is
     *     {@link SyncType }
     *     
     */
    public SyncType getSync() {
        return sync;
    }

    /**
     * Sets the value of the sync property.
     * 
     * @param value
     *     allowed object is
     *     {@link SyncType }
     *     
     */
    public void setSync(SyncType value) {
        this.sync = value;
    }

    /**
     * Gets the value of the riskControlLibrary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the riskControlLibrary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRiskControlLibrary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RiskControlLibraryType }
     * 
     * 
     */
    public List<RiskControlLibraryType> getRiskControlLibrary() {
        if (riskControlLibrary == null) {
            riskControlLibrary = new ArrayList<RiskControlLibraryType>();
        }
        return this.riskControlLibrary;
    }

}
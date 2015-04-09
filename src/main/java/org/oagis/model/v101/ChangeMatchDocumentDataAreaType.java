//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 04:20:09 PM CST 
//


package org.oagis.model.v101;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChangeMatchDocumentDataAreaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeMatchDocumentDataAreaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Change" type="{http://www.openapplications.org/oagis/10}ProcessType"/>
 *         &lt;element name="MatchDocument" type="{http://www.openapplications.org/oagis/10}MatchDocumentType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeMatchDocumentDataAreaType", propOrder = {
    "change",
    "matchDocument"
})
public class ChangeMatchDocumentDataAreaType {

    @XmlElement(name = "Change", required = true)
    protected ProcessType change;
    @XmlElement(name = "MatchDocument", required = true)
    protected List<MatchDocumentType> matchDocument;

    /**
     * Gets the value of the change property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessType }
     *     
     */
    public ProcessType getChange() {
        return change;
    }

    /**
     * Sets the value of the change property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessType }
     *     
     */
    public void setChange(ProcessType value) {
        this.change = value;
    }

    /**
     * Gets the value of the matchDocument property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the matchDocument property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMatchDocument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MatchDocumentType }
     * 
     * 
     */
    public List<MatchDocumentType> getMatchDocument() {
        if (matchDocument == null) {
            matchDocument = new ArrayList<MatchDocumentType>();
        }
        return this.matchDocument;
    }

}

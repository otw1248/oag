//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 04:39:16 PM CST 
//


package org.oagis.model.v101;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PostAcknowledgeProjectAccountingDataAreaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PostAcknowledgeProjectAccountingDataAreaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PostAcknowledge" type="{http://www.openapplications.org/oagis/10}AcknowledgeType"/>
 *         &lt;element name="ProjectAccounting" type="{http://www.openapplications.org/oagis/10}ProjectAccountingType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostAcknowledgeProjectAccountingDataAreaType", propOrder = {
    "postAcknowledge",
    "projectAccounting"
})
public class PostAcknowledgeProjectAccountingDataAreaType {

    @XmlElement(name = "PostAcknowledge", required = true)
    protected AcknowledgeType postAcknowledge;
    @XmlElement(name = "ProjectAccounting", required = true)
    protected List<ProjectAccountingType> projectAccounting;

    /**
     * Gets the value of the postAcknowledge property.
     * 
     * @return
     *     possible object is
     *     {@link AcknowledgeType }
     *     
     */
    public AcknowledgeType getPostAcknowledge() {
        return postAcknowledge;
    }

    /**
     * Sets the value of the postAcknowledge property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcknowledgeType }
     *     
     */
    public void setPostAcknowledge(AcknowledgeType value) {
        this.postAcknowledge = value;
    }

    /**
     * Gets the value of the projectAccounting property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the projectAccounting property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProjectAccounting().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProjectAccountingType }
     * 
     * 
     */
    public List<ProjectAccountingType> getProjectAccounting() {
        if (projectAccounting == null) {
            projectAccounting = new ArrayList<ProjectAccountingType>();
        }
        return this.projectAccounting;
    }

}

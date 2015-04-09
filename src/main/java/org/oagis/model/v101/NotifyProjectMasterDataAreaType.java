//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 04:36:26 PM CST 
//


package org.oagis.model.v101;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotifyProjectMasterDataAreaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotifyProjectMasterDataAreaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Notify" type="{http://www.openapplications.org/oagis/10}NotifyType"/>
 *         &lt;element name="ProjectMaster" type="{http://www.openapplications.org/oagis/10}ProjectMasterType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotifyProjectMasterDataAreaType", propOrder = {
    "notify",
    "projectMaster"
})
public class NotifyProjectMasterDataAreaType {

    @XmlElement(name = "Notify", required = true)
    protected NotifyType notify;
    @XmlElement(name = "ProjectMaster", required = true)
    protected List<ProjectMasterType> projectMaster;

    /**
     * Gets the value of the notify property.
     * 
     * @return
     *     possible object is
     *     {@link NotifyType }
     *     
     */
    public NotifyType getNotify() {
        return notify;
    }

    /**
     * Sets the value of the notify property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotifyType }
     *     
     */
    public void setNotify(NotifyType value) {
        this.notify = value;
    }

    /**
     * Gets the value of the projectMaster property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the projectMaster property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProjectMaster().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProjectMasterType }
     * 
     * 
     */
    public List<ProjectMasterType> getProjectMaster() {
        if (projectMaster == null) {
            projectMaster = new ArrayList<ProjectMasterType>();
        }
        return this.projectMaster;
    }

}

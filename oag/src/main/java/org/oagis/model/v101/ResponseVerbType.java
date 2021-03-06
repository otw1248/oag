//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 05:03:30 PM CST 
//


package org.oagis.model.v101;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseVerbType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseVerbType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}VerbType">
 *       &lt;sequence>
 *         &lt;element name="OriginalApplicationArea" type="{http://www.openapplications.org/oagis/10}ApplicationAreaType" minOccurs="0"/>
 *         &lt;element name="ResponseCriteria" type="{http://www.openapplications.org/oagis/10}ResponseActionCriteriaType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseVerbType", propOrder = {
    "originalApplicationArea",
    "responseCriteria"
})
@XmlSeeAlso({
    RespondType.class
})
public abstract class ResponseVerbType
    extends VerbType
{

    @XmlElement(name = "OriginalApplicationArea")
    protected ApplicationAreaType originalApplicationArea;
    @XmlElement(name = "ResponseCriteria")
    protected List<ResponseActionCriteriaType> responseCriteria;

    /**
     * Gets the value of the originalApplicationArea property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationAreaType }
     *     
     */
    public ApplicationAreaType getOriginalApplicationArea() {
        return originalApplicationArea;
    }

    /**
     * Sets the value of the originalApplicationArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationAreaType }
     *     
     */
    public void setOriginalApplicationArea(ApplicationAreaType value) {
        this.originalApplicationArea = value;
    }

    /**
     * Gets the value of the responseCriteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the responseCriteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResponseCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResponseActionCriteriaType }
     * 
     * 
     */
    public List<ResponseActionCriteriaType> getResponseCriteria() {
        if (responseCriteria == null) {
            responseCriteria = new ArrayList<ResponseActionCriteriaType>();
        }
        return this.responseCriteria;
    }

}

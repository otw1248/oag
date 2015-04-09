//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 04:59:34 PM CST 
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
 * The type that represents grouping of results from a specific test or analysis
 * 
 * <p>Java class for ResultsBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResultsBaseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}IdentificationType">
 *       &lt;sequence>
 *         &lt;element name="ResultName" type="{http://www.openapplications.org/oagis/10}NameType" minOccurs="0"/>
 *         &lt;element name="Qualitative" type="{http://www.openapplications.org/oagis/10}QualitativeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Quantitative" type="{http://www.openapplications.org/oagis/10}QuantitativeType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultsBaseType", propOrder = {
    "resultName",
    "qualitative",
    "quantitative"
})
@XmlSeeAlso({
    ResultsType.class
})
public class ResultsBaseType
    extends IdentificationType
{

    @XmlElement(name = "ResultName")
    protected NameType resultName;
    @XmlElement(name = "Qualitative")
    protected List<QualitativeType> qualitative;
    @XmlElement(name = "Quantitative")
    protected List<QuantitativeType> quantitative;

    /**
     * Gets the value of the resultName property.
     * 
     * @return
     *     possible object is
     *     {@link NameType }
     *     
     */
    public NameType getResultName() {
        return resultName;
    }

    /**
     * Sets the value of the resultName property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameType }
     *     
     */
    public void setResultName(NameType value) {
        this.resultName = value;
    }

    /**
     * Gets the value of the qualitative property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the qualitative property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQualitative().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QualitativeType }
     * 
     * 
     */
    public List<QualitativeType> getQualitative() {
        if (qualitative == null) {
            qualitative = new ArrayList<QualitativeType>();
        }
        return this.qualitative;
    }

    /**
     * Gets the value of the quantitative property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quantitative property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuantitative().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuantitativeType }
     * 
     * 
     */
    public List<QuantitativeType> getQuantitative() {
        if (quantitative == null) {
            quantitative = new ArrayList<QuantitativeType>();
        }
        return this.quantitative;
    }

}

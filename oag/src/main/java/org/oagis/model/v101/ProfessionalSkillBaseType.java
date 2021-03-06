//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 05:04:55 PM CST 
//


package org.oagis.model.v101;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Professional Skill Type for identifying a skill
 * 
 * <p>Java class for ProfessionalSkillBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProfessionalSkillBaseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}IdentificationType">
 *       &lt;sequence>
 *         &lt;element name="Code" type="{http://www.openapplications.org/oagis/10}OpenCodeType" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.openapplications.org/oagis/10}OpenNameType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CompetencyCode" type="{http://www.openapplications.org/oagis/10}CodeType" minOccurs="0"/>
 *         &lt;element name="LastUsedDateTime" type="{http://www.openapplications.org/oagis/10}DateTimeType" minOccurs="0"/>
 *         &lt;element name="TrainingDateTime" type="{http://www.openapplications.org/oagis/10}DateTimeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EffectiveTimePeriod" type="{http://www.openapplications.org/oagis/10}TimePeriodType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProfessionalSkillBaseType", propOrder = {
    "code",
    "name",
    "competencyCode",
    "lastUsedDateTime",
    "trainingDateTime",
    "effectiveTimePeriod"
})
@XmlSeeAlso({
    ProfessionalSkillType.class
})
public class ProfessionalSkillBaseType
    extends IdentificationType
{

    @XmlElement(name = "Code")
    protected OpenCodeType code;
    @XmlElement(name = "Name")
    protected List<OpenNameType> name;
    @XmlElement(name = "CompetencyCode")
    protected CodeType competencyCode;
    @XmlElement(name = "LastUsedDateTime")
    @XmlSchemaType(name = "anySimpleType")
    protected String lastUsedDateTime;
    @XmlElement(name = "TrainingDateTime")
    @XmlSchemaType(name = "anySimpleType")
    protected List<String> trainingDateTime;
    @XmlElement(name = "EffectiveTimePeriod")
    protected TimePeriodType effectiveTimePeriod;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link OpenCodeType }
     *     
     */
    public OpenCodeType getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenCodeType }
     *     
     */
    public void setCode(OpenCodeType value) {
        this.code = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the name property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpenNameType }
     * 
     * 
     */
    public List<OpenNameType> getName() {
        if (name == null) {
            name = new ArrayList<OpenNameType>();
        }
        return this.name;
    }

    /**
     * Gets the value of the competencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getCompetencyCode() {
        return competencyCode;
    }

    /**
     * Sets the value of the competencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setCompetencyCode(CodeType value) {
        this.competencyCode = value;
    }

    /**
     * Gets the value of the lastUsedDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastUsedDateTime() {
        return lastUsedDateTime;
    }

    /**
     * Sets the value of the lastUsedDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastUsedDateTime(String value) {
        this.lastUsedDateTime = value;
    }

    /**
     * Gets the value of the trainingDateTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trainingDateTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrainingDateTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTrainingDateTime() {
        if (trainingDateTime == null) {
            trainingDateTime = new ArrayList<String>();
        }
        return this.trainingDateTime;
    }

    /**
     * Gets the value of the effectiveTimePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodType }
     *     
     */
    public TimePeriodType getEffectiveTimePeriod() {
        return effectiveTimePeriod;
    }

    /**
     * Sets the value of the effectiveTimePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodType }
     *     
     */
    public void setEffectiveTimePeriod(TimePeriodType value) {
        this.effectiveTimePeriod = value;
    }

}

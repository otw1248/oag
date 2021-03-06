//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 05:04:55 PM CST 
//


package org.oagis.model.v101;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExportControlBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExportControlBaseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}IdentificationType">
 *       &lt;sequence>
 *         &lt;element name="Code" type="{http://www.openapplications.org/oagis/10}OpenCodeType" minOccurs="0"/>
 *         &lt;element name="CountryCode" type="{http://www.openapplications.org/oagis/10}CountryCodeType" minOccurs="0"/>
 *         &lt;element name="RegionCode" type="{http://www.openapplications.org/oagis/10}CodeType" minOccurs="0"/>
 *         &lt;element name="EncryptionStatusCode" type="{http://www.openapplications.org/oagis/10}CodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExportControlBaseType", propOrder = {
    "code",
    "countryCode",
    "regionCode",
    "encryptionStatusCode"
})
@XmlSeeAlso({
    ExportControlType.class
})
public class ExportControlBaseType
    extends IdentificationType
{

    @XmlElement(name = "Code")
    protected OpenCodeType code;
    @XmlElement(name = "CountryCode")
    protected CountryCodeType countryCode;
    @XmlElement(name = "RegionCode")
    protected CodeType regionCode;
    @XmlElement(name = "EncryptionStatusCode")
    protected CodeType encryptionStatusCode;

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
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link CountryCodeType }
     *     
     */
    public CountryCodeType getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryCodeType }
     *     
     */
    public void setCountryCode(CountryCodeType value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the regionCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getRegionCode() {
        return regionCode;
    }

    /**
     * Sets the value of the regionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setRegionCode(CodeType value) {
        this.regionCode = value;
    }

    /**
     * Gets the value of the encryptionStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getEncryptionStatusCode() {
        return encryptionStatusCode;
    }

    /**
     * Sets the value of the encryptionStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setEncryptionStatusCode(CodeType value) {
        this.encryptionStatusCode = value;
    }

}

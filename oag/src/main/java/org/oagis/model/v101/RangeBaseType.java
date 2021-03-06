//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 05:04:55 PM CST 
//


package org.oagis.model.v101;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RangeBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RangeBaseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}IdentificationType">
 *       &lt;sequence>
 *         &lt;element name="InclusiveIndicator" type="{http://www.openapplications.org/oagis/10}IndicatorType" minOccurs="0"/>
 *         &lt;element name="StartID" type="{http://www.openapplications.org/oagis/10}IDType" minOccurs="0"/>
 *         &lt;element name="RangeCountNumber" type="{http://www.openapplications.org/oagis/10}PositiveIntegerNumberType" minOccurs="0"/>
 *         &lt;element name="EndID" type="{http://www.openapplications.org/oagis/10}IDType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RangeBaseType", propOrder = {
    "inclusiveIndicator",
    "startID",
    "rangeCountNumber",
    "endID"
})
@XmlSeeAlso({
    RangeType.class
})
public class RangeBaseType
    extends IdentificationType
{

    @XmlElement(name = "InclusiveIndicator")
    protected Boolean inclusiveIndicator;
    @XmlElement(name = "StartID")
    protected IDType startID;
    @XmlElement(name = "RangeCountNumber")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger rangeCountNumber;
    @XmlElement(name = "EndID")
    protected IDType endID;

    /**
     * Gets the value of the inclusiveIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInclusiveIndicator() {
        return inclusiveIndicator;
    }

    /**
     * Sets the value of the inclusiveIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInclusiveIndicator(Boolean value) {
        this.inclusiveIndicator = value;
    }

    /**
     * Gets the value of the startID property.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getStartID() {
        return startID;
    }

    /**
     * Sets the value of the startID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setStartID(IDType value) {
        this.startID = value;
    }

    /**
     * Gets the value of the rangeCountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRangeCountNumber() {
        return rangeCountNumber;
    }

    /**
     * Sets the value of the rangeCountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRangeCountNumber(BigInteger value) {
        this.rangeCountNumber = value;
    }

    /**
     * Gets the value of the endID property.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getEndID() {
        return endID;
    }

    /**
     * Sets the value of the endID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setEndID(IDType value) {
        this.endID = value;
    }

}

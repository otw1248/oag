//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 04:58:00 PM CST 
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
 * <p>Java class for AttachedSoftwareBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AttachedSoftwareBaseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}IdentificationType">
 *       &lt;sequence>
 *         &lt;element name="ItemInstance" type="{http://www.openapplications.org/oagis/10}ItemInstanceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DiscountAllowancePricing" type="{http://www.openapplications.org/oagis/10}DiscountAllowancePricingType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Effectivity" type="{http://www.openapplications.org/oagis/10}EffectivityType" minOccurs="0"/>
 *         &lt;element name="SoftwareElements" type="{http://www.openapplications.org/oagis/10}SoftwareElementsType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttachedSoftwareBaseType", propOrder = {
    "itemInstance",
    "discountAllowancePricing",
    "effectivity",
    "softwareElements"
})
@XmlSeeAlso({
    AttachedSoftwareType.class
})
public class AttachedSoftwareBaseType
    extends IdentificationType
{

    @XmlElement(name = "ItemInstance")
    protected List<ItemInstanceType> itemInstance;
    @XmlElement(name = "DiscountAllowancePricing")
    protected List<DiscountAllowancePricingType> discountAllowancePricing;
    @XmlElement(name = "Effectivity")
    protected EffectivityType effectivity;
    @XmlElement(name = "SoftwareElements")
    protected List<SoftwareElementsType> softwareElements;

    /**
     * Gets the value of the itemInstance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemInstance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemInstance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemInstanceType }
     * 
     * 
     */
    public List<ItemInstanceType> getItemInstance() {
        if (itemInstance == null) {
            itemInstance = new ArrayList<ItemInstanceType>();
        }
        return this.itemInstance;
    }

    /**
     * Gets the value of the discountAllowancePricing property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the discountAllowancePricing property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiscountAllowancePricing().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DiscountAllowancePricingType }
     * 
     * 
     */
    public List<DiscountAllowancePricingType> getDiscountAllowancePricing() {
        if (discountAllowancePricing == null) {
            discountAllowancePricing = new ArrayList<DiscountAllowancePricingType>();
        }
        return this.discountAllowancePricing;
    }

    /**
     * Gets the value of the effectivity property.
     * 
     * @return
     *     possible object is
     *     {@link EffectivityType }
     *     
     */
    public EffectivityType getEffectivity() {
        return effectivity;
    }

    /**
     * Sets the value of the effectivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link EffectivityType }
     *     
     */
    public void setEffectivity(EffectivityType value) {
        this.effectivity = value;
    }

    /**
     * Gets the value of the softwareElements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the softwareElements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSoftwareElements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SoftwareElementsType }
     * 
     * 
     */
    public List<SoftwareElementsType> getSoftwareElements() {
        if (softwareElements == null) {
            softwareElements = new ArrayList<SoftwareElementsType>();
        }
        return this.softwareElements;
    }

}

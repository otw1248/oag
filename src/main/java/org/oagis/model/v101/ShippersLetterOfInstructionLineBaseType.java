//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 05:04:23 PM CST 
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
 * Shippers Letter of Instruction Line Base Type for detailing the minimum details of the individual components of a shippers letter of instruction Noun
 * 
 * <p>Java class for ShippersLetterOfInstructionLineBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShippersLetterOfInstructionLineBaseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}StatusLineBaseType">
 *       &lt;sequence>
 *         &lt;element name="ExportLicense" type="{http://www.openapplications.org/oagis/10}ExportLicenseType" minOccurs="0"/>
 *         &lt;element name="DeclaredValueAmount" type="{http://www.openapplications.org/oagis/10}AmountType" minOccurs="0"/>
 *         &lt;element name="HarmonizedTariffScheduleCode" type="{http://www.openapplications.org/oagis/10}HarmonizedTariffScheduleCodeType" minOccurs="0"/>
 *         &lt;element name="ItemInstance" type="{http://www.openapplications.org/oagis/10}ItemInstanceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Quantity" type="{http://www.openapplications.org/oagis/10}OpenQuantityType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShippersLetterOfInstructionLineBaseType", propOrder = {
    "exportLicense",
    "declaredValueAmount",
    "harmonizedTariffScheduleCode",
    "itemInstance",
    "quantity"
})
@XmlSeeAlso({
    ShippersLetterOfInstructionLineType.class
})
public class ShippersLetterOfInstructionLineBaseType
    extends StatusLineBaseType
{

    @XmlElement(name = "ExportLicense")
    protected ExportLicenseType exportLicense;
    @XmlElement(name = "DeclaredValueAmount")
    protected AmountType declaredValueAmount;
    @XmlElement(name = "HarmonizedTariffScheduleCode")
    protected HarmonizedTariffScheduleCodeType harmonizedTariffScheduleCode;
    @XmlElement(name = "ItemInstance")
    protected List<ItemInstanceType> itemInstance;
    @XmlElement(name = "Quantity")
    protected List<OpenQuantityType> quantity;

    /**
     * Gets the value of the exportLicense property.
     * 
     * @return
     *     possible object is
     *     {@link ExportLicenseType }
     *     
     */
    public ExportLicenseType getExportLicense() {
        return exportLicense;
    }

    /**
     * Sets the value of the exportLicense property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportLicenseType }
     *     
     */
    public void setExportLicense(ExportLicenseType value) {
        this.exportLicense = value;
    }

    /**
     * Gets the value of the declaredValueAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getDeclaredValueAmount() {
        return declaredValueAmount;
    }

    /**
     * Sets the value of the declaredValueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setDeclaredValueAmount(AmountType value) {
        this.declaredValueAmount = value;
    }

    /**
     * Gets the value of the harmonizedTariffScheduleCode property.
     * 
     * @return
     *     possible object is
     *     {@link HarmonizedTariffScheduleCodeType }
     *     
     */
    public HarmonizedTariffScheduleCodeType getHarmonizedTariffScheduleCode() {
        return harmonizedTariffScheduleCode;
    }

    /**
     * Sets the value of the harmonizedTariffScheduleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link HarmonizedTariffScheduleCodeType }
     *     
     */
    public void setHarmonizedTariffScheduleCode(HarmonizedTariffScheduleCodeType value) {
        this.harmonizedTariffScheduleCode = value;
    }

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
     * Gets the value of the quantity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quantity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuantity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpenQuantityType }
     * 
     * 
     */
    public List<OpenQuantityType> getQuantity() {
        if (quantity == null) {
            quantity = new ArrayList<OpenQuantityType>();
        }
        return this.quantity;
    }

}

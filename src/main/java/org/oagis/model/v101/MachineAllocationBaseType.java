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
 * Machine Allocation Type for detailing the division and assignment of expenses and income from Machine use
 * 
 * <p>Java class for MachineAllocationBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MachineAllocationBaseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}IdentificationType">
 *       &lt;sequence>
 *         &lt;element name="Machine" type="{http://www.openapplications.org/oagis/10}MachineType" minOccurs="0"/>
 *         &lt;group ref="{http://www.openapplications.org/oagis/10}ResourceAllocationGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MachineAllocationBaseType", propOrder = {
    "machine",
    "unitCost",
    "requiredQuantity",
    "quantity",
    "requiredDuration",
    "totalCostAmount"
})
@XmlSeeAlso({
    MachineAllocationType.class
})
public class MachineAllocationBaseType
    extends IdentificationType
{

    @XmlElement(name = "Machine")
    protected MachineType machine;
    @XmlElement(name = "UnitCost")
    protected PriceType unitCost;
    @XmlElement(name = "RequiredQuantity")
    protected QuantityType requiredQuantity;
    @XmlElement(name = "Quantity")
    protected List<OpenQuantityType> quantity;
    @XmlElement(name = "RequiredDuration")
    @XmlSchemaType(name = "anySimpleType")
    protected String requiredDuration;
    @XmlElement(name = "TotalCostAmount")
    protected AmountType totalCostAmount;

    /**
     * Gets the value of the machine property.
     * 
     * @return
     *     possible object is
     *     {@link MachineType }
     *     
     */
    public MachineType getMachine() {
        return machine;
    }

    /**
     * Sets the value of the machine property.
     * 
     * @param value
     *     allowed object is
     *     {@link MachineType }
     *     
     */
    public void setMachine(MachineType value) {
        this.machine = value;
    }

    /**
     * Gets the value of the unitCost property.
     * 
     * @return
     *     possible object is
     *     {@link PriceType }
     *     
     */
    public PriceType getUnitCost() {
        return unitCost;
    }

    /**
     * Sets the value of the unitCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceType }
     *     
     */
    public void setUnitCost(PriceType value) {
        this.unitCost = value;
    }

    /**
     * Gets the value of the requiredQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityType }
     *     
     */
    public QuantityType getRequiredQuantity() {
        return requiredQuantity;
    }

    /**
     * Sets the value of the requiredQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType }
     *     
     */
    public void setRequiredQuantity(QuantityType value) {
        this.requiredQuantity = value;
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

    /**
     * Gets the value of the requiredDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequiredDuration() {
        return requiredDuration;
    }

    /**
     * Sets the value of the requiredDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequiredDuration(String value) {
        this.requiredDuration = value;
    }

    /**
     * Gets the value of the totalCostAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalCostAmount() {
        return totalCostAmount;
    }

    /**
     * Sets the value of the totalCostAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalCostAmount(AmountType value) {
        this.totalCostAmount = value;
    }

}

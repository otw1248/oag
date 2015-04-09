//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 04:59:04 PM CST 
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
 * <p>Java class for HazardousMaterialShipmentLineBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HazardousMaterialShipmentLineBaseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}StatusLineBaseType">
 *       &lt;sequence>
 *         &lt;element name="ContainsHazardousMaterialIndicator" type="{http://www.openapplications.org/oagis/10}IndicatorType" minOccurs="0"/>
 *         &lt;element name="HazardousMaterialCodes" type="{http://www.openapplications.org/oagis/10}CodesType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Item" type="{http://www.openapplications.org/oagis/10}ItemType" minOccurs="0"/>
 *         &lt;element name="ItemInstance" type="{http://www.openapplications.org/oagis/10}ItemInstanceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CountryOfOriginCode" type="{http://www.openapplications.org/oagis/10}CountryCodeType" minOccurs="0"/>
 *         &lt;element name="HazardousMaterialShipmentContainer" type="{http://www.openapplications.org/oagis/10}HazardousMaterialShipmentContainerType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "HazardousMaterialShipmentLineBaseType", propOrder = {
    "containsHazardousMaterialIndicator",
    "hazardousMaterialCodes",
    "item",
    "itemInstance",
    "countryOfOriginCode",
    "hazardousMaterialShipmentContainer",
    "quantity"
})
@XmlSeeAlso({
    HazardousMaterialShipmentDocumentLineType.class
})
public class HazardousMaterialShipmentLineBaseType
    extends StatusLineBaseType
{

    @XmlElement(name = "ContainsHazardousMaterialIndicator")
    protected Boolean containsHazardousMaterialIndicator;
    @XmlElement(name = "HazardousMaterialCodes")
    protected List<CodesType> hazardousMaterialCodes;
    @XmlElement(name = "Item")
    protected ItemType item;
    @XmlElement(name = "ItemInstance")
    protected List<ItemInstanceType> itemInstance;
    @XmlElement(name = "CountryOfOriginCode")
    protected CountryCodeType countryOfOriginCode;
    @XmlElement(name = "HazardousMaterialShipmentContainer")
    protected List<HazardousMaterialShipmentContainerType> hazardousMaterialShipmentContainer;
    @XmlElement(name = "Quantity")
    protected List<OpenQuantityType> quantity;

    /**
     * Gets the value of the containsHazardousMaterialIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isContainsHazardousMaterialIndicator() {
        return containsHazardousMaterialIndicator;
    }

    /**
     * Sets the value of the containsHazardousMaterialIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContainsHazardousMaterialIndicator(Boolean value) {
        this.containsHazardousMaterialIndicator = value;
    }

    /**
     * Gets the value of the hazardousMaterialCodes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hazardousMaterialCodes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHazardousMaterialCodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodesType }
     * 
     * 
     */
    public List<CodesType> getHazardousMaterialCodes() {
        if (hazardousMaterialCodes == null) {
            hazardousMaterialCodes = new ArrayList<CodesType>();
        }
        return this.hazardousMaterialCodes;
    }

    /**
     * Gets the value of the item property.
     * 
     * @return
     *     possible object is
     *     {@link ItemType }
     *     
     */
    public ItemType getItem() {
        return item;
    }

    /**
     * Sets the value of the item property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemType }
     *     
     */
    public void setItem(ItemType value) {
        this.item = value;
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
     * Gets the value of the countryOfOriginCode property.
     * 
     * @return
     *     possible object is
     *     {@link CountryCodeType }
     *     
     */
    public CountryCodeType getCountryOfOriginCode() {
        return countryOfOriginCode;
    }

    /**
     * Sets the value of the countryOfOriginCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryCodeType }
     *     
     */
    public void setCountryOfOriginCode(CountryCodeType value) {
        this.countryOfOriginCode = value;
    }

    /**
     * Gets the value of the hazardousMaterialShipmentContainer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hazardousMaterialShipmentContainer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHazardousMaterialShipmentContainer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HazardousMaterialShipmentContainerType }
     * 
     * 
     */
    public List<HazardousMaterialShipmentContainerType> getHazardousMaterialShipmentContainer() {
        if (hazardousMaterialShipmentContainer == null) {
            hazardousMaterialShipmentContainer = new ArrayList<HazardousMaterialShipmentContainerType>();
        }
        return this.hazardousMaterialShipmentContainer;
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
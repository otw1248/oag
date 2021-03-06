//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 04:58:05 PM CST 
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
 * <p>Java class for ShopFloorControlResourceBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShopFloorControlResourceBaseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}ShopFloorControlBaseResourceBaseType">
 *       &lt;sequence>
 *         &lt;element name="ShopFloorControlActivity" type="{http://www.openapplications.org/oagis/10}ShopFloorControlActivityType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShopFloorControlResourceBaseType", propOrder = {
    "shopFloorControlActivity"
})
@XmlSeeAlso({
    ShopFloorControlResourceType.class,
    ShopFloorControlActivityType.class
})
public class ShopFloorControlResourceBaseType
    extends ShopFloorControlBaseResourceBaseType
{

    @XmlElement(name = "ShopFloorControlActivity")
    protected List<ShopFloorControlActivityType> shopFloorControlActivity;

    /**
     * Gets the value of the shopFloorControlActivity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shopFloorControlActivity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShopFloorControlActivity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShopFloorControlActivityType }
     * 
     * 
     */
    public List<ShopFloorControlActivityType> getShopFloorControlActivity() {
        if (shopFloorControlActivity == null) {
            shopFloorControlActivity = new ArrayList<ShopFloorControlActivityType>();
        }
        return this.shopFloorControlActivity;
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 05:02:09 PM CST 
//


package org.oagis.model.v101;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequisitionLineType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequisitionLineType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}RequisitionLineBaseType">
 *       &lt;sequence>
 *         &lt;element name="RequisitionSubLine" type="{http://www.openapplications.org/oagis/10}RequisitionSubLineType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Extension" type="{http://www.openapplications.org/oagis/10}RequisitionLineExtensionType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequisitionLineType", propOrder = {
    "requisitionSubLine",
    "extension"
})
public class RequisitionLineType
    extends RequisitionLineBaseType
{

    @XmlElement(name = "RequisitionSubLine")
    protected List<RequisitionSubLineType> requisitionSubLine;
    @XmlElement(name = "Extension")
    protected List<RequisitionLineExtensionType> extension;

    /**
     * Gets the value of the requisitionSubLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requisitionSubLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequisitionSubLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequisitionSubLineType }
     * 
     * 
     */
    public List<RequisitionSubLineType> getRequisitionSubLine() {
        if (requisitionSubLine == null) {
            requisitionSubLine = new ArrayList<RequisitionSubLineType>();
        }
        return this.requisitionSubLine;
    }

    /**
     * Gets the value of the extension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequisitionLineExtensionType }
     * 
     * 
     */
    public List<RequisitionLineExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<RequisitionLineExtensionType>();
        }
        return this.extension;
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 04:56:25 PM CST 
//


package org.oagis.model.v101;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Allows the adding of new requirements and the modification of previously established requirements through various Sync Indicator values.
 * Customers can use PlanningSchedule to communicate demand requirement in three different ways.  It can be as specific as the Item level or at the Commodity code level, which is higher than item.  Furthermore, it can be required simply by functional specification via feature identifiers and values using the optional Data Type FeatureValueData.
 * 
 * <p>Java class for SyncPlanningScheduleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SyncPlanningScheduleType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}BusinessObjectDocumentType">
 *       &lt;sequence>
 *         &lt;element name="DataArea" type="{http://www.openapplications.org/oagis/10}SyncPlanningScheduleDataAreaType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SyncPlanningScheduleType", propOrder = {
    "dataArea"
})
public class SyncPlanningScheduleType
    extends BusinessObjectDocumentType
{

    @XmlElement(name = "DataArea", required = true)
    protected SyncPlanningScheduleDataAreaType dataArea;

    /**
     * Gets the value of the dataArea property.
     * 
     * @return
     *     possible object is
     *     {@link SyncPlanningScheduleDataAreaType }
     *     
     */
    public SyncPlanningScheduleDataAreaType getDataArea() {
        return dataArea;
    }

    /**
     * Sets the value of the dataArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link SyncPlanningScheduleDataAreaType }
     *     
     */
    public void setDataArea(SyncPlanningScheduleDataAreaType value) {
        this.dataArea = value;
    }

}

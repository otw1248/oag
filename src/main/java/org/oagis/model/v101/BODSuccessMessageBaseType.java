//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 04:23:50 PM CST 
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
 * <p>Java class for BODSuccessMessageBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BODSuccessMessageBaseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}IdentificationType">
 *       &lt;sequence>
 *         &lt;element name="NounInstanceID" type="{http://www.openapplications.org/oagis/10}IDType" minOccurs="0"/>
 *         &lt;element name="ProcessingResultCode" type="{http://www.openapplications.org/oagis/10}CodeType" minOccurs="0"/>
 *         &lt;element name="TrackingID" type="{http://www.openapplications.org/oagis/10}IDType" minOccurs="0"/>
 *         &lt;element name="SourceLocationExpression" type="{http://www.openapplications.org/oagis/10}ExpressionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ProcessMessage" type="{http://www.openapplications.org/oagis/10}MessageType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="WarningProcessMessage" type="{http://www.openapplications.org/oagis/10}MessageType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="NounSuccessMessage" type="{http://www.openapplications.org/oagis/10}SuccessMessageType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BODSuccessMessageBaseType", propOrder = {
    "nounInstanceID",
    "processingResultCode",
    "trackingID",
    "sourceLocationExpression",
    "processMessage",
    "warningProcessMessage",
    "nounSuccessMessage"
})
@XmlSeeAlso({
    BODSuccessMessageType.class
})
public class BODSuccessMessageBaseType
    extends IdentificationType
{

    @XmlElement(name = "NounInstanceID")
    protected IDType nounInstanceID;
    @XmlElement(name = "ProcessingResultCode")
    protected CodeType processingResultCode;
    @XmlElement(name = "TrackingID")
    protected IDType trackingID;
    @XmlElement(name = "SourceLocationExpression")
    protected List<ExpressionType> sourceLocationExpression;
    @XmlElement(name = "ProcessMessage")
    protected List<MessageType> processMessage;
    @XmlElement(name = "WarningProcessMessage")
    protected List<MessageType> warningProcessMessage;
    @XmlElement(name = "NounSuccessMessage")
    protected List<SuccessMessageType> nounSuccessMessage;

    /**
     * Gets the value of the nounInstanceID property.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getNounInstanceID() {
        return nounInstanceID;
    }

    /**
     * Sets the value of the nounInstanceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setNounInstanceID(IDType value) {
        this.nounInstanceID = value;
    }

    /**
     * Gets the value of the processingResultCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getProcessingResultCode() {
        return processingResultCode;
    }

    /**
     * Sets the value of the processingResultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setProcessingResultCode(CodeType value) {
        this.processingResultCode = value;
    }

    /**
     * Gets the value of the trackingID property.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getTrackingID() {
        return trackingID;
    }

    /**
     * Sets the value of the trackingID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setTrackingID(IDType value) {
        this.trackingID = value;
    }

    /**
     * Gets the value of the sourceLocationExpression property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sourceLocationExpression property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSourceLocationExpression().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExpressionType }
     * 
     * 
     */
    public List<ExpressionType> getSourceLocationExpression() {
        if (sourceLocationExpression == null) {
            sourceLocationExpression = new ArrayList<ExpressionType>();
        }
        return this.sourceLocationExpression;
    }

    /**
     * Gets the value of the processMessage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the processMessage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcessMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MessageType }
     * 
     * 
     */
    public List<MessageType> getProcessMessage() {
        if (processMessage == null) {
            processMessage = new ArrayList<MessageType>();
        }
        return this.processMessage;
    }

    /**
     * Gets the value of the warningProcessMessage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the warningProcessMessage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWarningProcessMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MessageType }
     * 
     * 
     */
    public List<MessageType> getWarningProcessMessage() {
        if (warningProcessMessage == null) {
            warningProcessMessage = new ArrayList<MessageType>();
        }
        return this.warningProcessMessage;
    }

    /**
     * Gets the value of the nounSuccessMessage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nounSuccessMessage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNounSuccessMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SuccessMessageType }
     * 
     * 
     */
    public List<SuccessMessageType> getNounSuccessMessage() {
        if (nounSuccessMessage == null) {
            nounSuccessMessage = new ArrayList<SuccessMessageType>();
        }
        return this.nounSuccessMessage;
    }

}

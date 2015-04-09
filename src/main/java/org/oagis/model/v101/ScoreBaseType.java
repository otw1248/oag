//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 05:00:49 PM CST 
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
 * <p>Java class for ScoreBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScoreBaseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}IdentificationType">
 *       &lt;sequence>
 *         &lt;element name="ScoreValue" type="{http://www.openapplications.org/oagis/10}ScoreValueType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ScoreText" type="{http://www.openapplications.org/oagis/10}TextType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MatchWord" type="{http://www.openapplications.org/oagis/10}TextType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Algorithm" type="{http://www.openapplications.org/oagis/10}TextType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScoreBaseType", propOrder = {
    "scoreValue",
    "scoreText",
    "matchWord",
    "algorithm"
})
@XmlSeeAlso({
    ScoreType.class
})
public class ScoreBaseType
    extends IdentificationType
{

    @XmlElement(name = "ScoreValue")
    protected List<ScoreValueType> scoreValue;
    @XmlElement(name = "ScoreText")
    protected List<TextType> scoreText;
    @XmlElement(name = "MatchWord")
    protected List<TextType> matchWord;
    @XmlElement(name = "Algorithm")
    protected List<TextType> algorithm;

    /**
     * Gets the value of the scoreValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scoreValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScoreValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScoreValueType }
     * 
     * 
     */
    public List<ScoreValueType> getScoreValue() {
        if (scoreValue == null) {
            scoreValue = new ArrayList<ScoreValueType>();
        }
        return this.scoreValue;
    }

    /**
     * Gets the value of the scoreText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scoreText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScoreText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextType }
     * 
     * 
     */
    public List<TextType> getScoreText() {
        if (scoreText == null) {
            scoreText = new ArrayList<TextType>();
        }
        return this.scoreText;
    }

    /**
     * Gets the value of the matchWord property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the matchWord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMatchWord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextType }
     * 
     * 
     */
    public List<TextType> getMatchWord() {
        if (matchWord == null) {
            matchWord = new ArrayList<TextType>();
        }
        return this.matchWord;
    }

    /**
     * Gets the value of the algorithm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the algorithm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlgorithm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextType }
     * 
     * 
     */
    public List<TextType> getAlgorithm() {
        if (algorithm == null) {
            algorithm = new ArrayList<TextType>();
        }
        return this.algorithm;
    }

}

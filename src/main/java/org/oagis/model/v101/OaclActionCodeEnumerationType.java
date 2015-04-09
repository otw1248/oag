//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 05:04:55 PM CST 
//


package org.oagis.model.v101;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for oacl_ActionCodeEnumerationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="oacl_ActionCodeEnumerationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Add"/>
 *     &lt;enumeration value="Change"/>
 *     &lt;enumeration value="Delete"/>
 *     &lt;enumeration value="Replace"/>
 *     &lt;enumeration value="UpSert"/>
 *     &lt;enumeration value="Accepted"/>
 *     &lt;enumeration value="Modified"/>
 *     &lt;enumeration value="Rejected"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "oacl_ActionCodeEnumerationType")
@XmlEnum
public enum OaclActionCodeEnumerationType {

    @XmlEnumValue("Add")
    ADD("Add"),
    @XmlEnumValue("Change")
    CHANGE("Change"),
    @XmlEnumValue("Delete")
    DELETE("Delete"),
    @XmlEnumValue("Replace")
    REPLACE("Replace"),
    @XmlEnumValue("UpSert")
    UP_SERT("UpSert"),
    @XmlEnumValue("Accepted")
    ACCEPTED("Accepted"),
    @XmlEnumValue("Modified")
    MODIFIED("Modified"),
    @XmlEnumValue("Rejected")
    REJECTED("Rejected");
    private final String value;

    OaclActionCodeEnumerationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OaclActionCodeEnumerationType fromValue(String v) {
        for (OaclActionCodeEnumerationType c: OaclActionCodeEnumerationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

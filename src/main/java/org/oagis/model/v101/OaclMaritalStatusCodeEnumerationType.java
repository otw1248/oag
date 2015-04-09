//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 05:00:59 PM CST 
//


package org.oagis.model.v101;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for oacl_MaritalStatusCodeEnumerationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="oacl_MaritalStatusCodeEnumerationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Divorced"/>
 *     &lt;enumeration value="Married"/>
 *     &lt;enumeration value="NeverMarried"/>
 *     &lt;enumeration value="Separated"/>
 *     &lt;enumeration value="SignificantOther"/>
 *     &lt;enumeration value="Widowed"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "oacl_MaritalStatusCodeEnumerationType")
@XmlEnum
public enum OaclMaritalStatusCodeEnumerationType {

    @XmlEnumValue("Divorced")
    DIVORCED("Divorced"),
    @XmlEnumValue("Married")
    MARRIED("Married"),
    @XmlEnumValue("NeverMarried")
    NEVER_MARRIED("NeverMarried"),
    @XmlEnumValue("Separated")
    SEPARATED("Separated"),
    @XmlEnumValue("SignificantOther")
    SIGNIFICANT_OTHER("SignificantOther"),
    @XmlEnumValue("Widowed")
    WIDOWED("Widowed"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    OaclMaritalStatusCodeEnumerationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OaclMaritalStatusCodeEnumerationType fromValue(String v) {
        for (OaclMaritalStatusCodeEnumerationType c: OaclMaritalStatusCodeEnumerationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

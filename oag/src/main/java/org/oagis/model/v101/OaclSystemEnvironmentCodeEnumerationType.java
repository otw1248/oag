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
 * <p>Java class for oacl_SystemEnvironmentCodeEnumerationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="oacl_SystemEnvironmentCodeEnumerationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Production"/>
 *     &lt;enumeration value="Test"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "oacl_SystemEnvironmentCodeEnumerationType")
@XmlEnum
public enum OaclSystemEnvironmentCodeEnumerationType {

    @XmlEnumValue("Production")
    PRODUCTION("Production"),
    @XmlEnumValue("Test")
    TEST("Test");
    private final String value;

    OaclSystemEnvironmentCodeEnumerationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OaclSystemEnvironmentCodeEnumerationType fromValue(String v) {
        for (OaclSystemEnvironmentCodeEnumerationType c: OaclSystemEnvironmentCodeEnumerationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

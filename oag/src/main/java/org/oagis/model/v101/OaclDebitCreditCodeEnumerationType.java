//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 04:51:06 PM CST 
//


package org.oagis.model.v101;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for oacl_DebitCreditCodeEnumerationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="oacl_DebitCreditCodeEnumerationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Debit"/>
 *     &lt;enumeration value="Credit"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "oacl_DebitCreditCodeEnumerationType")
@XmlEnum
public enum OaclDebitCreditCodeEnumerationType {

    @XmlEnumValue("Debit")
    DEBIT("Debit"),
    @XmlEnumValue("Credit")
    CREDIT("Credit");
    private final String value;

    OaclDebitCreditCodeEnumerationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OaclDebitCreditCodeEnumerationType fromValue(String v) {
        for (OaclDebitCreditCodeEnumerationType c: OaclDebitCreditCodeEnumerationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

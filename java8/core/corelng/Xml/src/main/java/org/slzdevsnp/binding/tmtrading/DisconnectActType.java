//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.08.01 at 01:25:50 PM CEST 
//


package org.slzdevsnp.binding.tmtrading;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for disconnectActType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="disconnectActType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NO"/>
 *     &lt;enumeration value="DEACT_USER_ORDRS"/>
 *     &lt;enumeration value="DEACT_ACCT_ORDRS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "disconnectActType")
@XmlEnum
public enum DisconnectActType {

    NO,
    DEACT_USER_ORDRS,
    DEACT_ACCT_ORDRS;

    public String value() {
        return name();
    }

    public static DisconnectActType fromValue(String v) {
        return valueOf(v);
    }

}

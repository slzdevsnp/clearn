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
 * <p>Java class for orderStateType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="orderStateType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="HIBE"/>
 *     &lt;enumeration value="IACT"/>
 *     &lt;enumeration value="ACTI"/>
 *     &lt;enumeration value="UKNW"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "orderStateType")
@XmlEnum
public enum OrderStateType {

    HIBE,
    IACT,
    ACTI,
    UKNW;

    public String value() {
        return name();
    }

    public static OrderStateType fromValue(String v) {
        return valueOf(v);
    }

}

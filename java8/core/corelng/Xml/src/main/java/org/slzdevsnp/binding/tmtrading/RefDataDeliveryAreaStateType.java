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
 * <p>Java class for refDataDeliveryAreaStateType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="refDataDeliveryAreaStateType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACTI"/>
 *     &lt;enumeration value="SUSP"/>
 *     &lt;enumeration value="DELE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "refDataDeliveryAreaStateType")
@XmlEnum
public enum RefDataDeliveryAreaStateType {

    ACTI,
    SUSP,
    DELE;

    public String value() {
        return name();
    }

    public static RefDataDeliveryAreaStateType fromValue(String v) {
        return valueOf(v);
    }

}
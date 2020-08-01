//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.08.01 at 01:25:50 PM CEST 
//


package org.slzdevsnp.binding.tmtrading;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * 
 * Every message will contain a header at the beginning of the message.
 *             
 * 
 * <p>Java class for StandardHeaderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StandardHeaderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="clientData" type="{http://www.deutsche-boerse.com/m7/v6}ClientDataType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="marketId" use="required" type="{http://www.deutsche-boerse.com/m7/v6}stringType255" />
 *       &lt;attribute name="onBehalfUserId" type="{http://www.deutsche-boerse.com/m7/v6}intType" />
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StandardHeaderType", propOrder = {
    "clientData"
})
public class StandardHeaderType {

    protected ClientDataType clientData;
    @XmlAttribute(name = "marketId", required = true)
    protected String marketId;
    @XmlAttribute(name = "onBehalfUserId")
    protected Integer onBehalfUserId;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the clientData property.
     * 
     * @return
     *     possible object is
     *     {@link ClientDataType }
     *     
     */
    public ClientDataType getClientData() {
        return clientData;
    }

    /**
     * Sets the value of the clientData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientDataType }
     *     
     */
    public void setClientData(ClientDataType value) {
        this.clientData = value;
    }

    /**
     * Gets the value of the marketId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketId() {
        return marketId;
    }

    /**
     * Sets the value of the marketId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketId(String value) {
        this.marketId = value;
    }

    /**
     * Gets the value of the onBehalfUserId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOnBehalfUserId() {
        return onBehalfUserId;
    }

    /**
     * Sets the value of the onBehalfUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOnBehalfUserId(Integer value) {
        this.onBehalfUserId = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}

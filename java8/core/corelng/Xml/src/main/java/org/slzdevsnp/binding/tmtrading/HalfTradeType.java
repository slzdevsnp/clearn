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
 * <p>Java class for HalfTradeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HalfTradeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attGroup ref="{http://www.deutsche-boerse.com/m7/v6}tradeSideAttrGrp"/>
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HalfTradeType")
public class HalfTradeType {

    @XmlAttribute(name = "clearingAcctType")
    protected String clearingAcctType;
    @XmlAttribute(name = "dlvryAreaId")
    protected String dlvryAreaId;
    @XmlAttribute(name = "acctId")
    protected String acctId;
    @XmlAttribute(name = "ordrId")
    protected Long ordrId;
    @XmlAttribute(name = "txt")
    protected String txt;
    @XmlAttribute(name = "aggressorIndicator")
    protected String aggressorIndicator;
    @XmlAttribute(name = "usrCode")
    protected String usrCode;
    @XmlAttribute(name = "clOrdrId")
    protected String clOrdrId;
    @XmlAttribute(name = "mbrId")
    protected String mbrId;
    @XmlAttribute(name = "openCloseInd")
    protected String openCloseInd;
    @XmlAttribute(name = "brokerUserId")
    protected Integer brokerUserId;
    @XmlAttribute(name = "clgAcctId")
    protected Integer clgAcctId;
    @XmlAttribute(name = "remoteOrdrId")
    protected Long remoteOrdrId;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the clearingAcctType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClearingAcctType() {
        return clearingAcctType;
    }

    /**
     * Sets the value of the clearingAcctType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClearingAcctType(String value) {
        this.clearingAcctType = value;
    }

    /**
     * Gets the value of the dlvryAreaId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDlvryAreaId() {
        return dlvryAreaId;
    }

    /**
     * Sets the value of the dlvryAreaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDlvryAreaId(String value) {
        this.dlvryAreaId = value;
    }

    /**
     * Gets the value of the acctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctId() {
        return acctId;
    }

    /**
     * Sets the value of the acctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctId(String value) {
        this.acctId = value;
    }

    /**
     * Gets the value of the ordrId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOrdrId() {
        return ordrId;
    }

    /**
     * Sets the value of the ordrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOrdrId(Long value) {
        this.ordrId = value;
    }

    /**
     * Gets the value of the txt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxt() {
        return txt;
    }

    /**
     * Sets the value of the txt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxt(String value) {
        this.txt = value;
    }

    /**
     * Gets the value of the aggressorIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAggressorIndicator() {
        if (aggressorIndicator == null) {
            return "U";
        } else {
            return aggressorIndicator;
        }
    }

    /**
     * Sets the value of the aggressorIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAggressorIndicator(String value) {
        this.aggressorIndicator = value;
    }

    /**
     * Gets the value of the usrCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsrCode() {
        return usrCode;
    }

    /**
     * Sets the value of the usrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsrCode(String value) {
        this.usrCode = value;
    }

    /**
     * Gets the value of the clOrdrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClOrdrId() {
        return clOrdrId;
    }

    /**
     * Sets the value of the clOrdrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClOrdrId(String value) {
        this.clOrdrId = value;
    }

    /**
     * Gets the value of the mbrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMbrId() {
        return mbrId;
    }

    /**
     * Sets the value of the mbrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMbrId(String value) {
        this.mbrId = value;
    }

    /**
     * Gets the value of the openCloseInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpenCloseInd() {
        return openCloseInd;
    }

    /**
     * Sets the value of the openCloseInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpenCloseInd(String value) {
        this.openCloseInd = value;
    }

    /**
     * Gets the value of the brokerUserId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBrokerUserId() {
        return brokerUserId;
    }

    /**
     * Sets the value of the brokerUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBrokerUserId(Integer value) {
        this.brokerUserId = value;
    }

    /**
     * Gets the value of the clgAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getClgAcctId() {
        return clgAcctId;
    }

    /**
     * Sets the value of the clgAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setClgAcctId(Integer value) {
        this.clgAcctId = value;
    }

    /**
     * Gets the value of the remoteOrdrId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRemoteOrdrId() {
        return remoteOrdrId;
    }

    /**
     * Sets the value of the remoteOrdrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRemoteOrdrId(Long value) {
        this.remoteOrdrId = value;
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

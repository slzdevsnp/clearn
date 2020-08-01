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
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * <p>Java class for CashLmtRprtType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CashLmtRprtType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attGroup ref="{http://www.deutsche-boerse.com/m7/v6}CashLmtRprtAttrGrp"/>
 *       &lt;attribute name="lmtId" use="required" type="{http://www.deutsche-boerse.com/m7/v6}longType" />
 *       &lt;attribute name="state" use="required" type="{http://www.deutsche-boerse.com/m7/v6}cashLmtStateUnionType" />
 *       &lt;attribute name="startDate" type="{http://www.deutsche-boerse.com/m7/v6}dateTimeType" />
 *       &lt;attribute name="endDate" type="{http://www.deutsche-boerse.com/m7/v6}dateTimeType" />
 *       &lt;attribute name="externalLmtId" type="{http://www.deutsche-boerse.com/m7/v6}longType" />
 *       &lt;attribute name="externalVersion" type="{http://www.deutsche-boerse.com/m7/v6}longType" />
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashLmtRprtType")
public class CashLmtRprtType {

    @XmlAttribute(name = "lmtId", required = true)
    protected long lmtId;
    @XmlAttribute(name = "state", required = true)
    protected String state;
    @XmlAttribute(name = "startDate")
    protected XMLGregorianCalendar startDate;
    @XmlAttribute(name = "endDate")
    protected XMLGregorianCalendar endDate;
    @XmlAttribute(name = "externalLmtId")
    protected Long externalLmtId;
    @XmlAttribute(name = "externalVersion")
    protected Long externalVersion;
    @XmlAttribute(name = "revisionNo", required = true)
    protected long revisionNo;
    @XmlAttribute(name = "cashLmt", required = true)
    protected long cashLmt;
    @XmlAttribute(name = "decShft", required = true)
    protected int decShft;
    @XmlAttribute(name = "currency")
    protected String currency;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the lmtId property.
     * 
     */
    public long getLmtId() {
        return lmtId;
    }

    /**
     * Sets the value of the lmtId property.
     * 
     */
    public void setLmtId(long value) {
        this.lmtId = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the externalLmtId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getExternalLmtId() {
        return externalLmtId;
    }

    /**
     * Sets the value of the externalLmtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setExternalLmtId(Long value) {
        this.externalLmtId = value;
    }

    /**
     * Gets the value of the externalVersion property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getExternalVersion() {
        return externalVersion;
    }

    /**
     * Sets the value of the externalVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setExternalVersion(Long value) {
        this.externalVersion = value;
    }

    /**
     * Gets the value of the revisionNo property.
     * 
     */
    public long getRevisionNo() {
        return revisionNo;
    }

    /**
     * Sets the value of the revisionNo property.
     * 
     */
    public void setRevisionNo(long value) {
        this.revisionNo = value;
    }

    /**
     * Gets the value of the cashLmt property.
     * 
     */
    public long getCashLmt() {
        return cashLmt;
    }

    /**
     * Sets the value of the cashLmt property.
     * 
     */
    public void setCashLmt(long value) {
        this.cashLmt = value;
    }

    /**
     * Gets the value of the decShft property.
     * 
     */
    public int getDecShft() {
        return decShft;
    }

    /**
     * Sets the value of the decShft property.
     * 
     */
    public void setDecShft(int value) {
        this.decShft = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        if (currency == null) {
            return "EUR";
        } else {
            return currency;
        }
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
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

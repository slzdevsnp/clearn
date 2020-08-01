//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.08.01 at 01:25:50 PM CEST 
//


package org.slzdevsnp.binding.tmtrading;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for tradingScheduleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tradingScheduleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tradingPhases" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="phaseName" type="{http://www.deutsche-boerse.com/m7/v6}stringType255" />
 *                 &lt;attribute name="phaseType" use="required" type="{http://www.deutsche-boerse.com/m7/v6}contractPhaseType" />
 *                 &lt;attribute name="referencePoint" use="required" type="{http://www.deutsche-boerse.com/m7/v6}referencePointType" />
 *                 &lt;attribute name="offset" type="{http://www.w3.org/2001/XMLSchema}duration" />
 *                 &lt;attribute name="fixedTime" type="{http://www.deutsche-boerse.com/m7/v6}dateTimeType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="scheduleId" use="required" type="{http://www.deutsche-boerse.com/m7/v6}longType" />
 *       &lt;attribute name="scheduleName" use="required" type="{http://www.deutsche-boerse.com/m7/v6}stringType255" />
 *       &lt;attribute name="tradingDays" use="required" type="{http://www.deutsche-boerse.com/m7/v6}listOfDays" />
 *       &lt;attribute name="tradeOnHolidays" use="required" type="{http://www.deutsche-boerse.com/m7/v6}boolType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tradingScheduleType", propOrder = {
    "tradingPhases"
})
public class TradingScheduleType {

    @XmlElement(required = true)
    protected List<TradingScheduleType.TradingPhases> tradingPhases;
    @XmlAttribute(name = "scheduleId", required = true)
    protected long scheduleId;
    @XmlAttribute(name = "scheduleName", required = true)
    protected String scheduleName;
    @XmlAttribute(name = "tradingDays", required = true)
    protected List<Weekday> tradingDays;
    @XmlAttribute(name = "tradeOnHolidays", required = true)
    protected boolean tradeOnHolidays;

    /**
     * Gets the value of the tradingPhases property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradingPhases property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradingPhases().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradingScheduleType.TradingPhases }
     * 
     * 
     */
    public List<TradingScheduleType.TradingPhases> getTradingPhases() {
        if (tradingPhases == null) {
            tradingPhases = new ArrayList<TradingScheduleType.TradingPhases>();
        }
        return this.tradingPhases;
    }

    /**
     * Gets the value of the scheduleId property.
     * 
     */
    public long getScheduleId() {
        return scheduleId;
    }

    /**
     * Sets the value of the scheduleId property.
     * 
     */
    public void setScheduleId(long value) {
        this.scheduleId = value;
    }

    /**
     * Gets the value of the scheduleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScheduleName() {
        return scheduleName;
    }

    /**
     * Sets the value of the scheduleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScheduleName(String value) {
        this.scheduleName = value;
    }

    /**
     * Gets the value of the tradingDays property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradingDays property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradingDays().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Weekday }
     * 
     * 
     */
    public List<Weekday> getTradingDays() {
        if (tradingDays == null) {
            tradingDays = new ArrayList<Weekday>();
        }
        return this.tradingDays;
    }

    /**
     * Gets the value of the tradeOnHolidays property.
     * 
     */
    public boolean isTradeOnHolidays() {
        return tradeOnHolidays;
    }

    /**
     * Sets the value of the tradeOnHolidays property.
     * 
     */
    public void setTradeOnHolidays(boolean value) {
        this.tradeOnHolidays = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="phaseName" type="{http://www.deutsche-boerse.com/m7/v6}stringType255" />
     *       &lt;attribute name="phaseType" use="required" type="{http://www.deutsche-boerse.com/m7/v6}contractPhaseType" />
     *       &lt;attribute name="referencePoint" use="required" type="{http://www.deutsche-boerse.com/m7/v6}referencePointType" />
     *       &lt;attribute name="offset" type="{http://www.w3.org/2001/XMLSchema}duration" />
     *       &lt;attribute name="fixedTime" type="{http://www.deutsche-boerse.com/m7/v6}dateTimeType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TradingPhases {

        @XmlAttribute(name = "phaseName")
        protected String phaseName;
        @XmlAttribute(name = "phaseType", required = true)
        protected ContractPhaseType phaseType;
        @XmlAttribute(name = "referencePoint", required = true)
        protected ReferencePointType referencePoint;
        @XmlAttribute(name = "offset")
        protected Duration offset;
        @XmlAttribute(name = "fixedTime")
        protected XMLGregorianCalendar fixedTime;

        /**
         * Gets the value of the phaseName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPhaseName() {
            return phaseName;
        }

        /**
         * Sets the value of the phaseName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPhaseName(String value) {
            this.phaseName = value;
        }

        /**
         * Gets the value of the phaseType property.
         * 
         * @return
         *     possible object is
         *     {@link ContractPhaseType }
         *     
         */
        public ContractPhaseType getPhaseType() {
            return phaseType;
        }

        /**
         * Sets the value of the phaseType property.
         * 
         * @param value
         *     allowed object is
         *     {@link ContractPhaseType }
         *     
         */
        public void setPhaseType(ContractPhaseType value) {
            this.phaseType = value;
        }

        /**
         * Gets the value of the referencePoint property.
         * 
         * @return
         *     possible object is
         *     {@link ReferencePointType }
         *     
         */
        public ReferencePointType getReferencePoint() {
            return referencePoint;
        }

        /**
         * Sets the value of the referencePoint property.
         * 
         * @param value
         *     allowed object is
         *     {@link ReferencePointType }
         *     
         */
        public void setReferencePoint(ReferencePointType value) {
            this.referencePoint = value;
        }

        /**
         * Gets the value of the offset property.
         * 
         * @return
         *     possible object is
         *     {@link Duration }
         *     
         */
        public Duration getOffset() {
            return offset;
        }

        /**
         * Sets the value of the offset property.
         * 
         * @param value
         *     allowed object is
         *     {@link Duration }
         *     
         */
        public void setOffset(Duration value) {
            this.offset = value;
        }

        /**
         * Gets the value of the fixedTime property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getFixedTime() {
            return fixedTime;
        }

        /**
         * Sets the value of the fixedTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setFixedTime(XMLGregorianCalendar value) {
            this.fixedTime = value;
        }

    }

}

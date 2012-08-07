
package com.fortify.schema.fws;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RuntimeApplicationId" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded"/>
 *         &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "runtimeApplicationId",
    "notes",
    "startDate",
    "endDate"
})
@XmlRootElement(name = "ArchiveRuntimeEventRequest")
public class ArchiveRuntimeEventRequest {

    @XmlElement(name = "RuntimeApplicationId", type = Long.class)
    protected List<Long> runtimeApplicationId;
    @XmlElement(name = "Notes")
    protected String notes;
    @XmlElement(name = "StartDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlElement(name = "EndDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;

    /**
     * Default no-arg constructor
     * 
     */
    public ArchiveRuntimeEventRequest() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ArchiveRuntimeEventRequest(final List<Long> runtimeApplicationId, final String notes, final XMLGregorianCalendar startDate, final XMLGregorianCalendar endDate) {
        this.runtimeApplicationId = runtimeApplicationId;
        this.notes = notes;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    /**
     * Gets the value of the runtimeApplicationId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the runtimeApplicationId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRuntimeApplicationId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getRuntimeApplicationId() {
        if (runtimeApplicationId == null) {
            runtimeApplicationId = new ArrayList<Long>();
        }
        return this.runtimeApplicationId;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
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

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

    @Override
    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    /**
     * Sets the value of the runtimeApplicationId property.
     * 
     * @param runtimeApplicationId
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRuntimeApplicationId(List<Long> runtimeApplicationId) {
        this.runtimeApplicationId = runtimeApplicationId;
    }

    public ArchiveRuntimeEventRequest withRuntimeApplicationId(Long... values) {
        if (values!= null) {
            for (Long value: values) {
                getRuntimeApplicationId().add(value);
            }
        }
        return this;
    }

    public ArchiveRuntimeEventRequest withRuntimeApplicationId(Collection<Long> values) {
        if (values!= null) {
            getRuntimeApplicationId().addAll(values);
        }
        return this;
    }

    public ArchiveRuntimeEventRequest withNotes(String value) {
        setNotes(value);
        return this;
    }

    public ArchiveRuntimeEventRequest withStartDate(XMLGregorianCalendar value) {
        setStartDate(value);
        return this;
    }

    public ArchiveRuntimeEventRequest withEndDate(XMLGregorianCalendar value) {
        setEndDate(value);
        return this;
    }

    public ArchiveRuntimeEventRequest withRuntimeApplicationId(List<Long> runtimeApplicationId) {
        setRuntimeApplicationId(runtimeApplicationId);
        return this;
    }

}

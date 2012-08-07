
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
import xmlns.www_fortifysoftware_com.schema.wstypes.RootCause;
import xmlns.www_fortifysoftware_com.schema.wstypes.Status;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{xmlns://www.fortifysoftware.com/schema/wsTypes}status">
 *       &lt;sequence>
 *         &lt;element name="ProjectVersionIDs" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="MeasurementGuids" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "projectVersionIDs",
    "startDate",
    "endDate",
    "measurementGuids"
})
@XmlRootElement(name = "MeasurementHistoryListRequest")
public class MeasurementHistoryListRequest
    extends Status
{

    @XmlElement(name = "ProjectVersionIDs", type = Long.class)
    protected List<Long> projectVersionIDs;
    @XmlElement(name = "StartDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlElement(name = "EndDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;
    @XmlElement(name = "MeasurementGuids")
    protected List<String> measurementGuids;

    /**
     * Default no-arg constructor
     * 
     */
    public MeasurementHistoryListRequest() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public MeasurementHistoryListRequest(final long code, final String msg, final List<RootCause> rootCause, final List<Long> projectVersionIDs, final XMLGregorianCalendar startDate, final XMLGregorianCalendar endDate, final List<String> measurementGuids) {
        super(code, msg, rootCause);
        this.projectVersionIDs = projectVersionIDs;
        this.startDate = startDate;
        this.endDate = endDate;
        this.measurementGuids = measurementGuids;
    }

    /**
     * Gets the value of the projectVersionIDs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the projectVersionIDs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProjectVersionIDs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getProjectVersionIDs() {
        if (projectVersionIDs == null) {
            projectVersionIDs = new ArrayList<Long>();
        }
        return this.projectVersionIDs;
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
     * Gets the value of the measurementGuids property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the measurementGuids property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeasurementGuids().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMeasurementGuids() {
        if (measurementGuids == null) {
            measurementGuids = new ArrayList<String>();
        }
        return this.measurementGuids;
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
     * Sets the value of the projectVersionIDs property.
     * 
     * @param projectVersionIDs
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProjectVersionIDs(List<Long> projectVersionIDs) {
        this.projectVersionIDs = projectVersionIDs;
    }

    /**
     * Sets the value of the measurementGuids property.
     * 
     * @param measurementGuids
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasurementGuids(List<String> measurementGuids) {
        this.measurementGuids = measurementGuids;
    }

    public MeasurementHistoryListRequest withProjectVersionIDs(Long... values) {
        if (values!= null) {
            for (Long value: values) {
                getProjectVersionIDs().add(value);
            }
        }
        return this;
    }

    public MeasurementHistoryListRequest withProjectVersionIDs(Collection<Long> values) {
        if (values!= null) {
            getProjectVersionIDs().addAll(values);
        }
        return this;
    }

    public MeasurementHistoryListRequest withStartDate(XMLGregorianCalendar value) {
        setStartDate(value);
        return this;
    }

    public MeasurementHistoryListRequest withEndDate(XMLGregorianCalendar value) {
        setEndDate(value);
        return this;
    }

    public MeasurementHistoryListRequest withMeasurementGuids(String... values) {
        if (values!= null) {
            for (String value: values) {
                getMeasurementGuids().add(value);
            }
        }
        return this;
    }

    public MeasurementHistoryListRequest withMeasurementGuids(Collection<String> values) {
        if (values!= null) {
            getMeasurementGuids().addAll(values);
        }
        return this;
    }

    public MeasurementHistoryListRequest withProjectVersionIDs(List<Long> projectVersionIDs) {
        setProjectVersionIDs(projectVersionIDs);
        return this;
    }

    public MeasurementHistoryListRequest withMeasurementGuids(List<String> measurementGuids) {
        setMeasurementGuids(measurementGuids);
        return this;
    }

    @Override
    public MeasurementHistoryListRequest withCode(long value) {
        setCode(value);
        return this;
    }

    @Override
    public MeasurementHistoryListRequest withMsg(String value) {
        setMsg(value);
        return this;
    }

    @Override
    public MeasurementHistoryListRequest withRootCause(RootCause... values) {
        if (values!= null) {
            for (RootCause value: values) {
                getRootCause().add(value);
            }
        }
        return this;
    }

    @Override
    public MeasurementHistoryListRequest withRootCause(Collection<RootCause> values) {
        if (values!= null) {
            getRootCause().addAll(values);
        }
        return this;
    }

    @Override
    public MeasurementHistoryListRequest withRootCause(List<RootCause> rootCause) {
        setRootCause(rootCause);
        return this;
    }

}

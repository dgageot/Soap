
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
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="ProjectVersionIds" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
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
    "startDate",
    "endDate",
    "projectVersionIds"
})
@XmlRootElement(name = "SnapshotMostRecentFirstDateRequest")
public class SnapshotMostRecentFirstDateRequest
    extends Status
{

    @XmlElement(name = "StartDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlElement(name = "EndDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;
    @XmlElement(name = "ProjectVersionIds", type = Long.class)
    protected List<Long> projectVersionIds;

    /**
     * Default no-arg constructor
     * 
     */
    public SnapshotMostRecentFirstDateRequest() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public SnapshotMostRecentFirstDateRequest(final long code, final String msg, final List<RootCause> rootCause, final XMLGregorianCalendar startDate, final XMLGregorianCalendar endDate, final List<Long> projectVersionIds) {
        super(code, msg, rootCause);
        this.startDate = startDate;
        this.endDate = endDate;
        this.projectVersionIds = projectVersionIds;
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
     * Gets the value of the projectVersionIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the projectVersionIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProjectVersionIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getProjectVersionIds() {
        if (projectVersionIds == null) {
            projectVersionIds = new ArrayList<Long>();
        }
        return this.projectVersionIds;
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
     * Sets the value of the projectVersionIds property.
     * 
     * @param projectVersionIds
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProjectVersionIds(List<Long> projectVersionIds) {
        this.projectVersionIds = projectVersionIds;
    }

    public SnapshotMostRecentFirstDateRequest withStartDate(XMLGregorianCalendar value) {
        setStartDate(value);
        return this;
    }

    public SnapshotMostRecentFirstDateRequest withEndDate(XMLGregorianCalendar value) {
        setEndDate(value);
        return this;
    }

    public SnapshotMostRecentFirstDateRequest withProjectVersionIds(Long... values) {
        if (values!= null) {
            for (Long value: values) {
                getProjectVersionIds().add(value);
            }
        }
        return this;
    }

    public SnapshotMostRecentFirstDateRequest withProjectVersionIds(Collection<Long> values) {
        if (values!= null) {
            getProjectVersionIds().addAll(values);
        }
        return this;
    }

    public SnapshotMostRecentFirstDateRequest withProjectVersionIds(List<Long> projectVersionIds) {
        setProjectVersionIds(projectVersionIds);
        return this;
    }

    @Override
    public SnapshotMostRecentFirstDateRequest withCode(long value) {
        setCode(value);
        return this;
    }

    @Override
    public SnapshotMostRecentFirstDateRequest withMsg(String value) {
        setMsg(value);
        return this;
    }

    @Override
    public SnapshotMostRecentFirstDateRequest withRootCause(RootCause... values) {
        if (values!= null) {
            for (RootCause value: values) {
                getRootCause().add(value);
            }
        }
        return this;
    }

    @Override
    public SnapshotMostRecentFirstDateRequest withRootCause(Collection<RootCause> values) {
        if (values!= null) {
            getRootCause().addAll(values);
        }
        return this;
    }

    @Override
    public SnapshotMostRecentFirstDateRequest withRootCause(List<RootCause> rootCause) {
        setRootCause(rootCause);
        return this;
    }

}

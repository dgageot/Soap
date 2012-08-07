
package com.fortify.schema.fws;

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
 *         &lt;element name="ProjectVersionId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
    "projectVersionId",
    "date"
})
@XmlRootElement(name = "SnapshotsForProjectVersionAndPriorToDateRequest")
public class SnapshotsForProjectVersionAndPriorToDateRequest
    extends Status
{

    @XmlElement(name = "ProjectVersionId")
    protected long projectVersionId;
    @XmlElement(name = "Date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar date;

    /**
     * Default no-arg constructor
     * 
     */
    public SnapshotsForProjectVersionAndPriorToDateRequest() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public SnapshotsForProjectVersionAndPriorToDateRequest(final long code, final String msg, final List<RootCause> rootCause, final long projectVersionId, final XMLGregorianCalendar date) {
        super(code, msg, rootCause);
        this.projectVersionId = projectVersionId;
        this.date = date;
    }

    /**
     * Gets the value of the projectVersionId property.
     * 
     */
    public long getProjectVersionId() {
        return projectVersionId;
    }

    /**
     * Sets the value of the projectVersionId property.
     * 
     */
    public void setProjectVersionId(long value) {
        this.projectVersionId = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
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

    public SnapshotsForProjectVersionAndPriorToDateRequest withProjectVersionId(long value) {
        setProjectVersionId(value);
        return this;
    }

    public SnapshotsForProjectVersionAndPriorToDateRequest withDate(XMLGregorianCalendar value) {
        setDate(value);
        return this;
    }

    @Override
    public SnapshotsForProjectVersionAndPriorToDateRequest withCode(long value) {
        setCode(value);
        return this;
    }

    @Override
    public SnapshotsForProjectVersionAndPriorToDateRequest withMsg(String value) {
        setMsg(value);
        return this;
    }

    @Override
    public SnapshotsForProjectVersionAndPriorToDateRequest withRootCause(RootCause... values) {
        if (values!= null) {
            for (RootCause value: values) {
                getRootCause().add(value);
            }
        }
        return this;
    }

    @Override
    public SnapshotsForProjectVersionAndPriorToDateRequest withRootCause(Collection<RootCause> values) {
        if (values!= null) {
            getRootCause().addAll(values);
        }
        return this;
    }

    @Override
    public SnapshotsForProjectVersionAndPriorToDateRequest withRootCause(List<RootCause> rootCause) {
        setRootCause(rootCause);
        return this;
    }

}

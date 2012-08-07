
package com.fortify.schema.fws;

import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
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
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="entityId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="invokingUserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="jobType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="jobState" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "id",
    "entityId",
    "invokingUserName",
    "jobType",
    "jobState"
})
@XmlRootElement(name = "JobStatusResponse")
public class JobStatusResponse
    extends Status
{

    protected String id;
    protected Long entityId;
    protected String invokingUserName;
    protected int jobType;
    protected int jobState;

    /**
     * Default no-arg constructor
     * 
     */
    public JobStatusResponse() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public JobStatusResponse(final long code, final String msg, final List<RootCause> rootCause, final String id, final Long entityId, final String invokingUserName, final int jobType, final int jobState) {
        super(code, msg, rootCause);
        this.id = id;
        this.entityId = entityId;
        this.invokingUserName = invokingUserName;
        this.jobType = jobType;
        this.jobState = jobState;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the entityId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEntityId() {
        return entityId;
    }

    /**
     * Sets the value of the entityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEntityId(Long value) {
        this.entityId = value;
    }

    /**
     * Gets the value of the invokingUserName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvokingUserName() {
        return invokingUserName;
    }

    /**
     * Sets the value of the invokingUserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvokingUserName(String value) {
        this.invokingUserName = value;
    }

    /**
     * Gets the value of the jobType property.
     * 
     */
    public int getJobType() {
        return jobType;
    }

    /**
     * Sets the value of the jobType property.
     * 
     */
    public void setJobType(int value) {
        this.jobType = value;
    }

    /**
     * Gets the value of the jobState property.
     * 
     */
    public int getJobState() {
        return jobState;
    }

    /**
     * Sets the value of the jobState property.
     * 
     */
    public void setJobState(int value) {
        this.jobState = value;
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

    public JobStatusResponse withId(String value) {
        setId(value);
        return this;
    }

    public JobStatusResponse withEntityId(Long value) {
        setEntityId(value);
        return this;
    }

    public JobStatusResponse withInvokingUserName(String value) {
        setInvokingUserName(value);
        return this;
    }

    public JobStatusResponse withJobType(int value) {
        setJobType(value);
        return this;
    }

    public JobStatusResponse withJobState(int value) {
        setJobState(value);
        return this;
    }

    @Override
    public JobStatusResponse withCode(long value) {
        setCode(value);
        return this;
    }

    @Override
    public JobStatusResponse withMsg(String value) {
        setMsg(value);
        return this;
    }

    @Override
    public JobStatusResponse withRootCause(RootCause... values) {
        if (values!= null) {
            for (RootCause value: values) {
                getRootCause().add(value);
            }
        }
        return this;
    }

    @Override
    public JobStatusResponse withRootCause(Collection<RootCause> values) {
        if (values!= null) {
            getRootCause().addAll(values);
        }
        return this;
    }

    @Override
    public JobStatusResponse withRootCause(List<RootCause> rootCause) {
        setRootCause(rootCause);
        return this;
    }

}


package com.fortify.schema.fws;

import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import xmlns.www_fortifysoftware_com.schema.wstypes.AddStatus;
import xmlns.www_fortifysoftware_com.schema.wstypes.RootCause;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{xmlns://www.fortifysoftware.com/schema/wsTypes}addStatus">
 *       &lt;sequence>
 *         &lt;element name="ProjectId" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
    "projectId"
})
@XmlRootElement(name = "AddProjectAndVersionResponse")
public class AddProjectAndVersionResponse
    extends AddStatus
{

    @XmlElement(name = "ProjectId")
    protected long projectId;

    /**
     * Default no-arg constructor
     * 
     */
    public AddProjectAndVersionResponse() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public AddProjectAndVersionResponse(final long code, final String msg, final List<RootCause> rootCause, final long entityId, final long projectId) {
        super(code, msg, rootCause, entityId);
        this.projectId = projectId;
    }

    /**
     * Gets the value of the projectId property.
     * 
     */
    public long getProjectId() {
        return projectId;
    }

    /**
     * Sets the value of the projectId property.
     * 
     */
    public void setProjectId(long value) {
        this.projectId = value;
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

    public AddProjectAndVersionResponse withProjectId(long value) {
        setProjectId(value);
        return this;
    }

    @Override
    public AddProjectAndVersionResponse withEntityId(long value) {
        setEntityId(value);
        return this;
    }

    @Override
    public AddProjectAndVersionResponse withCode(long value) {
        setCode(value);
        return this;
    }

    @Override
    public AddProjectAndVersionResponse withMsg(String value) {
        setMsg(value);
        return this;
    }

    @Override
    public AddProjectAndVersionResponse withRootCause(RootCause... values) {
        if (values!= null) {
            for (RootCause value: values) {
                getRootCause().add(value);
            }
        }
        return this;
    }

    @Override
    public AddProjectAndVersionResponse withRootCause(Collection<RootCause> values) {
        if (values!= null) {
            getRootCause().addAll(values);
        }
        return this;
    }

    @Override
    public AddProjectAndVersionResponse withRootCause(List<RootCause> rootCause) {
        setRootCause(rootCause);
        return this;
    }

}

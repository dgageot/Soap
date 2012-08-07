
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
 *         &lt;element name="MeasurementAgentId" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
    "measurementAgentId"
})
@XmlRootElement(name = "MeasurementHistoryListForProjectVersionAndMeasurementAgentRequest")
public class MeasurementHistoryListForProjectVersionAndMeasurementAgentRequest
    extends Status
{

    @XmlElement(name = "ProjectVersionId")
    protected long projectVersionId;
    @XmlElement(name = "MeasurementAgentId")
    protected long measurementAgentId;

    /**
     * Default no-arg constructor
     * 
     */
    public MeasurementHistoryListForProjectVersionAndMeasurementAgentRequest() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public MeasurementHistoryListForProjectVersionAndMeasurementAgentRequest(final long code, final String msg, final List<RootCause> rootCause, final long projectVersionId, final long measurementAgentId) {
        super(code, msg, rootCause);
        this.projectVersionId = projectVersionId;
        this.measurementAgentId = measurementAgentId;
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
     * Gets the value of the measurementAgentId property.
     * 
     */
    public long getMeasurementAgentId() {
        return measurementAgentId;
    }

    /**
     * Sets the value of the measurementAgentId property.
     * 
     */
    public void setMeasurementAgentId(long value) {
        this.measurementAgentId = value;
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

    public MeasurementHistoryListForProjectVersionAndMeasurementAgentRequest withProjectVersionId(long value) {
        setProjectVersionId(value);
        return this;
    }

    public MeasurementHistoryListForProjectVersionAndMeasurementAgentRequest withMeasurementAgentId(long value) {
        setMeasurementAgentId(value);
        return this;
    }

    @Override
    public MeasurementHistoryListForProjectVersionAndMeasurementAgentRequest withCode(long value) {
        setCode(value);
        return this;
    }

    @Override
    public MeasurementHistoryListForProjectVersionAndMeasurementAgentRequest withMsg(String value) {
        setMsg(value);
        return this;
    }

    @Override
    public MeasurementHistoryListForProjectVersionAndMeasurementAgentRequest withRootCause(RootCause... values) {
        if (values!= null) {
            for (RootCause value: values) {
                getRootCause().add(value);
            }
        }
        return this;
    }

    @Override
    public MeasurementHistoryListForProjectVersionAndMeasurementAgentRequest withRootCause(Collection<RootCause> values) {
        if (values!= null) {
            getRootCause().addAll(values);
        }
        return this;
    }

    @Override
    public MeasurementHistoryListForProjectVersionAndMeasurementAgentRequest withRootCause(List<RootCause> rootCause) {
        setRootCause(rootCause);
        return this;
    }

}

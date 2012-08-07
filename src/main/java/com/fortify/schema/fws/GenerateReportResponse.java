
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
 *         &lt;element name="JobId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="SavedReportId" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
    "jobId",
    "savedReportId"
})
@XmlRootElement(name = "GenerateReportResponse")
public class GenerateReportResponse
    extends Status
{

    @XmlElement(name = "JobId")
    protected long jobId;
    @XmlElement(name = "SavedReportId")
    protected long savedReportId;

    /**
     * Default no-arg constructor
     * 
     */
    public GenerateReportResponse() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public GenerateReportResponse(final long code, final String msg, final List<RootCause> rootCause, final long jobId, final long savedReportId) {
        super(code, msg, rootCause);
        this.jobId = jobId;
        this.savedReportId = savedReportId;
    }

    /**
     * Gets the value of the jobId property.
     * 
     */
    public long getJobId() {
        return jobId;
    }

    /**
     * Sets the value of the jobId property.
     * 
     */
    public void setJobId(long value) {
        this.jobId = value;
    }

    /**
     * Gets the value of the savedReportId property.
     * 
     */
    public long getSavedReportId() {
        return savedReportId;
    }

    /**
     * Sets the value of the savedReportId property.
     * 
     */
    public void setSavedReportId(long value) {
        this.savedReportId = value;
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

    public GenerateReportResponse withJobId(long value) {
        setJobId(value);
        return this;
    }

    public GenerateReportResponse withSavedReportId(long value) {
        setSavedReportId(value);
        return this;
    }

    @Override
    public GenerateReportResponse withCode(long value) {
        setCode(value);
        return this;
    }

    @Override
    public GenerateReportResponse withMsg(String value) {
        setMsg(value);
        return this;
    }

    @Override
    public GenerateReportResponse withRootCause(RootCause... values) {
        if (values!= null) {
            for (RootCause value: values) {
                getRootCause().add(value);
            }
        }
        return this;
    }

    @Override
    public GenerateReportResponse withRootCause(Collection<RootCause> values) {
        if (values!= null) {
            getRootCause().addAll(values);
        }
        return this;
    }

    @Override
    public GenerateReportResponse withRootCause(List<RootCause> rootCause) {
        setRootCause(rootCause);
        return this;
    }

}

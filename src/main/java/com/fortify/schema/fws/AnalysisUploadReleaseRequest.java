
package com.fortify.schema.fws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import xmlns.www_fortifysoftware_com.schema.wstypes.ProjectIdentifier;


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
 *         &lt;element name="ProjectVersionId" type="{xmlns://www.fortifysoftware.com/schema/wsTypes}ProjectIdentifier"/>
 *         &lt;element name="JobId" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
    "projectVersionId",
    "jobId"
})
@XmlRootElement(name = "AnalysisUploadReleaseRequest")
public class AnalysisUploadReleaseRequest {

    @XmlElement(name = "ProjectVersionId", required = true)
    protected ProjectIdentifier projectVersionId;
    @XmlElement(name = "JobId")
    protected long jobId;

    /**
     * Default no-arg constructor
     * 
     */
    public AnalysisUploadReleaseRequest() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public AnalysisUploadReleaseRequest(final ProjectIdentifier projectVersionId, final long jobId) {
        this.projectVersionId = projectVersionId;
        this.jobId = jobId;
    }

    /**
     * Gets the value of the projectVersionId property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectIdentifier }
     *     
     */
    public ProjectIdentifier getProjectVersionId() {
        return projectVersionId;
    }

    /**
     * Sets the value of the projectVersionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectIdentifier }
     *     
     */
    public void setProjectVersionId(ProjectIdentifier value) {
        this.projectVersionId = value;
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

    public AnalysisUploadReleaseRequest withProjectVersionId(ProjectIdentifier value) {
        setProjectVersionId(value);
        return this;
    }

    public AnalysisUploadReleaseRequest withJobId(long value) {
        setJobId(value);
        return this;
    }

}

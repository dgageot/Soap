
package com.fortify.schema.fws;

import java.util.ArrayList;
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
 *         &lt;element ref="{http://www.fortify.com/schema/fws}JobStatusResponse" maxOccurs="unbounded" minOccurs="0"/>
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
    "jobStatusResponse"
})
@XmlRootElement(name = "JobListResponse")
public class JobListResponse {

    @XmlElement(name = "JobStatusResponse")
    protected List<JobStatusResponse> jobStatusResponse;

    /**
     * Default no-arg constructor
     * 
     */
    public JobListResponse() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public JobListResponse(final List<JobStatusResponse> jobStatusResponse) {
        this.jobStatusResponse = jobStatusResponse;
    }

    /**
     * Gets the value of the jobStatusResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jobStatusResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJobStatusResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JobStatusResponse }
     * 
     * 
     */
    public List<JobStatusResponse> getJobStatusResponse() {
        if (jobStatusResponse == null) {
            jobStatusResponse = new ArrayList<JobStatusResponse>();
        }
        return this.jobStatusResponse;
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
     * Sets the value of the jobStatusResponse property.
     * 
     * @param jobStatusResponse
     *     allowed object is
     *     {@link JobStatusResponse }
     *     
     */
    public void setJobStatusResponse(List<JobStatusResponse> jobStatusResponse) {
        this.jobStatusResponse = jobStatusResponse;
    }

    public JobListResponse withJobStatusResponse(JobStatusResponse... values) {
        if (values!= null) {
            for (JobStatusResponse value: values) {
                getJobStatusResponse().add(value);
            }
        }
        return this;
    }

    public JobListResponse withJobStatusResponse(Collection<JobStatusResponse> values) {
        if (values!= null) {
            getJobStatusResponse().addAll(values);
        }
        return this;
    }

    public JobListResponse withJobStatusResponse(List<JobStatusResponse> jobStatusResponse) {
        setJobStatusResponse(jobStatusResponse);
        return this;
    }

}

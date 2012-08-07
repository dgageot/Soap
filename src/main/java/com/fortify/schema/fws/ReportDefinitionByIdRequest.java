
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
 *         &lt;element name="ReportDefinitionId" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
    "reportDefinitionId"
})
@XmlRootElement(name = "ReportDefinitionByIDRequest")
public class ReportDefinitionByIdRequest {

    @XmlElement(name = "ReportDefinitionId")
    protected long reportDefinitionId;

    /**
     * Default no-arg constructor
     * 
     */
    public ReportDefinitionByIdRequest() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ReportDefinitionByIdRequest(final long reportDefinitionId) {
        this.reportDefinitionId = reportDefinitionId;
    }

    /**
     * Gets the value of the reportDefinitionId property.
     * 
     */
    public long getReportDefinitionId() {
        return reportDefinitionId;
    }

    /**
     * Sets the value of the reportDefinitionId property.
     * 
     */
    public void setReportDefinitionId(long value) {
        this.reportDefinitionId = value;
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

    public ReportDefinitionByIdRequest withReportDefinitionId(long value) {
        setReportDefinitionId(value);
        return this;
    }

}

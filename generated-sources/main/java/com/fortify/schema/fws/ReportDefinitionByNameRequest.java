
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
 *         &lt;element name="ReportDefinitionName" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "reportDefinitionName"
})
@XmlRootElement(name = "ReportDefinitionByNameRequest")
public class ReportDefinitionByNameRequest {

    @XmlElement(name = "ReportDefinitionName", required = true)
    protected String reportDefinitionName;

    /**
     * Default no-arg constructor
     * 
     */
    public ReportDefinitionByNameRequest() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ReportDefinitionByNameRequest(final String reportDefinitionName) {
        this.reportDefinitionName = reportDefinitionName;
    }

    /**
     * Gets the value of the reportDefinitionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportDefinitionName() {
        return reportDefinitionName;
    }

    /**
     * Sets the value of the reportDefinitionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportDefinitionName(String value) {
        this.reportDefinitionName = value;
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

    public ReportDefinitionByNameRequest withReportDefinitionName(String value) {
        setReportDefinitionName(value);
        return this;
    }

}

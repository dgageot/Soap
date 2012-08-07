
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
import xmlns.www_fortifysoftware_com.schema.enumconstants.ReportOutputFormat;
import xmlns.www_fortifysoftware_com.schema.wstypes.ReportDefinition;
import xmlns.www_fortifysoftware_com.schema.wstypes.ScheduledReportParameter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fortify.com/schema/fws}ClientVersionRequest">
 *       &lt;sequence>
 *         &lt;element name="ReportDefinition" type="{xmlns://www.fortifysoftware.com/schema/wsTypes}ReportDefinition"/>
 *         &lt;element name="ReportName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ReportNote" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OutputFormat" type="{xmlns://www.fortifysoftware.com/schema/enumConstants}ReportOutputFormat"/>
 *         &lt;element name="ReportParameters" type="{xmlns://www.fortifysoftware.com/schema/wsTypes}ScheduledReportParameter" maxOccurs="unbounded" minOccurs="0"/>
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
    "reportDefinition",
    "reportName",
    "reportNote",
    "outputFormat",
    "reportParameters"
})
@XmlRootElement(name = "GenerateReportRequest")
public class GenerateReportRequest
    extends ClientVersionRequest
{

    @XmlElement(name = "ReportDefinition", required = true)
    protected ReportDefinition reportDefinition;
    @XmlElement(name = "ReportName", required = true)
    protected String reportName;
    @XmlElement(name = "ReportNote", required = true)
    protected String reportNote;
    @XmlElement(name = "OutputFormat", required = true)
    protected ReportOutputFormat outputFormat;
    @XmlElement(name = "ReportParameters")
    protected List<ScheduledReportParameter> reportParameters;

    /**
     * Default no-arg constructor
     * 
     */
    public GenerateReportRequest() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public GenerateReportRequest(final String clientVersion, final ReportDefinition reportDefinition, final String reportName, final String reportNote, final ReportOutputFormat outputFormat, final List<ScheduledReportParameter> reportParameters) {
        super(clientVersion);
        this.reportDefinition = reportDefinition;
        this.reportName = reportName;
        this.reportNote = reportNote;
        this.outputFormat = outputFormat;
        this.reportParameters = reportParameters;
    }

    /**
     * Gets the value of the reportDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link ReportDefinition }
     *     
     */
    public ReportDefinition getReportDefinition() {
        return reportDefinition;
    }

    /**
     * Sets the value of the reportDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportDefinition }
     *     
     */
    public void setReportDefinition(ReportDefinition value) {
        this.reportDefinition = value;
    }

    /**
     * Gets the value of the reportName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportName() {
        return reportName;
    }

    /**
     * Sets the value of the reportName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportName(String value) {
        this.reportName = value;
    }

    /**
     * Gets the value of the reportNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportNote() {
        return reportNote;
    }

    /**
     * Sets the value of the reportNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportNote(String value) {
        this.reportNote = value;
    }

    /**
     * Gets the value of the outputFormat property.
     * 
     * @return
     *     possible object is
     *     {@link ReportOutputFormat }
     *     
     */
    public ReportOutputFormat getOutputFormat() {
        return outputFormat;
    }

    /**
     * Sets the value of the outputFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportOutputFormat }
     *     
     */
    public void setOutputFormat(ReportOutputFormat value) {
        this.outputFormat = value;
    }

    /**
     * Gets the value of the reportParameters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reportParameters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReportParameters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScheduledReportParameter }
     * 
     * 
     */
    public List<ScheduledReportParameter> getReportParameters() {
        if (reportParameters == null) {
            reportParameters = new ArrayList<ScheduledReportParameter>();
        }
        return this.reportParameters;
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
     * Sets the value of the reportParameters property.
     * 
     * @param reportParameters
     *     allowed object is
     *     {@link ScheduledReportParameter }
     *     
     */
    public void setReportParameters(List<ScheduledReportParameter> reportParameters) {
        this.reportParameters = reportParameters;
    }

    public GenerateReportRequest withReportDefinition(ReportDefinition value) {
        setReportDefinition(value);
        return this;
    }

    public GenerateReportRequest withReportName(String value) {
        setReportName(value);
        return this;
    }

    public GenerateReportRequest withReportNote(String value) {
        setReportNote(value);
        return this;
    }

    public GenerateReportRequest withOutputFormat(ReportOutputFormat value) {
        setOutputFormat(value);
        return this;
    }

    public GenerateReportRequest withReportParameters(ScheduledReportParameter... values) {
        if (values!= null) {
            for (ScheduledReportParameter value: values) {
                getReportParameters().add(value);
            }
        }
        return this;
    }

    public GenerateReportRequest withReportParameters(Collection<ScheduledReportParameter> values) {
        if (values!= null) {
            getReportParameters().addAll(values);
        }
        return this;
    }

    public GenerateReportRequest withReportParameters(List<ScheduledReportParameter> reportParameters) {
        setReportParameters(reportParameters);
        return this;
    }

    @Override
    public GenerateReportRequest withClientVersion(String value) {
        setClientVersion(value);
        return this;
    }

}

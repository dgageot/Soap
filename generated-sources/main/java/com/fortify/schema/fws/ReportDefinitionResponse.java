
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
import xmlns.www_fortifysoftware_com.schema.wstypes.ReportDefinition;
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
 *         &lt;element name="ReportDefinition" type="{xmlns://www.fortifysoftware.com/schema/wsTypes}ReportDefinition" minOccurs="0"/>
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
    "reportDefinition"
})
@XmlRootElement(name = "ReportDefinitionResponse")
public class ReportDefinitionResponse
    extends Status
{

    @XmlElement(name = "ReportDefinition")
    protected ReportDefinition reportDefinition;

    /**
     * Default no-arg constructor
     * 
     */
    public ReportDefinitionResponse() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ReportDefinitionResponse(final long code, final String msg, final List<RootCause> rootCause, final ReportDefinition reportDefinition) {
        super(code, msg, rootCause);
        this.reportDefinition = reportDefinition;
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

    public ReportDefinitionResponse withReportDefinition(ReportDefinition value) {
        setReportDefinition(value);
        return this;
    }

    @Override
    public ReportDefinitionResponse withCode(long value) {
        setCode(value);
        return this;
    }

    @Override
    public ReportDefinitionResponse withMsg(String value) {
        setMsg(value);
        return this;
    }

    @Override
    public ReportDefinitionResponse withRootCause(RootCause... values) {
        if (values!= null) {
            for (RootCause value: values) {
                getRootCause().add(value);
            }
        }
        return this;
    }

    @Override
    public ReportDefinitionResponse withRootCause(Collection<RootCause> values) {
        if (values!= null) {
            getRootCause().addAll(values);
        }
        return this;
    }

    @Override
    public ReportDefinitionResponse withRootCause(List<RootCause> rootCause) {
        setRootCause(rootCause);
        return this;
    }

}

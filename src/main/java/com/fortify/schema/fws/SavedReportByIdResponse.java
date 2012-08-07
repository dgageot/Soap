
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
import xmlns.www_fortifysoftware_com.schema.wstypes.SavedReport;
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
 *         &lt;element name="SavedReport" type="{xmlns://www.fortifysoftware.com/schema/wsTypes}SavedReport" minOccurs="0"/>
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
    "savedReport"
})
@XmlRootElement(name = "SavedReportByIdResponse")
public class SavedReportByIdResponse
    extends Status
{

    @XmlElement(name = "SavedReport")
    protected SavedReport savedReport;

    /**
     * Default no-arg constructor
     * 
     */
    public SavedReportByIdResponse() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public SavedReportByIdResponse(final long code, final String msg, final List<RootCause> rootCause, final SavedReport savedReport) {
        super(code, msg, rootCause);
        this.savedReport = savedReport;
    }

    /**
     * Gets the value of the savedReport property.
     * 
     * @return
     *     possible object is
     *     {@link SavedReport }
     *     
     */
    public SavedReport getSavedReport() {
        return savedReport;
    }

    /**
     * Sets the value of the savedReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link SavedReport }
     *     
     */
    public void setSavedReport(SavedReport value) {
        this.savedReport = value;
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

    public SavedReportByIdResponse withSavedReport(SavedReport value) {
        setSavedReport(value);
        return this;
    }

    @Override
    public SavedReportByIdResponse withCode(long value) {
        setCode(value);
        return this;
    }

    @Override
    public SavedReportByIdResponse withMsg(String value) {
        setMsg(value);
        return this;
    }

    @Override
    public SavedReportByIdResponse withRootCause(RootCause... values) {
        if (values!= null) {
            for (RootCause value: values) {
                getRootCause().add(value);
            }
        }
        return this;
    }

    @Override
    public SavedReportByIdResponse withRootCause(Collection<RootCause> values) {
        if (values!= null) {
            getRootCause().addAll(values);
        }
        return this;
    }

    @Override
    public SavedReportByIdResponse withRootCause(List<RootCause> rootCause) {
        setRootCause(rootCause);
        return this;
    }

}

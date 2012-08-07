
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
 *         &lt;element name="SavedReports" type="{xmlns://www.fortifysoftware.com/schema/wsTypes}SavedReport" maxOccurs="unbounded" minOccurs="0"/>
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
    "savedReports"
})
@XmlRootElement(name = "SavedReportListResponse")
public class SavedReportListResponse
    extends Status
{

    @XmlElement(name = "SavedReports")
    protected List<SavedReport> savedReports;

    /**
     * Default no-arg constructor
     * 
     */
    public SavedReportListResponse() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public SavedReportListResponse(final long code, final String msg, final List<RootCause> rootCause, final List<SavedReport> savedReports) {
        super(code, msg, rootCause);
        this.savedReports = savedReports;
    }

    /**
     * Gets the value of the savedReports property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the savedReports property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSavedReports().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SavedReport }
     * 
     * 
     */
    public List<SavedReport> getSavedReports() {
        if (savedReports == null) {
            savedReports = new ArrayList<SavedReport>();
        }
        return this.savedReports;
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
     * Sets the value of the savedReports property.
     * 
     * @param savedReports
     *     allowed object is
     *     {@link SavedReport }
     *     
     */
    public void setSavedReports(List<SavedReport> savedReports) {
        this.savedReports = savedReports;
    }

    public SavedReportListResponse withSavedReports(SavedReport... values) {
        if (values!= null) {
            for (SavedReport value: values) {
                getSavedReports().add(value);
            }
        }
        return this;
    }

    public SavedReportListResponse withSavedReports(Collection<SavedReport> values) {
        if (values!= null) {
            getSavedReports().addAll(values);
        }
        return this;
    }

    public SavedReportListResponse withSavedReports(List<SavedReport> savedReports) {
        setSavedReports(savedReports);
        return this;
    }

    @Override
    public SavedReportListResponse withCode(long value) {
        setCode(value);
        return this;
    }

    @Override
    public SavedReportListResponse withMsg(String value) {
        setMsg(value);
        return this;
    }

    @Override
    public SavedReportListResponse withRootCause(RootCause... values) {
        if (values!= null) {
            for (RootCause value: values) {
                getRootCause().add(value);
            }
        }
        return this;
    }

    @Override
    public SavedReportListResponse withRootCause(Collection<RootCause> values) {
        if (values!= null) {
            getRootCause().addAll(values);
        }
        return this;
    }

    @Override
    public SavedReportListResponse withRootCause(List<RootCause> rootCause) {
        setRootCause(rootCause);
        return this;
    }

}

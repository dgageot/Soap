
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
 *         &lt;element name="SavedReportId" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
    "savedReportId"
})
@XmlRootElement(name = "SavedReportByIdRequest")
public class SavedReportByIdRequest {

    @XmlElement(name = "SavedReportId")
    protected long savedReportId;

    /**
     * Default no-arg constructor
     * 
     */
    public SavedReportByIdRequest() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public SavedReportByIdRequest(final long savedReportId) {
        this.savedReportId = savedReportId;
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

    public SavedReportByIdRequest withSavedReportId(long value) {
        setSavedReportId(value);
        return this;
    }

}

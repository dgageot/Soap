
package com.fortify.schema.fws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
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
 *         &lt;element name="ProjectVersionId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ScanDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
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
    "scanDate"
})
@XmlRootElement(name = "PurgeProjectVersionRequest")
public class PurgeProjectVersionRequest {

    @XmlElement(name = "ProjectVersionId")
    protected long projectVersionId;
    @XmlElement(name = "ScanDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar scanDate;

    /**
     * Default no-arg constructor
     * 
     */
    public PurgeProjectVersionRequest() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public PurgeProjectVersionRequest(final long projectVersionId, final XMLGregorianCalendar scanDate) {
        this.projectVersionId = projectVersionId;
        this.scanDate = scanDate;
    }

    /**
     * Gets the value of the projectVersionId property.
     * 
     */
    public long getProjectVersionId() {
        return projectVersionId;
    }

    /**
     * Sets the value of the projectVersionId property.
     * 
     */
    public void setProjectVersionId(long value) {
        this.projectVersionId = value;
    }

    /**
     * Gets the value of the scanDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScanDate() {
        return scanDate;
    }

    /**
     * Sets the value of the scanDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScanDate(XMLGregorianCalendar value) {
        this.scanDate = value;
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

    public PurgeProjectVersionRequest withProjectVersionId(long value) {
        setProjectVersionId(value);
        return this;
    }

    public PurgeProjectVersionRequest withScanDate(XMLGregorianCalendar value) {
        setScanDate(value);
        return this;
    }

}

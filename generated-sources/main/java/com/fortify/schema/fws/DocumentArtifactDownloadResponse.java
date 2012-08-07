
package com.fortify.schema.fws;

import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
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
 *         &lt;element name="filename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="hasAttachment" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "filename"
})
@XmlRootElement(name = "DocumentArtifactDownloadResponse")
public class DocumentArtifactDownloadResponse
    extends Status
{

    protected String filename;
    @XmlAttribute
    protected Boolean hasAttachment;

    /**
     * Default no-arg constructor
     * 
     */
    public DocumentArtifactDownloadResponse() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public DocumentArtifactDownloadResponse(final long code, final String msg, final List<RootCause> rootCause, final String filename, final Boolean hasAttachment) {
        super(code, msg, rootCause);
        this.filename = filename;
        this.hasAttachment = hasAttachment;
    }

    /**
     * Gets the value of the filename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilename() {
        return filename;
    }

    /**
     * Sets the value of the filename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilename(String value) {
        this.filename = value;
    }

    /**
     * Gets the value of the hasAttachment property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasAttachment() {
        return hasAttachment;
    }

    /**
     * Sets the value of the hasAttachment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasAttachment(Boolean value) {
        this.hasAttachment = value;
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

    public DocumentArtifactDownloadResponse withFilename(String value) {
        setFilename(value);
        return this;
    }

    public DocumentArtifactDownloadResponse withHasAttachment(Boolean value) {
        setHasAttachment(value);
        return this;
    }

    @Override
    public DocumentArtifactDownloadResponse withCode(long value) {
        setCode(value);
        return this;
    }

    @Override
    public DocumentArtifactDownloadResponse withMsg(String value) {
        setMsg(value);
        return this;
    }

    @Override
    public DocumentArtifactDownloadResponse withRootCause(RootCause... values) {
        if (values!= null) {
            for (RootCause value: values) {
                getRootCause().add(value);
            }
        }
        return this;
    }

    @Override
    public DocumentArtifactDownloadResponse withRootCause(Collection<RootCause> values) {
        if (values!= null) {
            getRootCause().addAll(values);
        }
        return this;
    }

    @Override
    public DocumentArtifactDownloadResponse withRootCause(List<RootCause> rootCause) {
        setRootCause(rootCause);
        return this;
    }

}

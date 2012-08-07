
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
 *         &lt;element name="DocumentArtifactId" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
    "documentArtifactId"
})
@XmlRootElement(name = "DocumentArtifactDownloadRequest")
public class DocumentArtifactDownloadRequest {

    @XmlElement(name = "DocumentArtifactId")
    protected long documentArtifactId;

    /**
     * Default no-arg constructor
     * 
     */
    public DocumentArtifactDownloadRequest() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public DocumentArtifactDownloadRequest(final long documentArtifactId) {
        this.documentArtifactId = documentArtifactId;
    }

    /**
     * Gets the value of the documentArtifactId property.
     * 
     */
    public long getDocumentArtifactId() {
        return documentArtifactId;
    }

    /**
     * Sets the value of the documentArtifactId property.
     * 
     */
    public void setDocumentArtifactId(long value) {
        this.documentArtifactId = value;
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

    public DocumentArtifactDownloadRequest withDocumentArtifactId(long value) {
        setDocumentArtifactId(value);
        return this;
    }

}

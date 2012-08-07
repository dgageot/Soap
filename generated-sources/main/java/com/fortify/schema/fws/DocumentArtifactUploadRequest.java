
package com.fortify.schema.fws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import xmlns.www_fortifysoftware_com.schema.wstypes.DocumentArtifact;


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
 *         &lt;element name="DocumentArtifact" type="{xmlns://www.fortifysoftware.com/schema/wsTypes}DocumentArtifact"/>
 *       &lt;/sequence>
 *       &lt;attribute name="expectsAttachment" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "documentArtifact"
})
@XmlRootElement(name = "DocumentArtifactUploadRequest")
public class DocumentArtifactUploadRequest {

    @XmlElement(name = "DocumentArtifact", required = true)
    protected DocumentArtifact documentArtifact;
    @XmlAttribute
    protected Boolean expectsAttachment;

    /**
     * Default no-arg constructor
     * 
     */
    public DocumentArtifactUploadRequest() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public DocumentArtifactUploadRequest(final DocumentArtifact documentArtifact, final Boolean expectsAttachment) {
        this.documentArtifact = documentArtifact;
        this.expectsAttachment = expectsAttachment;
    }

    /**
     * Gets the value of the documentArtifact property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentArtifact }
     *     
     */
    public DocumentArtifact getDocumentArtifact() {
        return documentArtifact;
    }

    /**
     * Sets the value of the documentArtifact property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentArtifact }
     *     
     */
    public void setDocumentArtifact(DocumentArtifact value) {
        this.documentArtifact = value;
    }

    /**
     * Gets the value of the expectsAttachment property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExpectsAttachment() {
        return expectsAttachment;
    }

    /**
     * Sets the value of the expectsAttachment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExpectsAttachment(Boolean value) {
        this.expectsAttachment = value;
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

    public DocumentArtifactUploadRequest withDocumentArtifact(DocumentArtifact value) {
        setDocumentArtifact(value);
        return this;
    }

    public DocumentArtifactUploadRequest withExpectsAttachment(Boolean value) {
        setExpectsAttachment(value);
        return this;
    }

}

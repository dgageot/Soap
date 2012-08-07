
package com.fortify.schema.fws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element name="filename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="overwrite" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="fortifyContentUpdate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "filename",
    "overwrite",
    "fortifyContentUpdate"
})
@XmlRootElement(name = "SDLBundleUploadRequest")
public class SdlBundleUploadRequest {

    protected String filename;
    protected Boolean overwrite;
    protected Boolean fortifyContentUpdate;
    @XmlAttribute
    protected Boolean expectsAttachment;

    /**
     * Default no-arg constructor
     * 
     */
    public SdlBundleUploadRequest() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public SdlBundleUploadRequest(final String filename, final Boolean overwrite, final Boolean fortifyContentUpdate, final Boolean expectsAttachment) {
        this.filename = filename;
        this.overwrite = overwrite;
        this.fortifyContentUpdate = fortifyContentUpdate;
        this.expectsAttachment = expectsAttachment;
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
     * Gets the value of the overwrite property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOverwrite() {
        return overwrite;
    }

    /**
     * Sets the value of the overwrite property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOverwrite(Boolean value) {
        this.overwrite = value;
    }

    /**
     * Gets the value of the fortifyContentUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFortifyContentUpdate() {
        return fortifyContentUpdate;
    }

    /**
     * Sets the value of the fortifyContentUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFortifyContentUpdate(Boolean value) {
        this.fortifyContentUpdate = value;
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

    public SdlBundleUploadRequest withFilename(String value) {
        setFilename(value);
        return this;
    }

    public SdlBundleUploadRequest withOverwrite(Boolean value) {
        setOverwrite(value);
        return this;
    }

    public SdlBundleUploadRequest withFortifyContentUpdate(Boolean value) {
        setFortifyContentUpdate(value);
        return this;
    }

    public SdlBundleUploadRequest withExpectsAttachment(Boolean value) {
        setExpectsAttachment(value);
        return this;
    }

}


package com.fortify.schema.fws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import xmlns.www_fortifysoftware_com.schema.wstypes.ProjectIdentifier;


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
 *         &lt;element name="ProjectVersionId" type="{xmlns://www.fortifysoftware.com/schema/wsTypes}ProjectIdentifier"/>
 *         &lt;element name="filename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastOne" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="originalUploadDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="originalUploadUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="originalUploadIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SharedSecret" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "projectVersionId",
    "filename",
    "lastOne",
    "originalUploadDate",
    "originalUploadUser",
    "originalUploadIp",
    "sharedSecret"
})
@XmlRootElement(name = "FPRSimpleMigrateRequest")
public class FprSimpleMigrateRequest {

    @XmlElement(name = "ProjectVersionId", required = true)
    protected ProjectIdentifier projectVersionId;
    protected String filename;
    protected boolean lastOne;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar originalUploadDate;
    protected String originalUploadUser;
    @XmlElement(name = "originalUploadIP")
    protected String originalUploadIp;
    @XmlElement(name = "SharedSecret", required = true)
    protected String sharedSecret;
    @XmlAttribute
    protected Boolean expectsAttachment;

    /**
     * Default no-arg constructor
     * 
     */
    public FprSimpleMigrateRequest() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public FprSimpleMigrateRequest(final ProjectIdentifier projectVersionId, final String filename, final boolean lastOne, final XMLGregorianCalendar originalUploadDate, final String originalUploadUser, final String originalUploadIp, final String sharedSecret, final Boolean expectsAttachment) {
        this.projectVersionId = projectVersionId;
        this.filename = filename;
        this.lastOne = lastOne;
        this.originalUploadDate = originalUploadDate;
        this.originalUploadUser = originalUploadUser;
        this.originalUploadIp = originalUploadIp;
        this.sharedSecret = sharedSecret;
        this.expectsAttachment = expectsAttachment;
    }

    /**
     * Gets the value of the projectVersionId property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectIdentifier }
     *     
     */
    public ProjectIdentifier getProjectVersionId() {
        return projectVersionId;
    }

    /**
     * Sets the value of the projectVersionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectIdentifier }
     *     
     */
    public void setProjectVersionId(ProjectIdentifier value) {
        this.projectVersionId = value;
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
     * Gets the value of the lastOne property.
     * 
     */
    public boolean isLastOne() {
        return lastOne;
    }

    /**
     * Sets the value of the lastOne property.
     * 
     */
    public void setLastOne(boolean value) {
        this.lastOne = value;
    }

    /**
     * Gets the value of the originalUploadDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOriginalUploadDate() {
        return originalUploadDate;
    }

    /**
     * Sets the value of the originalUploadDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOriginalUploadDate(XMLGregorianCalendar value) {
        this.originalUploadDate = value;
    }

    /**
     * Gets the value of the originalUploadUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalUploadUser() {
        return originalUploadUser;
    }

    /**
     * Sets the value of the originalUploadUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalUploadUser(String value) {
        this.originalUploadUser = value;
    }

    /**
     * Gets the value of the originalUploadIp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalUploadIp() {
        return originalUploadIp;
    }

    /**
     * Sets the value of the originalUploadIp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalUploadIp(String value) {
        this.originalUploadIp = value;
    }

    /**
     * Gets the value of the sharedSecret property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSharedSecret() {
        return sharedSecret;
    }

    /**
     * Sets the value of the sharedSecret property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSharedSecret(String value) {
        this.sharedSecret = value;
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

    public FprSimpleMigrateRequest withProjectVersionId(ProjectIdentifier value) {
        setProjectVersionId(value);
        return this;
    }

    public FprSimpleMigrateRequest withFilename(String value) {
        setFilename(value);
        return this;
    }

    public FprSimpleMigrateRequest withLastOne(boolean value) {
        setLastOne(value);
        return this;
    }

    public FprSimpleMigrateRequest withOriginalUploadDate(XMLGregorianCalendar value) {
        setOriginalUploadDate(value);
        return this;
    }

    public FprSimpleMigrateRequest withOriginalUploadUser(String value) {
        setOriginalUploadUser(value);
        return this;
    }

    public FprSimpleMigrateRequest withOriginalUploadIp(String value) {
        setOriginalUploadIp(value);
        return this;
    }

    public FprSimpleMigrateRequest withSharedSecret(String value) {
        setSharedSecret(value);
        return this;
    }

    public FprSimpleMigrateRequest withExpectsAttachment(Boolean value) {
        setExpectsAttachment(value);
        return this;
    }

}

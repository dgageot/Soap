
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
import xmlns.www_fortifysoftware_com.schema.enumconstants.ArtifactStatus;
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
 *         &lt;element name="NewStatus" type="{xmlns://www.fortifysoftware.com/schema/enumConstants}ArtifactStatus"/>
 *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "newStatus",
    "message"
})
@XmlRootElement(name = "AnalysisStatusUpdateRequest")
public class AnalysisStatusUpdateRequest {

    @XmlElement(name = "ProjectVersionId", required = true)
    protected ProjectIdentifier projectVersionId;
    @XmlElement(name = "NewStatus", required = true)
    protected ArtifactStatus newStatus;
    @XmlElement(name = "Message")
    protected String message;

    /**
     * Default no-arg constructor
     * 
     */
    public AnalysisStatusUpdateRequest() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public AnalysisStatusUpdateRequest(final ProjectIdentifier projectVersionId, final ArtifactStatus newStatus, final String message) {
        this.projectVersionId = projectVersionId;
        this.newStatus = newStatus;
        this.message = message;
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
     * Gets the value of the newStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ArtifactStatus }
     *     
     */
    public ArtifactStatus getNewStatus() {
        return newStatus;
    }

    /**
     * Sets the value of the newStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArtifactStatus }
     *     
     */
    public void setNewStatus(ArtifactStatus value) {
        this.newStatus = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
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

    public AnalysisStatusUpdateRequest withProjectVersionId(ProjectIdentifier value) {
        setProjectVersionId(value);
        return this;
    }

    public AnalysisStatusUpdateRequest withNewStatus(ArtifactStatus value) {
        setNewStatus(value);
        return this;
    }

    public AnalysisStatusUpdateRequest withMessage(String value) {
        setMessage(value);
        return this;
    }

}

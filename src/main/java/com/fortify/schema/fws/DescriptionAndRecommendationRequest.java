
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
import xmlns.www_fortifysoftware_com.schema.wstypes.ManagedSessionRequest;
import xmlns.www_fortifysoftware_com.schema.wstypes.ProjectIdentifier;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{xmlns://www.fortifysoftware.com/schema/wsTypes}ManagedSessionRequest">
 *       &lt;sequence>
 *         &lt;element name="ProjectIdentifier" type="{xmlns://www.fortifysoftware.com/schema/wsTypes}ProjectIdentifier"/>
 *         &lt;element name="IssueId" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "projectIdentifier",
    "issueId"
})
@XmlRootElement(name = "DescriptionAndRecommendationRequest")
public class DescriptionAndRecommendationRequest
    extends ManagedSessionRequest
{

    @XmlElement(name = "ProjectIdentifier", required = true)
    protected ProjectIdentifier projectIdentifier;
    @XmlElement(name = "IssueId", required = true)
    protected String issueId;

    /**
     * Default no-arg constructor
     * 
     */
    public DescriptionAndRecommendationRequest() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public DescriptionAndRecommendationRequest(final String sessionId, final ProjectIdentifier projectIdentifier, final String issueId) {
        super(sessionId);
        this.projectIdentifier = projectIdentifier;
        this.issueId = issueId;
    }

    /**
     * Gets the value of the projectIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectIdentifier }
     *     
     */
    public ProjectIdentifier getProjectIdentifier() {
        return projectIdentifier;
    }

    /**
     * Sets the value of the projectIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectIdentifier }
     *     
     */
    public void setProjectIdentifier(ProjectIdentifier value) {
        this.projectIdentifier = value;
    }

    /**
     * Gets the value of the issueId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssueId() {
        return issueId;
    }

    /**
     * Sets the value of the issueId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssueId(String value) {
        this.issueId = value;
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

    public DescriptionAndRecommendationRequest withProjectIdentifier(ProjectIdentifier value) {
        setProjectIdentifier(value);
        return this;
    }

    public DescriptionAndRecommendationRequest withIssueId(String value) {
        setIssueId(value);
        return this;
    }

    @Override
    public DescriptionAndRecommendationRequest withSessionId(String value) {
        setSessionId(value);
        return this;
    }

}

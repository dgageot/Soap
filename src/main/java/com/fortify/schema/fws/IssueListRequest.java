
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
import xmlns.www_fortify_com.schema.issuemanagement.IssueListDescription;
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
 *         &lt;element name="IssueListDescription" type="{xmlns://www.fortify.com/schema/issuemanagement}IssueListDescription"/>
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
    "issueListDescription"
})
@XmlRootElement(name = "IssueListRequest")
public class IssueListRequest
    extends ManagedSessionRequest
{

    @XmlElement(name = "ProjectIdentifier", required = true)
    protected ProjectIdentifier projectIdentifier;
    @XmlElement(name = "IssueListDescription", required = true)
    protected IssueListDescription issueListDescription;

    /**
     * Default no-arg constructor
     * 
     */
    public IssueListRequest() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public IssueListRequest(final String sessionId, final ProjectIdentifier projectIdentifier, final IssueListDescription issueListDescription) {
        super(sessionId);
        this.projectIdentifier = projectIdentifier;
        this.issueListDescription = issueListDescription;
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
     * Gets the value of the issueListDescription property.
     * 
     * @return
     *     possible object is
     *     {@link IssueListDescription }
     *     
     */
    public IssueListDescription getIssueListDescription() {
        return issueListDescription;
    }

    /**
     * Sets the value of the issueListDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssueListDescription }
     *     
     */
    public void setIssueListDescription(IssueListDescription value) {
        this.issueListDescription = value;
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

    public IssueListRequest withProjectIdentifier(ProjectIdentifier value) {
        setProjectIdentifier(value);
        return this;
    }

    public IssueListRequest withIssueListDescription(IssueListDescription value) {
        setIssueListDescription(value);
        return this;
    }

    @Override
    public IssueListRequest withSessionId(String value) {
        setSessionId(value);
        return this;
    }

}

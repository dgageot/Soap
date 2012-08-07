
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
import xmlns.www_fortify_com.schema.issuemanagement.IssueListDescription;
import xmlns.www_fortifysoftware_com.schema.wstypes.ManagedSessionRequest;


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
 *         &lt;element name="IssueListDescription" type="{xmlns://www.fortify.com/schema/issuemanagement}IssueListDescription" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="projectVersionId" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "issueListDescription"
})
@XmlRootElement(name = "AuditViewRequest")
public class AuditViewRequest
    extends ManagedSessionRequest
{

    @XmlElement(name = "IssueListDescription")
    protected IssueListDescription issueListDescription;
    @XmlAttribute(required = true)
    protected long projectVersionId;

    /**
     * Default no-arg constructor
     * 
     */
    public AuditViewRequest() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public AuditViewRequest(final String sessionId, final IssueListDescription issueListDescription, final long projectVersionId) {
        super(sessionId);
        this.issueListDescription = issueListDescription;
        this.projectVersionId = projectVersionId;
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

    public AuditViewRequest withIssueListDescription(IssueListDescription value) {
        setIssueListDescription(value);
        return this;
    }

    public AuditViewRequest withProjectVersionId(long value) {
        setProjectVersionId(value);
        return this;
    }

    @Override
    public AuditViewRequest withSessionId(String value) {
        setSessionId(value);
        return this;
    }

}

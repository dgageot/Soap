
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
import xmlns.www_fortifysoftware_com.schema.wstypes.StringMap;


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
 *         &lt;element name="IssueInstanceId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ProjectVersionId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="BugtrackerUsername" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BugtrackerPassword" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Summary" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Parameters" type="{xmlns://www.fortifysoftware.com/schema/wsTypes}StringMap"/>
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
    "issueInstanceId",
    "projectVersionId",
    "bugtrackerUsername",
    "bugtrackerPassword",
    "summary",
    "description",
    "parameters"
})
@XmlRootElement(name = "SubmitBugRequest")
public class SubmitBugRequest
    extends ManagedSessionRequest
{

    @XmlElement(name = "IssueInstanceId", required = true)
    protected String issueInstanceId;
    @XmlElement(name = "ProjectVersionId")
    protected long projectVersionId;
    @XmlElement(name = "BugtrackerUsername", required = true)
    protected String bugtrackerUsername;
    @XmlElement(name = "BugtrackerPassword", required = true)
    protected String bugtrackerPassword;
    @XmlElement(name = "Summary", required = true)
    protected String summary;
    @XmlElement(name = "Description", required = true)
    protected String description;
    @XmlElement(name = "Parameters", required = true)
    protected StringMap parameters;

    /**
     * Default no-arg constructor
     * 
     */
    public SubmitBugRequest() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public SubmitBugRequest(final String sessionId, final String issueInstanceId, final long projectVersionId, final String bugtrackerUsername, final String bugtrackerPassword, final String summary, final String description, final StringMap parameters) {
        super(sessionId);
        this.issueInstanceId = issueInstanceId;
        this.projectVersionId = projectVersionId;
        this.bugtrackerUsername = bugtrackerUsername;
        this.bugtrackerPassword = bugtrackerPassword;
        this.summary = summary;
        this.description = description;
        this.parameters = parameters;
    }

    /**
     * Gets the value of the issueInstanceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssueInstanceId() {
        return issueInstanceId;
    }

    /**
     * Sets the value of the issueInstanceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssueInstanceId(String value) {
        this.issueInstanceId = value;
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
     * Gets the value of the bugtrackerUsername property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBugtrackerUsername() {
        return bugtrackerUsername;
    }

    /**
     * Sets the value of the bugtrackerUsername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBugtrackerUsername(String value) {
        this.bugtrackerUsername = value;
    }

    /**
     * Gets the value of the bugtrackerPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBugtrackerPassword() {
        return bugtrackerPassword;
    }

    /**
     * Sets the value of the bugtrackerPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBugtrackerPassword(String value) {
        this.bugtrackerPassword = value;
    }

    /**
     * Gets the value of the summary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSummary() {
        return summary;
    }

    /**
     * Sets the value of the summary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSummary(String value) {
        this.summary = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the parameters property.
     * 
     * @return
     *     possible object is
     *     {@link StringMap }
     *     
     */
    public StringMap getParameters() {
        return parameters;
    }

    /**
     * Sets the value of the parameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringMap }
     *     
     */
    public void setParameters(StringMap value) {
        this.parameters = value;
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

    public SubmitBugRequest withIssueInstanceId(String value) {
        setIssueInstanceId(value);
        return this;
    }

    public SubmitBugRequest withProjectVersionId(long value) {
        setProjectVersionId(value);
        return this;
    }

    public SubmitBugRequest withBugtrackerUsername(String value) {
        setBugtrackerUsername(value);
        return this;
    }

    public SubmitBugRequest withBugtrackerPassword(String value) {
        setBugtrackerPassword(value);
        return this;
    }

    public SubmitBugRequest withSummary(String value) {
        setSummary(value);
        return this;
    }

    public SubmitBugRequest withDescription(String value) {
        setDescription(value);
        return this;
    }

    public SubmitBugRequest withParameters(StringMap value) {
        setParameters(value);
        return this;
    }

    @Override
    public SubmitBugRequest withSessionId(String value) {
        setSessionId(value);
        return this;
    }

}

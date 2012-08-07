
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
 *         &lt;element name="IssueId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ProjectVersionId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Parameters" type="{xmlns://www.fortifysoftware.com/schema/wsTypes}StringMap" minOccurs="0"/>
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
    "issueId",
    "projectVersionId",
    "parameters"
})
@XmlRootElement(name = "TraceNodesRequest")
public class TraceNodesRequest
    extends ManagedSessionRequest
{

    @XmlElement(name = "IssueId", required = true)
    protected String issueId;
    @XmlElement(name = "ProjectVersionId")
    protected long projectVersionId;
    @XmlElement(name = "Parameters")
    protected StringMap parameters;

    /**
     * Default no-arg constructor
     * 
     */
    public TraceNodesRequest() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public TraceNodesRequest(final String sessionId, final String issueId, final long projectVersionId, final StringMap parameters) {
        super(sessionId);
        this.issueId = issueId;
        this.projectVersionId = projectVersionId;
        this.parameters = parameters;
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

    public TraceNodesRequest withIssueId(String value) {
        setIssueId(value);
        return this;
    }

    public TraceNodesRequest withProjectVersionId(long value) {
        setProjectVersionId(value);
        return this;
    }

    public TraceNodesRequest withParameters(StringMap value) {
        setParameters(value);
        return this;
    }

    @Override
    public TraceNodesRequest withSessionId(String value) {
        setSessionId(value);
        return this;
    }

}


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
import xmlns.www_fortify_com.schema.issuemanagement.AuditAction;
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
 *         &lt;element name="AuditAction" type="{xmlns://www.fortify.com/schema/issuemanagement}AuditAction"/>
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
    "auditAction"
})
@XmlRootElement(name = "PerformAuditActionRequest")
public class PerformAuditActionRequest
    extends ManagedSessionRequest
{

    @XmlElement(name = "AuditAction", required = true)
    protected AuditAction auditAction;

    /**
     * Default no-arg constructor
     * 
     */
    public PerformAuditActionRequest() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public PerformAuditActionRequest(final String sessionId, final AuditAction auditAction) {
        super(sessionId);
        this.auditAction = auditAction;
    }

    /**
     * Gets the value of the auditAction property.
     * 
     * @return
     *     possible object is
     *     {@link AuditAction }
     *     
     */
    public AuditAction getAuditAction() {
        return auditAction;
    }

    /**
     * Sets the value of the auditAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuditAction }
     *     
     */
    public void setAuditAction(AuditAction value) {
        this.auditAction = value;
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

    public PerformAuditActionRequest withAuditAction(AuditAction value) {
        setAuditAction(value);
        return this;
    }

    @Override
    public PerformAuditActionRequest withSessionId(String value) {
        setSessionId(value);
        return this;
    }

}

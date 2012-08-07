
package com.fortify.schema.fws;

import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import xmlns.www_fortify_com.schema.issuemanagement.AuditView;
import xmlns.www_fortifysoftware_com.schema.wstypes.RootCause;
import xmlns.www_fortifysoftware_com.schema.wstypes.Status;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{xmlns://www.fortifysoftware.com/schema/wsTypes}status">
 *       &lt;sequence>
 *         &lt;element name="AuditView" type="{xmlns://www.fortify.com/schema/issuemanagement}AuditView"/>
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
    "auditView"
})
@XmlRootElement(name = "AuditViewResponse")
public class AuditViewResponse
    extends Status
{

    @XmlElement(name = "AuditView", required = true)
    protected AuditView auditView;

    /**
     * Default no-arg constructor
     * 
     */
    public AuditViewResponse() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public AuditViewResponse(final long code, final String msg, final List<RootCause> rootCause, final AuditView auditView) {
        super(code, msg, rootCause);
        this.auditView = auditView;
    }

    /**
     * Gets the value of the auditView property.
     * 
     * @return
     *     possible object is
     *     {@link AuditView }
     *     
     */
    public AuditView getAuditView() {
        return auditView;
    }

    /**
     * Sets the value of the auditView property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuditView }
     *     
     */
    public void setAuditView(AuditView value) {
        this.auditView = value;
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

    public AuditViewResponse withAuditView(AuditView value) {
        setAuditView(value);
        return this;
    }

    @Override
    public AuditViewResponse withCode(long value) {
        setCode(value);
        return this;
    }

    @Override
    public AuditViewResponse withMsg(String value) {
        setMsg(value);
        return this;
    }

    @Override
    public AuditViewResponse withRootCause(RootCause... values) {
        if (values!= null) {
            for (RootCause value: values) {
                getRootCause().add(value);
            }
        }
        return this;
    }

    @Override
    public AuditViewResponse withRootCause(Collection<RootCause> values) {
        if (values!= null) {
            getRootCause().addAll(values);
        }
        return this;
    }

    @Override
    public AuditViewResponse withRootCause(List<RootCause> rootCause) {
        setRootCause(rootCause);
        return this;
    }

}

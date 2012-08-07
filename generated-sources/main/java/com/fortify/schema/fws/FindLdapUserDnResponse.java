
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
 *         &lt;element name="LdapDN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "ldapDn"
})
@XmlRootElement(name = "FindLdapUserDNResponse")
public class FindLdapUserDnResponse
    extends Status
{

    @XmlElement(name = "LdapDN")
    protected String ldapDn;

    /**
     * Default no-arg constructor
     * 
     */
    public FindLdapUserDnResponse() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public FindLdapUserDnResponse(final long code, final String msg, final List<RootCause> rootCause, final String ldapDn) {
        super(code, msg, rootCause);
        this.ldapDn = ldapDn;
    }

    /**
     * Gets the value of the ldapDn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLdapDn() {
        return ldapDn;
    }

    /**
     * Sets the value of the ldapDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLdapDn(String value) {
        this.ldapDn = value;
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

    public FindLdapUserDnResponse withLdapDn(String value) {
        setLdapDn(value);
        return this;
    }

    @Override
    public FindLdapUserDnResponse withCode(long value) {
        setCode(value);
        return this;
    }

    @Override
    public FindLdapUserDnResponse withMsg(String value) {
        setMsg(value);
        return this;
    }

    @Override
    public FindLdapUserDnResponse withRootCause(RootCause... values) {
        if (values!= null) {
            for (RootCause value: values) {
                getRootCause().add(value);
            }
        }
        return this;
    }

    @Override
    public FindLdapUserDnResponse withRootCause(Collection<RootCause> values) {
        if (values!= null) {
            getRootCause().addAll(values);
        }
        return this;
    }

    @Override
    public FindLdapUserDnResponse withRootCause(List<RootCause> rootCause) {
        setRootCause(rootCause);
        return this;
    }

}

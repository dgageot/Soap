
package com.fortify.schema.fws;

import java.util.ArrayList;
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
import xmlns.www_fortifysoftware_com.schema.wstypes.LdapEntity;
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
 *         &lt;element name="LdapEntity" type="{xmlns://www.fortifysoftware.com/schema/wsTypes}LdapEntity" maxOccurs="unbounded" minOccurs="0"/>
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
    "ldapEntity"
})
@XmlRootElement(name = "RegisteredLdapEntityListResponse")
public class RegisteredLdapEntityListResponse
    extends Status
{

    @XmlElement(name = "LdapEntity")
    protected List<LdapEntity> ldapEntity;

    /**
     * Default no-arg constructor
     * 
     */
    public RegisteredLdapEntityListResponse() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public RegisteredLdapEntityListResponse(final long code, final String msg, final List<RootCause> rootCause, final List<LdapEntity> ldapEntity) {
        super(code, msg, rootCause);
        this.ldapEntity = ldapEntity;
    }

    /**
     * Gets the value of the ldapEntity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ldapEntity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLdapEntity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LdapEntity }
     * 
     * 
     */
    public List<LdapEntity> getLdapEntity() {
        if (ldapEntity == null) {
            ldapEntity = new ArrayList<LdapEntity>();
        }
        return this.ldapEntity;
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

    /**
     * Sets the value of the ldapEntity property.
     * 
     * @param ldapEntity
     *     allowed object is
     *     {@link LdapEntity }
     *     
     */
    public void setLdapEntity(List<LdapEntity> ldapEntity) {
        this.ldapEntity = ldapEntity;
    }

    public RegisteredLdapEntityListResponse withLdapEntity(LdapEntity... values) {
        if (values!= null) {
            for (LdapEntity value: values) {
                getLdapEntity().add(value);
            }
        }
        return this;
    }

    public RegisteredLdapEntityListResponse withLdapEntity(Collection<LdapEntity> values) {
        if (values!= null) {
            getLdapEntity().addAll(values);
        }
        return this;
    }

    public RegisteredLdapEntityListResponse withLdapEntity(List<LdapEntity> ldapEntity) {
        setLdapEntity(ldapEntity);
        return this;
    }

    @Override
    public RegisteredLdapEntityListResponse withCode(long value) {
        setCode(value);
        return this;
    }

    @Override
    public RegisteredLdapEntityListResponse withMsg(String value) {
        setMsg(value);
        return this;
    }

    @Override
    public RegisteredLdapEntityListResponse withRootCause(RootCause... values) {
        if (values!= null) {
            for (RootCause value: values) {
                getRootCause().add(value);
            }
        }
        return this;
    }

    @Override
    public RegisteredLdapEntityListResponse withRootCause(Collection<RootCause> values) {
        if (values!= null) {
            getRootCause().addAll(values);
        }
        return this;
    }

    @Override
    public RegisteredLdapEntityListResponse withRootCause(List<RootCause> rootCause) {
        setRootCause(rootCause);
        return this;
    }

}

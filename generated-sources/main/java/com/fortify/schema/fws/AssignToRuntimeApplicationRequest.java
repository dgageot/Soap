
package com.fortify.schema.fws;

import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import xmlns.www_fortifysoftware_com.schema.wstypes.RuntimeApplicationAccessAssignment;
import xmlns.www_fortifysoftware_com.schema.wstypes.RuntimeApplicationIdentifier;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{xmlns://www.fortifysoftware.com/schema/wsTypes}RuntimeApplicationAccessAssignment">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "AssignToRuntimeApplicationRequest")
public class AssignToRuntimeApplicationRequest
    extends RuntimeApplicationAccessAssignment
{


    /**
     * Default no-arg constructor
     * 
     */
    public AssignToRuntimeApplicationRequest() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public AssignToRuntimeApplicationRequest(final List<String> username, final List<String> ldapDn, final RuntimeApplicationIdentifier runtimeApplicationId) {
        super(username, ldapDn, runtimeApplicationId);
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

    @Override
    public AssignToRuntimeApplicationRequest withRuntimeApplicationId(RuntimeApplicationIdentifier value) {
        setRuntimeApplicationId(value);
        return this;
    }

    @Override
    public AssignToRuntimeApplicationRequest withUsername(String... values) {
        if (values!= null) {
            for (String value: values) {
                getUsername().add(value);
            }
        }
        return this;
    }

    @Override
    public AssignToRuntimeApplicationRequest withUsername(Collection<String> values) {
        if (values!= null) {
            getUsername().addAll(values);
        }
        return this;
    }

    @Override
    public AssignToRuntimeApplicationRequest withLdapDn(String... values) {
        if (values!= null) {
            for (String value: values) {
                getLdapDn().add(value);
            }
        }
        return this;
    }

    @Override
    public AssignToRuntimeApplicationRequest withLdapDn(Collection<String> values) {
        if (values!= null) {
            getLdapDn().addAll(values);
        }
        return this;
    }

    @Override
    public AssignToRuntimeApplicationRequest withUsername(List<String> username) {
        setUsername(username);
        return this;
    }

    @Override
    public AssignToRuntimeApplicationRequest withLdapDn(List<String> ldapDn) {
        setLdapDn(ldapDn);
        return this;
    }

}

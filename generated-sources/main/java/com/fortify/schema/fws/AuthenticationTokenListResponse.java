
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
import xmlns.www_fortifysoftware_com.schema.wstypes.AuthenticationToken;
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
 *         &lt;element name="AuthenticationToken" type="{xmlns://www.fortifysoftware.com/schema/wsTypes}AuthenticationToken" maxOccurs="unbounded" minOccurs="0"/>
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
    "authenticationToken"
})
@XmlRootElement(name = "AuthenticationTokenListResponse")
public class AuthenticationTokenListResponse
    extends Status
{

    @XmlElement(name = "AuthenticationToken")
    protected List<AuthenticationToken> authenticationToken;

    /**
     * Default no-arg constructor
     * 
     */
    public AuthenticationTokenListResponse() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public AuthenticationTokenListResponse(final long code, final String msg, final List<RootCause> rootCause, final List<AuthenticationToken> authenticationToken) {
        super(code, msg, rootCause);
        this.authenticationToken = authenticationToken;
    }

    /**
     * Gets the value of the authenticationToken property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authenticationToken property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthenticationToken().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AuthenticationToken }
     * 
     * 
     */
    public List<AuthenticationToken> getAuthenticationToken() {
        if (authenticationToken == null) {
            authenticationToken = new ArrayList<AuthenticationToken>();
        }
        return this.authenticationToken;
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
     * Sets the value of the authenticationToken property.
     * 
     * @param authenticationToken
     *     allowed object is
     *     {@link AuthenticationToken }
     *     
     */
    public void setAuthenticationToken(List<AuthenticationToken> authenticationToken) {
        this.authenticationToken = authenticationToken;
    }

    public AuthenticationTokenListResponse withAuthenticationToken(AuthenticationToken... values) {
        if (values!= null) {
            for (AuthenticationToken value: values) {
                getAuthenticationToken().add(value);
            }
        }
        return this;
    }

    public AuthenticationTokenListResponse withAuthenticationToken(Collection<AuthenticationToken> values) {
        if (values!= null) {
            getAuthenticationToken().addAll(values);
        }
        return this;
    }

    public AuthenticationTokenListResponse withAuthenticationToken(List<AuthenticationToken> authenticationToken) {
        setAuthenticationToken(authenticationToken);
        return this;
    }

    @Override
    public AuthenticationTokenListResponse withCode(long value) {
        setCode(value);
        return this;
    }

    @Override
    public AuthenticationTokenListResponse withMsg(String value) {
        setMsg(value);
        return this;
    }

    @Override
    public AuthenticationTokenListResponse withRootCause(RootCause... values) {
        if (values!= null) {
            for (RootCause value: values) {
                getRootCause().add(value);
            }
        }
        return this;
    }

    @Override
    public AuthenticationTokenListResponse withRootCause(Collection<RootCause> values) {
        if (values!= null) {
            getRootCause().addAll(values);
        }
        return this;
    }

    @Override
    public AuthenticationTokenListResponse withRootCause(List<RootCause> rootCause) {
        setRootCause(rootCause);
        return this;
    }

}

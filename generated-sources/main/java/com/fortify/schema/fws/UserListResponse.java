
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
import xmlns.www_fortifysoftware_com.schema.wstypes.RootCause;
import xmlns.www_fortifysoftware_com.schema.wstypes.Status;
import xmlns.www_fortifysoftware_com.schema.wstypes.User;


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
 *         &lt;element name="User" type="{xmlns://www.fortifysoftware.com/schema/wsTypes}User" maxOccurs="unbounded" minOccurs="0"/>
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
    "user"
})
@XmlRootElement(name = "UserListResponse")
public class UserListResponse
    extends Status
{

    @XmlElement(name = "User")
    protected List<User> user;

    /**
     * Default no-arg constructor
     * 
     */
    public UserListResponse() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public UserListResponse(final long code, final String msg, final List<RootCause> rootCause, final List<User> user) {
        super(code, msg, rootCause);
        this.user = user;
    }

    /**
     * Gets the value of the user property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the user property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUser().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link User }
     * 
     * 
     */
    public List<User> getUser() {
        if (user == null) {
            user = new ArrayList<User>();
        }
        return this.user;
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
     * Sets the value of the user property.
     * 
     * @param user
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setUser(List<User> user) {
        this.user = user;
    }

    public UserListResponse withUser(User... values) {
        if (values!= null) {
            for (User value: values) {
                getUser().add(value);
            }
        }
        return this;
    }

    public UserListResponse withUser(Collection<User> values) {
        if (values!= null) {
            getUser().addAll(values);
        }
        return this;
    }

    public UserListResponse withUser(List<User> user) {
        setUser(user);
        return this;
    }

    @Override
    public UserListResponse withCode(long value) {
        setCode(value);
        return this;
    }

    @Override
    public UserListResponse withMsg(String value) {
        setMsg(value);
        return this;
    }

    @Override
    public UserListResponse withRootCause(RootCause... values) {
        if (values!= null) {
            for (RootCause value: values) {
                getRootCause().add(value);
            }
        }
        return this;
    }

    @Override
    public UserListResponse withRootCause(Collection<RootCause> values) {
        if (values!= null) {
            getRootCause().addAll(values);
        }
        return this;
    }

    @Override
    public UserListResponse withRootCause(List<RootCause> rootCause) {
        setRootCause(rootCause);
        return this;
    }

}

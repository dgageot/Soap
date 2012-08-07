
package xmlns.www_fortifysoftware_com.schema.wstypes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;


/**
 * <p>Java class for AccessAssignmentBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccessAssignmentBase">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Username" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="LdapDN" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccessAssignmentBase", propOrder = {
    "username",
    "ldapDn"
})
@XmlSeeAlso({
    AccessAssignment.class,
    RuntimeApplicationAccessAssignment.class
})
public class AccessAssignmentBase {

    @XmlElement(name = "Username")
    protected List<String> username;
    @XmlElement(name = "LdapDN")
    protected List<String> ldapDn;

    /**
     * Default no-arg constructor
     * 
     */
    public AccessAssignmentBase() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public AccessAssignmentBase(final List<String> username, final List<String> ldapDn) {
        this.username = username;
        this.ldapDn = ldapDn;
    }

    /**
     * Gets the value of the username property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the username property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUsername().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getUsername() {
        if (username == null) {
            username = new ArrayList<String>();
        }
        return this.username;
    }

    /**
     * Gets the value of the ldapDn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ldapDn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLdapDn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLdapDn() {
        if (ldapDn == null) {
            ldapDn = new ArrayList<String>();
        }
        return this.ldapDn;
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
     * Sets the value of the username property.
     * 
     * @param username
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(List<String> username) {
        this.username = username;
    }

    /**
     * Sets the value of the ldapDn property.
     * 
     * @param ldapDn
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLdapDn(List<String> ldapDn) {
        this.ldapDn = ldapDn;
    }

    public AccessAssignmentBase withUsername(String... values) {
        if (values!= null) {
            for (String value: values) {
                getUsername().add(value);
            }
        }
        return this;
    }

    public AccessAssignmentBase withUsername(Collection<String> values) {
        if (values!= null) {
            getUsername().addAll(values);
        }
        return this;
    }

    public AccessAssignmentBase withLdapDn(String... values) {
        if (values!= null) {
            for (String value: values) {
                getLdapDn().add(value);
            }
        }
        return this;
    }

    public AccessAssignmentBase withLdapDn(Collection<String> values) {
        if (values!= null) {
            getLdapDn().addAll(values);
        }
        return this;
    }

    public AccessAssignmentBase withUsername(List<String> username) {
        setUsername(username);
        return this;
    }

    public AccessAssignmentBase withLdapDn(List<String> ldapDn) {
        setLdapDn(ldapDn);
        return this;
    }

}

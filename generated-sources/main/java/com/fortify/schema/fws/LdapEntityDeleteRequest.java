
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


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DN" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "dn"
})
@XmlRootElement(name = "LdapEntityDeleteRequest")
public class LdapEntityDeleteRequest {

    @XmlElement(name = "DN", required = true)
    protected List<String> dn;

    /**
     * Default no-arg constructor
     * 
     */
    public LdapEntityDeleteRequest() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public LdapEntityDeleteRequest(final List<String> dn) {
        this.dn = dn;
    }

    /**
     * Gets the value of the dn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDn() {
        if (dn == null) {
            dn = new ArrayList<String>();
        }
        return this.dn;
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
     * Sets the value of the dn property.
     * 
     * @param dn
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDn(List<String> dn) {
        this.dn = dn;
    }

    public LdapEntityDeleteRequest withDn(String... values) {
        if (values!= null) {
            for (String value: values) {
                getDn().add(value);
            }
        }
        return this;
    }

    public LdapEntityDeleteRequest withDn(Collection<String> values) {
        if (values!= null) {
            getDn().addAll(values);
        }
        return this;
    }

    public LdapEntityDeleteRequest withDn(List<String> dn) {
        setDn(dn);
        return this;
    }

}


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
import xmlns.www_fortifysoftware_com.schema.enumconstants.LdapEntityType;


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
 *         &lt;element name="LdapEntityType" type="{xmlns://www.fortifysoftware.com/schema/enumConstants}LdapEntityType" minOccurs="0"/>
 *         &lt;element name="SearchString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExcludeAlreadyRegistered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "ldapEntityType",
    "searchString",
    "excludeAlreadyRegistered"
})
@XmlRootElement(name = "SearchLdapRequest")
public class SearchLdapRequest {

    @XmlElement(name = "LdapEntityType")
    protected LdapEntityType ldapEntityType;
    @XmlElement(name = "SearchString")
    protected String searchString;
    @XmlElement(name = "ExcludeAlreadyRegistered")
    protected Boolean excludeAlreadyRegistered;

    /**
     * Default no-arg constructor
     * 
     */
    public SearchLdapRequest() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public SearchLdapRequest(final LdapEntityType ldapEntityType, final String searchString, final Boolean excludeAlreadyRegistered) {
        this.ldapEntityType = ldapEntityType;
        this.searchString = searchString;
        this.excludeAlreadyRegistered = excludeAlreadyRegistered;
    }

    /**
     * Gets the value of the ldapEntityType property.
     * 
     * @return
     *     possible object is
     *     {@link LdapEntityType }
     *     
     */
    public LdapEntityType getLdapEntityType() {
        return ldapEntityType;
    }

    /**
     * Sets the value of the ldapEntityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LdapEntityType }
     *     
     */
    public void setLdapEntityType(LdapEntityType value) {
        this.ldapEntityType = value;
    }

    /**
     * Gets the value of the searchString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchString() {
        return searchString;
    }

    /**
     * Sets the value of the searchString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchString(String value) {
        this.searchString = value;
    }

    /**
     * Gets the value of the excludeAlreadyRegistered property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExcludeAlreadyRegistered() {
        return excludeAlreadyRegistered;
    }

    /**
     * Sets the value of the excludeAlreadyRegistered property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcludeAlreadyRegistered(Boolean value) {
        this.excludeAlreadyRegistered = value;
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

    public SearchLdapRequest withLdapEntityType(LdapEntityType value) {
        setLdapEntityType(value);
        return this;
    }

    public SearchLdapRequest withSearchString(String value) {
        setSearchString(value);
        return this;
    }

    public SearchLdapRequest withExcludeAlreadyRegistered(Boolean value) {
        setExcludeAlreadyRegistered(value);
        return this;
    }

}

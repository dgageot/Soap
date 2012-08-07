
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


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="TokenToInvalidate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UsernameToInvalidate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IdToInvalidate" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="InvalidateAll" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "tokenToInvalidate",
    "usernameToInvalidate",
    "idToInvalidate",
    "invalidateAll"
})
@XmlRootElement(name = "InvalidateTokenRequest")
public class InvalidateTokenRequest {

    @XmlElement(name = "TokenToInvalidate")
    protected String tokenToInvalidate;
    @XmlElement(name = "UsernameToInvalidate")
    protected String usernameToInvalidate;
    @XmlElement(name = "IdToInvalidate")
    protected Long idToInvalidate;
    @XmlElement(name = "InvalidateAll")
    protected Boolean invalidateAll;

    /**
     * Default no-arg constructor
     * 
     */
    public InvalidateTokenRequest() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public InvalidateTokenRequest(final String tokenToInvalidate, final String usernameToInvalidate, final Long idToInvalidate, final Boolean invalidateAll) {
        this.tokenToInvalidate = tokenToInvalidate;
        this.usernameToInvalidate = usernameToInvalidate;
        this.idToInvalidate = idToInvalidate;
        this.invalidateAll = invalidateAll;
    }

    /**
     * Gets the value of the tokenToInvalidate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTokenToInvalidate() {
        return tokenToInvalidate;
    }

    /**
     * Sets the value of the tokenToInvalidate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTokenToInvalidate(String value) {
        this.tokenToInvalidate = value;
    }

    /**
     * Gets the value of the usernameToInvalidate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsernameToInvalidate() {
        return usernameToInvalidate;
    }

    /**
     * Sets the value of the usernameToInvalidate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsernameToInvalidate(String value) {
        this.usernameToInvalidate = value;
    }

    /**
     * Gets the value of the idToInvalidate property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdToInvalidate() {
        return idToInvalidate;
    }

    /**
     * Sets the value of the idToInvalidate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdToInvalidate(Long value) {
        this.idToInvalidate = value;
    }

    /**
     * Gets the value of the invalidateAll property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInvalidateAll() {
        return invalidateAll;
    }

    /**
     * Sets the value of the invalidateAll property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInvalidateAll(Boolean value) {
        this.invalidateAll = value;
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

    public InvalidateTokenRequest withTokenToInvalidate(String value) {
        setTokenToInvalidate(value);
        return this;
    }

    public InvalidateTokenRequest withUsernameToInvalidate(String value) {
        setUsernameToInvalidate(value);
        return this;
    }

    public InvalidateTokenRequest withIdToInvalidate(Long value) {
        setIdToInvalidate(value);
        return this;
    }

    public InvalidateTokenRequest withInvalidateAll(Boolean value) {
        setInvalidateAll(value);
        return this;
    }

}

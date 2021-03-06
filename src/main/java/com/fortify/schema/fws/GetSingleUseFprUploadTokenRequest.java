
package com.fortify.schema.fws;

import java.math.BigInteger;
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
 *         &lt;element name="DaysToLive" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
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
    "daysToLive"
})
@XmlRootElement(name = "GetSingleUseFPRUploadTokenRequest")
public class GetSingleUseFprUploadTokenRequest {

    @XmlElement(name = "DaysToLive")
    protected BigInteger daysToLive;

    /**
     * Default no-arg constructor
     * 
     */
    public GetSingleUseFprUploadTokenRequest() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public GetSingleUseFprUploadTokenRequest(final BigInteger daysToLive) {
        this.daysToLive = daysToLive;
    }

    /**
     * Gets the value of the daysToLive property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDaysToLive() {
        return daysToLive;
    }

    /**
     * Sets the value of the daysToLive property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDaysToLive(BigInteger value) {
        this.daysToLive = value;
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

    public GetSingleUseFprUploadTokenRequest withDaysToLive(BigInteger value) {
        setDaysToLive(value);
        return this;
    }

}

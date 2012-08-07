
package com.fortify.schema.fws;

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
 * <p>Java class for ClientVersionRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClientVersionRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClientVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClientVersionRequest", propOrder = {
    "clientVersion"
})
@XmlSeeAlso({
    CustomTagListForProjectTemplateRequest.class,
    GenerateReportRequest.class,
    CustomTagListRequest.class,
    FprDownloadRequest.class,
    BatchCreateUpdateAndAssignCustomTagsRequest.class,
    CustomTagListForProjectVersionRequest.class
})
public class ClientVersionRequest {

    @XmlElement(name = "ClientVersion")
    protected String clientVersion;

    /**
     * Default no-arg constructor
     * 
     */
    public ClientVersionRequest() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ClientVersionRequest(final String clientVersion) {
        this.clientVersion = clientVersion;
    }

    /**
     * Gets the value of the clientVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientVersion() {
        return clientVersion;
    }

    /**
     * Sets the value of the clientVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientVersion(String value) {
        this.clientVersion = value;
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

    public ClientVersionRequest withClientVersion(String value) {
        setClientVersion(value);
        return this;
    }

}

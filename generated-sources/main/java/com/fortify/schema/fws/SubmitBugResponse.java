
package com.fortify.schema.fws;

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
 *         &lt;element name="ExternalIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExternalUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "externalIdentifier",
    "externalUrl"
})
@XmlRootElement(name = "SubmitBugResponse")
public class SubmitBugResponse
    extends Status
{

    @XmlElement(name = "ExternalIdentifier")
    protected String externalIdentifier;
    @XmlElement(name = "ExternalUrl")
    protected String externalUrl;

    /**
     * Default no-arg constructor
     * 
     */
    public SubmitBugResponse() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public SubmitBugResponse(final long code, final String msg, final List<RootCause> rootCause, final String externalIdentifier, final String externalUrl) {
        super(code, msg, rootCause);
        this.externalIdentifier = externalIdentifier;
        this.externalUrl = externalUrl;
    }

    /**
     * Gets the value of the externalIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalIdentifier() {
        return externalIdentifier;
    }

    /**
     * Sets the value of the externalIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalIdentifier(String value) {
        this.externalIdentifier = value;
    }

    /**
     * Gets the value of the externalUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalUrl() {
        return externalUrl;
    }

    /**
     * Sets the value of the externalUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalUrl(String value) {
        this.externalUrl = value;
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

    public SubmitBugResponse withExternalIdentifier(String value) {
        setExternalIdentifier(value);
        return this;
    }

    public SubmitBugResponse withExternalUrl(String value) {
        setExternalUrl(value);
        return this;
    }

    @Override
    public SubmitBugResponse withCode(long value) {
        setCode(value);
        return this;
    }

    @Override
    public SubmitBugResponse withMsg(String value) {
        setMsg(value);
        return this;
    }

    @Override
    public SubmitBugResponse withRootCause(RootCause... values) {
        if (values!= null) {
            for (RootCause value: values) {
                getRootCause().add(value);
            }
        }
        return this;
    }

    @Override
    public SubmitBugResponse withRootCause(Collection<RootCause> values) {
        if (values!= null) {
            getRootCause().addAll(values);
        }
        return this;
    }

    @Override
    public SubmitBugResponse withRootCause(List<RootCause> rootCause) {
        setRootCause(rootCause);
        return this;
    }

}

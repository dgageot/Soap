
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
 *     &lt;extension base="{http://www.fortify.com/schema/fws}ClientVersionRequest">
 *       &lt;sequence>
 *         &lt;element name="ProjectTemplateId" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "projectTemplateId"
})
@XmlRootElement(name = "CustomTagListForProjectTemplateRequest")
public class CustomTagListForProjectTemplateRequest
    extends ClientVersionRequest
{

    @XmlElement(name = "ProjectTemplateId", required = true)
    protected String projectTemplateId;

    /**
     * Default no-arg constructor
     * 
     */
    public CustomTagListForProjectTemplateRequest() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public CustomTagListForProjectTemplateRequest(final String clientVersion, final String projectTemplateId) {
        super(clientVersion);
        this.projectTemplateId = projectTemplateId;
    }

    /**
     * Gets the value of the projectTemplateId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectTemplateId() {
        return projectTemplateId;
    }

    /**
     * Sets the value of the projectTemplateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectTemplateId(String value) {
        this.projectTemplateId = value;
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

    public CustomTagListForProjectTemplateRequest withProjectTemplateId(String value) {
        setProjectTemplateId(value);
        return this;
    }

    @Override
    public CustomTagListForProjectTemplateRequest withClientVersion(String value) {
        setClientVersion(value);
        return this;
    }

}

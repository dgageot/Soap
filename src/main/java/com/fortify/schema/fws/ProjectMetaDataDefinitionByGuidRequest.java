
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
 *       &lt;sequence>
 *         &lt;element name="ProjectMetaDataDefinitionGuid" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "projectMetaDataDefinitionGuid"
})
@XmlRootElement(name = "ProjectMetaDataDefinitionByGuidRequest")
public class ProjectMetaDataDefinitionByGuidRequest {

    @XmlElement(name = "ProjectMetaDataDefinitionGuid", required = true)
    protected String projectMetaDataDefinitionGuid;

    /**
     * Default no-arg constructor
     * 
     */
    public ProjectMetaDataDefinitionByGuidRequest() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ProjectMetaDataDefinitionByGuidRequest(final String projectMetaDataDefinitionGuid) {
        this.projectMetaDataDefinitionGuid = projectMetaDataDefinitionGuid;
    }

    /**
     * Gets the value of the projectMetaDataDefinitionGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectMetaDataDefinitionGuid() {
        return projectMetaDataDefinitionGuid;
    }

    /**
     * Sets the value of the projectMetaDataDefinitionGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectMetaDataDefinitionGuid(String value) {
        this.projectMetaDataDefinitionGuid = value;
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

    public ProjectMetaDataDefinitionByGuidRequest withProjectMetaDataDefinitionGuid(String value) {
        setProjectMetaDataDefinitionGuid(value);
        return this;
    }

}

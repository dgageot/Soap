
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
 *         &lt;element name="ProjectVersionId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="TechnologyStackMetaDataId" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "projectVersionId",
    "technologyStackMetaDataId"
})
@XmlRootElement(name = "ProjectMetaDataValueRequest")
public class ProjectMetaDataValueRequest {

    @XmlElement(name = "ProjectVersionId")
    protected long projectVersionId;
    @XmlElement(name = "TechnologyStackMetaDataId", required = true)
    protected String technologyStackMetaDataId;

    /**
     * Default no-arg constructor
     * 
     */
    public ProjectMetaDataValueRequest() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ProjectMetaDataValueRequest(final long projectVersionId, final String technologyStackMetaDataId) {
        this.projectVersionId = projectVersionId;
        this.technologyStackMetaDataId = technologyStackMetaDataId;
    }

    /**
     * Gets the value of the projectVersionId property.
     * 
     */
    public long getProjectVersionId() {
        return projectVersionId;
    }

    /**
     * Sets the value of the projectVersionId property.
     * 
     */
    public void setProjectVersionId(long value) {
        this.projectVersionId = value;
    }

    /**
     * Gets the value of the technologyStackMetaDataId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechnologyStackMetaDataId() {
        return technologyStackMetaDataId;
    }

    /**
     * Sets the value of the technologyStackMetaDataId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTechnologyStackMetaDataId(String value) {
        this.technologyStackMetaDataId = value;
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

    public ProjectMetaDataValueRequest withProjectVersionId(long value) {
        setProjectVersionId(value);
        return this;
    }

    public ProjectMetaDataValueRequest withTechnologyStackMetaDataId(String value) {
        setTechnologyStackMetaDataId(value);
        return this;
    }

}

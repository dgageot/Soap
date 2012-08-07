
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
 *         &lt;element name="ProjectTemplateId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CustomTagId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
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
    "projectTemplateId",
    "customTagId"
})
@XmlRootElement(name = "AssignCustomTagsToProjectTemplateRequest")
public class AssignCustomTagsToProjectTemplateRequest {

    @XmlElement(name = "ProjectTemplateId", required = true)
    protected String projectTemplateId;
    @XmlElement(name = "CustomTagId", required = true)
    protected List<String> customTagId;

    /**
     * Default no-arg constructor
     * 
     */
    public AssignCustomTagsToProjectTemplateRequest() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public AssignCustomTagsToProjectTemplateRequest(final String projectTemplateId, final List<String> customTagId) {
        this.projectTemplateId = projectTemplateId;
        this.customTagId = customTagId;
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

    /**
     * Gets the value of the customTagId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customTagId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomTagId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCustomTagId() {
        if (customTagId == null) {
            customTagId = new ArrayList<String>();
        }
        return this.customTagId;
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
     * Sets the value of the customTagId property.
     * 
     * @param customTagId
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomTagId(List<String> customTagId) {
        this.customTagId = customTagId;
    }

    public AssignCustomTagsToProjectTemplateRequest withProjectTemplateId(String value) {
        setProjectTemplateId(value);
        return this;
    }

    public AssignCustomTagsToProjectTemplateRequest withCustomTagId(String... values) {
        if (values!= null) {
            for (String value: values) {
                getCustomTagId().add(value);
            }
        }
        return this;
    }

    public AssignCustomTagsToProjectTemplateRequest withCustomTagId(Collection<String> values) {
        if (values!= null) {
            getCustomTagId().addAll(values);
        }
        return this;
    }

    public AssignCustomTagsToProjectTemplateRequest withCustomTagId(List<String> customTagId) {
        setCustomTagId(customTagId);
        return this;
    }

}

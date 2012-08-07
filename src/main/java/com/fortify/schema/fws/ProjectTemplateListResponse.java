
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
import xmlns.www_fortifysoftware_com.schema.wstypes.ProjectTemplate;
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
 *         &lt;element name="ProjectTemplate" type="{xmlns://www.fortifysoftware.com/schema/wsTypes}ProjectTemplate" maxOccurs="unbounded" minOccurs="0"/>
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
    "projectTemplate"
})
@XmlRootElement(name = "ProjectTemplateListResponse")
public class ProjectTemplateListResponse
    extends Status
{

    @XmlElement(name = "ProjectTemplate")
    protected List<ProjectTemplate> projectTemplate;

    /**
     * Default no-arg constructor
     * 
     */
    public ProjectTemplateListResponse() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ProjectTemplateListResponse(final long code, final String msg, final List<RootCause> rootCause, final List<ProjectTemplate> projectTemplate) {
        super(code, msg, rootCause);
        this.projectTemplate = projectTemplate;
    }

    /**
     * Gets the value of the projectTemplate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the projectTemplate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProjectTemplate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProjectTemplate }
     * 
     * 
     */
    public List<ProjectTemplate> getProjectTemplate() {
        if (projectTemplate == null) {
            projectTemplate = new ArrayList<ProjectTemplate>();
        }
        return this.projectTemplate;
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
     * Sets the value of the projectTemplate property.
     * 
     * @param projectTemplate
     *     allowed object is
     *     {@link ProjectTemplate }
     *     
     */
    public void setProjectTemplate(List<ProjectTemplate> projectTemplate) {
        this.projectTemplate = projectTemplate;
    }

    public ProjectTemplateListResponse withProjectTemplate(ProjectTemplate... values) {
        if (values!= null) {
            for (ProjectTemplate value: values) {
                getProjectTemplate().add(value);
            }
        }
        return this;
    }

    public ProjectTemplateListResponse withProjectTemplate(Collection<ProjectTemplate> values) {
        if (values!= null) {
            getProjectTemplate().addAll(values);
        }
        return this;
    }

    public ProjectTemplateListResponse withProjectTemplate(List<ProjectTemplate> projectTemplate) {
        setProjectTemplate(projectTemplate);
        return this;
    }

    @Override
    public ProjectTemplateListResponse withCode(long value) {
        setCode(value);
        return this;
    }

    @Override
    public ProjectTemplateListResponse withMsg(String value) {
        setMsg(value);
        return this;
    }

    @Override
    public ProjectTemplateListResponse withRootCause(RootCause... values) {
        if (values!= null) {
            for (RootCause value: values) {
                getRootCause().add(value);
            }
        }
        return this;
    }

    @Override
    public ProjectTemplateListResponse withRootCause(Collection<RootCause> values) {
        if (values!= null) {
            getRootCause().addAll(values);
        }
        return this;
    }

    @Override
    public ProjectTemplateListResponse withRootCause(List<RootCause> rootCause) {
        setRootCause(rootCause);
        return this;
    }

}

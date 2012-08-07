
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
 *         &lt;element name="ProjectTemplate" type="{xmlns://www.fortifysoftware.com/schema/wsTypes}ProjectTemplate" minOccurs="0"/>
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
@XmlRootElement(name = "ProjectTemplateUploadResponse")
public class ProjectTemplateUploadResponse
    extends Status
{

    @XmlElement(name = "ProjectTemplate")
    protected ProjectTemplate projectTemplate;

    /**
     * Default no-arg constructor
     * 
     */
    public ProjectTemplateUploadResponse() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ProjectTemplateUploadResponse(final long code, final String msg, final List<RootCause> rootCause, final ProjectTemplate projectTemplate) {
        super(code, msg, rootCause);
        this.projectTemplate = projectTemplate;
    }

    /**
     * Gets the value of the projectTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectTemplate }
     *     
     */
    public ProjectTemplate getProjectTemplate() {
        return projectTemplate;
    }

    /**
     * Sets the value of the projectTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectTemplate }
     *     
     */
    public void setProjectTemplate(ProjectTemplate value) {
        this.projectTemplate = value;
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

    public ProjectTemplateUploadResponse withProjectTemplate(ProjectTemplate value) {
        setProjectTemplate(value);
        return this;
    }

    @Override
    public ProjectTemplateUploadResponse withCode(long value) {
        setCode(value);
        return this;
    }

    @Override
    public ProjectTemplateUploadResponse withMsg(String value) {
        setMsg(value);
        return this;
    }

    @Override
    public ProjectTemplateUploadResponse withRootCause(RootCause... values) {
        if (values!= null) {
            for (RootCause value: values) {
                getRootCause().add(value);
            }
        }
        return this;
    }

    @Override
    public ProjectTemplateUploadResponse withRootCause(Collection<RootCause> values) {
        if (values!= null) {
            getRootCause().addAll(values);
        }
        return this;
    }

    @Override
    public ProjectTemplateUploadResponse withRootCause(List<RootCause> rootCause) {
        setRootCause(rootCause);
        return this;
    }

}

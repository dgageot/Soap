
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
import xmlns.www_fortifysoftware_com.schema.wstypes.Project;
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
 *         &lt;element name="Project" type="{xmlns://www.fortifysoftware.com/schema/wsTypes}Project" maxOccurs="unbounded" minOccurs="0"/>
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
    "project"
})
@XmlRootElement(name = "ProjectListResponse")
public class ProjectListResponse
    extends Status
{

    @XmlElement(name = "Project")
    protected List<Project> project;

    /**
     * Default no-arg constructor
     * 
     */
    public ProjectListResponse() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ProjectListResponse(final long code, final String msg, final List<RootCause> rootCause, final List<Project> project) {
        super(code, msg, rootCause);
        this.project = project;
    }

    /**
     * Gets the value of the project property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the project property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Project }
     * 
     * 
     */
    public List<Project> getProject() {
        if (project == null) {
            project = new ArrayList<Project>();
        }
        return this.project;
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
     * Sets the value of the project property.
     * 
     * @param project
     *     allowed object is
     *     {@link Project }
     *     
     */
    public void setProject(List<Project> project) {
        this.project = project;
    }

    public ProjectListResponse withProject(Project... values) {
        if (values!= null) {
            for (Project value: values) {
                getProject().add(value);
            }
        }
        return this;
    }

    public ProjectListResponse withProject(Collection<Project> values) {
        if (values!= null) {
            getProject().addAll(values);
        }
        return this;
    }

    public ProjectListResponse withProject(List<Project> project) {
        setProject(project);
        return this;
    }

    @Override
    public ProjectListResponse withCode(long value) {
        setCode(value);
        return this;
    }

    @Override
    public ProjectListResponse withMsg(String value) {
        setMsg(value);
        return this;
    }

    @Override
    public ProjectListResponse withRootCause(RootCause... values) {
        if (values!= null) {
            for (RootCause value: values) {
                getRootCause().add(value);
            }
        }
        return this;
    }

    @Override
    public ProjectListResponse withRootCause(Collection<RootCause> values) {
        if (values!= null) {
            getRootCause().addAll(values);
        }
        return this;
    }

    @Override
    public ProjectListResponse withRootCause(List<RootCause> rootCause) {
        setRootCause(rootCause);
        return this;
    }

}

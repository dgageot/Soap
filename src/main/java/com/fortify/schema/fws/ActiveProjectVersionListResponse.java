
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
import xmlns.www_fortifysoftware_com.schema.wstypes.ProjectVersionLite;
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
 *         &lt;element name="ProjectVersion" type="{xmlns://www.fortifysoftware.com/schema/wsTypes}ProjectVersionLite" maxOccurs="unbounded" minOccurs="0"/>
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
    "projectVersion"
})
@XmlRootElement(name = "ActiveProjectVersionListResponse")
public class ActiveProjectVersionListResponse
    extends Status
{

    @XmlElement(name = "ProjectVersion")
    protected List<ProjectVersionLite> projectVersion;

    /**
     * Default no-arg constructor
     * 
     */
    public ActiveProjectVersionListResponse() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ActiveProjectVersionListResponse(final long code, final String msg, final List<RootCause> rootCause, final List<ProjectVersionLite> projectVersion) {
        super(code, msg, rootCause);
        this.projectVersion = projectVersion;
    }

    /**
     * Gets the value of the projectVersion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the projectVersion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProjectVersion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProjectVersionLite }
     * 
     * 
     */
    public List<ProjectVersionLite> getProjectVersion() {
        if (projectVersion == null) {
            projectVersion = new ArrayList<ProjectVersionLite>();
        }
        return this.projectVersion;
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
     * Sets the value of the projectVersion property.
     * 
     * @param projectVersion
     *     allowed object is
     *     {@link ProjectVersionLite }
     *     
     */
    public void setProjectVersion(List<ProjectVersionLite> projectVersion) {
        this.projectVersion = projectVersion;
    }

    public ActiveProjectVersionListResponse withProjectVersion(ProjectVersionLite... values) {
        if (values!= null) {
            for (ProjectVersionLite value: values) {
                getProjectVersion().add(value);
            }
        }
        return this;
    }

    public ActiveProjectVersionListResponse withProjectVersion(Collection<ProjectVersionLite> values) {
        if (values!= null) {
            getProjectVersion().addAll(values);
        }
        return this;
    }

    public ActiveProjectVersionListResponse withProjectVersion(List<ProjectVersionLite> projectVersion) {
        setProjectVersion(projectVersion);
        return this;
    }

    @Override
    public ActiveProjectVersionListResponse withCode(long value) {
        setCode(value);
        return this;
    }

    @Override
    public ActiveProjectVersionListResponse withMsg(String value) {
        setMsg(value);
        return this;
    }

    @Override
    public ActiveProjectVersionListResponse withRootCause(RootCause... values) {
        if (values!= null) {
            for (RootCause value: values) {
                getRootCause().add(value);
            }
        }
        return this;
    }

    @Override
    public ActiveProjectVersionListResponse withRootCause(Collection<RootCause> values) {
        if (values!= null) {
            getRootCause().addAll(values);
        }
        return this;
    }

    @Override
    public ActiveProjectVersionListResponse withRootCause(List<RootCause> rootCause) {
        setRootCause(rootCause);
        return this;
    }

}

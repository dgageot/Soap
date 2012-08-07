
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
import xmlns.www_fortifysoftware_com.schema.wstypes.MetaDataDefinition;
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
 *         &lt;element name="ProjectMetaDataDefinition" type="{xmlns://www.fortifysoftware.com/schema/wsTypes}MetaDataDefinition" maxOccurs="unbounded" minOccurs="0"/>
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
    "projectMetaDataDefinition"
})
@XmlRootElement(name = "ProjectMetaDataDefinitionsListResponse")
public class ProjectMetaDataDefinitionsListResponse
    extends Status
{

    @XmlElement(name = "ProjectMetaDataDefinition")
    protected List<MetaDataDefinition> projectMetaDataDefinition;

    /**
     * Default no-arg constructor
     * 
     */
    public ProjectMetaDataDefinitionsListResponse() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ProjectMetaDataDefinitionsListResponse(final long code, final String msg, final List<RootCause> rootCause, final List<MetaDataDefinition> projectMetaDataDefinition) {
        super(code, msg, rootCause);
        this.projectMetaDataDefinition = projectMetaDataDefinition;
    }

    /**
     * Gets the value of the projectMetaDataDefinition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the projectMetaDataDefinition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProjectMetaDataDefinition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MetaDataDefinition }
     * 
     * 
     */
    public List<MetaDataDefinition> getProjectMetaDataDefinition() {
        if (projectMetaDataDefinition == null) {
            projectMetaDataDefinition = new ArrayList<MetaDataDefinition>();
        }
        return this.projectMetaDataDefinition;
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
     * Sets the value of the projectMetaDataDefinition property.
     * 
     * @param projectMetaDataDefinition
     *     allowed object is
     *     {@link MetaDataDefinition }
     *     
     */
    public void setProjectMetaDataDefinition(List<MetaDataDefinition> projectMetaDataDefinition) {
        this.projectMetaDataDefinition = projectMetaDataDefinition;
    }

    public ProjectMetaDataDefinitionsListResponse withProjectMetaDataDefinition(MetaDataDefinition... values) {
        if (values!= null) {
            for (MetaDataDefinition value: values) {
                getProjectMetaDataDefinition().add(value);
            }
        }
        return this;
    }

    public ProjectMetaDataDefinitionsListResponse withProjectMetaDataDefinition(Collection<MetaDataDefinition> values) {
        if (values!= null) {
            getProjectMetaDataDefinition().addAll(values);
        }
        return this;
    }

    public ProjectMetaDataDefinitionsListResponse withProjectMetaDataDefinition(List<MetaDataDefinition> projectMetaDataDefinition) {
        setProjectMetaDataDefinition(projectMetaDataDefinition);
        return this;
    }

    @Override
    public ProjectMetaDataDefinitionsListResponse withCode(long value) {
        setCode(value);
        return this;
    }

    @Override
    public ProjectMetaDataDefinitionsListResponse withMsg(String value) {
        setMsg(value);
        return this;
    }

    @Override
    public ProjectMetaDataDefinitionsListResponse withRootCause(RootCause... values) {
        if (values!= null) {
            for (RootCause value: values) {
                getRootCause().add(value);
            }
        }
        return this;
    }

    @Override
    public ProjectMetaDataDefinitionsListResponse withRootCause(Collection<RootCause> values) {
        if (values!= null) {
            getRootCause().addAll(values);
        }
        return this;
    }

    @Override
    public ProjectMetaDataDefinitionsListResponse withRootCause(List<RootCause> rootCause) {
        setRootCause(rootCause);
        return this;
    }

}

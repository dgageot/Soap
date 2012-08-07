
package com.fortify.schema.fws;

import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import xmlns.www_fortifysoftware_com.schema.wstypes.MetaDataSelectedValue;
import xmlns.www_fortifysoftware_com.schema.wstypes.ProjectIdentifier;
import xmlns.www_fortifysoftware_com.schema.wstypes.ProjectVersionLite;
import xmlns.www_fortifysoftware_com.schema.wstypes.ProjectVersionSpecification;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{xmlns://www.fortifysoftware.com/schema/wsTypes}ProjectVersionSpecification">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "AddProjectVersionRequest")
public class AddProjectVersionRequest
    extends ProjectVersionSpecification
{


    /**
     * Default no-arg constructor
     * 
     */
    public AddProjectVersionRequest() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public AddProjectVersionRequest(final ProjectVersionLite projectVersion, final List<MetaDataSelectedValue> projectMetaDataSelectedValues, final String requirementTemplateId, final List<ProjectIdentifier> dependancy) {
        super(projectVersion, projectMetaDataSelectedValues, requirementTemplateId, dependancy);
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

    @Override
    public AddProjectVersionRequest withProjectVersion(ProjectVersionLite value) {
        setProjectVersion(value);
        return this;
    }

    @Override
    public AddProjectVersionRequest withProjectMetaDataSelectedValues(MetaDataSelectedValue... values) {
        if (values!= null) {
            for (MetaDataSelectedValue value: values) {
                getProjectMetaDataSelectedValues().add(value);
            }
        }
        return this;
    }

    @Override
    public AddProjectVersionRequest withProjectMetaDataSelectedValues(Collection<MetaDataSelectedValue> values) {
        if (values!= null) {
            getProjectMetaDataSelectedValues().addAll(values);
        }
        return this;
    }

    @Override
    public AddProjectVersionRequest withRequirementTemplateId(String value) {
        setRequirementTemplateId(value);
        return this;
    }

    @Override
    public AddProjectVersionRequest withDependancy(ProjectIdentifier... values) {
        if (values!= null) {
            for (ProjectIdentifier value: values) {
                getDependancy().add(value);
            }
        }
        return this;
    }

    @Override
    public AddProjectVersionRequest withDependancy(Collection<ProjectIdentifier> values) {
        if (values!= null) {
            getDependancy().addAll(values);
        }
        return this;
    }

    @Override
    public AddProjectVersionRequest withProjectMetaDataSelectedValues(List<MetaDataSelectedValue> projectMetaDataSelectedValues) {
        setProjectMetaDataSelectedValues(projectMetaDataSelectedValues);
        return this;
    }

    @Override
    public AddProjectVersionRequest withDependancy(List<ProjectIdentifier> dependancy) {
        setDependancy(dependancy);
        return this;
    }

}

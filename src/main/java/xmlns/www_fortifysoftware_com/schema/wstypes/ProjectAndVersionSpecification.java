
package xmlns.www_fortifysoftware_com.schema.wstypes;

import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.fortify.schema.fws.AddProjectAndVersionRequest;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;


/**
 * <p>Java class for ProjectAndVersionSpecification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProjectAndVersionSpecification">
 *   &lt;complexContent>
 *     &lt;extension base="{xmlns://www.fortifysoftware.com/schema/wsTypes}ProjectVersionSpecification">
 *       &lt;sequence>
 *         &lt;element name="Project" type="{xmlns://www.fortifysoftware.com/schema/wsTypes}Project"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProjectAndVersionSpecification", propOrder = {
    "project"
})
@XmlSeeAlso({
    AddProjectAndVersionRequest.class
})
public class ProjectAndVersionSpecification
    extends ProjectVersionSpecification
{

    @XmlElement(name = "Project", required = true)
    protected Project project;

    /**
     * Default no-arg constructor
     * 
     */
    public ProjectAndVersionSpecification() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ProjectAndVersionSpecification(final ProjectVersionLite projectVersion, final List<MetaDataSelectedValue> projectMetaDataSelectedValues, final String requirementTemplateId, final List<ProjectIdentifier> dependancy, final Project project) {
        super(projectVersion, projectMetaDataSelectedValues, requirementTemplateId, dependancy);
        this.project = project;
    }

    /**
     * Gets the value of the project property.
     * 
     * @return
     *     possible object is
     *     {@link Project }
     *     
     */
    public Project getProject() {
        return project;
    }

    /**
     * Sets the value of the project property.
     * 
     * @param value
     *     allowed object is
     *     {@link Project }
     *     
     */
    public void setProject(Project value) {
        this.project = value;
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

    public ProjectAndVersionSpecification withProject(Project value) {
        setProject(value);
        return this;
    }

    @Override
    public ProjectAndVersionSpecification withProjectVersion(ProjectVersionLite value) {
        setProjectVersion(value);
        return this;
    }

    @Override
    public ProjectAndVersionSpecification withProjectMetaDataSelectedValues(MetaDataSelectedValue... values) {
        if (values!= null) {
            for (MetaDataSelectedValue value: values) {
                getProjectMetaDataSelectedValues().add(value);
            }
        }
        return this;
    }

    @Override
    public ProjectAndVersionSpecification withProjectMetaDataSelectedValues(Collection<MetaDataSelectedValue> values) {
        if (values!= null) {
            getProjectMetaDataSelectedValues().addAll(values);
        }
        return this;
    }

    @Override
    public ProjectAndVersionSpecification withRequirementTemplateId(String value) {
        setRequirementTemplateId(value);
        return this;
    }

    @Override
    public ProjectAndVersionSpecification withDependancy(ProjectIdentifier... values) {
        if (values!= null) {
            for (ProjectIdentifier value: values) {
                getDependancy().add(value);
            }
        }
        return this;
    }

    @Override
    public ProjectAndVersionSpecification withDependancy(Collection<ProjectIdentifier> values) {
        if (values!= null) {
            getDependancy().addAll(values);
        }
        return this;
    }

    @Override
    public ProjectAndVersionSpecification withProjectMetaDataSelectedValues(List<MetaDataSelectedValue> projectMetaDataSelectedValues) {
        setProjectMetaDataSelectedValues(projectMetaDataSelectedValues);
        return this;
    }

    @Override
    public ProjectAndVersionSpecification withDependancy(List<ProjectIdentifier> dependancy) {
        setDependancy(dependancy);
        return this;
    }

}

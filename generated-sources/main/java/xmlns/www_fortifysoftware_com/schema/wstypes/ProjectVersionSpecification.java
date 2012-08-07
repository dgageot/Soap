
package xmlns.www_fortifysoftware_com.schema.wstypes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.fortify.schema.fws.AddProjectVersionRequest;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;


/**
 * <p>Java class for ProjectVersionSpecification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProjectVersionSpecification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProjectVersion" type="{xmlns://www.fortifysoftware.com/schema/wsTypes}ProjectVersionLite"/>
 *         &lt;element name="ProjectMetaDataSelectedValues" type="{xmlns://www.fortifysoftware.com/schema/wsTypes}MetaDataSelectedValue" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RequirementTemplateId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Dependancy" type="{xmlns://www.fortifysoftware.com/schema/wsTypes}ProjectIdentifier" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProjectVersionSpecification", propOrder = {
    "projectVersion",
    "projectMetaDataSelectedValues",
    "requirementTemplateId",
    "dependancy"
})
@XmlSeeAlso({
    ProjectAndVersionSpecification.class,
    AddProjectVersionRequest.class
})
public class ProjectVersionSpecification {

    @XmlElement(name = "ProjectVersion", required = true)
    protected ProjectVersionLite projectVersion;
    @XmlElement(name = "ProjectMetaDataSelectedValues")
    protected List<MetaDataSelectedValue> projectMetaDataSelectedValues;
    @XmlElement(name = "RequirementTemplateId")
    protected String requirementTemplateId;
    @XmlElement(name = "Dependancy")
    protected List<ProjectIdentifier> dependancy;

    /**
     * Default no-arg constructor
     * 
     */
    public ProjectVersionSpecification() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ProjectVersionSpecification(final ProjectVersionLite projectVersion, final List<MetaDataSelectedValue> projectMetaDataSelectedValues, final String requirementTemplateId, final List<ProjectIdentifier> dependancy) {
        this.projectVersion = projectVersion;
        this.projectMetaDataSelectedValues = projectMetaDataSelectedValues;
        this.requirementTemplateId = requirementTemplateId;
        this.dependancy = dependancy;
    }

    /**
     * Gets the value of the projectVersion property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectVersionLite }
     *     
     */
    public ProjectVersionLite getProjectVersion() {
        return projectVersion;
    }

    /**
     * Sets the value of the projectVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectVersionLite }
     *     
     */
    public void setProjectVersion(ProjectVersionLite value) {
        this.projectVersion = value;
    }

    /**
     * Gets the value of the projectMetaDataSelectedValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the projectMetaDataSelectedValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProjectMetaDataSelectedValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MetaDataSelectedValue }
     * 
     * 
     */
    public List<MetaDataSelectedValue> getProjectMetaDataSelectedValues() {
        if (projectMetaDataSelectedValues == null) {
            projectMetaDataSelectedValues = new ArrayList<MetaDataSelectedValue>();
        }
        return this.projectMetaDataSelectedValues;
    }

    /**
     * Gets the value of the requirementTemplateId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequirementTemplateId() {
        return requirementTemplateId;
    }

    /**
     * Sets the value of the requirementTemplateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequirementTemplateId(String value) {
        this.requirementTemplateId = value;
    }

    /**
     * Gets the value of the dependancy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dependancy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDependancy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProjectIdentifier }
     * 
     * 
     */
    public List<ProjectIdentifier> getDependancy() {
        if (dependancy == null) {
            dependancy = new ArrayList<ProjectIdentifier>();
        }
        return this.dependancy;
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
     * Sets the value of the projectMetaDataSelectedValues property.
     * 
     * @param projectMetaDataSelectedValues
     *     allowed object is
     *     {@link MetaDataSelectedValue }
     *     
     */
    public void setProjectMetaDataSelectedValues(List<MetaDataSelectedValue> projectMetaDataSelectedValues) {
        this.projectMetaDataSelectedValues = projectMetaDataSelectedValues;
    }

    /**
     * Sets the value of the dependancy property.
     * 
     * @param dependancy
     *     allowed object is
     *     {@link ProjectIdentifier }
     *     
     */
    public void setDependancy(List<ProjectIdentifier> dependancy) {
        this.dependancy = dependancy;
    }

    public ProjectVersionSpecification withProjectVersion(ProjectVersionLite value) {
        setProjectVersion(value);
        return this;
    }

    public ProjectVersionSpecification withProjectMetaDataSelectedValues(MetaDataSelectedValue... values) {
        if (values!= null) {
            for (MetaDataSelectedValue value: values) {
                getProjectMetaDataSelectedValues().add(value);
            }
        }
        return this;
    }

    public ProjectVersionSpecification withProjectMetaDataSelectedValues(Collection<MetaDataSelectedValue> values) {
        if (values!= null) {
            getProjectMetaDataSelectedValues().addAll(values);
        }
        return this;
    }

    public ProjectVersionSpecification withRequirementTemplateId(String value) {
        setRequirementTemplateId(value);
        return this;
    }

    public ProjectVersionSpecification withDependancy(ProjectIdentifier... values) {
        if (values!= null) {
            for (ProjectIdentifier value: values) {
                getDependancy().add(value);
            }
        }
        return this;
    }

    public ProjectVersionSpecification withDependancy(Collection<ProjectIdentifier> values) {
        if (values!= null) {
            getDependancy().addAll(values);
        }
        return this;
    }

    public ProjectVersionSpecification withProjectMetaDataSelectedValues(List<MetaDataSelectedValue> projectMetaDataSelectedValues) {
        setProjectMetaDataSelectedValues(projectMetaDataSelectedValues);
        return this;
    }

    public ProjectVersionSpecification withDependancy(List<ProjectIdentifier> dependancy) {
        setDependancy(dependancy);
        return this;
    }

}

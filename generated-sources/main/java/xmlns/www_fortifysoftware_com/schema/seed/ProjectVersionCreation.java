
package xmlns.www_fortifysoftware_com.schema.seed;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import xmlns.www_fortifysoftware_com.schema.wstypes.ProjectVersionSpecification;


/**
 * <p>Java class for ProjectVersionCreation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProjectVersionCreation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProjectName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ProjectVersionSpecification" type="{xmlns://www.fortifysoftware.com/schema/wsTypes}ProjectVersionSpecification"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProjectVersionCreation", propOrder = {
    "projectName",
    "projectVersionSpecification"
})
public class ProjectVersionCreation {

    @XmlElement(name = "ProjectName", required = true)
    protected String projectName;
    @XmlElement(name = "ProjectVersionSpecification", required = true)
    protected ProjectVersionSpecification projectVersionSpecification;

    /**
     * Default no-arg constructor
     * 
     */
    public ProjectVersionCreation() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ProjectVersionCreation(final String projectName, final ProjectVersionSpecification projectVersionSpecification) {
        this.projectName = projectName;
        this.projectVersionSpecification = projectVersionSpecification;
    }

    /**
     * Gets the value of the projectName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * Sets the value of the projectName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectName(String value) {
        this.projectName = value;
    }

    /**
     * Gets the value of the projectVersionSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectVersionSpecification }
     *     
     */
    public ProjectVersionSpecification getProjectVersionSpecification() {
        return projectVersionSpecification;
    }

    /**
     * Sets the value of the projectVersionSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectVersionSpecification }
     *     
     */
    public void setProjectVersionSpecification(ProjectVersionSpecification value) {
        this.projectVersionSpecification = value;
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

    public ProjectVersionCreation withProjectName(String value) {
        setProjectName(value);
        return this;
    }

    public ProjectVersionCreation withProjectVersionSpecification(ProjectVersionSpecification value) {
        setProjectVersionSpecification(value);
        return this;
    }

}

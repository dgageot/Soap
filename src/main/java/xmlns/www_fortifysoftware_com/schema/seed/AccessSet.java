
package xmlns.www_fortifysoftware_com.schema.seed;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import xmlns.www_fortifysoftware_com.schema.wstypes.AccessAssignment;
import xmlns.www_fortifysoftware_com.schema.wstypes.ProjectAndVersionSpecification;


/**
 * <p>Java class for AccessSet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccessSet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProjectAndVersionSpec" type="{xmlns://www.fortifysoftware.com/schema/wsTypes}ProjectAndVersionSpecification" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ProjectVersionSpec" type="{xmlns://www.fortifysoftware.com/schema/seed}ProjectVersionCreation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Access" type="{xmlns://www.fortifysoftware.com/schema/wsTypes}AccessAssignment" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccessSet", propOrder = {
    "projectAndVersionSpec",
    "projectVersionSpec",
    "access"
})
public class AccessSet {

    @XmlElement(name = "ProjectAndVersionSpec")
    protected List<ProjectAndVersionSpecification> projectAndVersionSpec;
    @XmlElement(name = "ProjectVersionSpec")
    protected List<ProjectVersionCreation> projectVersionSpec;
    @XmlElement(name = "Access")
    protected AccessAssignment access;

    /**
     * Default no-arg constructor
     * 
     */
    public AccessSet() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public AccessSet(final List<ProjectAndVersionSpecification> projectAndVersionSpec, final List<ProjectVersionCreation> projectVersionSpec, final AccessAssignment access) {
        this.projectAndVersionSpec = projectAndVersionSpec;
        this.projectVersionSpec = projectVersionSpec;
        this.access = access;
    }

    /**
     * Gets the value of the projectAndVersionSpec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the projectAndVersionSpec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProjectAndVersionSpec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProjectAndVersionSpecification }
     * 
     * 
     */
    public List<ProjectAndVersionSpecification> getProjectAndVersionSpec() {
        if (projectAndVersionSpec == null) {
            projectAndVersionSpec = new ArrayList<ProjectAndVersionSpecification>();
        }
        return this.projectAndVersionSpec;
    }

    /**
     * Gets the value of the projectVersionSpec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the projectVersionSpec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProjectVersionSpec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProjectVersionCreation }
     * 
     * 
     */
    public List<ProjectVersionCreation> getProjectVersionSpec() {
        if (projectVersionSpec == null) {
            projectVersionSpec = new ArrayList<ProjectVersionCreation>();
        }
        return this.projectVersionSpec;
    }

    /**
     * Gets the value of the access property.
     * 
     * @return
     *     possible object is
     *     {@link AccessAssignment }
     *     
     */
    public AccessAssignment getAccess() {
        return access;
    }

    /**
     * Sets the value of the access property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessAssignment }
     *     
     */
    public void setAccess(AccessAssignment value) {
        this.access = value;
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
     * Sets the value of the projectAndVersionSpec property.
     * 
     * @param projectAndVersionSpec
     *     allowed object is
     *     {@link ProjectAndVersionSpecification }
     *     
     */
    public void setProjectAndVersionSpec(List<ProjectAndVersionSpecification> projectAndVersionSpec) {
        this.projectAndVersionSpec = projectAndVersionSpec;
    }

    /**
     * Sets the value of the projectVersionSpec property.
     * 
     * @param projectVersionSpec
     *     allowed object is
     *     {@link ProjectVersionCreation }
     *     
     */
    public void setProjectVersionSpec(List<ProjectVersionCreation> projectVersionSpec) {
        this.projectVersionSpec = projectVersionSpec;
    }

    public AccessSet withProjectAndVersionSpec(ProjectAndVersionSpecification... values) {
        if (values!= null) {
            for (ProjectAndVersionSpecification value: values) {
                getProjectAndVersionSpec().add(value);
            }
        }
        return this;
    }

    public AccessSet withProjectAndVersionSpec(Collection<ProjectAndVersionSpecification> values) {
        if (values!= null) {
            getProjectAndVersionSpec().addAll(values);
        }
        return this;
    }

    public AccessSet withProjectVersionSpec(ProjectVersionCreation... values) {
        if (values!= null) {
            for (ProjectVersionCreation value: values) {
                getProjectVersionSpec().add(value);
            }
        }
        return this;
    }

    public AccessSet withProjectVersionSpec(Collection<ProjectVersionCreation> values) {
        if (values!= null) {
            getProjectVersionSpec().addAll(values);
        }
        return this;
    }

    public AccessSet withAccess(AccessAssignment value) {
        setAccess(value);
        return this;
    }

    public AccessSet withProjectAndVersionSpec(List<ProjectAndVersionSpecification> projectAndVersionSpec) {
        setProjectAndVersionSpec(projectAndVersionSpec);
        return this;
    }

    public AccessSet withProjectVersionSpec(List<ProjectVersionCreation> projectVersionSpec) {
        setProjectVersionSpec(projectVersionSpec);
        return this;
    }

}

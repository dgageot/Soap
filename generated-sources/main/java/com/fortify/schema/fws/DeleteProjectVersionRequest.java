
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
import xmlns.www_fortifysoftware_com.schema.wstypes.ProjectIdentifier;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProjectVersionId" type="{xmlns://www.fortifysoftware.com/schema/wsTypes}ProjectIdentifier" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "projectVersionId"
})
@XmlRootElement(name = "DeleteProjectVersionRequest")
public class DeleteProjectVersionRequest {

    @XmlElement(name = "ProjectVersionId", required = true)
    protected List<ProjectIdentifier> projectVersionId;

    /**
     * Default no-arg constructor
     * 
     */
    public DeleteProjectVersionRequest() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public DeleteProjectVersionRequest(final List<ProjectIdentifier> projectVersionId) {
        this.projectVersionId = projectVersionId;
    }

    /**
     * Gets the value of the projectVersionId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the projectVersionId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProjectVersionId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProjectIdentifier }
     * 
     * 
     */
    public List<ProjectIdentifier> getProjectVersionId() {
        if (projectVersionId == null) {
            projectVersionId = new ArrayList<ProjectIdentifier>();
        }
        return this.projectVersionId;
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
     * Sets the value of the projectVersionId property.
     * 
     * @param projectVersionId
     *     allowed object is
     *     {@link ProjectIdentifier }
     *     
     */
    public void setProjectVersionId(List<ProjectIdentifier> projectVersionId) {
        this.projectVersionId = projectVersionId;
    }

    public DeleteProjectVersionRequest withProjectVersionId(ProjectIdentifier... values) {
        if (values!= null) {
            for (ProjectIdentifier value: values) {
                getProjectVersionId().add(value);
            }
        }
        return this;
    }

    public DeleteProjectVersionRequest withProjectVersionId(Collection<ProjectIdentifier> values) {
        if (values!= null) {
            getProjectVersionId().addAll(values);
        }
        return this;
    }

    public DeleteProjectVersionRequest withProjectVersionId(List<ProjectIdentifier> projectVersionId) {
        setProjectVersionId(projectVersionId);
        return this;
    }

}

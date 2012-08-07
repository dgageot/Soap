
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
 *         &lt;element name="ProjectId" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded"/>
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
    "projectId"
})
@XmlRootElement(name = "DeleteUserRequest")
public class DeleteUserRequest {

    @XmlElement(name = "ProjectId", type = Long.class)
    protected List<Long> projectId;

    /**
     * Default no-arg constructor
     * 
     */
    public DeleteUserRequest() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public DeleteUserRequest(final List<Long> projectId) {
        this.projectId = projectId;
    }

    /**
     * Gets the value of the projectId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the projectId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProjectId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getProjectId() {
        if (projectId == null) {
            projectId = new ArrayList<Long>();
        }
        return this.projectId;
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
     * Sets the value of the projectId property.
     * 
     * @param projectId
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProjectId(List<Long> projectId) {
        this.projectId = projectId;
    }

    public DeleteUserRequest withProjectId(Long... values) {
        if (values!= null) {
            for (Long value: values) {
                getProjectId().add(value);
            }
        }
        return this;
    }

    public DeleteUserRequest withProjectId(Collection<Long> values) {
        if (values!= null) {
            getProjectId().addAll(values);
        }
        return this;
    }

    public DeleteUserRequest withProjectId(List<Long> projectId) {
        setProjectId(projectId);
        return this;
    }

}

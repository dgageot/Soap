
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
import xmlns.www_fortifysoftware_com.schema.wstypes.AlertDefinition;


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
 *         &lt;element name="ProjectVersionIds" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded"/>
 *         &lt;element name="AlertDefinition" type="{xmlns://www.fortifysoftware.com/schema/wsTypes}AlertDefinition"/>
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
    "projectVersionIds",
    "alertDefinition"
})
@XmlRootElement(name = "UpdateAlertDefinitionForSelfRequest")
public class UpdateAlertDefinitionForSelfRequest {

    @XmlElement(name = "ProjectVersionIds", type = Long.class)
    protected List<Long> projectVersionIds;
    @XmlElement(name = "AlertDefinition", required = true)
    protected AlertDefinition alertDefinition;

    /**
     * Default no-arg constructor
     * 
     */
    public UpdateAlertDefinitionForSelfRequest() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public UpdateAlertDefinitionForSelfRequest(final List<Long> projectVersionIds, final AlertDefinition alertDefinition) {
        this.projectVersionIds = projectVersionIds;
        this.alertDefinition = alertDefinition;
    }

    /**
     * Gets the value of the projectVersionIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the projectVersionIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProjectVersionIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getProjectVersionIds() {
        if (projectVersionIds == null) {
            projectVersionIds = new ArrayList<Long>();
        }
        return this.projectVersionIds;
    }

    /**
     * Gets the value of the alertDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link AlertDefinition }
     *     
     */
    public AlertDefinition getAlertDefinition() {
        return alertDefinition;
    }

    /**
     * Sets the value of the alertDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlertDefinition }
     *     
     */
    public void setAlertDefinition(AlertDefinition value) {
        this.alertDefinition = value;
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
     * Sets the value of the projectVersionIds property.
     * 
     * @param projectVersionIds
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProjectVersionIds(List<Long> projectVersionIds) {
        this.projectVersionIds = projectVersionIds;
    }

    public UpdateAlertDefinitionForSelfRequest withProjectVersionIds(Long... values) {
        if (values!= null) {
            for (Long value: values) {
                getProjectVersionIds().add(value);
            }
        }
        return this;
    }

    public UpdateAlertDefinitionForSelfRequest withProjectVersionIds(Collection<Long> values) {
        if (values!= null) {
            getProjectVersionIds().addAll(values);
        }
        return this;
    }

    public UpdateAlertDefinitionForSelfRequest withAlertDefinition(AlertDefinition value) {
        setAlertDefinition(value);
        return this;
    }

    public UpdateAlertDefinitionForSelfRequest withProjectVersionIds(List<Long> projectVersionIds) {
        setProjectVersionIds(projectVersionIds);
        return this;
    }

}

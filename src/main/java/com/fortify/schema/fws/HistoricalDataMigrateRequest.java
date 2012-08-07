
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
import xmlns.www_fortifysoftware_com.schema.wstypes.ProjectHistory;


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
 *         &lt;element name="ProjectHistory" type="{xmlns://www.fortifysoftware.com/schema/wsTypes}ProjectHistory" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SharedSecret" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "projectHistory",
    "sharedSecret"
})
@XmlRootElement(name = "HistoricalDataMigrateRequest")
public class HistoricalDataMigrateRequest {

    @XmlElement(name = "ProjectHistory")
    protected List<ProjectHistory> projectHistory;
    @XmlElement(name = "SharedSecret", required = true)
    protected String sharedSecret;

    /**
     * Default no-arg constructor
     * 
     */
    public HistoricalDataMigrateRequest() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public HistoricalDataMigrateRequest(final List<ProjectHistory> projectHistory, final String sharedSecret) {
        this.projectHistory = projectHistory;
        this.sharedSecret = sharedSecret;
    }

    /**
     * Gets the value of the projectHistory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the projectHistory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProjectHistory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProjectHistory }
     * 
     * 
     */
    public List<ProjectHistory> getProjectHistory() {
        if (projectHistory == null) {
            projectHistory = new ArrayList<ProjectHistory>();
        }
        return this.projectHistory;
    }

    /**
     * Gets the value of the sharedSecret property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSharedSecret() {
        return sharedSecret;
    }

    /**
     * Sets the value of the sharedSecret property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSharedSecret(String value) {
        this.sharedSecret = value;
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
     * Sets the value of the projectHistory property.
     * 
     * @param projectHistory
     *     allowed object is
     *     {@link ProjectHistory }
     *     
     */
    public void setProjectHistory(List<ProjectHistory> projectHistory) {
        this.projectHistory = projectHistory;
    }

    public HistoricalDataMigrateRequest withProjectHistory(ProjectHistory... values) {
        if (values!= null) {
            for (ProjectHistory value: values) {
                getProjectHistory().add(value);
            }
        }
        return this;
    }

    public HistoricalDataMigrateRequest withProjectHistory(Collection<ProjectHistory> values) {
        if (values!= null) {
            getProjectHistory().addAll(values);
        }
        return this;
    }

    public HistoricalDataMigrateRequest withSharedSecret(String value) {
        setSharedSecret(value);
        return this;
    }

    public HistoricalDataMigrateRequest withProjectHistory(List<ProjectHistory> projectHistory) {
        setProjectHistory(projectHistory);
        return this;
    }

}

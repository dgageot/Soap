
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
 *         &lt;element name="ProjectVersionId" type="{xmlns://www.fortifysoftware.com/schema/wsTypes}ProjectIdentifier"/>
 *         &lt;element name="ConfirmedAnalysisFiles" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
    "projectVersionId",
    "confirmedAnalysisFiles"
})
@XmlRootElement(name = "AnalysisPayloadDispatchRequest")
public class AnalysisPayloadDispatchRequest {

    @XmlElement(name = "ProjectVersionId", required = true)
    protected ProjectIdentifier projectVersionId;
    @XmlElement(name = "ConfirmedAnalysisFiles")
    protected List<String> confirmedAnalysisFiles;

    /**
     * Default no-arg constructor
     * 
     */
    public AnalysisPayloadDispatchRequest() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public AnalysisPayloadDispatchRequest(final ProjectIdentifier projectVersionId, final List<String> confirmedAnalysisFiles) {
        this.projectVersionId = projectVersionId;
        this.confirmedAnalysisFiles = confirmedAnalysisFiles;
    }

    /**
     * Gets the value of the projectVersionId property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectIdentifier }
     *     
     */
    public ProjectIdentifier getProjectVersionId() {
        return projectVersionId;
    }

    /**
     * Sets the value of the projectVersionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectIdentifier }
     *     
     */
    public void setProjectVersionId(ProjectIdentifier value) {
        this.projectVersionId = value;
    }

    /**
     * Gets the value of the confirmedAnalysisFiles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the confirmedAnalysisFiles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConfirmedAnalysisFiles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getConfirmedAnalysisFiles() {
        if (confirmedAnalysisFiles == null) {
            confirmedAnalysisFiles = new ArrayList<String>();
        }
        return this.confirmedAnalysisFiles;
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
     * Sets the value of the confirmedAnalysisFiles property.
     * 
     * @param confirmedAnalysisFiles
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfirmedAnalysisFiles(List<String> confirmedAnalysisFiles) {
        this.confirmedAnalysisFiles = confirmedAnalysisFiles;
    }

    public AnalysisPayloadDispatchRequest withProjectVersionId(ProjectIdentifier value) {
        setProjectVersionId(value);
        return this;
    }

    public AnalysisPayloadDispatchRequest withConfirmedAnalysisFiles(String... values) {
        if (values!= null) {
            for (String value: values) {
                getConfirmedAnalysisFiles().add(value);
            }
        }
        return this;
    }

    public AnalysisPayloadDispatchRequest withConfirmedAnalysisFiles(Collection<String> values) {
        if (values!= null) {
            getConfirmedAnalysisFiles().addAll(values);
        }
        return this;
    }

    public AnalysisPayloadDispatchRequest withConfirmedAnalysisFiles(List<String> confirmedAnalysisFiles) {
        setConfirmedAnalysisFiles(confirmedAnalysisFiles);
        return this;
    }

}


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
import xmlns.www_fortifysoftware_com.schema.wstypes.TagDefinition;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fortify.com/schema/fws}ClientVersionRequest">
 *       &lt;sequence>
 *         &lt;element name="ProjectVersionId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ProjectTemplateId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TagDefinition" type="{xmlns://www.fortifysoftware.com/schema/wsTypes}TagDefinition" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "projectVersionId",
    "projectTemplateId",
    "tagDefinition"
})
@XmlRootElement(name = "BatchCreateUpdateAndAssignCustomTagsRequest")
public class BatchCreateUpdateAndAssignCustomTagsRequest
    extends ClientVersionRequest
{

    @XmlElement(name = "ProjectVersionId")
    protected Long projectVersionId;
    @XmlElement(name = "ProjectTemplateId")
    protected String projectTemplateId;
    @XmlElement(name = "TagDefinition", required = true)
    protected List<TagDefinition> tagDefinition;

    /**
     * Default no-arg constructor
     * 
     */
    public BatchCreateUpdateAndAssignCustomTagsRequest() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public BatchCreateUpdateAndAssignCustomTagsRequest(final String clientVersion, final Long projectVersionId, final String projectTemplateId, final List<TagDefinition> tagDefinition) {
        super(clientVersion);
        this.projectVersionId = projectVersionId;
        this.projectTemplateId = projectTemplateId;
        this.tagDefinition = tagDefinition;
    }

    /**
     * Gets the value of the projectVersionId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProjectVersionId() {
        return projectVersionId;
    }

    /**
     * Sets the value of the projectVersionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProjectVersionId(Long value) {
        this.projectVersionId = value;
    }

    /**
     * Gets the value of the projectTemplateId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectTemplateId() {
        return projectTemplateId;
    }

    /**
     * Sets the value of the projectTemplateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectTemplateId(String value) {
        this.projectTemplateId = value;
    }

    /**
     * Gets the value of the tagDefinition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tagDefinition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTagDefinition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TagDefinition }
     * 
     * 
     */
    public List<TagDefinition> getTagDefinition() {
        if (tagDefinition == null) {
            tagDefinition = new ArrayList<TagDefinition>();
        }
        return this.tagDefinition;
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
     * Sets the value of the tagDefinition property.
     * 
     * @param tagDefinition
     *     allowed object is
     *     {@link TagDefinition }
     *     
     */
    public void setTagDefinition(List<TagDefinition> tagDefinition) {
        this.tagDefinition = tagDefinition;
    }

    public BatchCreateUpdateAndAssignCustomTagsRequest withProjectVersionId(Long value) {
        setProjectVersionId(value);
        return this;
    }

    public BatchCreateUpdateAndAssignCustomTagsRequest withProjectTemplateId(String value) {
        setProjectTemplateId(value);
        return this;
    }

    public BatchCreateUpdateAndAssignCustomTagsRequest withTagDefinition(TagDefinition... values) {
        if (values!= null) {
            for (TagDefinition value: values) {
                getTagDefinition().add(value);
            }
        }
        return this;
    }

    public BatchCreateUpdateAndAssignCustomTagsRequest withTagDefinition(Collection<TagDefinition> values) {
        if (values!= null) {
            getTagDefinition().addAll(values);
        }
        return this;
    }

    public BatchCreateUpdateAndAssignCustomTagsRequest withTagDefinition(List<TagDefinition> tagDefinition) {
        setTagDefinition(tagDefinition);
        return this;
    }

    @Override
    public BatchCreateUpdateAndAssignCustomTagsRequest withClientVersion(String value) {
        setClientVersion(value);
        return this;
    }

}

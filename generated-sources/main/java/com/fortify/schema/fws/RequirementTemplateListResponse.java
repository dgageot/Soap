
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
import xmlns.www_fortifysoftware_com.schema.activitytemplate.RequirementTemplate;
import xmlns.www_fortifysoftware_com.schema.wstypes.RootCause;
import xmlns.www_fortifysoftware_com.schema.wstypes.Status;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{xmlns://www.fortifysoftware.com/schema/wsTypes}status">
 *       &lt;sequence>
 *         &lt;element ref="{xmlns://www.fortifysoftware.com/schema/activitytemplate}RequirementTemplate" maxOccurs="unbounded" minOccurs="0"/>
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
    "requirementTemplate"
})
@XmlRootElement(name = "RequirementTemplateListResponse")
public class RequirementTemplateListResponse
    extends Status
{

    @XmlElement(name = "RequirementTemplate", namespace = "xmlns://www.fortifysoftware.com/schema/activitytemplate")
    protected List<RequirementTemplate> requirementTemplate;

    /**
     * Default no-arg constructor
     * 
     */
    public RequirementTemplateListResponse() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public RequirementTemplateListResponse(final long code, final String msg, final List<RootCause> rootCause, final List<RequirementTemplate> requirementTemplate) {
        super(code, msg, rootCause);
        this.requirementTemplate = requirementTemplate;
    }

    /**
     * Gets the value of the requirementTemplate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requirementTemplate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequirementTemplate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequirementTemplate }
     * 
     * 
     */
    public List<RequirementTemplate> getRequirementTemplate() {
        if (requirementTemplate == null) {
            requirementTemplate = new ArrayList<RequirementTemplate>();
        }
        return this.requirementTemplate;
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
     * Sets the value of the requirementTemplate property.
     * 
     * @param requirementTemplate
     *     allowed object is
     *     {@link RequirementTemplate }
     *     
     */
    public void setRequirementTemplate(List<RequirementTemplate> requirementTemplate) {
        this.requirementTemplate = requirementTemplate;
    }

    public RequirementTemplateListResponse withRequirementTemplate(RequirementTemplate... values) {
        if (values!= null) {
            for (RequirementTemplate value: values) {
                getRequirementTemplate().add(value);
            }
        }
        return this;
    }

    public RequirementTemplateListResponse withRequirementTemplate(Collection<RequirementTemplate> values) {
        if (values!= null) {
            getRequirementTemplate().addAll(values);
        }
        return this;
    }

    public RequirementTemplateListResponse withRequirementTemplate(List<RequirementTemplate> requirementTemplate) {
        setRequirementTemplate(requirementTemplate);
        return this;
    }

    @Override
    public RequirementTemplateListResponse withCode(long value) {
        setCode(value);
        return this;
    }

    @Override
    public RequirementTemplateListResponse withMsg(String value) {
        setMsg(value);
        return this;
    }

    @Override
    public RequirementTemplateListResponse withRootCause(RootCause... values) {
        if (values!= null) {
            for (RootCause value: values) {
                getRootCause().add(value);
            }
        }
        return this;
    }

    @Override
    public RequirementTemplateListResponse withRootCause(Collection<RootCause> values) {
        if (values!= null) {
            getRootCause().addAll(values);
        }
        return this;
    }

    @Override
    public RequirementTemplateListResponse withRootCause(List<RootCause> rootCause) {
        setRootCause(rootCause);
        return this;
    }

}


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
import xmlns.www_fortifysoftware_com.schema.wstypes.RootCause;
import xmlns.www_fortifysoftware_com.schema.wstypes.Status;
import xmlns.www_fortifysoftware_com.schema.wstypes.TemplateAssignmentRule;


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
 *         &lt;element name="ActivityTemplateAssignmentRule" type="{xmlns://www.fortifysoftware.com/schema/wsTypes}TemplateAssignmentRule" maxOccurs="unbounded" minOccurs="0"/>
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
    "activityTemplateAssignmentRule"
})
@XmlRootElement(name = "ActivityTemplateAssignmentRuleListResponse")
public class ActivityTemplateAssignmentRuleListResponse
    extends Status
{

    @XmlElement(name = "ActivityTemplateAssignmentRule")
    protected List<TemplateAssignmentRule> activityTemplateAssignmentRule;

    /**
     * Default no-arg constructor
     * 
     */
    public ActivityTemplateAssignmentRuleListResponse() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ActivityTemplateAssignmentRuleListResponse(final long code, final String msg, final List<RootCause> rootCause, final List<TemplateAssignmentRule> activityTemplateAssignmentRule) {
        super(code, msg, rootCause);
        this.activityTemplateAssignmentRule = activityTemplateAssignmentRule;
    }

    /**
     * Gets the value of the activityTemplateAssignmentRule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the activityTemplateAssignmentRule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActivityTemplateAssignmentRule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TemplateAssignmentRule }
     * 
     * 
     */
    public List<TemplateAssignmentRule> getActivityTemplateAssignmentRule() {
        if (activityTemplateAssignmentRule == null) {
            activityTemplateAssignmentRule = new ArrayList<TemplateAssignmentRule>();
        }
        return this.activityTemplateAssignmentRule;
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
     * Sets the value of the activityTemplateAssignmentRule property.
     * 
     * @param activityTemplateAssignmentRule
     *     allowed object is
     *     {@link TemplateAssignmentRule }
     *     
     */
    public void setActivityTemplateAssignmentRule(List<TemplateAssignmentRule> activityTemplateAssignmentRule) {
        this.activityTemplateAssignmentRule = activityTemplateAssignmentRule;
    }

    public ActivityTemplateAssignmentRuleListResponse withActivityTemplateAssignmentRule(TemplateAssignmentRule... values) {
        if (values!= null) {
            for (TemplateAssignmentRule value: values) {
                getActivityTemplateAssignmentRule().add(value);
            }
        }
        return this;
    }

    public ActivityTemplateAssignmentRuleListResponse withActivityTemplateAssignmentRule(Collection<TemplateAssignmentRule> values) {
        if (values!= null) {
            getActivityTemplateAssignmentRule().addAll(values);
        }
        return this;
    }

    public ActivityTemplateAssignmentRuleListResponse withActivityTemplateAssignmentRule(List<TemplateAssignmentRule> activityTemplateAssignmentRule) {
        setActivityTemplateAssignmentRule(activityTemplateAssignmentRule);
        return this;
    }

    @Override
    public ActivityTemplateAssignmentRuleListResponse withCode(long value) {
        setCode(value);
        return this;
    }

    @Override
    public ActivityTemplateAssignmentRuleListResponse withMsg(String value) {
        setMsg(value);
        return this;
    }

    @Override
    public ActivityTemplateAssignmentRuleListResponse withRootCause(RootCause... values) {
        if (values!= null) {
            for (RootCause value: values) {
                getRootCause().add(value);
            }
        }
        return this;
    }

    @Override
    public ActivityTemplateAssignmentRuleListResponse withRootCause(Collection<RootCause> values) {
        if (values!= null) {
            getRootCause().addAll(values);
        }
        return this;
    }

    @Override
    public ActivityTemplateAssignmentRuleListResponse withRootCause(List<RootCause> rootCause) {
        setRootCause(rootCause);
        return this;
    }

}

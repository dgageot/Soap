
package com.fortify.schema.fws;

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
import xmlns.www_fortifysoftware_com.schema.activitytemplate.ActivityDefinition;
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
 *         &lt;element ref="{xmlns://www.fortifysoftware.com/schema/activitytemplate}ActivityDefinition"/>
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
    "activityDefinition"
})
@XmlRootElement(name = "ActivityListResponse")
public class ActivityListResponse
    extends Status
{

    @XmlElement(name = "ActivityDefinition", namespace = "xmlns://www.fortifysoftware.com/schema/activitytemplate", required = true)
    protected ActivityDefinition activityDefinition;

    /**
     * Default no-arg constructor
     * 
     */
    public ActivityListResponse() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ActivityListResponse(final long code, final String msg, final List<RootCause> rootCause, final ActivityDefinition activityDefinition) {
        super(code, msg, rootCause);
        this.activityDefinition = activityDefinition;
    }

    /**
     * Gets the value of the activityDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link ActivityDefinition }
     *     
     */
    public ActivityDefinition getActivityDefinition() {
        return activityDefinition;
    }

    /**
     * Sets the value of the activityDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivityDefinition }
     *     
     */
    public void setActivityDefinition(ActivityDefinition value) {
        this.activityDefinition = value;
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

    public ActivityListResponse withActivityDefinition(ActivityDefinition value) {
        setActivityDefinition(value);
        return this;
    }

    @Override
    public ActivityListResponse withCode(long value) {
        setCode(value);
        return this;
    }

    @Override
    public ActivityListResponse withMsg(String value) {
        setMsg(value);
        return this;
    }

    @Override
    public ActivityListResponse withRootCause(RootCause... values) {
        if (values!= null) {
            for (RootCause value: values) {
                getRootCause().add(value);
            }
        }
        return this;
    }

    @Override
    public ActivityListResponse withRootCause(Collection<RootCause> values) {
        if (values!= null) {
            getRootCause().addAll(values);
        }
        return this;
    }

    @Override
    public ActivityListResponse withRootCause(List<RootCause> rootCause) {
        setRootCause(rootCause);
        return this;
    }

}


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
import xmlns.www_fortifysoftware_com.schema.activitytemplate.SdlAssignmentRuleList;
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
 *         &lt;element ref="{xmlns://www.fortifysoftware.com/schema/activitytemplate}SDLAssignmentRuleList"/>
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
    "sdlAssignmentRuleList"
})
@XmlRootElement(name = "TemplateAssignmentRuleListResponse")
public class TemplateAssignmentRuleListResponse
    extends Status
{

    @XmlElement(name = "SDLAssignmentRuleList", namespace = "xmlns://www.fortifysoftware.com/schema/activitytemplate", required = true)
    protected SdlAssignmentRuleList sdlAssignmentRuleList;

    /**
     * Default no-arg constructor
     * 
     */
    public TemplateAssignmentRuleListResponse() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public TemplateAssignmentRuleListResponse(final long code, final String msg, final List<RootCause> rootCause, final SdlAssignmentRuleList sdlAssignmentRuleList) {
        super(code, msg, rootCause);
        this.sdlAssignmentRuleList = sdlAssignmentRuleList;
    }

    /**
     * Gets the value of the sdlAssignmentRuleList property.
     * 
     * @return
     *     possible object is
     *     {@link SdlAssignmentRuleList }
     *     
     */
    public SdlAssignmentRuleList getSdlAssignmentRuleList() {
        return sdlAssignmentRuleList;
    }

    /**
     * Sets the value of the sdlAssignmentRuleList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SdlAssignmentRuleList }
     *     
     */
    public void setSdlAssignmentRuleList(SdlAssignmentRuleList value) {
        this.sdlAssignmentRuleList = value;
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

    public TemplateAssignmentRuleListResponse withSdlAssignmentRuleList(SdlAssignmentRuleList value) {
        setSdlAssignmentRuleList(value);
        return this;
    }

    @Override
    public TemplateAssignmentRuleListResponse withCode(long value) {
        setCode(value);
        return this;
    }

    @Override
    public TemplateAssignmentRuleListResponse withMsg(String value) {
        setMsg(value);
        return this;
    }

    @Override
    public TemplateAssignmentRuleListResponse withRootCause(RootCause... values) {
        if (values!= null) {
            for (RootCause value: values) {
                getRootCause().add(value);
            }
        }
        return this;
    }

    @Override
    public TemplateAssignmentRuleListResponse withRootCause(Collection<RootCause> values) {
        if (values!= null) {
            getRootCause().addAll(values);
        }
        return this;
    }

    @Override
    public TemplateAssignmentRuleListResponse withRootCause(List<RootCause> rootCause) {
        setRootCause(rootCause);
        return this;
    }

}

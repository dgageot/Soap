
package com.fortify.schema.fws;

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
 *         &lt;element ref="{xmlns://www.fortifysoftware.com/schema/activitytemplate}SDLAssignmentRuleList"/>
 *         &lt;element name="forceReplaceAll" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "sdlAssignmentRuleList",
    "forceReplaceAll"
})
@XmlRootElement(name = "TemplateAssignmentRuleBatchUpdateRequest")
public class TemplateAssignmentRuleBatchUpdateRequest {

    @XmlElement(name = "SDLAssignmentRuleList", namespace = "xmlns://www.fortifysoftware.com/schema/activitytemplate", required = true)
    protected SdlAssignmentRuleList sdlAssignmentRuleList;
    protected Boolean forceReplaceAll;

    /**
     * Default no-arg constructor
     * 
     */
    public TemplateAssignmentRuleBatchUpdateRequest() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public TemplateAssignmentRuleBatchUpdateRequest(final SdlAssignmentRuleList sdlAssignmentRuleList, final Boolean forceReplaceAll) {
        this.sdlAssignmentRuleList = sdlAssignmentRuleList;
        this.forceReplaceAll = forceReplaceAll;
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

    /**
     * Gets the value of the forceReplaceAll property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isForceReplaceAll() {
        return forceReplaceAll;
    }

    /**
     * Sets the value of the forceReplaceAll property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForceReplaceAll(Boolean value) {
        this.forceReplaceAll = value;
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

    public TemplateAssignmentRuleBatchUpdateRequest withSdlAssignmentRuleList(SdlAssignmentRuleList value) {
        setSdlAssignmentRuleList(value);
        return this;
    }

    public TemplateAssignmentRuleBatchUpdateRequest withForceReplaceAll(Boolean value) {
        setForceReplaceAll(value);
        return this;
    }

}

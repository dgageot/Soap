
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
import xmlns.www_fortifysoftware_com.schema.enumconstants.AppEntityType;


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
 *         &lt;element name="AppEntityType" type="{xmlns://www.fortifysoftware.com/schema/enumConstants}AppEntityType" minOccurs="0"/>
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
    "appEntityType"
})
@XmlRootElement(name = "ProjectMetaDataDefinitionsListRequest")
public class ProjectMetaDataDefinitionsListRequest {

    @XmlElement(name = "AppEntityType")
    protected AppEntityType appEntityType;

    /**
     * Default no-arg constructor
     * 
     */
    public ProjectMetaDataDefinitionsListRequest() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ProjectMetaDataDefinitionsListRequest(final AppEntityType appEntityType) {
        this.appEntityType = appEntityType;
    }

    /**
     * Gets the value of the appEntityType property.
     * 
     * @return
     *     possible object is
     *     {@link AppEntityType }
     *     
     */
    public AppEntityType getAppEntityType() {
        return appEntityType;
    }

    /**
     * Sets the value of the appEntityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppEntityType }
     *     
     */
    public void setAppEntityType(AppEntityType value) {
        this.appEntityType = value;
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

    public ProjectMetaDataDefinitionsListRequest withAppEntityType(AppEntityType value) {
        setAppEntityType(value);
        return this;
    }

}

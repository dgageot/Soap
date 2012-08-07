
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
 *         &lt;element name="AlertDefinitionId" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
    "alertDefinitionId"
})
@XmlRootElement(name = "AlertDefinitionByIdRequest")
public class AlertDefinitionByIdRequest {

    @XmlElement(name = "AlertDefinitionId")
    protected long alertDefinitionId;

    /**
     * Default no-arg constructor
     * 
     */
    public AlertDefinitionByIdRequest() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public AlertDefinitionByIdRequest(final long alertDefinitionId) {
        this.alertDefinitionId = alertDefinitionId;
    }

    /**
     * Gets the value of the alertDefinitionId property.
     * 
     */
    public long getAlertDefinitionId() {
        return alertDefinitionId;
    }

    /**
     * Sets the value of the alertDefinitionId property.
     * 
     */
    public void setAlertDefinitionId(long value) {
        this.alertDefinitionId = value;
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

    public AlertDefinitionByIdRequest withAlertDefinitionId(long value) {
        setAlertDefinitionId(value);
        return this;
    }

}


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
import xmlns.www_fortifysoftware_com.schema.wstypes.AlertDefinition;
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
 *         &lt;element name="AlertDefinition" type="{xmlns://www.fortifysoftware.com/schema/wsTypes}AlertDefinition" minOccurs="0"/>
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
    "alertDefinition"
})
@XmlRootElement(name = "AlertDefinitionResponse")
public class AlertDefinitionResponse
    extends Status
{

    @XmlElement(name = "AlertDefinition")
    protected AlertDefinition alertDefinition;

    /**
     * Default no-arg constructor
     * 
     */
    public AlertDefinitionResponse() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public AlertDefinitionResponse(final long code, final String msg, final List<RootCause> rootCause, final AlertDefinition alertDefinition) {
        super(code, msg, rootCause);
        this.alertDefinition = alertDefinition;
    }

    /**
     * Gets the value of the alertDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link AlertDefinition }
     *     
     */
    public AlertDefinition getAlertDefinition() {
        return alertDefinition;
    }

    /**
     * Sets the value of the alertDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlertDefinition }
     *     
     */
    public void setAlertDefinition(AlertDefinition value) {
        this.alertDefinition = value;
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

    public AlertDefinitionResponse withAlertDefinition(AlertDefinition value) {
        setAlertDefinition(value);
        return this;
    }

    @Override
    public AlertDefinitionResponse withCode(long value) {
        setCode(value);
        return this;
    }

    @Override
    public AlertDefinitionResponse withMsg(String value) {
        setMsg(value);
        return this;
    }

    @Override
    public AlertDefinitionResponse withRootCause(RootCause... values) {
        if (values!= null) {
            for (RootCause value: values) {
                getRootCause().add(value);
            }
        }
        return this;
    }

    @Override
    public AlertDefinitionResponse withRootCause(Collection<RootCause> values) {
        if (values!= null) {
            getRootCause().addAll(values);
        }
        return this;
    }

    @Override
    public AlertDefinitionResponse withRootCause(List<RootCause> rootCause) {
        setRootCause(rootCause);
        return this;
    }

}

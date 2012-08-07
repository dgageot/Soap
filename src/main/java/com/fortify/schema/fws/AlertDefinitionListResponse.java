
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
 *         &lt;element name="AlertDefinition" type="{xmlns://www.fortifysoftware.com/schema/wsTypes}AlertDefinition" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlRootElement(name = "AlertDefinitionListResponse")
public class AlertDefinitionListResponse
    extends Status
{

    @XmlElement(name = "AlertDefinition")
    protected List<AlertDefinition> alertDefinition;

    /**
     * Default no-arg constructor
     * 
     */
    public AlertDefinitionListResponse() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public AlertDefinitionListResponse(final long code, final String msg, final List<RootCause> rootCause, final List<AlertDefinition> alertDefinition) {
        super(code, msg, rootCause);
        this.alertDefinition = alertDefinition;
    }

    /**
     * Gets the value of the alertDefinition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alertDefinition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlertDefinition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlertDefinition }
     * 
     * 
     */
    public List<AlertDefinition> getAlertDefinition() {
        if (alertDefinition == null) {
            alertDefinition = new ArrayList<AlertDefinition>();
        }
        return this.alertDefinition;
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
     * Sets the value of the alertDefinition property.
     * 
     * @param alertDefinition
     *     allowed object is
     *     {@link AlertDefinition }
     *     
     */
    public void setAlertDefinition(List<AlertDefinition> alertDefinition) {
        this.alertDefinition = alertDefinition;
    }

    public AlertDefinitionListResponse withAlertDefinition(AlertDefinition... values) {
        if (values!= null) {
            for (AlertDefinition value: values) {
                getAlertDefinition().add(value);
            }
        }
        return this;
    }

    public AlertDefinitionListResponse withAlertDefinition(Collection<AlertDefinition> values) {
        if (values!= null) {
            getAlertDefinition().addAll(values);
        }
        return this;
    }

    public AlertDefinitionListResponse withAlertDefinition(List<AlertDefinition> alertDefinition) {
        setAlertDefinition(alertDefinition);
        return this;
    }

    @Override
    public AlertDefinitionListResponse withCode(long value) {
        setCode(value);
        return this;
    }

    @Override
    public AlertDefinitionListResponse withMsg(String value) {
        setMsg(value);
        return this;
    }

    @Override
    public AlertDefinitionListResponse withRootCause(RootCause... values) {
        if (values!= null) {
            for (RootCause value: values) {
                getRootCause().add(value);
            }
        }
        return this;
    }

    @Override
    public AlertDefinitionListResponse withRootCause(Collection<RootCause> values) {
        if (values!= null) {
            getRootCause().addAll(values);
        }
        return this;
    }

    @Override
    public AlertDefinitionListResponse withRootCause(List<RootCause> rootCause) {
        setRootCause(rootCause);
        return this;
    }

}

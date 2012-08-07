
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
import xmlns.www_fortifysoftware_com.schema.activitytemplate.PerformanceIndicatorDefinition;
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
 *         &lt;element ref="{xmlns://www.fortifysoftware.com/schema/activitytemplate}PerformanceIndicatorDefinition"/>
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
    "performanceIndicatorDefinition"
})
@XmlRootElement(name = "EquationVariableListResponse")
public class EquationVariableListResponse
    extends Status
{

    @XmlElement(name = "PerformanceIndicatorDefinition", namespace = "xmlns://www.fortifysoftware.com/schema/activitytemplate", required = true)
    protected PerformanceIndicatorDefinition performanceIndicatorDefinition;

    /**
     * Default no-arg constructor
     * 
     */
    public EquationVariableListResponse() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public EquationVariableListResponse(final long code, final String msg, final List<RootCause> rootCause, final PerformanceIndicatorDefinition performanceIndicatorDefinition) {
        super(code, msg, rootCause);
        this.performanceIndicatorDefinition = performanceIndicatorDefinition;
    }

    /**
     * Gets the value of the performanceIndicatorDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link PerformanceIndicatorDefinition }
     *     
     */
    public PerformanceIndicatorDefinition getPerformanceIndicatorDefinition() {
        return performanceIndicatorDefinition;
    }

    /**
     * Sets the value of the performanceIndicatorDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link PerformanceIndicatorDefinition }
     *     
     */
    public void setPerformanceIndicatorDefinition(PerformanceIndicatorDefinition value) {
        this.performanceIndicatorDefinition = value;
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

    public EquationVariableListResponse withPerformanceIndicatorDefinition(PerformanceIndicatorDefinition value) {
        setPerformanceIndicatorDefinition(value);
        return this;
    }

    @Override
    public EquationVariableListResponse withCode(long value) {
        setCode(value);
        return this;
    }

    @Override
    public EquationVariableListResponse withMsg(String value) {
        setMsg(value);
        return this;
    }

    @Override
    public EquationVariableListResponse withRootCause(RootCause... values) {
        if (values!= null) {
            for (RootCause value: values) {
                getRootCause().add(value);
            }
        }
        return this;
    }

    @Override
    public EquationVariableListResponse withRootCause(Collection<RootCause> values) {
        if (values!= null) {
            getRootCause().addAll(values);
        }
        return this;
    }

    @Override
    public EquationVariableListResponse withRootCause(List<RootCause> rootCause) {
        setRootCause(rootCause);
        return this;
    }

}

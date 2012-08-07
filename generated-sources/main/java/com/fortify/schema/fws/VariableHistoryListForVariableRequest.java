
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
import xmlns.www_fortifysoftware_com.schema.activitytemplate.Variable;
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
 *         &lt;element name="Variable" type="{xmlns://www.fortifysoftware.com/schema/activitytemplate}Variable"/>
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
    "variable"
})
@XmlRootElement(name = "VariableHistoryListForVariableRequest")
public class VariableHistoryListForVariableRequest
    extends Status
{

    @XmlElement(name = "Variable", required = true)
    protected Variable variable;

    /**
     * Default no-arg constructor
     * 
     */
    public VariableHistoryListForVariableRequest() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public VariableHistoryListForVariableRequest(final long code, final String msg, final List<RootCause> rootCause, final Variable variable) {
        super(code, msg, rootCause);
        this.variable = variable;
    }

    /**
     * Gets the value of the variable property.
     * 
     * @return
     *     possible object is
     *     {@link Variable }
     *     
     */
    public Variable getVariable() {
        return variable;
    }

    /**
     * Sets the value of the variable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Variable }
     *     
     */
    public void setVariable(Variable value) {
        this.variable = value;
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

    public VariableHistoryListForVariableRequest withVariable(Variable value) {
        setVariable(value);
        return this;
    }

    @Override
    public VariableHistoryListForVariableRequest withCode(long value) {
        setCode(value);
        return this;
    }

    @Override
    public VariableHistoryListForVariableRequest withMsg(String value) {
        setMsg(value);
        return this;
    }

    @Override
    public VariableHistoryListForVariableRequest withRootCause(RootCause... values) {
        if (values!= null) {
            for (RootCause value: values) {
                getRootCause().add(value);
            }
        }
        return this;
    }

    @Override
    public VariableHistoryListForVariableRequest withRootCause(Collection<RootCause> values) {
        if (values!= null) {
            getRootCause().addAll(values);
        }
        return this;
    }

    @Override
    public VariableHistoryListForVariableRequest withRootCause(List<RootCause> rootCause) {
        setRootCause(rootCause);
        return this;
    }

}

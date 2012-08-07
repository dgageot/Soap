
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
import xmlns.www_fortifysoftware_com.schema.runtime.RuntimeApplication;
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
 *         &lt;element name="RuntimeApplication" type="{xmlns://www.fortifysoftware.com/schema/runtime}RuntimeApplication" maxOccurs="unbounded" minOccurs="0"/>
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
    "runtimeApplication"
})
@XmlRootElement(name = "RuntimeApplicationListResponse")
public class RuntimeApplicationListResponse
    extends Status
{

    @XmlElement(name = "RuntimeApplication")
    protected List<RuntimeApplication> runtimeApplication;

    /**
     * Default no-arg constructor
     * 
     */
    public RuntimeApplicationListResponse() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public RuntimeApplicationListResponse(final long code, final String msg, final List<RootCause> rootCause, final List<RuntimeApplication> runtimeApplication) {
        super(code, msg, rootCause);
        this.runtimeApplication = runtimeApplication;
    }

    /**
     * Gets the value of the runtimeApplication property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the runtimeApplication property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRuntimeApplication().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RuntimeApplication }
     * 
     * 
     */
    public List<RuntimeApplication> getRuntimeApplication() {
        if (runtimeApplication == null) {
            runtimeApplication = new ArrayList<RuntimeApplication>();
        }
        return this.runtimeApplication;
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
     * Sets the value of the runtimeApplication property.
     * 
     * @param runtimeApplication
     *     allowed object is
     *     {@link RuntimeApplication }
     *     
     */
    public void setRuntimeApplication(List<RuntimeApplication> runtimeApplication) {
        this.runtimeApplication = runtimeApplication;
    }

    public RuntimeApplicationListResponse withRuntimeApplication(RuntimeApplication... values) {
        if (values!= null) {
            for (RuntimeApplication value: values) {
                getRuntimeApplication().add(value);
            }
        }
        return this;
    }

    public RuntimeApplicationListResponse withRuntimeApplication(Collection<RuntimeApplication> values) {
        if (values!= null) {
            getRuntimeApplication().addAll(values);
        }
        return this;
    }

    public RuntimeApplicationListResponse withRuntimeApplication(List<RuntimeApplication> runtimeApplication) {
        setRuntimeApplication(runtimeApplication);
        return this;
    }

    @Override
    public RuntimeApplicationListResponse withCode(long value) {
        setCode(value);
        return this;
    }

    @Override
    public RuntimeApplicationListResponse withMsg(String value) {
        setMsg(value);
        return this;
    }

    @Override
    public RuntimeApplicationListResponse withRootCause(RootCause... values) {
        if (values!= null) {
            for (RootCause value: values) {
                getRootCause().add(value);
            }
        }
        return this;
    }

    @Override
    public RuntimeApplicationListResponse withRootCause(Collection<RootCause> values) {
        if (values!= null) {
            getRootCause().addAll(values);
        }
        return this;
    }

    @Override
    public RuntimeApplicationListResponse withRootCause(List<RootCause> rootCause) {
        setRootCause(rootCause);
        return this;
    }

}

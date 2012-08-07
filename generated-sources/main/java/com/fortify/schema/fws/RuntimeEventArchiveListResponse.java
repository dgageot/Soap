
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
import xmlns.www_fortifysoftware_com.schema.wstypes.RootCause;
import xmlns.www_fortifysoftware_com.schema.wstypes.RuntimeEventArchive;
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
 *         &lt;element name="RuntimeEventArchive" type="{xmlns://www.fortifysoftware.com/schema/wsTypes}RuntimeEventArchive" maxOccurs="unbounded" minOccurs="0"/>
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
    "runtimeEventArchive"
})
@XmlRootElement(name = "RuntimeEventArchiveListResponse")
public class RuntimeEventArchiveListResponse
    extends Status
{

    @XmlElement(name = "RuntimeEventArchive")
    protected List<RuntimeEventArchive> runtimeEventArchive;

    /**
     * Default no-arg constructor
     * 
     */
    public RuntimeEventArchiveListResponse() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public RuntimeEventArchiveListResponse(final long code, final String msg, final List<RootCause> rootCause, final List<RuntimeEventArchive> runtimeEventArchive) {
        super(code, msg, rootCause);
        this.runtimeEventArchive = runtimeEventArchive;
    }

    /**
     * Gets the value of the runtimeEventArchive property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the runtimeEventArchive property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRuntimeEventArchive().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RuntimeEventArchive }
     * 
     * 
     */
    public List<RuntimeEventArchive> getRuntimeEventArchive() {
        if (runtimeEventArchive == null) {
            runtimeEventArchive = new ArrayList<RuntimeEventArchive>();
        }
        return this.runtimeEventArchive;
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
     * Sets the value of the runtimeEventArchive property.
     * 
     * @param runtimeEventArchive
     *     allowed object is
     *     {@link RuntimeEventArchive }
     *     
     */
    public void setRuntimeEventArchive(List<RuntimeEventArchive> runtimeEventArchive) {
        this.runtimeEventArchive = runtimeEventArchive;
    }

    public RuntimeEventArchiveListResponse withRuntimeEventArchive(RuntimeEventArchive... values) {
        if (values!= null) {
            for (RuntimeEventArchive value: values) {
                getRuntimeEventArchive().add(value);
            }
        }
        return this;
    }

    public RuntimeEventArchiveListResponse withRuntimeEventArchive(Collection<RuntimeEventArchive> values) {
        if (values!= null) {
            getRuntimeEventArchive().addAll(values);
        }
        return this;
    }

    public RuntimeEventArchiveListResponse withRuntimeEventArchive(List<RuntimeEventArchive> runtimeEventArchive) {
        setRuntimeEventArchive(runtimeEventArchive);
        return this;
    }

    @Override
    public RuntimeEventArchiveListResponse withCode(long value) {
        setCode(value);
        return this;
    }

    @Override
    public RuntimeEventArchiveListResponse withMsg(String value) {
        setMsg(value);
        return this;
    }

    @Override
    public RuntimeEventArchiveListResponse withRootCause(RootCause... values) {
        if (values!= null) {
            for (RootCause value: values) {
                getRootCause().add(value);
            }
        }
        return this;
    }

    @Override
    public RuntimeEventArchiveListResponse withRootCause(Collection<RootCause> values) {
        if (values!= null) {
            getRootCause().addAll(values);
        }
        return this;
    }

    @Override
    public RuntimeEventArchiveListResponse withRootCause(List<RootCause> rootCause) {
        setRootCause(rootCause);
        return this;
    }

}

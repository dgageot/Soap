
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
 *         &lt;element name="RuntimeEventArchiveId" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
    "runtimeEventArchiveId"
})
@XmlRootElement(name = "RuntimeEventArchiveDownloadRequest")
public class RuntimeEventArchiveDownloadRequest {

    @XmlElement(name = "RuntimeEventArchiveId")
    protected long runtimeEventArchiveId;

    /**
     * Default no-arg constructor
     * 
     */
    public RuntimeEventArchiveDownloadRequest() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public RuntimeEventArchiveDownloadRequest(final long runtimeEventArchiveId) {
        this.runtimeEventArchiveId = runtimeEventArchiveId;
    }

    /**
     * Gets the value of the runtimeEventArchiveId property.
     * 
     */
    public long getRuntimeEventArchiveId() {
        return runtimeEventArchiveId;
    }

    /**
     * Sets the value of the runtimeEventArchiveId property.
     * 
     */
    public void setRuntimeEventArchiveId(long value) {
        this.runtimeEventArchiveId = value;
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

    public RuntimeEventArchiveDownloadRequest withRuntimeEventArchiveId(long value) {
        setRuntimeEventArchiveId(value);
        return this;
    }

}

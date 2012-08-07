
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
import xmlns.www_fortifysoftware_com.schema.wstypes.PayloadMetaData;
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
 *         &lt;element name="PayloadMetaData" type="{xmlns://www.fortifysoftware.com/schema/wsTypes}PayloadMetaData"/>
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
    "payloadMetaData"
})
@XmlRootElement(name = "AnalysisPayloadUploadResponse")
public class AnalysisPayloadUploadResponse
    extends Status
{

    @XmlElement(name = "PayloadMetaData", required = true)
    protected PayloadMetaData payloadMetaData;

    /**
     * Default no-arg constructor
     * 
     */
    public AnalysisPayloadUploadResponse() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public AnalysisPayloadUploadResponse(final long code, final String msg, final List<RootCause> rootCause, final PayloadMetaData payloadMetaData) {
        super(code, msg, rootCause);
        this.payloadMetaData = payloadMetaData;
    }

    /**
     * Gets the value of the payloadMetaData property.
     * 
     * @return
     *     possible object is
     *     {@link PayloadMetaData }
     *     
     */
    public PayloadMetaData getPayloadMetaData() {
        return payloadMetaData;
    }

    /**
     * Sets the value of the payloadMetaData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayloadMetaData }
     *     
     */
    public void setPayloadMetaData(PayloadMetaData value) {
        this.payloadMetaData = value;
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

    public AnalysisPayloadUploadResponse withPayloadMetaData(PayloadMetaData value) {
        setPayloadMetaData(value);
        return this;
    }

    @Override
    public AnalysisPayloadUploadResponse withCode(long value) {
        setCode(value);
        return this;
    }

    @Override
    public AnalysisPayloadUploadResponse withMsg(String value) {
        setMsg(value);
        return this;
    }

    @Override
    public AnalysisPayloadUploadResponse withRootCause(RootCause... values) {
        if (values!= null) {
            for (RootCause value: values) {
                getRootCause().add(value);
            }
        }
        return this;
    }

    @Override
    public AnalysisPayloadUploadResponse withRootCause(Collection<RootCause> values) {
        if (values!= null) {
            getRootCause().addAll(values);
        }
        return this;
    }

    @Override
    public AnalysisPayloadUploadResponse withRootCause(List<RootCause> rootCause) {
        setRootCause(rootCause);
        return this;
    }

}


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
 *         &lt;element name="SnapshotId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="MeasurementAgentIds" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
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
    "snapshotId",
    "measurementAgentIds"
})
@XmlRootElement(name = "MeasurementHistoryListForSnapshotAndMeasurementAgentsRequest")
public class MeasurementHistoryListForSnapshotAndMeasurementAgentsRequest
    extends Status
{

    @XmlElement(name = "SnapshotId")
    protected long snapshotId;
    @XmlElement(name = "MeasurementAgentIds", type = Long.class)
    protected List<Long> measurementAgentIds;

    /**
     * Default no-arg constructor
     * 
     */
    public MeasurementHistoryListForSnapshotAndMeasurementAgentsRequest() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public MeasurementHistoryListForSnapshotAndMeasurementAgentsRequest(final long code, final String msg, final List<RootCause> rootCause, final long snapshotId, final List<Long> measurementAgentIds) {
        super(code, msg, rootCause);
        this.snapshotId = snapshotId;
        this.measurementAgentIds = measurementAgentIds;
    }

    /**
     * Gets the value of the snapshotId property.
     * 
     */
    public long getSnapshotId() {
        return snapshotId;
    }

    /**
     * Sets the value of the snapshotId property.
     * 
     */
    public void setSnapshotId(long value) {
        this.snapshotId = value;
    }

    /**
     * Gets the value of the measurementAgentIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the measurementAgentIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeasurementAgentIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getMeasurementAgentIds() {
        if (measurementAgentIds == null) {
            measurementAgentIds = new ArrayList<Long>();
        }
        return this.measurementAgentIds;
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
     * Sets the value of the measurementAgentIds property.
     * 
     * @param measurementAgentIds
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMeasurementAgentIds(List<Long> measurementAgentIds) {
        this.measurementAgentIds = measurementAgentIds;
    }

    public MeasurementHistoryListForSnapshotAndMeasurementAgentsRequest withSnapshotId(long value) {
        setSnapshotId(value);
        return this;
    }

    public MeasurementHistoryListForSnapshotAndMeasurementAgentsRequest withMeasurementAgentIds(Long... values) {
        if (values!= null) {
            for (Long value: values) {
                getMeasurementAgentIds().add(value);
            }
        }
        return this;
    }

    public MeasurementHistoryListForSnapshotAndMeasurementAgentsRequest withMeasurementAgentIds(Collection<Long> values) {
        if (values!= null) {
            getMeasurementAgentIds().addAll(values);
        }
        return this;
    }

    public MeasurementHistoryListForSnapshotAndMeasurementAgentsRequest withMeasurementAgentIds(List<Long> measurementAgentIds) {
        setMeasurementAgentIds(measurementAgentIds);
        return this;
    }

    @Override
    public MeasurementHistoryListForSnapshotAndMeasurementAgentsRequest withCode(long value) {
        setCode(value);
        return this;
    }

    @Override
    public MeasurementHistoryListForSnapshotAndMeasurementAgentsRequest withMsg(String value) {
        setMsg(value);
        return this;
    }

    @Override
    public MeasurementHistoryListForSnapshotAndMeasurementAgentsRequest withRootCause(RootCause... values) {
        if (values!= null) {
            for (RootCause value: values) {
                getRootCause().add(value);
            }
        }
        return this;
    }

    @Override
    public MeasurementHistoryListForSnapshotAndMeasurementAgentsRequest withRootCause(Collection<RootCause> values) {
        if (values!= null) {
            getRootCause().addAll(values);
        }
        return this;
    }

    @Override
    public MeasurementHistoryListForSnapshotAndMeasurementAgentsRequest withRootCause(List<RootCause> rootCause) {
        setRootCause(rootCause);
        return this;
    }

}

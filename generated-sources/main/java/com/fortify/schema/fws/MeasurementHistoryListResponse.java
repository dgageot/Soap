
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
import xmlns.www_fortifysoftware_com.schema.wstypes.MeasurementHistory;
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
 *         &lt;element name="MeasurementHistories" type="{xmlns://www.fortifysoftware.com/schema/wsTypes}MeasurementHistory" maxOccurs="unbounded" minOccurs="0"/>
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
    "measurementHistories"
})
@XmlRootElement(name = "MeasurementHistoryListResponse")
public class MeasurementHistoryListResponse
    extends Status
{

    @XmlElement(name = "MeasurementHistories")
    protected List<MeasurementHistory> measurementHistories;

    /**
     * Default no-arg constructor
     * 
     */
    public MeasurementHistoryListResponse() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public MeasurementHistoryListResponse(final long code, final String msg, final List<RootCause> rootCause, final List<MeasurementHistory> measurementHistories) {
        super(code, msg, rootCause);
        this.measurementHistories = measurementHistories;
    }

    /**
     * Gets the value of the measurementHistories property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the measurementHistories property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeasurementHistories().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementHistory }
     * 
     * 
     */
    public List<MeasurementHistory> getMeasurementHistories() {
        if (measurementHistories == null) {
            measurementHistories = new ArrayList<MeasurementHistory>();
        }
        return this.measurementHistories;
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
     * Sets the value of the measurementHistories property.
     * 
     * @param measurementHistories
     *     allowed object is
     *     {@link MeasurementHistory }
     *     
     */
    public void setMeasurementHistories(List<MeasurementHistory> measurementHistories) {
        this.measurementHistories = measurementHistories;
    }

    public MeasurementHistoryListResponse withMeasurementHistories(MeasurementHistory... values) {
        if (values!= null) {
            for (MeasurementHistory value: values) {
                getMeasurementHistories().add(value);
            }
        }
        return this;
    }

    public MeasurementHistoryListResponse withMeasurementHistories(Collection<MeasurementHistory> values) {
        if (values!= null) {
            getMeasurementHistories().addAll(values);
        }
        return this;
    }

    public MeasurementHistoryListResponse withMeasurementHistories(List<MeasurementHistory> measurementHistories) {
        setMeasurementHistories(measurementHistories);
        return this;
    }

    @Override
    public MeasurementHistoryListResponse withCode(long value) {
        setCode(value);
        return this;
    }

    @Override
    public MeasurementHistoryListResponse withMsg(String value) {
        setMsg(value);
        return this;
    }

    @Override
    public MeasurementHistoryListResponse withRootCause(RootCause... values) {
        if (values!= null) {
            for (RootCause value: values) {
                getRootCause().add(value);
            }
        }
        return this;
    }

    @Override
    public MeasurementHistoryListResponse withRootCause(Collection<RootCause> values) {
        if (values!= null) {
            getRootCause().addAll(values);
        }
        return this;
    }

    @Override
    public MeasurementHistoryListResponse withRootCause(List<RootCause> rootCause) {
        setRootCause(rootCause);
        return this;
    }

}

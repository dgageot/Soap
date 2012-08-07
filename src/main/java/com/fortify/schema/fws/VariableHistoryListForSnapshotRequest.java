
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
    "snapshotId"
})
@XmlRootElement(name = "VariableHistoryListForSnapshotRequest")
public class VariableHistoryListForSnapshotRequest
    extends Status
{

    @XmlElement(name = "SnapshotId")
    protected long snapshotId;

    /**
     * Default no-arg constructor
     * 
     */
    public VariableHistoryListForSnapshotRequest() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public VariableHistoryListForSnapshotRequest(final long code, final String msg, final List<RootCause> rootCause, final long snapshotId) {
        super(code, msg, rootCause);
        this.snapshotId = snapshotId;
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

    public VariableHistoryListForSnapshotRequest withSnapshotId(long value) {
        setSnapshotId(value);
        return this;
    }

    @Override
    public VariableHistoryListForSnapshotRequest withCode(long value) {
        setCode(value);
        return this;
    }

    @Override
    public VariableHistoryListForSnapshotRequest withMsg(String value) {
        setMsg(value);
        return this;
    }

    @Override
    public VariableHistoryListForSnapshotRequest withRootCause(RootCause... values) {
        if (values!= null) {
            for (RootCause value: values) {
                getRootCause().add(value);
            }
        }
        return this;
    }

    @Override
    public VariableHistoryListForSnapshotRequest withRootCause(Collection<RootCause> values) {
        if (values!= null) {
            getRootCause().addAll(values);
        }
        return this;
    }

    @Override
    public VariableHistoryListForSnapshotRequest withRootCause(List<RootCause> rootCause) {
        setRootCause(rootCause);
        return this;
    }

}

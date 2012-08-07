
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
import xmlns.www_fortifysoftware_com.schema.wstypes.Snapshot;
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
 *         &lt;element name="Snapshots" type="{xmlns://www.fortifysoftware.com/schema/wsTypes}Snapshot" maxOccurs="unbounded" minOccurs="0"/>
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
    "snapshots"
})
@XmlRootElement(name = "SnapshotListResponse")
public class SnapshotListResponse
    extends Status
{

    @XmlElement(name = "Snapshots")
    protected List<Snapshot> snapshots;

    /**
     * Default no-arg constructor
     * 
     */
    public SnapshotListResponse() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public SnapshotListResponse(final long code, final String msg, final List<RootCause> rootCause, final List<Snapshot> snapshots) {
        super(code, msg, rootCause);
        this.snapshots = snapshots;
    }

    /**
     * Gets the value of the snapshots property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the snapshots property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSnapshots().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Snapshot }
     * 
     * 
     */
    public List<Snapshot> getSnapshots() {
        if (snapshots == null) {
            snapshots = new ArrayList<Snapshot>();
        }
        return this.snapshots;
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
     * Sets the value of the snapshots property.
     * 
     * @param snapshots
     *     allowed object is
     *     {@link Snapshot }
     *     
     */
    public void setSnapshots(List<Snapshot> snapshots) {
        this.snapshots = snapshots;
    }

    public SnapshotListResponse withSnapshots(Snapshot... values) {
        if (values!= null) {
            for (Snapshot value: values) {
                getSnapshots().add(value);
            }
        }
        return this;
    }

    public SnapshotListResponse withSnapshots(Collection<Snapshot> values) {
        if (values!= null) {
            getSnapshots().addAll(values);
        }
        return this;
    }

    public SnapshotListResponse withSnapshots(List<Snapshot> snapshots) {
        setSnapshots(snapshots);
        return this;
    }

    @Override
    public SnapshotListResponse withCode(long value) {
        setCode(value);
        return this;
    }

    @Override
    public SnapshotListResponse withMsg(String value) {
        setMsg(value);
        return this;
    }

    @Override
    public SnapshotListResponse withRootCause(RootCause... values) {
        if (values!= null) {
            for (RootCause value: values) {
                getRootCause().add(value);
            }
        }
        return this;
    }

    @Override
    public SnapshotListResponse withRootCause(Collection<RootCause> values) {
        if (values!= null) {
            getRootCause().addAll(values);
        }
        return this;
    }

    @Override
    public SnapshotListResponse withRootCause(List<RootCause> rootCause) {
        setRootCause(rootCause);
        return this;
    }

}

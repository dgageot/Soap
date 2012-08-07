
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
import xmlns.www_fortify_com.schema.issuemanagement.TraceNodeList;
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
 *         &lt;element name="TraceNodeLists" type="{xmlns://www.fortify.com/schema/issuemanagement}TraceNodeList" maxOccurs="unbounded" minOccurs="0"/>
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
    "traceNodeLists"
})
@XmlRootElement(name = "TraceNodesResponse")
public class TraceNodesResponse
    extends Status
{

    @XmlElement(name = "TraceNodeLists")
    protected List<TraceNodeList> traceNodeLists;

    /**
     * Default no-arg constructor
     * 
     */
    public TraceNodesResponse() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public TraceNodesResponse(final long code, final String msg, final List<RootCause> rootCause, final List<TraceNodeList> traceNodeLists) {
        super(code, msg, rootCause);
        this.traceNodeLists = traceNodeLists;
    }

    /**
     * Gets the value of the traceNodeLists property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the traceNodeLists property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTraceNodeLists().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TraceNodeList }
     * 
     * 
     */
    public List<TraceNodeList> getTraceNodeLists() {
        if (traceNodeLists == null) {
            traceNodeLists = new ArrayList<TraceNodeList>();
        }
        return this.traceNodeLists;
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
     * Sets the value of the traceNodeLists property.
     * 
     * @param traceNodeLists
     *     allowed object is
     *     {@link TraceNodeList }
     *     
     */
    public void setTraceNodeLists(List<TraceNodeList> traceNodeLists) {
        this.traceNodeLists = traceNodeLists;
    }

    public TraceNodesResponse withTraceNodeLists(TraceNodeList... values) {
        if (values!= null) {
            for (TraceNodeList value: values) {
                getTraceNodeLists().add(value);
            }
        }
        return this;
    }

    public TraceNodesResponse withTraceNodeLists(Collection<TraceNodeList> values) {
        if (values!= null) {
            getTraceNodeLists().addAll(values);
        }
        return this;
    }

    public TraceNodesResponse withTraceNodeLists(List<TraceNodeList> traceNodeLists) {
        setTraceNodeLists(traceNodeLists);
        return this;
    }

    @Override
    public TraceNodesResponse withCode(long value) {
        setCode(value);
        return this;
    }

    @Override
    public TraceNodesResponse withMsg(String value) {
        setMsg(value);
        return this;
    }

    @Override
    public TraceNodesResponse withRootCause(RootCause... values) {
        if (values!= null) {
            for (RootCause value: values) {
                getRootCause().add(value);
            }
        }
        return this;
    }

    @Override
    public TraceNodesResponse withRootCause(Collection<RootCause> values) {
        if (values!= null) {
            getRootCause().addAll(values);
        }
        return this;
    }

    @Override
    public TraceNodesResponse withRootCause(List<RootCause> rootCause) {
        setRootCause(rootCause);
        return this;
    }

}

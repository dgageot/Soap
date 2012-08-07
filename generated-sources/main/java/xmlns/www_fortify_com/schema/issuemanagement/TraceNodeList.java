
package xmlns.www_fortify_com.schema.issuemanagement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;


/**
 * <p>Java class for TraceNodeList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TraceNodeList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TraceNodes" type="{xmlns://www.fortify.com/schema/issuemanagement}TraceNode" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TraceNodeList", propOrder = {
    "traceNodes"
})
public class TraceNodeList {

    @XmlElement(name = "TraceNodes")
    protected List<TraceNode> traceNodes;

    /**
     * Default no-arg constructor
     * 
     */
    public TraceNodeList() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public TraceNodeList(final List<TraceNode> traceNodes) {
        this.traceNodes = traceNodes;
    }

    /**
     * Gets the value of the traceNodes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the traceNodes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTraceNodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TraceNode }
     * 
     * 
     */
    public List<TraceNode> getTraceNodes() {
        if (traceNodes == null) {
            traceNodes = new ArrayList<TraceNode>();
        }
        return this.traceNodes;
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
     * Sets the value of the traceNodes property.
     * 
     * @param traceNodes
     *     allowed object is
     *     {@link TraceNode }
     *     
     */
    public void setTraceNodes(List<TraceNode> traceNodes) {
        this.traceNodes = traceNodes;
    }

    public TraceNodeList withTraceNodes(TraceNode... values) {
        if (values!= null) {
            for (TraceNode value: values) {
                getTraceNodes().add(value);
            }
        }
        return this;
    }

    public TraceNodeList withTraceNodes(Collection<TraceNode> values) {
        if (values!= null) {
            getTraceNodes().addAll(values);
        }
        return this;
    }

    public TraceNodeList withTraceNodes(List<TraceNode> traceNodes) {
        setTraceNodes(traceNodes);
        return this;
    }

}

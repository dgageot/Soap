
package xmlns.www_fortifysoftware_com.schema.wstypes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;


/**
 * Returns true if any subnodes evaluate true.
 *           
 * 
 * <p>Java class for Or complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Or">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{xmlns://www.fortifysoftware.com/schema/wsTypes}ConditionalNodes" maxOccurs="unbounded" minOccurs="2"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Or", propOrder = {
    "conditionalNodes"
})
public class Or {

    @XmlElements({
        @XmlElement(name = "RuleCondition", type = RuleCondition.class),
        @XmlElement(name = "Or", type = Or.class),
        @XmlElement(name = "Not", type = Not.class),
        @XmlElement(name = "And", type = And.class)
    })
    protected List<Object> conditionalNodes;

    /**
     * Default no-arg constructor
     * 
     */
    public Or() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public Or(final List<Object> conditionalNodes) {
        this.conditionalNodes = conditionalNodes;
    }

    /**
     * Gets the value of the conditionalNodes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conditionalNodes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConditionalNodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RuleCondition }
     * {@link Or }
     * {@link Not }
     * {@link And }
     * 
     * 
     */
    public List<Object> getConditionalNodes() {
        if (conditionalNodes == null) {
            conditionalNodes = new ArrayList<Object>();
        }
        return this.conditionalNodes;
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
     * Sets the value of the conditionalNodes property.
     * 
     * @param conditionalNodes
     *     allowed object is
     *     {@link RuleCondition }
     *     {@link Or }
     *     {@link Not }
     *     {@link And }
     *     
     */
    public void setConditionalNodes(List<Object> conditionalNodes) {
        this.conditionalNodes = conditionalNodes;
    }

    public Or withConditionalNodes(Object... values) {
        if (values!= null) {
            for (Object value: values) {
                getConditionalNodes().add(value);
            }
        }
        return this;
    }

    public Or withConditionalNodes(Collection<Object> values) {
        if (values!= null) {
            getConditionalNodes().addAll(values);
        }
        return this;
    }

    public Or withConditionalNodes(List<Object> conditionalNodes) {
        setConditionalNodes(conditionalNodes);
        return this;
    }

}

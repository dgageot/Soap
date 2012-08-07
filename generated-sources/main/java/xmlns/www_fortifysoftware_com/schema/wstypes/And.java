
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
 * Contains two or more subelements. Returns true
 *             only if all the subnodes are true; if one
 *             or more is false, then returns false.
 *           
 * 
 * <p>Java class for And complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="And">
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
@XmlType(name = "And", propOrder = {
    "conditionalNodes"
})
public class And {

    @XmlElements({
        @XmlElement(name = "And", type = And.class),
        @XmlElement(name = "Not", type = Not.class),
        @XmlElement(name = "RuleCondition", type = RuleCondition.class),
        @XmlElement(name = "Or", type = Or.class)
    })
    protected List<Object> conditionalNodes;

    /**
     * Default no-arg constructor
     * 
     */
    public And() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public And(final List<Object> conditionalNodes) {
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
     * {@link And }
     * {@link Not }
     * {@link RuleCondition }
     * {@link Or }
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
     *     {@link And }
     *     {@link Not }
     *     {@link RuleCondition }
     *     {@link Or }
     *     
     */
    public void setConditionalNodes(List<Object> conditionalNodes) {
        this.conditionalNodes = conditionalNodes;
    }

    public And withConditionalNodes(Object... values) {
        if (values!= null) {
            for (Object value: values) {
                getConditionalNodes().add(value);
            }
        }
        return this;
    }

    public And withConditionalNodes(Collection<Object> values) {
        if (values!= null) {
            getConditionalNodes().addAll(values);
        }
        return this;
    }

    public And withConditionalNodes(List<Object> conditionalNodes) {
        setConditionalNodes(conditionalNodes);
        return this;
    }

}

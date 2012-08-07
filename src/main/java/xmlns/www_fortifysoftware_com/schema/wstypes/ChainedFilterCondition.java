
package xmlns.www_fortifysoftware_com.schema.wstypes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;


/**
 * <p>Java class for ChainedFilterCondition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChainedFilterCondition">
 *   &lt;complexContent>
 *     &lt;extension base="{xmlns://www.fortifysoftware.com/schema/wsTypes}FilterCondition">
 *       &lt;sequence>
 *         &lt;element name="Condition" type="{xmlns://www.fortifysoftware.com/schema/wsTypes}FilterCondition" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChainedFilterCondition", propOrder = {
    "condition"
})
@XmlSeeAlso({
    ConjunctionFilterCondition.class,
    DisjunctionFilterCondition.class
})
public class ChainedFilterCondition
    extends FilterCondition
{

    @XmlElement(name = "Condition", required = true)
    protected List<FilterCondition> condition;

    /**
     * Default no-arg constructor
     * 
     */
    public ChainedFilterCondition() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ChainedFilterCondition(final List<FilterCondition> condition) {
        super();
        this.condition = condition;
    }

    /**
     * Gets the value of the condition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the condition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCondition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FilterCondition }
     * 
     * 
     */
    public List<FilterCondition> getCondition() {
        if (condition == null) {
            condition = new ArrayList<FilterCondition>();
        }
        return this.condition;
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
     * Sets the value of the condition property.
     * 
     * @param condition
     *     allowed object is
     *     {@link FilterCondition }
     *     
     */
    public void setCondition(List<FilterCondition> condition) {
        this.condition = condition;
    }

    public ChainedFilterCondition withCondition(FilterCondition... values) {
        if (values!= null) {
            for (FilterCondition value: values) {
                getCondition().add(value);
            }
        }
        return this;
    }

    public ChainedFilterCondition withCondition(Collection<FilterCondition> values) {
        if (values!= null) {
            getCondition().addAll(values);
        }
        return this;
    }

    public ChainedFilterCondition withCondition(List<FilterCondition> condition) {
        setCondition(condition);
        return this;
    }

}

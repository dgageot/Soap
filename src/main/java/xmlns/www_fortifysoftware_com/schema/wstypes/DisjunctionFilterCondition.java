
package xmlns.www_fortifysoftware_com.schema.wstypes;

import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;


/**
 * <p>Java class for DisjunctionFilterCondition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DisjunctionFilterCondition">
 *   &lt;complexContent>
 *     &lt;extension base="{xmlns://www.fortifysoftware.com/schema/wsTypes}ChainedFilterCondition">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisjunctionFilterCondition")
public class DisjunctionFilterCondition
    extends ChainedFilterCondition
{


    /**
     * Default no-arg constructor
     * 
     */
    public DisjunctionFilterCondition() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public DisjunctionFilterCondition(final List<FilterCondition> condition) {
        super(condition);
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

    @Override
    public DisjunctionFilterCondition withCondition(FilterCondition... values) {
        if (values!= null) {
            for (FilterCondition value: values) {
                getCondition().add(value);
            }
        }
        return this;
    }

    @Override
    public DisjunctionFilterCondition withCondition(Collection<FilterCondition> values) {
        if (values!= null) {
            getCondition().addAll(values);
        }
        return this;
    }

    @Override
    public DisjunctionFilterCondition withCondition(List<FilterCondition> condition) {
        setCondition(condition);
        return this;
    }

}

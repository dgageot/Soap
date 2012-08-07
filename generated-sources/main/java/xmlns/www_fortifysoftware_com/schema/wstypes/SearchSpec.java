
package xmlns.www_fortifysoftware_com.schema.wstypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{xmlns://www.fortifysoftware.com/schema/wsTypes}SearchSpecBase">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "SearchSpec")
public class SearchSpec
    extends SearchSpecBase
{


    /**
     * Default no-arg constructor
     * 
     */
    public SearchSpec() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public SearchSpec(final FilterCondition searchCondition, final OrderCondition orderCondition, final Integer startIndex, final Integer pageSize) {
        super(searchCondition, orderCondition, startIndex, pageSize);
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
    public SearchSpec withSearchCondition(FilterCondition value) {
        setSearchCondition(value);
        return this;
    }

    @Override
    public SearchSpec withOrderCondition(OrderCondition value) {
        setOrderCondition(value);
        return this;
    }

    @Override
    public SearchSpec withStartIndex(Integer value) {
        setStartIndex(value);
        return this;
    }

    @Override
    public SearchSpec withPageSize(Integer value) {
        setPageSize(value);
        return this;
    }

}

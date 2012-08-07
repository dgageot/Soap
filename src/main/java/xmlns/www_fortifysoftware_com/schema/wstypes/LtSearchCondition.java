
package xmlns.www_fortifysoftware_com.schema.wstypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;


/**
 * <p>Java class for LTSearchCondition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LTSearchCondition">
 *   &lt;complexContent>
 *     &lt;extension base="{xmlns://www.fortifysoftware.com/schema/wsTypes}OptionallyNumericFilterCondition">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LTSearchCondition")
public class LtSearchCondition
    extends OptionallyNumericFilterCondition
{


    /**
     * Default no-arg constructor
     * 
     */
    public LtSearchCondition() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public LtSearchCondition(final String searchConstant, final String stringCondition, final Boolean booleanCondition, final XMLGregorianCalendar dateCondition, final Long numberCondition, final EnumSpec enumCondition, final Boolean numeric) {
        super(searchConstant, stringCondition, booleanCondition, dateCondition, numberCondition, enumCondition, numeric);
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
    public LtSearchCondition withNumeric(Boolean value) {
        setNumeric(value);
        return this;
    }

    @Override
    public LtSearchCondition withStringCondition(String value) {
        setStringCondition(value);
        return this;
    }

    @Override
    public LtSearchCondition withBooleanCondition(Boolean value) {
        setBooleanCondition(value);
        return this;
    }

    @Override
    public LtSearchCondition withDateCondition(XMLGregorianCalendar value) {
        setDateCondition(value);
        return this;
    }

    @Override
    public LtSearchCondition withNumberCondition(Long value) {
        setNumberCondition(value);
        return this;
    }

    @Override
    public LtSearchCondition withEnumCondition(EnumSpec value) {
        setEnumCondition(value);
        return this;
    }

    @Override
    public LtSearchCondition withSearchConstant(String value) {
        setSearchConstant(value);
        return this;
    }

}

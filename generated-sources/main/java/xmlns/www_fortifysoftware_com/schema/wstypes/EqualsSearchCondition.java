
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
 * <p>Java class for EqualsSearchCondition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EqualsSearchCondition">
 *   &lt;complexContent>
 *     &lt;extension base="{xmlns://www.fortifysoftware.com/schema/wsTypes}SinglePropertyFilterCondition">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EqualsSearchCondition")
public class EqualsSearchCondition
    extends SinglePropertyFilterCondition
{


    /**
     * Default no-arg constructor
     * 
     */
    public EqualsSearchCondition() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public EqualsSearchCondition(final String searchConstant, final String stringCondition, final Boolean booleanCondition, final XMLGregorianCalendar dateCondition, final Long numberCondition, final EnumSpec enumCondition) {
        super(searchConstant, stringCondition, booleanCondition, dateCondition, numberCondition, enumCondition);
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
    public EqualsSearchCondition withStringCondition(String value) {
        setStringCondition(value);
        return this;
    }

    @Override
    public EqualsSearchCondition withBooleanCondition(Boolean value) {
        setBooleanCondition(value);
        return this;
    }

    @Override
    public EqualsSearchCondition withDateCondition(XMLGregorianCalendar value) {
        setDateCondition(value);
        return this;
    }

    @Override
    public EqualsSearchCondition withNumberCondition(Long value) {
        setNumberCondition(value);
        return this;
    }

    @Override
    public EqualsSearchCondition withEnumCondition(EnumSpec value) {
        setEnumCondition(value);
        return this;
    }

    @Override
    public EqualsSearchCondition withSearchConstant(String value) {
        setSearchConstant(value);
        return this;
    }

}

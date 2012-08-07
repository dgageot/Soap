
package xmlns.www_fortifysoftware_com.schema.wstypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;


/**
 * <p>Java class for OptionallyNumericFilterCondition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OptionallyNumericFilterCondition">
 *   &lt;complexContent>
 *     &lt;extension base="{xmlns://www.fortifysoftware.com/schema/wsTypes}SinglePropertyFilterCondition">
 *       &lt;attribute name="numeric" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OptionallyNumericFilterCondition")
@XmlSeeAlso({
    BetweenSearchCondition.class,
    GtSearchCondition.class,
    LtSearchCondition.class
})
public class OptionallyNumericFilterCondition
    extends SinglePropertyFilterCondition
{

    @XmlAttribute
    protected Boolean numeric;

    /**
     * Default no-arg constructor
     * 
     */
    public OptionallyNumericFilterCondition() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public OptionallyNumericFilterCondition(final String searchConstant, final String stringCondition, final Boolean booleanCondition, final XMLGregorianCalendar dateCondition, final Long numberCondition, final EnumSpec enumCondition, final Boolean numeric) {
        super(searchConstant, stringCondition, booleanCondition, dateCondition, numberCondition, enumCondition);
        this.numeric = numeric;
    }

    /**
     * Gets the value of the numeric property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNumeric() {
        return numeric;
    }

    /**
     * Sets the value of the numeric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNumeric(Boolean value) {
        this.numeric = value;
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

    public OptionallyNumericFilterCondition withNumeric(Boolean value) {
        setNumeric(value);
        return this;
    }

    @Override
    public OptionallyNumericFilterCondition withStringCondition(String value) {
        setStringCondition(value);
        return this;
    }

    @Override
    public OptionallyNumericFilterCondition withBooleanCondition(Boolean value) {
        setBooleanCondition(value);
        return this;
    }

    @Override
    public OptionallyNumericFilterCondition withDateCondition(XMLGregorianCalendar value) {
        setDateCondition(value);
        return this;
    }

    @Override
    public OptionallyNumericFilterCondition withNumberCondition(Long value) {
        setNumberCondition(value);
        return this;
    }

    @Override
    public OptionallyNumericFilterCondition withEnumCondition(EnumSpec value) {
        setEnumCondition(value);
        return this;
    }

    @Override
    public OptionallyNumericFilterCondition withSearchConstant(String value) {
        setSearchConstant(value);
        return this;
    }

}

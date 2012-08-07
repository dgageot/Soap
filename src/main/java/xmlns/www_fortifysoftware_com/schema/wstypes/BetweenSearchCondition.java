
package xmlns.www_fortifysoftware_com.schema.wstypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;


/**
 * <p>Java class for BetweenSearchCondition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BetweenSearchCondition">
 *   &lt;complexContent>
 *     &lt;extension base="{xmlns://www.fortifysoftware.com/schema/wsTypes}OptionallyNumericFilterCondition">
 *       &lt;sequence>
 *         &lt;element name="OtherCondition" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BetweenSearchCondition", propOrder = {
    "otherCondition"
})
public class BetweenSearchCondition
    extends OptionallyNumericFilterCondition
{

    @XmlElement(name = "OtherCondition", required = true)
    protected String otherCondition;

    /**
     * Default no-arg constructor
     * 
     */
    public BetweenSearchCondition() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public BetweenSearchCondition(final String searchConstant, final String stringCondition, final Boolean booleanCondition, final XMLGregorianCalendar dateCondition, final Long numberCondition, final EnumSpec enumCondition, final Boolean numeric, final String otherCondition) {
        super(searchConstant, stringCondition, booleanCondition, dateCondition, numberCondition, enumCondition, numeric);
        this.otherCondition = otherCondition;
    }

    /**
     * Gets the value of the otherCondition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherCondition() {
        return otherCondition;
    }

    /**
     * Sets the value of the otherCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherCondition(String value) {
        this.otherCondition = value;
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

    public BetweenSearchCondition withOtherCondition(String value) {
        setOtherCondition(value);
        return this;
    }

    @Override
    public BetweenSearchCondition withNumeric(Boolean value) {
        setNumeric(value);
        return this;
    }

    @Override
    public BetweenSearchCondition withStringCondition(String value) {
        setStringCondition(value);
        return this;
    }

    @Override
    public BetweenSearchCondition withBooleanCondition(Boolean value) {
        setBooleanCondition(value);
        return this;
    }

    @Override
    public BetweenSearchCondition withDateCondition(XMLGregorianCalendar value) {
        setDateCondition(value);
        return this;
    }

    @Override
    public BetweenSearchCondition withNumberCondition(Long value) {
        setNumberCondition(value);
        return this;
    }

    @Override
    public BetweenSearchCondition withEnumCondition(EnumSpec value) {
        setEnumCondition(value);
        return this;
    }

    @Override
    public BetweenSearchCondition withSearchConstant(String value) {
        setSearchConstant(value);
        return this;
    }

}

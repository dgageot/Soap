
package xmlns.www_fortifysoftware_com.schema.wstypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;


/**
 * <p>Java class for SinglePropertyFilterCondition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SinglePropertyFilterCondition">
 *   &lt;complexContent>
 *     &lt;extension base="{xmlns://www.fortifysoftware.com/schema/wsTypes}PropertyFilterCondition">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="StringCondition" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="BooleanCondition" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *           &lt;element name="DateCondition" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *           &lt;element name="NumberCondition" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *           &lt;element name="EnumCondition" type="{xmlns://www.fortifysoftware.com/schema/wsTypes}EnumSpec"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SinglePropertyFilterCondition", propOrder = {
    "stringCondition",
    "booleanCondition",
    "dateCondition",
    "numberCondition",
    "enumCondition"
})
@XmlSeeAlso({
    EqualsSearchCondition.class,
    NotEqualSearchCondition.class,
    StartsWithSearchCondition.class,
    ContainsSearchCondition.class,
    NullSearchCondition.class,
    OptionallyNumericFilterCondition.class
})
public class SinglePropertyFilterCondition
    extends PropertyFilterCondition
{

    @XmlElement(name = "StringCondition")
    protected String stringCondition;
    @XmlElement(name = "BooleanCondition")
    protected Boolean booleanCondition;
    @XmlElement(name = "DateCondition")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateCondition;
    @XmlElement(name = "NumberCondition")
    protected Long numberCondition;
    @XmlElement(name = "EnumCondition")
    protected EnumSpec enumCondition;

    /**
     * Default no-arg constructor
     * 
     */
    public SinglePropertyFilterCondition() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public SinglePropertyFilterCondition(final String searchConstant, final String stringCondition, final Boolean booleanCondition, final XMLGregorianCalendar dateCondition, final Long numberCondition, final EnumSpec enumCondition) {
        super(searchConstant);
        this.stringCondition = stringCondition;
        this.booleanCondition = booleanCondition;
        this.dateCondition = dateCondition;
        this.numberCondition = numberCondition;
        this.enumCondition = enumCondition;
    }

    /**
     * Gets the value of the stringCondition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStringCondition() {
        return stringCondition;
    }

    /**
     * Sets the value of the stringCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStringCondition(String value) {
        this.stringCondition = value;
    }

    /**
     * Gets the value of the booleanCondition property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBooleanCondition() {
        return booleanCondition;
    }

    /**
     * Sets the value of the booleanCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBooleanCondition(Boolean value) {
        this.booleanCondition = value;
    }

    /**
     * Gets the value of the dateCondition property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateCondition() {
        return dateCondition;
    }

    /**
     * Sets the value of the dateCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateCondition(XMLGregorianCalendar value) {
        this.dateCondition = value;
    }

    /**
     * Gets the value of the numberCondition property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumberCondition() {
        return numberCondition;
    }

    /**
     * Sets the value of the numberCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumberCondition(Long value) {
        this.numberCondition = value;
    }

    /**
     * Gets the value of the enumCondition property.
     * 
     * @return
     *     possible object is
     *     {@link EnumSpec }
     *     
     */
    public EnumSpec getEnumCondition() {
        return enumCondition;
    }

    /**
     * Sets the value of the enumCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumSpec }
     *     
     */
    public void setEnumCondition(EnumSpec value) {
        this.enumCondition = value;
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

    public SinglePropertyFilterCondition withStringCondition(String value) {
        setStringCondition(value);
        return this;
    }

    public SinglePropertyFilterCondition withBooleanCondition(Boolean value) {
        setBooleanCondition(value);
        return this;
    }

    public SinglePropertyFilterCondition withDateCondition(XMLGregorianCalendar value) {
        setDateCondition(value);
        return this;
    }

    public SinglePropertyFilterCondition withNumberCondition(Long value) {
        setNumberCondition(value);
        return this;
    }

    public SinglePropertyFilterCondition withEnumCondition(EnumSpec value) {
        setEnumCondition(value);
        return this;
    }

    @Override
    public SinglePropertyFilterCondition withSearchConstant(String value) {
        setSearchConstant(value);
        return this;
    }

}

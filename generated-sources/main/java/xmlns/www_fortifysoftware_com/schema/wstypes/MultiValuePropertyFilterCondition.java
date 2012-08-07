
package xmlns.www_fortifysoftware_com.schema.wstypes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;


/**
 * <p>Java class for MultiValuePropertyFilterCondition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MultiValuePropertyFilterCondition">
 *   &lt;complexContent>
 *     &lt;extension base="{xmlns://www.fortifysoftware.com/schema/wsTypes}PropertyFilterCondition">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded">
 *           &lt;element name="StringCondition" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="BooleanCondition" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *           &lt;element name="DateCondition" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *           &lt;element name="NumberCondition" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *           &lt;element name="EnumCondition" type="{xmlns://www.fortifysoftware.com/schema/wsTypes}EnumSpec"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="idList" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiValuePropertyFilterCondition", propOrder = {
    "stringConditionOrBooleanConditionOrDateCondition"
})
public class MultiValuePropertyFilterCondition
    extends PropertyFilterCondition
{

    @XmlElements({
        @XmlElement(name = "NumberCondition", type = Long.class),
        @XmlElement(name = "DateCondition", type = XMLGregorianCalendar.class),
        @XmlElement(name = "BooleanCondition", type = Boolean.class),
        @XmlElement(name = "StringCondition", type = String.class),
        @XmlElement(name = "EnumCondition", type = EnumSpec.class)
    })
    protected List<Object> stringConditionOrBooleanConditionOrDateCondition;
    @XmlAttribute
    protected Boolean idList;

    /**
     * Default no-arg constructor
     * 
     */
    public MultiValuePropertyFilterCondition() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public MultiValuePropertyFilterCondition(final String searchConstant, final List<Object> stringConditionOrBooleanConditionOrDateCondition, final Boolean idList) {
        super(searchConstant);
        this.stringConditionOrBooleanConditionOrDateCondition = stringConditionOrBooleanConditionOrDateCondition;
        this.idList = idList;
    }

    /**
     * Gets the value of the stringConditionOrBooleanConditionOrDateCondition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stringConditionOrBooleanConditionOrDateCondition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStringConditionOrBooleanConditionOrDateCondition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * {@link XMLGregorianCalendar }
     * {@link Boolean }
     * {@link String }
     * {@link EnumSpec }
     * 
     * 
     */
    public List<Object> getStringConditionOrBooleanConditionOrDateCondition() {
        if (stringConditionOrBooleanConditionOrDateCondition == null) {
            stringConditionOrBooleanConditionOrDateCondition = new ArrayList<Object>();
        }
        return this.stringConditionOrBooleanConditionOrDateCondition;
    }

    /**
     * Gets the value of the idList property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIdList() {
        return idList;
    }

    /**
     * Sets the value of the idList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIdList(Boolean value) {
        this.idList = value;
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
     * Sets the value of the stringConditionOrBooleanConditionOrDateCondition property.
     * 
     * @param stringConditionOrBooleanConditionOrDateCondition
     *     allowed object is
     *     {@link Long }
     *     {@link XMLGregorianCalendar }
     *     {@link Boolean }
     *     {@link String }
     *     {@link EnumSpec }
     *     
     */
    public void setStringConditionOrBooleanConditionOrDateCondition(List<Object> stringConditionOrBooleanConditionOrDateCondition) {
        this.stringConditionOrBooleanConditionOrDateCondition = stringConditionOrBooleanConditionOrDateCondition;
    }

    public MultiValuePropertyFilterCondition withStringConditionOrBooleanConditionOrDateCondition(Object... values) {
        if (values!= null) {
            for (Object value: values) {
                getStringConditionOrBooleanConditionOrDateCondition().add(value);
            }
        }
        return this;
    }

    public MultiValuePropertyFilterCondition withStringConditionOrBooleanConditionOrDateCondition(Collection<Object> values) {
        if (values!= null) {
            getStringConditionOrBooleanConditionOrDateCondition().addAll(values);
        }
        return this;
    }

    public MultiValuePropertyFilterCondition withIdList(Boolean value) {
        setIdList(value);
        return this;
    }

    public MultiValuePropertyFilterCondition withStringConditionOrBooleanConditionOrDateCondition(List<Object> stringConditionOrBooleanConditionOrDateCondition) {
        setStringConditionOrBooleanConditionOrDateCondition(stringConditionOrBooleanConditionOrDateCondition);
        return this;
    }

    @Override
    public MultiValuePropertyFilterCondition withSearchConstant(String value) {
        setSearchConstant(value);
        return this;
    }

}

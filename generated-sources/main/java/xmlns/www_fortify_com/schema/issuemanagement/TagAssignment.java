
package xmlns.www_fortify_com.schema.issuemanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;


/**
 * <p>Java class for TagAssignment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TagAssignment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="ValueId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ValueString" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/choice>
 *       &lt;attribute name="TagId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TagAssignment", propOrder = {
    "valueId",
    "valueString"
})
public class TagAssignment {

    @XmlElement(name = "ValueId")
    protected String valueId;
    @XmlElement(name = "ValueString")
    protected String valueString;
    @XmlAttribute(name = "TagId", required = true)
    protected String tagId;

    /**
     * Default no-arg constructor
     * 
     */
    public TagAssignment() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public TagAssignment(final String valueId, final String valueString, final String tagId) {
        this.valueId = valueId;
        this.valueString = valueString;
        this.tagId = tagId;
    }

    /**
     * Gets the value of the valueId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueId() {
        return valueId;
    }

    /**
     * Sets the value of the valueId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueId(String value) {
        this.valueId = value;
    }

    /**
     * Gets the value of the valueString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueString() {
        return valueString;
    }

    /**
     * Sets the value of the valueString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueString(String value) {
        this.valueString = value;
    }

    /**
     * Gets the value of the tagId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTagId() {
        return tagId;
    }

    /**
     * Sets the value of the tagId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTagId(String value) {
        this.tagId = value;
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

    public TagAssignment withValueId(String value) {
        setValueId(value);
        return this;
    }

    public TagAssignment withValueString(String value) {
        setValueString(value);
        return this;
    }

    public TagAssignment withTagId(String value) {
        setTagId(value);
        return this;
    }

}

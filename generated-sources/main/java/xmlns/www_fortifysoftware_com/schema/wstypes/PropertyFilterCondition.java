
package xmlns.www_fortifysoftware_com.schema.wstypes;

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
 * <p>Java class for PropertyFilterCondition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PropertyFilterCondition">
 *   &lt;complexContent>
 *     &lt;extension base="{xmlns://www.fortifysoftware.com/schema/wsTypes}FilterCondition">
 *       &lt;sequence>
 *         &lt;element name="SearchConstant" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PropertyFilterCondition", propOrder = {
    "searchConstant"
})
@XmlSeeAlso({
    MultiValuePropertyFilterCondition.class,
    SinglePropertyFilterCondition.class
})
public class PropertyFilterCondition
    extends FilterCondition
{

    @XmlElement(name = "SearchConstant", required = true)
    protected String searchConstant;

    /**
     * Default no-arg constructor
     * 
     */
    public PropertyFilterCondition() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public PropertyFilterCondition(final String searchConstant) {
        super();
        this.searchConstant = searchConstant;
    }

    /**
     * Gets the value of the searchConstant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchConstant() {
        return searchConstant;
    }

    /**
     * Sets the value of the searchConstant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchConstant(String value) {
        this.searchConstant = value;
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

    public PropertyFilterCondition withSearchConstant(String value) {
        setSearchConstant(value);
        return this;
    }

}

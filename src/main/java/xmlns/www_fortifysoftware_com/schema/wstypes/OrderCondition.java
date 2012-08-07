
package xmlns.www_fortifysoftware_com.schema.wstypes;

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
 * <p>Java class for OrderCondition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderCondition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SearchConstant" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *       &lt;attribute name="descending" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderCondition", propOrder = {
    "searchConstant"
})
public class OrderCondition {

    @XmlElement(name = "SearchConstant", required = true)
    protected String searchConstant;
    @XmlAttribute
    protected Boolean descending;

    /**
     * Default no-arg constructor
     * 
     */
    public OrderCondition() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public OrderCondition(final String searchConstant, final Boolean descending) {
        this.searchConstant = searchConstant;
        this.descending = descending;
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

    /**
     * Gets the value of the descending property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDescending() {
        return descending;
    }

    /**
     * Sets the value of the descending property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDescending(Boolean value) {
        this.descending = value;
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

    public OrderCondition withSearchConstant(String value) {
        setSearchConstant(value);
        return this;
    }

    public OrderCondition withDescending(Boolean value) {
        setDescending(value);
        return this;
    }

}


package xmlns.www_fortify_com.schema.issuemanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;


/**
 * <p>Java class for FilterSetDescription complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FilterSetDescription">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FilterSetId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FilterSetDescription", propOrder = {
    "name",
    "filterSetId",
    "description"
})
public class FilterSetDescription {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "FilterSetId", required = true)
    protected String filterSetId;
    @XmlElement(name = "Description", required = true)
    protected String description;

    /**
     * Default no-arg constructor
     * 
     */
    public FilterSetDescription() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public FilterSetDescription(final String name, final String filterSetId, final String description) {
        this.name = name;
        this.filterSetId = filterSetId;
        this.description = description;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the filterSetId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilterSetId() {
        return filterSetId;
    }

    /**
     * Sets the value of the filterSetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilterSetId(String value) {
        this.filterSetId = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
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

    public FilterSetDescription withName(String value) {
        setName(value);
        return this;
    }

    public FilterSetDescription withFilterSetId(String value) {
        setFilterSetId(value);
        return this;
    }

    public FilterSetDescription withDescription(String value) {
        setDescription(value);
        return this;
    }

}

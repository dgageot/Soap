
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
 * <p>Java class for GroupingProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GroupingProfile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="GroupingTypeString" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupingProfile", propOrder = {
    "name",
    "groupingTypeString"
})
public class GroupingProfile {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "GroupingTypeString", required = true)
    protected String groupingTypeString;

    /**
     * Default no-arg constructor
     * 
     */
    public GroupingProfile() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public GroupingProfile(final String name, final String groupingTypeString) {
        this.name = name;
        this.groupingTypeString = groupingTypeString;
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
     * Gets the value of the groupingTypeString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupingTypeString() {
        return groupingTypeString;
    }

    /**
     * Sets the value of the groupingTypeString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupingTypeString(String value) {
        this.groupingTypeString = value;
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

    public GroupingProfile withName(String value) {
        setName(value);
        return this;
    }

    public GroupingProfile withGroupingTypeString(String value) {
        setGroupingTypeString(value);
        return this;
    }

}

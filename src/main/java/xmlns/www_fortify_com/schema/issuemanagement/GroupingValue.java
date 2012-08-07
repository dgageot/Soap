
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
 * <p>Java class for GroupingValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GroupingValue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TotalCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="VisibleCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AuditedCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Selected" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupingValue", propOrder = {
    "name",
    "id",
    "totalCount",
    "visibleCount",
    "auditedCount",
    "selected"
})
public class GroupingValue {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "TotalCount")
    protected int totalCount;
    @XmlElement(name = "VisibleCount")
    protected int visibleCount;
    @XmlElement(name = "AuditedCount")
    protected int auditedCount;
    @XmlElement(name = "Selected")
    protected boolean selected;

    /**
     * Default no-arg constructor
     * 
     */
    public GroupingValue() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public GroupingValue(final String name, final String id, final int totalCount, final int visibleCount, final int auditedCount, final boolean selected) {
        this.name = name;
        this.id = id;
        this.totalCount = totalCount;
        this.visibleCount = visibleCount;
        this.auditedCount = auditedCount;
        this.selected = selected;
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
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the totalCount property.
     * 
     */
    public int getTotalCount() {
        return totalCount;
    }

    /**
     * Sets the value of the totalCount property.
     * 
     */
    public void setTotalCount(int value) {
        this.totalCount = value;
    }

    /**
     * Gets the value of the visibleCount property.
     * 
     */
    public int getVisibleCount() {
        return visibleCount;
    }

    /**
     * Sets the value of the visibleCount property.
     * 
     */
    public void setVisibleCount(int value) {
        this.visibleCount = value;
    }

    /**
     * Gets the value of the auditedCount property.
     * 
     */
    public int getAuditedCount() {
        return auditedCount;
    }

    /**
     * Sets the value of the auditedCount property.
     * 
     */
    public void setAuditedCount(int value) {
        this.auditedCount = value;
    }

    /**
     * Gets the value of the selected property.
     * 
     */
    public boolean isSelected() {
        return selected;
    }

    /**
     * Sets the value of the selected property.
     * 
     */
    public void setSelected(boolean value) {
        this.selected = value;
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

    public GroupingValue withName(String value) {
        setName(value);
        return this;
    }

    public GroupingValue withId(String value) {
        setId(value);
        return this;
    }

    public GroupingValue withTotalCount(int value) {
        setTotalCount(value);
        return this;
    }

    public GroupingValue withVisibleCount(int value) {
        setVisibleCount(value);
        return this;
    }

    public GroupingValue withAuditedCount(int value) {
        setAuditedCount(value);
        return this;
    }

    public GroupingValue withSelected(boolean value) {
        setSelected(value);
        return this;
    }

}

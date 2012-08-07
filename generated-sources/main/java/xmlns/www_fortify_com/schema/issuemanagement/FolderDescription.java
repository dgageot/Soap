
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
 * <p>Java class for FolderDescription complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FolderDescription">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FolderId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TotalCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="HiddenCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RemovedCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SuppressedCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Color" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FolderDescription", propOrder = {
    "name",
    "folderId",
    "description",
    "totalCount",
    "hiddenCount",
    "removedCount",
    "suppressedCount",
    "color"
})
public class FolderDescription {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "FolderId", required = true)
    protected String folderId;
    @XmlElement(name = "Description", required = true)
    protected String description;
    @XmlElement(name = "TotalCount")
    protected Integer totalCount;
    @XmlElement(name = "HiddenCount")
    protected Integer hiddenCount;
    @XmlElement(name = "RemovedCount")
    protected Integer removedCount;
    @XmlElement(name = "SuppressedCount")
    protected Integer suppressedCount;
    @XmlElement(name = "Color")
    protected String color;

    /**
     * Default no-arg constructor
     * 
     */
    public FolderDescription() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public FolderDescription(final String name, final String folderId, final String description, final Integer totalCount, final Integer hiddenCount, final Integer removedCount, final Integer suppressedCount, final String color) {
        this.name = name;
        this.folderId = folderId;
        this.description = description;
        this.totalCount = totalCount;
        this.hiddenCount = hiddenCount;
        this.removedCount = removedCount;
        this.suppressedCount = suppressedCount;
        this.color = color;
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
     * Gets the value of the folderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFolderId() {
        return folderId;
    }

    /**
     * Sets the value of the folderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFolderId(String value) {
        this.folderId = value;
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

    /**
     * Gets the value of the totalCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     * Sets the value of the totalCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalCount(Integer value) {
        this.totalCount = value;
    }

    /**
     * Gets the value of the hiddenCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHiddenCount() {
        return hiddenCount;
    }

    /**
     * Sets the value of the hiddenCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHiddenCount(Integer value) {
        this.hiddenCount = value;
    }

    /**
     * Gets the value of the removedCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRemovedCount() {
        return removedCount;
    }

    /**
     * Sets the value of the removedCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRemovedCount(Integer value) {
        this.removedCount = value;
    }

    /**
     * Gets the value of the suppressedCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSuppressedCount() {
        return suppressedCount;
    }

    /**
     * Sets the value of the suppressedCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSuppressedCount(Integer value) {
        this.suppressedCount = value;
    }

    /**
     * Gets the value of the color property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the value of the color property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColor(String value) {
        this.color = value;
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

    public FolderDescription withName(String value) {
        setName(value);
        return this;
    }

    public FolderDescription withFolderId(String value) {
        setFolderId(value);
        return this;
    }

    public FolderDescription withDescription(String value) {
        setDescription(value);
        return this;
    }

    public FolderDescription withTotalCount(Integer value) {
        setTotalCount(value);
        return this;
    }

    public FolderDescription withHiddenCount(Integer value) {
        setHiddenCount(value);
        return this;
    }

    public FolderDescription withRemovedCount(Integer value) {
        setRemovedCount(value);
        return this;
    }

    public FolderDescription withSuppressedCount(Integer value) {
        setSuppressedCount(value);
        return this;
    }

    public FolderDescription withColor(String value) {
        setColor(value);
        return this;
    }

}

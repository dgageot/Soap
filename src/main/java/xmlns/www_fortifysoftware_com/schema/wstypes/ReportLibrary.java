
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
 * <p>Java class for ReportLibrary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReportLibrary">
 *   &lt;complexContent>
 *     &lt;extension base="{xmlns://www.fortifysoftware.com/schema/wsTypes}PublishBase">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FileEntryName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Guid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportLibrary", propOrder = {
    "name",
    "description",
    "fileEntryName",
    "guid"
})
public class ReportLibrary
    extends PublishBase
{

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Description", required = true)
    protected String description;
    @XmlElement(name = "FileEntryName", required = true)
    protected String fileEntryName;
    @XmlElement(name = "Guid", required = true)
    protected String guid;
    @XmlAttribute
    protected Long id;

    /**
     * Default no-arg constructor
     * 
     */
    public ReportLibrary() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ReportLibrary(final int publishVersion, final int objectVersion, final String name, final String description, final String fileEntryName, final String guid, final Long id) {
        super(publishVersion, objectVersion);
        this.name = name;
        this.description = description;
        this.fileEntryName = fileEntryName;
        this.guid = guid;
        this.id = id;
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
     * Gets the value of the fileEntryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileEntryName() {
        return fileEntryName;
    }

    /**
     * Sets the value of the fileEntryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileEntryName(String value) {
        this.fileEntryName = value;
    }

    /**
     * Gets the value of the guid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuid() {
        return guid;
    }

    /**
     * Sets the value of the guid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuid(String value) {
        this.guid = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
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

    public ReportLibrary withName(String value) {
        setName(value);
        return this;
    }

    public ReportLibrary withDescription(String value) {
        setDescription(value);
        return this;
    }

    public ReportLibrary withFileEntryName(String value) {
        setFileEntryName(value);
        return this;
    }

    public ReportLibrary withGuid(String value) {
        setGuid(value);
        return this;
    }

    public ReportLibrary withId(Long value) {
        setId(value);
        return this;
    }

    @Override
    public ReportLibrary withPublishVersion(int value) {
        setPublishVersion(value);
        return this;
    }

    @Override
    public ReportLibrary withObjectVersion(int value) {
        setObjectVersion(value);
        return this;
    }

}

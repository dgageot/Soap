
package xmlns.www_fortify_com.schema.audit;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProjectVersionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProjectVersionId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="WriteDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "description",
    "name",
    "projectVersionName",
    "projectVersionId",
    "writeDate"
})
@XmlRootElement(name = "ProjectInfo")
public class ProjectInfo {

    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "ProjectVersionName")
    protected String projectVersionName;
    @XmlElement(name = "ProjectVersionId")
    protected Long projectVersionId;
    @XmlElement(name = "WriteDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar writeDate;

    /**
     * Default no-arg constructor
     * 
     */
    public ProjectInfo() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ProjectInfo(final String description, final String name, final String projectVersionName, final Long projectVersionId, final XMLGregorianCalendar writeDate) {
        this.description = description;
        this.name = name;
        this.projectVersionName = projectVersionName;
        this.projectVersionId = projectVersionId;
        this.writeDate = writeDate;
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
     * Gets the value of the projectVersionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectVersionName() {
        return projectVersionName;
    }

    /**
     * Sets the value of the projectVersionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectVersionName(String value) {
        this.projectVersionName = value;
    }

    /**
     * Gets the value of the projectVersionId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProjectVersionId() {
        return projectVersionId;
    }

    /**
     * Sets the value of the projectVersionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProjectVersionId(Long value) {
        this.projectVersionId = value;
    }

    /**
     * Gets the value of the writeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getWriteDate() {
        return writeDate;
    }

    /**
     * Sets the value of the writeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setWriteDate(XMLGregorianCalendar value) {
        this.writeDate = value;
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

    public ProjectInfo withDescription(String value) {
        setDescription(value);
        return this;
    }

    public ProjectInfo withName(String value) {
        setName(value);
        return this;
    }

    public ProjectInfo withProjectVersionName(String value) {
        setProjectVersionName(value);
        return this;
    }

    public ProjectInfo withProjectVersionId(Long value) {
        setProjectVersionId(value);
        return this;
    }

    public ProjectInfo withWriteDate(XMLGregorianCalendar value) {
        setWriteDate(value);
        return this;
    }

}

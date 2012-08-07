
package xmlns.www_fortifysoftware_com.schema.wstypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;


/**
 * <p>Java class for RuntimeEventArchive complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RuntimeEventArchive">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="RuntimeApplicationName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Restored" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RuntimeEventArchive", propOrder = {
    "id",
    "runtimeApplicationName",
    "notes",
    "startDate",
    "endDate",
    "restored"
})
public class RuntimeEventArchive {

    protected long id;
    @XmlElement(name = "RuntimeApplicationName", required = true)
    protected String runtimeApplicationName;
    @XmlElement(name = "Notes")
    protected String notes;
    @XmlElement(name = "StartDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlElement(name = "EndDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    @XmlElement(name = "Restored")
    protected boolean restored;

    /**
     * Default no-arg constructor
     * 
     */
    public RuntimeEventArchive() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public RuntimeEventArchive(final long id, final String runtimeApplicationName, final String notes, final XMLGregorianCalendar startDate, final XMLGregorianCalendar endDate, final boolean restored) {
        this.id = id;
        this.runtimeApplicationName = runtimeApplicationName;
        this.notes = notes;
        this.startDate = startDate;
        this.endDate = endDate;
        this.restored = restored;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the runtimeApplicationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuntimeApplicationName() {
        return runtimeApplicationName;
    }

    /**
     * Sets the value of the runtimeApplicationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuntimeApplicationName(String value) {
        this.runtimeApplicationName = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the restored property.
     * 
     */
    public boolean isRestored() {
        return restored;
    }

    /**
     * Sets the value of the restored property.
     * 
     */
    public void setRestored(boolean value) {
        this.restored = value;
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

    public RuntimeEventArchive withId(long value) {
        setId(value);
        return this;
    }

    public RuntimeEventArchive withRuntimeApplicationName(String value) {
        setRuntimeApplicationName(value);
        return this;
    }

    public RuntimeEventArchive withNotes(String value) {
        setNotes(value);
        return this;
    }

    public RuntimeEventArchive withStartDate(XMLGregorianCalendar value) {
        setStartDate(value);
        return this;
    }

    public RuntimeEventArchive withEndDate(XMLGregorianCalendar value) {
        setEndDate(value);
        return this;
    }

    public RuntimeEventArchive withRestored(boolean value) {
        setRestored(value);
        return this;
    }

}

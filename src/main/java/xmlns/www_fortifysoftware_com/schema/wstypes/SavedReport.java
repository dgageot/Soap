
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
 * <p>Java class for SavedReport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SavedReport">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Note" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ReportDefinition" type="{xmlns://www.fortifysoftware.com/schema/wsTypes}ReportDefinition"/>
 *         &lt;element name="Username" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="GenerationDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Filename" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OutputFormat" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OutputDocId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Published" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="EntityType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SavedReport", propOrder = {
    "id",
    "name",
    "note",
    "reportDefinition",
    "username",
    "generationDate",
    "status",
    "filename",
    "outputFormat",
    "outputDocId",
    "published",
    "entityType"
})
public class SavedReport {

    @XmlElement(name = "Id")
    protected long id;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Note", required = true)
    protected String note;
    @XmlElement(name = "ReportDefinition", required = true)
    protected ReportDefinition reportDefinition;
    @XmlElement(name = "Username", required = true)
    protected String username;
    @XmlElement(name = "GenerationDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar generationDate;
    @XmlElement(name = "Status", required = true)
    protected String status;
    @XmlElement(name = "Filename", required = true)
    protected String filename;
    @XmlElement(name = "OutputFormat", required = true)
    protected String outputFormat;
    @XmlElement(name = "OutputDocId")
    protected long outputDocId;
    @XmlElement(name = "Published")
    protected boolean published;
    @XmlElement(name = "EntityType", required = true)
    protected String entityType;

    /**
     * Default no-arg constructor
     * 
     */
    public SavedReport() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public SavedReport(final long id, final String name, final String note, final ReportDefinition reportDefinition, final String username, final XMLGregorianCalendar generationDate, final String status, final String filename, final String outputFormat, final long outputDocId, final boolean published, final String entityType) {
        this.id = id;
        this.name = name;
        this.note = note;
        this.reportDefinition = reportDefinition;
        this.username = username;
        this.generationDate = generationDate;
        this.status = status;
        this.filename = filename;
        this.outputFormat = outputFormat;
        this.outputDocId = outputDocId;
        this.published = published;
        this.entityType = entityType;
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
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

    /**
     * Gets the value of the reportDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link ReportDefinition }
     *     
     */
    public ReportDefinition getReportDefinition() {
        return reportDefinition;
    }

    /**
     * Sets the value of the reportDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportDefinition }
     *     
     */
    public void setReportDefinition(ReportDefinition value) {
        this.reportDefinition = value;
    }

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Gets the value of the generationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGenerationDate() {
        return generationDate;
    }

    /**
     * Sets the value of the generationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGenerationDate(XMLGregorianCalendar value) {
        this.generationDate = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the filename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilename() {
        return filename;
    }

    /**
     * Sets the value of the filename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilename(String value) {
        this.filename = value;
    }

    /**
     * Gets the value of the outputFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputFormat() {
        return outputFormat;
    }

    /**
     * Sets the value of the outputFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputFormat(String value) {
        this.outputFormat = value;
    }

    /**
     * Gets the value of the outputDocId property.
     * 
     */
    public long getOutputDocId() {
        return outputDocId;
    }

    /**
     * Sets the value of the outputDocId property.
     * 
     */
    public void setOutputDocId(long value) {
        this.outputDocId = value;
    }

    /**
     * Gets the value of the published property.
     * 
     */
    public boolean isPublished() {
        return published;
    }

    /**
     * Sets the value of the published property.
     * 
     */
    public void setPublished(boolean value) {
        this.published = value;
    }

    /**
     * Gets the value of the entityType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityType() {
        return entityType;
    }

    /**
     * Sets the value of the entityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityType(String value) {
        this.entityType = value;
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

    public SavedReport withId(long value) {
        setId(value);
        return this;
    }

    public SavedReport withName(String value) {
        setName(value);
        return this;
    }

    public SavedReport withNote(String value) {
        setNote(value);
        return this;
    }

    public SavedReport withReportDefinition(ReportDefinition value) {
        setReportDefinition(value);
        return this;
    }

    public SavedReport withUsername(String value) {
        setUsername(value);
        return this;
    }

    public SavedReport withGenerationDate(XMLGregorianCalendar value) {
        setGenerationDate(value);
        return this;
    }

    public SavedReport withStatus(String value) {
        setStatus(value);
        return this;
    }

    public SavedReport withFilename(String value) {
        setFilename(value);
        return this;
    }

    public SavedReport withOutputFormat(String value) {
        setOutputFormat(value);
        return this;
    }

    public SavedReport withOutputDocId(long value) {
        setOutputDocId(value);
        return this;
    }

    public SavedReport withPublished(boolean value) {
        setPublished(value);
        return this;
    }

    public SavedReport withEntityType(String value) {
        setEntityType(value);
        return this;
    }

}


package xmlns.www_fortifysoftware_com.schema.wstypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import xmlns.www_fortifysoftware_com.schema.enumconstants.TemplateMode;


/**
 * <p>Java class for ProjectVersionLite complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProjectVersionLite">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Mode" type="{xmlns://www.fortifysoftware.com/schema/enumConstants}TemplateMode"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProjectId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Committed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ProjectTemplateId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProjectVersionLite", propOrder = {
    "id",
    "mode",
    "name",
    "description",
    "projectId",
    "committed",
    "projectTemplateId"
})
public class ProjectVersionLite {

    @XmlElement(name = "Id")
    protected long id;
    @XmlElement(name = "Mode", required = true)
    protected TemplateMode mode;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "ProjectId")
    protected long projectId;
    @XmlElement(name = "Committed")
    protected boolean committed;
    @XmlElement(name = "ProjectTemplateId")
    protected String projectTemplateId;

    /**
     * Default no-arg constructor
     * 
     */
    public ProjectVersionLite() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ProjectVersionLite(final long id, final TemplateMode mode, final String name, final String description, final long projectId, final boolean committed, final String projectTemplateId) {
        this.id = id;
        this.mode = mode;
        this.name = name;
        this.description = description;
        this.projectId = projectId;
        this.committed = committed;
        this.projectTemplateId = projectTemplateId;
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
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link TemplateMode }
     *     
     */
    public TemplateMode getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TemplateMode }
     *     
     */
    public void setMode(TemplateMode value) {
        this.mode = value;
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
     * Gets the value of the projectId property.
     * 
     */
    public long getProjectId() {
        return projectId;
    }

    /**
     * Sets the value of the projectId property.
     * 
     */
    public void setProjectId(long value) {
        this.projectId = value;
    }

    /**
     * Gets the value of the committed property.
     * 
     */
    public boolean isCommitted() {
        return committed;
    }

    /**
     * Sets the value of the committed property.
     * 
     */
    public void setCommitted(boolean value) {
        this.committed = value;
    }

    /**
     * Gets the value of the projectTemplateId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectTemplateId() {
        return projectTemplateId;
    }

    /**
     * Sets the value of the projectTemplateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectTemplateId(String value) {
        this.projectTemplateId = value;
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

    public ProjectVersionLite withId(long value) {
        setId(value);
        return this;
    }

    public ProjectVersionLite withMode(TemplateMode value) {
        setMode(value);
        return this;
    }

    public ProjectVersionLite withName(String value) {
        setName(value);
        return this;
    }

    public ProjectVersionLite withDescription(String value) {
        setDescription(value);
        return this;
    }

    public ProjectVersionLite withProjectId(long value) {
        setProjectId(value);
        return this;
    }

    public ProjectVersionLite withCommitted(boolean value) {
        setCommitted(value);
        return this;
    }

    public ProjectVersionLite withProjectTemplateId(String value) {
        setProjectTemplateId(value);
        return this;
    }

}

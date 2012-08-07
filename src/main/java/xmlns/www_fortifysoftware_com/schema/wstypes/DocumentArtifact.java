
package xmlns.www_fortifysoftware_com.schema.wstypes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;


/**
 * <p>Java class for DocumentArtifact complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentArtifact">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProjectIdentifier" type="{xmlns://www.fortifysoftware.com/schema/wsTypes}ProjectIdentifier"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;choice>
 *           &lt;element name="filename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="DocumentDefinitionId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentArtifact", propOrder = {
    "projectIdentifier",
    "name",
    "description",
    "filename",
    "url",
    "documentDefinitionId"
})
public class DocumentArtifact {

    @XmlElement(name = "ProjectIdentifier", required = true)
    protected ProjectIdentifier projectIdentifier;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Description", required = true)
    protected String description;
    protected String filename;
    protected String url;
    @XmlElement(name = "DocumentDefinitionId", required = true)
    protected List<String> documentDefinitionId;

    /**
     * Default no-arg constructor
     * 
     */
    public DocumentArtifact() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public DocumentArtifact(final ProjectIdentifier projectIdentifier, final String name, final String description, final String filename, final String url, final List<String> documentDefinitionId) {
        this.projectIdentifier = projectIdentifier;
        this.name = name;
        this.description = description;
        this.filename = filename;
        this.url = url;
        this.documentDefinitionId = documentDefinitionId;
    }

    /**
     * Gets the value of the projectIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectIdentifier }
     *     
     */
    public ProjectIdentifier getProjectIdentifier() {
        return projectIdentifier;
    }

    /**
     * Sets the value of the projectIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectIdentifier }
     *     
     */
    public void setProjectIdentifier(ProjectIdentifier value) {
        this.projectIdentifier = value;
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
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the documentDefinitionId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentDefinitionId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentDefinitionId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDocumentDefinitionId() {
        if (documentDefinitionId == null) {
            documentDefinitionId = new ArrayList<String>();
        }
        return this.documentDefinitionId;
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

    /**
     * Sets the value of the documentDefinitionId property.
     * 
     * @param documentDefinitionId
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentDefinitionId(List<String> documentDefinitionId) {
        this.documentDefinitionId = documentDefinitionId;
    }

    public DocumentArtifact withProjectIdentifier(ProjectIdentifier value) {
        setProjectIdentifier(value);
        return this;
    }

    public DocumentArtifact withName(String value) {
        setName(value);
        return this;
    }

    public DocumentArtifact withDescription(String value) {
        setDescription(value);
        return this;
    }

    public DocumentArtifact withFilename(String value) {
        setFilename(value);
        return this;
    }

    public DocumentArtifact withUrl(String value) {
        setUrl(value);
        return this;
    }

    public DocumentArtifact withDocumentDefinitionId(String... values) {
        if (values!= null) {
            for (String value: values) {
                getDocumentDefinitionId().add(value);
            }
        }
        return this;
    }

    public DocumentArtifact withDocumentDefinitionId(Collection<String> values) {
        if (values!= null) {
            getDocumentDefinitionId().addAll(values);
        }
        return this;
    }

    public DocumentArtifact withDocumentDefinitionId(List<String> documentDefinitionId) {
        setDocumentDefinitionId(documentDefinitionId);
        return this;
    }

}

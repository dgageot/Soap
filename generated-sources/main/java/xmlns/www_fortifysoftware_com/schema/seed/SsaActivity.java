
package xmlns.www_fortifysoftware_com.schema.seed;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import xmlns.www_fortifysoftware_com.schema.wstypes.DocumentArtifact;


/**
 * <p>Java class for SSAActivity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SSAActivity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NameOfEntity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Document" type="{xmlns://www.fortifysoftware.com/schema/wsTypes}DocumentArtifact" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="exemption" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="type" use="required" type="{xmlns://www.fortifysoftware.com/schema/seed}SSAType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SSAActivity", propOrder = {
    "nameOfEntity",
    "comment",
    "document"
})
public class SsaActivity {

    @XmlElement(name = "NameOfEntity", required = true)
    protected String nameOfEntity;
    @XmlElement(name = "Comment")
    protected String comment;
    @XmlElement(name = "Document")
    protected DocumentArtifact document;
    @XmlAttribute
    protected Boolean exemption;
    @XmlAttribute(required = true)
    protected SsaType type;

    /**
     * Default no-arg constructor
     * 
     */
    public SsaActivity() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public SsaActivity(final String nameOfEntity, final String comment, final DocumentArtifact document, final Boolean exemption, final SsaType type) {
        this.nameOfEntity = nameOfEntity;
        this.comment = comment;
        this.document = document;
        this.exemption = exemption;
        this.type = type;
    }

    /**
     * Gets the value of the nameOfEntity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameOfEntity() {
        return nameOfEntity;
    }

    /**
     * Sets the value of the nameOfEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameOfEntity(String value) {
        this.nameOfEntity = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the document property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentArtifact }
     *     
     */
    public DocumentArtifact getDocument() {
        return document;
    }

    /**
     * Sets the value of the document property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentArtifact }
     *     
     */
    public void setDocument(DocumentArtifact value) {
        this.document = value;
    }

    /**
     * Gets the value of the exemption property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExemption() {
        return exemption;
    }

    /**
     * Sets the value of the exemption property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExemption(Boolean value) {
        this.exemption = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link SsaType }
     *     
     */
    public SsaType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link SsaType }
     *     
     */
    public void setType(SsaType value) {
        this.type = value;
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

    public SsaActivity withNameOfEntity(String value) {
        setNameOfEntity(value);
        return this;
    }

    public SsaActivity withComment(String value) {
        setComment(value);
        return this;
    }

    public SsaActivity withDocument(DocumentArtifact value) {
        setDocument(value);
        return this;
    }

    public SsaActivity withExemption(Boolean value) {
        setExemption(value);
        return this;
    }

    public SsaActivity withType(SsaType value) {
        setType(value);
        return this;
    }

}

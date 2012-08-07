
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
 * <p>Java class for TemplateAssignmentRule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TemplateAssignmentRule">
 *   &lt;complexContent>
 *     &lt;extension base="{xmlns://www.fortifysoftware.com/schema/wsTypes}PublishBase">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Conditional" type="{xmlns://www.fortifysoftware.com/schema/wsTypes}Conditional"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="templateId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TemplateAssignmentRule", propOrder = {
    "name",
    "description",
    "conditional"
})
public class TemplateAssignmentRule
    extends PublishBase
{

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Description", required = true)
    protected String description;
    @XmlElement(name = "Conditional", required = true)
    protected Conditional conditional;
    @XmlAttribute(required = true)
    protected String id;
    @XmlAttribute(required = true)
    protected String templateId;

    /**
     * Default no-arg constructor
     * 
     */
    public TemplateAssignmentRule() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public TemplateAssignmentRule(final int publishVersion, final int objectVersion, final String name, final String description, final Conditional conditional, final String id, final String templateId) {
        super(publishVersion, objectVersion);
        this.name = name;
        this.description = description;
        this.conditional = conditional;
        this.id = id;
        this.templateId = templateId;
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
     * Gets the value of the conditional property.
     * 
     * @return
     *     possible object is
     *     {@link Conditional }
     *     
     */
    public Conditional getConditional() {
        return conditional;
    }

    /**
     * Sets the value of the conditional property.
     * 
     * @param value
     *     allowed object is
     *     {@link Conditional }
     *     
     */
    public void setConditional(Conditional value) {
        this.conditional = value;
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
     * Gets the value of the templateId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplateId() {
        return templateId;
    }

    /**
     * Sets the value of the templateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplateId(String value) {
        this.templateId = value;
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

    public TemplateAssignmentRule withName(String value) {
        setName(value);
        return this;
    }

    public TemplateAssignmentRule withDescription(String value) {
        setDescription(value);
        return this;
    }

    public TemplateAssignmentRule withConditional(Conditional value) {
        setConditional(value);
        return this;
    }

    public TemplateAssignmentRule withId(String value) {
        setId(value);
        return this;
    }

    public TemplateAssignmentRule withTemplateId(String value) {
        setTemplateId(value);
        return this;
    }

    @Override
    public TemplateAssignmentRule withPublishVersion(int value) {
        setPublishVersion(value);
        return this;
    }

    @Override
    public TemplateAssignmentRule withObjectVersion(int value) {
        setObjectVersion(value);
        return this;
    }

}

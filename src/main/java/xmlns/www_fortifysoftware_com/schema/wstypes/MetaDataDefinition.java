
package xmlns.www_fortifysoftware_com.schema.wstypes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import xmlns.www_fortifysoftware_com.schema.enumconstants.ProjectMetaDataCategory;


/**
 * <p>Java class for MetaDataDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MetaDataDefinition">
 *   &lt;complexContent>
 *     &lt;extension base="{xmlns://www.fortifysoftware.com/schema/wsTypes}PublishBase">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="Value" type="{xmlns://www.fortifysoftware.com/schema/wsTypes}MetaDataValue" maxOccurs="unbounded"/>
 *           &lt;element name="FreeFormValue" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="type" use="required" type="{xmlns://www.fortifysoftware.com/schema/enumConstants}ProjectMetaDataCategory" />
 *       &lt;attribute name="multiple" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="hidden" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="appEntityType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MetaDataDefinition", propOrder = {
    "name",
    "description",
    "value",
    "freeFormValue"
})
public class MetaDataDefinition
    extends PublishBase
{

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Value")
    protected List<MetaDataValue> value;
    @XmlElement(name = "FreeFormValue")
    protected Boolean freeFormValue;
    @XmlAttribute(required = true)
    protected String id;
    @XmlAttribute(required = true)
    protected ProjectMetaDataCategory type;
    @XmlAttribute
    protected Boolean multiple;
    @XmlAttribute
    protected Boolean hidden;
    @XmlAttribute
    protected Boolean required;
    @XmlAttribute(required = true)
    protected String appEntityType;

    /**
     * Default no-arg constructor
     * 
     */
    public MetaDataDefinition() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public MetaDataDefinition(final int publishVersion, final int objectVersion, final String name, final String description, final List<MetaDataValue> value, final Boolean freeFormValue, final String id, final ProjectMetaDataCategory type, final Boolean multiple, final Boolean hidden, final Boolean required, final String appEntityType) {
        super(publishVersion, objectVersion);
        this.name = name;
        this.description = description;
        this.value = value;
        this.freeFormValue = freeFormValue;
        this.id = id;
        this.type = type;
        this.multiple = multiple;
        this.hidden = hidden;
        this.required = required;
        this.appEntityType = appEntityType;
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
     * Gets the value of the value property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the value property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MetaDataValue }
     * 
     * 
     */
    public List<MetaDataValue> getValue() {
        if (value == null) {
            value = new ArrayList<MetaDataValue>();
        }
        return this.value;
    }

    /**
     * Gets the value of the freeFormValue property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFreeFormValue() {
        return freeFormValue;
    }

    /**
     * Sets the value of the freeFormValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFreeFormValue(Boolean value) {
        this.freeFormValue = value;
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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectMetaDataCategory }
     *     
     */
    public ProjectMetaDataCategory getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectMetaDataCategory }
     *     
     */
    public void setType(ProjectMetaDataCategory value) {
        this.type = value;
    }

    /**
     * Gets the value of the multiple property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMultiple() {
        return multiple;
    }

    /**
     * Sets the value of the multiple property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMultiple(Boolean value) {
        this.multiple = value;
    }

    /**
     * Gets the value of the hidden property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHidden() {
        return hidden;
    }

    /**
     * Sets the value of the hidden property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHidden(Boolean value) {
        this.hidden = value;
    }

    /**
     * Gets the value of the required property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequired() {
        return required;
    }

    /**
     * Sets the value of the required property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequired(Boolean value) {
        this.required = value;
    }

    /**
     * Gets the value of the appEntityType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppEntityType() {
        return appEntityType;
    }

    /**
     * Sets the value of the appEntityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppEntityType(String value) {
        this.appEntityType = value;
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
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link MetaDataValue }
     *     
     */
    public void setValue(List<MetaDataValue> value) {
        this.value = value;
    }

    public MetaDataDefinition withName(String value) {
        setName(value);
        return this;
    }

    public MetaDataDefinition withDescription(String value) {
        setDescription(value);
        return this;
    }

    public MetaDataDefinition withValue(MetaDataValue... values) {
        if (values!= null) {
            for (MetaDataValue value: values) {
                getValue().add(value);
            }
        }
        return this;
    }

    public MetaDataDefinition withValue(Collection<MetaDataValue> values) {
        if (values!= null) {
            getValue().addAll(values);
        }
        return this;
    }

    public MetaDataDefinition withFreeFormValue(Boolean value) {
        setFreeFormValue(value);
        return this;
    }

    public MetaDataDefinition withId(String value) {
        setId(value);
        return this;
    }

    public MetaDataDefinition withType(ProjectMetaDataCategory value) {
        setType(value);
        return this;
    }

    public MetaDataDefinition withMultiple(Boolean value) {
        setMultiple(value);
        return this;
    }

    public MetaDataDefinition withHidden(Boolean value) {
        setHidden(value);
        return this;
    }

    public MetaDataDefinition withRequired(Boolean value) {
        setRequired(value);
        return this;
    }

    public MetaDataDefinition withAppEntityType(String value) {
        setAppEntityType(value);
        return this;
    }

    public MetaDataDefinition withValue(List<MetaDataValue> value) {
        setValue(value);
        return this;
    }

    @Override
    public MetaDataDefinition withPublishVersion(int value) {
        setPublishVersion(value);
        return this;
    }

    @Override
    public MetaDataDefinition withObjectVersion(int value) {
        setObjectVersion(value);
        return this;
    }

}


package xmlns.www_fortifysoftware_com.schema.wstypes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;


/**
 * <p>Java class for TagDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TagDefinition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="restriction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="extensible" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="hidden" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="value" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="isDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="hidden" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="objectVersion" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TagDefinition", propOrder = {
    "name",
    "description",
    "restriction",
    "extensible",
    "hidden",
    "value"
})
public class TagDefinition {

    @XmlElement(required = true)
    protected String name;
    protected String description;
    protected String restriction;
    protected Boolean extensible;
    protected Boolean hidden;
    protected List<TagDefinition.Value> value;
    @XmlAttribute
    protected String id;
    @XmlAttribute
    protected Integer objectVersion;

    /**
     * Default no-arg constructor
     * 
     */
    public TagDefinition() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public TagDefinition(final String name, final String description, final String restriction, final Boolean extensible, final Boolean hidden, final List<TagDefinition.Value> value, final String id, final Integer objectVersion) {
        this.name = name;
        this.description = description;
        this.restriction = restriction;
        this.extensible = extensible;
        this.hidden = hidden;
        this.value = value;
        this.id = id;
        this.objectVersion = objectVersion;
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
     * Gets the value of the restriction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestriction() {
        return restriction;
    }

    /**
     * Sets the value of the restriction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestriction(String value) {
        this.restriction = value;
    }

    /**
     * Gets the value of the extensible property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExtensible() {
        return extensible;
    }

    /**
     * Sets the value of the extensible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExtensible(Boolean value) {
        this.extensible = value;
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
     * {@link TagDefinition.Value }
     * 
     * 
     */
    public List<TagDefinition.Value> getValue() {
        if (value == null) {
            value = new ArrayList<TagDefinition.Value>();
        }
        return this.value;
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
     * Gets the value of the objectVersion property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getObjectVersion() {
        return objectVersion;
    }

    /**
     * Sets the value of the objectVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setObjectVersion(Integer value) {
        this.objectVersion = value;
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
     *     {@link TagDefinition.Value }
     *     
     */
    public void setValue(List<TagDefinition.Value> value) {
        this.value = value;
    }

    public TagDefinition withName(String value) {
        setName(value);
        return this;
    }

    public TagDefinition withDescription(String value) {
        setDescription(value);
        return this;
    }

    public TagDefinition withRestriction(String value) {
        setRestriction(value);
        return this;
    }

    public TagDefinition withExtensible(Boolean value) {
        setExtensible(value);
        return this;
    }

    public TagDefinition withHidden(Boolean value) {
        setHidden(value);
        return this;
    }

    public TagDefinition withValue(TagDefinition.Value... values) {
        if (values!= null) {
            for (TagDefinition.Value value: values) {
                getValue().add(value);
            }
        }
        return this;
    }

    public TagDefinition withValue(Collection<TagDefinition.Value> values) {
        if (values!= null) {
            getValue().addAll(values);
        }
        return this;
    }

    public TagDefinition withId(String value) {
        setId(value);
        return this;
    }

    public TagDefinition withObjectVersion(Integer value) {
        setObjectVersion(value);
        return this;
    }

    public TagDefinition withValue(List<TagDefinition.Value> value) {
        setValue(value);
        return this;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="isDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="hidden" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class Value {

        @XmlValue
        protected String value;
        @XmlAttribute
        protected Boolean isDefault;
        @XmlAttribute(required = true)
        protected String id;
        @XmlAttribute
        protected String description;
        @XmlAttribute
        protected Boolean hidden;

        /**
         * Default no-arg constructor
         * 
         */
        public Value() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public Value(final String value, final Boolean isDefault, final String id, final String description, final Boolean hidden) {
            this.value = value;
            this.isDefault = isDefault;
            this.id = id;
            this.description = description;
            this.hidden = hidden;
        }

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the isDefault property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIsDefault() {
            return isDefault;
        }

        /**
         * Sets the value of the isDefault property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setIsDefault(Boolean value) {
            this.isDefault = value;
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

        public TagDefinition.Value withValue(String value) {
            setValue(value);
            return this;
        }

        public TagDefinition.Value withIsDefault(Boolean value) {
            setIsDefault(value);
            return this;
        }

        public TagDefinition.Value withId(String value) {
            setId(value);
            return this;
        }

        public TagDefinition.Value withDescription(String value) {
            setDescription(value);
            return this;
        }

        public TagDefinition.Value withHidden(Boolean value) {
            setHidden(value);
            return this;
        }

    }

}

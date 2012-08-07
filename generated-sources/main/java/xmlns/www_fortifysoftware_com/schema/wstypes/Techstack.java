
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


/**
 * <p>Java class for techstack complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="techstack">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TechAttribute" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="techstackguid" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "techstack", propOrder = {
    "techAttribute"
})
public class Techstack {

    @XmlElement(name = "TechAttribute")
    protected List<Techstack.TechAttribute> techAttribute;
    @XmlAttribute(required = true)
    protected String techstackguid;

    /**
     * Default no-arg constructor
     * 
     */
    public Techstack() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public Techstack(final List<Techstack.TechAttribute> techAttribute, final String techstackguid) {
        this.techAttribute = techAttribute;
        this.techstackguid = techstackguid;
    }

    /**
     * Gets the value of the techAttribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the techAttribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTechAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Techstack.TechAttribute }
     * 
     * 
     */
    public List<Techstack.TechAttribute> getTechAttribute() {
        if (techAttribute == null) {
            techAttribute = new ArrayList<Techstack.TechAttribute>();
        }
        return this.techAttribute;
    }

    /**
     * Gets the value of the techstackguid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechstackguid() {
        return techstackguid;
    }

    /**
     * Sets the value of the techstackguid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTechstackguid(String value) {
        this.techstackguid = value;
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
     * Sets the value of the techAttribute property.
     * 
     * @param techAttribute
     *     allowed object is
     *     {@link Techstack.TechAttribute }
     *     
     */
    public void setTechAttribute(List<Techstack.TechAttribute> techAttribute) {
        this.techAttribute = techAttribute;
    }

    public Techstack withTechAttribute(Techstack.TechAttribute... values) {
        if (values!= null) {
            for (Techstack.TechAttribute value: values) {
                getTechAttribute().add(value);
            }
        }
        return this;
    }

    public Techstack withTechAttribute(Collection<Techstack.TechAttribute> values) {
        if (values!= null) {
            getTechAttribute().addAll(values);
        }
        return this;
    }

    public Techstack withTechstackguid(String value) {
        setTechstackguid(value);
        return this;
    }

    public Techstack withTechAttribute(List<Techstack.TechAttribute> techAttribute) {
        setTechAttribute(techAttribute);
        return this;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TechAttribute {

        @XmlAttribute(required = true)
        protected String name;
        @XmlAttribute(required = true)
        protected String value;

        /**
         * Default no-arg constructor
         * 
         */
        public TechAttribute() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public TechAttribute(final String name, final String value) {
            this.name = name;
            this.value = value;
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

        public Techstack.TechAttribute withName(String value) {
            setName(value);
            return this;
        }

        public Techstack.TechAttribute withValue(String value) {
            setValue(value);
            return this;
        }

    }

}

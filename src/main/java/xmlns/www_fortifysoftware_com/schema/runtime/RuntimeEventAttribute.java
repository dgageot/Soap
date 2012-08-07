
package xmlns.www_fortifysoftware_com.schema.runtime;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;


/**
 * <p>Java class for RuntimeEventAttribute complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RuntimeEventAttribute">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RuntimeEventId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trusted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RuntimeEventAttribute", propOrder = {
    "runtimeEventId",
    "name",
    "value",
    "trusted"
})
public class RuntimeEventAttribute {

    @XmlElement(name = "RuntimeEventId")
    protected long runtimeEventId;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Value")
    protected String value;
    protected Boolean trusted;

    /**
     * Default no-arg constructor
     * 
     */
    public RuntimeEventAttribute() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public RuntimeEventAttribute(final long runtimeEventId, final String name, final String value, final Boolean trusted) {
        this.runtimeEventId = runtimeEventId;
        this.name = name;
        this.value = value;
        this.trusted = trusted;
    }

    /**
     * Gets the value of the runtimeEventId property.
     * 
     */
    public long getRuntimeEventId() {
        return runtimeEventId;
    }

    /**
     * Sets the value of the runtimeEventId property.
     * 
     */
    public void setRuntimeEventId(long value) {
        this.runtimeEventId = value;
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

    /**
     * Gets the value of the trusted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTrusted() {
        return trusted;
    }

    /**
     * Sets the value of the trusted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTrusted(Boolean value) {
        this.trusted = value;
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

    public RuntimeEventAttribute withRuntimeEventId(long value) {
        setRuntimeEventId(value);
        return this;
    }

    public RuntimeEventAttribute withName(String value) {
        setName(value);
        return this;
    }

    public RuntimeEventAttribute withValue(String value) {
        setValue(value);
        return this;
    }

    public RuntimeEventAttribute withTrusted(Boolean value) {
        setTrusted(value);
        return this;
    }

}

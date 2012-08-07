
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
 * <p>Java class for RuntimeAlert complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RuntimeAlert">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="RuntimeEventId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="EventHandlerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EventHandlerDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RuntimeAlert", propOrder = {
    "id",
    "runtimeEventId",
    "eventHandlerName",
    "eventHandlerDescription"
})
public class RuntimeAlert {

    @XmlElement(name = "Id")
    protected long id;
    @XmlElement(name = "RuntimeEventId")
    protected long runtimeEventId;
    @XmlElement(name = "EventHandlerName")
    protected String eventHandlerName;
    @XmlElement(name = "EventHandlerDescription")
    protected String eventHandlerDescription;

    /**
     * Default no-arg constructor
     * 
     */
    public RuntimeAlert() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public RuntimeAlert(final long id, final long runtimeEventId, final String eventHandlerName, final String eventHandlerDescription) {
        this.id = id;
        this.runtimeEventId = runtimeEventId;
        this.eventHandlerName = eventHandlerName;
        this.eventHandlerDescription = eventHandlerDescription;
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
     * Gets the value of the eventHandlerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventHandlerName() {
        return eventHandlerName;
    }

    /**
     * Sets the value of the eventHandlerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventHandlerName(String value) {
        this.eventHandlerName = value;
    }

    /**
     * Gets the value of the eventHandlerDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventHandlerDescription() {
        return eventHandlerDescription;
    }

    /**
     * Sets the value of the eventHandlerDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventHandlerDescription(String value) {
        this.eventHandlerDescription = value;
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

    public RuntimeAlert withId(long value) {
        setId(value);
        return this;
    }

    public RuntimeAlert withRuntimeEventId(long value) {
        setRuntimeEventId(value);
        return this;
    }

    public RuntimeAlert withEventHandlerName(String value) {
        setEventHandlerName(value);
        return this;
    }

    public RuntimeAlert withEventHandlerDescription(String value) {
        setEventHandlerDescription(value);
        return this;
    }

}

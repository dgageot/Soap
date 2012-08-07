
package xmlns.www_fortifysoftware_com.schema.activitytemplate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import xmlns.www_fortifysoftware_com.schema.enumconstants.ActivityEventType;


/**
 * <p>Java class for EventTimeLapse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventTimeLapse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EventType" type="{xmlns://www.fortifysoftware.com/schema/enumConstants}ActivityEventType"/>
 *         &lt;element name="TimeLapse" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventTimeLapse", propOrder = {
    "eventType",
    "timeLapse"
})
public class EventTimeLapse {

    @XmlElement(name = "EventType", required = true)
    protected ActivityEventType eventType;
    @XmlElement(name = "TimeLapse")
    protected int timeLapse;

    /**
     * Default no-arg constructor
     * 
     */
    public EventTimeLapse() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public EventTimeLapse(final ActivityEventType eventType, final int timeLapse) {
        this.eventType = eventType;
        this.timeLapse = timeLapse;
    }

    /**
     * Gets the value of the eventType property.
     * 
     * @return
     *     possible object is
     *     {@link ActivityEventType }
     *     
     */
    public ActivityEventType getEventType() {
        return eventType;
    }

    /**
     * Sets the value of the eventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivityEventType }
     *     
     */
    public void setEventType(ActivityEventType value) {
        this.eventType = value;
    }

    /**
     * Gets the value of the timeLapse property.
     * 
     */
    public int getTimeLapse() {
        return timeLapse;
    }

    /**
     * Sets the value of the timeLapse property.
     * 
     */
    public void setTimeLapse(int value) {
        this.timeLapse = value;
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

    public EventTimeLapse withEventType(ActivityEventType value) {
        setEventType(value);
        return this;
    }

    public EventTimeLapse withTimeLapse(int value) {
        setTimeLapse(value);
        return this;
    }

}

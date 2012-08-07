
package xmlns.www_fortifysoftware_com.schema.wstypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import xmlns.www_fortifysoftware_com.schema.enumconstants.AlertableAttribute;


/**
 * <p>Java class for AlertTrigger complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlertTrigger">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="alertDefinitionId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="monitoredAttribute" type="{xmlns://www.fortifysoftware.com/schema/enumConstants}AlertableAttribute"/>
 *         &lt;element name="triggeredValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlertTrigger", propOrder = {
    "alertDefinitionId",
    "monitoredAttribute",
    "triggeredValue"
})
public class AlertTrigger {

    protected long alertDefinitionId;
    @XmlElement(required = true)
    protected AlertableAttribute monitoredAttribute;
    @XmlElement(required = true)
    protected String triggeredValue;

    /**
     * Default no-arg constructor
     * 
     */
    public AlertTrigger() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public AlertTrigger(final long alertDefinitionId, final AlertableAttribute monitoredAttribute, final String triggeredValue) {
        this.alertDefinitionId = alertDefinitionId;
        this.monitoredAttribute = monitoredAttribute;
        this.triggeredValue = triggeredValue;
    }

    /**
     * Gets the value of the alertDefinitionId property.
     * 
     */
    public long getAlertDefinitionId() {
        return alertDefinitionId;
    }

    /**
     * Sets the value of the alertDefinitionId property.
     * 
     */
    public void setAlertDefinitionId(long value) {
        this.alertDefinitionId = value;
    }

    /**
     * Gets the value of the monitoredAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link AlertableAttribute }
     *     
     */
    public AlertableAttribute getMonitoredAttribute() {
        return monitoredAttribute;
    }

    /**
     * Sets the value of the monitoredAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlertableAttribute }
     *     
     */
    public void setMonitoredAttribute(AlertableAttribute value) {
        this.monitoredAttribute = value;
    }

    /**
     * Gets the value of the triggeredValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTriggeredValue() {
        return triggeredValue;
    }

    /**
     * Sets the value of the triggeredValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTriggeredValue(String value) {
        this.triggeredValue = value;
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

    public AlertTrigger withAlertDefinitionId(long value) {
        setAlertDefinitionId(value);
        return this;
    }

    public AlertTrigger withMonitoredAttribute(AlertableAttribute value) {
        setMonitoredAttribute(value);
        return this;
    }

    public AlertTrigger withTriggeredValue(String value) {
        setTriggeredValue(value);
        return this;
    }

}

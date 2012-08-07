
package xmlns.www_fortifysoftware_com.schema.wstypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;


/**
 * <p>Java class for callbackNotificationEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="callbackNotificationEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{xmlns://www.fortifysoftware.com/schema/wsTypes}notificationEvent">
 *       &lt;sequence>
 *         &lt;element name="token" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="response" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "callbackNotificationEvent", propOrder = {
    "token",
    "source",
    "response"
})
@XmlSeeAlso({
    AnalysisNotificationEvent.class
})
public abstract class CallbackNotificationEvent
    extends NotificationEvent
{

    @XmlElement(required = true)
    protected String token;
    @XmlElement(required = true)
    protected String source;
    @XmlElement(required = true)
    protected String response;

    /**
     * Default no-arg constructor
     * 
     */
    public CallbackNotificationEvent() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public CallbackNotificationEvent(final Long projectVersionId, final String userName, final String eventType, final String token, final String source, final String response) {
        super(projectVersionId, userName, eventType);
        this.token = token;
        this.source = source;
        this.response = response;
    }

    /**
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponse(String value) {
        this.response = value;
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

    public CallbackNotificationEvent withToken(String value) {
        setToken(value);
        return this;
    }

    public CallbackNotificationEvent withSource(String value) {
        setSource(value);
        return this;
    }

    public CallbackNotificationEvent withResponse(String value) {
        setResponse(value);
        return this;
    }

    @Override
    public CallbackNotificationEvent withProjectVersionId(Long value) {
        setProjectVersionId(value);
        return this;
    }

    @Override
    public CallbackNotificationEvent withUserName(String value) {
        setUserName(value);
        return this;
    }

    @Override
    public CallbackNotificationEvent withEventType(String value) {
        setEventType(value);
        return this;
    }

}

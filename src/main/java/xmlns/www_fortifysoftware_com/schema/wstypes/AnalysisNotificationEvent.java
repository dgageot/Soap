
package xmlns.www_fortifysoftware_com.schema.wstypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{xmlns://www.fortifysoftware.com/schema/wsTypes}callbackNotificationEvent">
 *       &lt;sequence>
 *         &lt;element name="TechStack" type="{xmlns://www.fortifysoftware.com/schema/wsTypes}techstack"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "techStack"
})
@XmlRootElement(name = "AnalysisNotificationEvent")
public class AnalysisNotificationEvent
    extends CallbackNotificationEvent
{

    @XmlElement(name = "TechStack", required = true)
    protected Techstack techStack;

    /**
     * Default no-arg constructor
     * 
     */
    public AnalysisNotificationEvent() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public AnalysisNotificationEvent(final Long projectVersionId, final String userName, final String eventType, final String token, final String source, final String response, final Techstack techStack) {
        super(projectVersionId, userName, eventType, token, source, response);
        this.techStack = techStack;
    }

    /**
     * Gets the value of the techStack property.
     * 
     * @return
     *     possible object is
     *     {@link Techstack }
     *     
     */
    public Techstack getTechStack() {
        return techStack;
    }

    /**
     * Sets the value of the techStack property.
     * 
     * @param value
     *     allowed object is
     *     {@link Techstack }
     *     
     */
    public void setTechStack(Techstack value) {
        this.techStack = value;
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

    public AnalysisNotificationEvent withTechStack(Techstack value) {
        setTechStack(value);
        return this;
    }

    @Override
    public AnalysisNotificationEvent withToken(String value) {
        setToken(value);
        return this;
    }

    @Override
    public AnalysisNotificationEvent withSource(String value) {
        setSource(value);
        return this;
    }

    @Override
    public AnalysisNotificationEvent withResponse(String value) {
        setResponse(value);
        return this;
    }

    @Override
    public AnalysisNotificationEvent withProjectVersionId(Long value) {
        setProjectVersionId(value);
        return this;
    }

    @Override
    public AnalysisNotificationEvent withUserName(String value) {
        setUserName(value);
        return this;
    }

    @Override
    public AnalysisNotificationEvent withEventType(String value) {
        setEventType(value);
        return this;
    }

}

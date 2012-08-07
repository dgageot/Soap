
package xmlns.www_fortifysoftware_com.schema.activitytemplate;

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
import xmlns.www_fortifysoftware_com.schema.enumconstants.DateUnit;


/**
 * <p>Java class for Activity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Activity">
 *   &lt;complexContent>
 *     &lt;extension base="{xmlns://www.fortifysoftware.com/schema/activitytemplate}ActivityBase">
 *       &lt;choice>
 *         &lt;element name="DocumentReq" type="{xmlns://www.fortifysoftware.com/schema/activitytemplate}DocumentReq"/>
 *         &lt;element name="ProjectState" type="{xmlns://www.fortifysoftware.com/schema/activitytemplate}ProjectState"/>
 *         &lt;element name="EventTimeLapse" type="{xmlns://www.fortifysoftware.com/schema/activitytemplate}EventTimeLapse"/>
 *       &lt;/choice>
 *       &lt;attribute name="publishVersion" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="objectVersion" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Activity", propOrder = {
    "documentReq",
    "projectState",
    "eventTimeLapse"
})
public class Activity
    extends ActivityBase
{

    @XmlElement(name = "DocumentReq")
    protected DocumentReq documentReq;
    @XmlElement(name = "ProjectState")
    protected ProjectState projectState;
    @XmlElement(name = "EventTimeLapse")
    protected EventTimeLapse eventTimeLapse;
    @XmlAttribute(required = true)
    protected int publishVersion;
    @XmlAttribute(required = true)
    protected int objectVersion;

    /**
     * Default no-arg constructor
     * 
     */
    public Activity() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public Activity(final String name, final String description, final String permissionLevel, final List<String> signOffPersonaId, final String workOwnerPersonaId, final Integer dueDate, final DateUnit dueDateUnits, final String id, final DocumentReq documentReq, final ProjectState projectState, final EventTimeLapse eventTimeLapse, final int publishVersion, final int objectVersion) {
        super(name, description, permissionLevel, signOffPersonaId, workOwnerPersonaId, dueDate, dueDateUnits, id);
        this.documentReq = documentReq;
        this.projectState = projectState;
        this.eventTimeLapse = eventTimeLapse;
        this.publishVersion = publishVersion;
        this.objectVersion = objectVersion;
    }

    /**
     * Gets the value of the documentReq property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentReq }
     *     
     */
    public DocumentReq getDocumentReq() {
        return documentReq;
    }

    /**
     * Sets the value of the documentReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentReq }
     *     
     */
    public void setDocumentReq(DocumentReq value) {
        this.documentReq = value;
    }

    /**
     * Gets the value of the projectState property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectState }
     *     
     */
    public ProjectState getProjectState() {
        return projectState;
    }

    /**
     * Sets the value of the projectState property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectState }
     *     
     */
    public void setProjectState(ProjectState value) {
        this.projectState = value;
    }

    /**
     * Gets the value of the eventTimeLapse property.
     * 
     * @return
     *     possible object is
     *     {@link EventTimeLapse }
     *     
     */
    public EventTimeLapse getEventTimeLapse() {
        return eventTimeLapse;
    }

    /**
     * Sets the value of the eventTimeLapse property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventTimeLapse }
     *     
     */
    public void setEventTimeLapse(EventTimeLapse value) {
        this.eventTimeLapse = value;
    }

    /**
     * Gets the value of the publishVersion property.
     * 
     */
    public int getPublishVersion() {
        return publishVersion;
    }

    /**
     * Sets the value of the publishVersion property.
     * 
     */
    public void setPublishVersion(int value) {
        this.publishVersion = value;
    }

    /**
     * Gets the value of the objectVersion property.
     * 
     */
    public int getObjectVersion() {
        return objectVersion;
    }

    /**
     * Sets the value of the objectVersion property.
     * 
     */
    public void setObjectVersion(int value) {
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

    public Activity withDocumentReq(DocumentReq value) {
        setDocumentReq(value);
        return this;
    }

    public Activity withProjectState(ProjectState value) {
        setProjectState(value);
        return this;
    }

    public Activity withEventTimeLapse(EventTimeLapse value) {
        setEventTimeLapse(value);
        return this;
    }

    public Activity withPublishVersion(int value) {
        setPublishVersion(value);
        return this;
    }

    public Activity withObjectVersion(int value) {
        setObjectVersion(value);
        return this;
    }

    @Override
    public Activity withName(String value) {
        setName(value);
        return this;
    }

    @Override
    public Activity withDescription(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public Activity withPermissionLevel(String value) {
        setPermissionLevel(value);
        return this;
    }

    @Override
    public Activity withSignOffPersonaId(String... values) {
        if (values!= null) {
            for (String value: values) {
                getSignOffPersonaId().add(value);
            }
        }
        return this;
    }

    @Override
    public Activity withSignOffPersonaId(Collection<String> values) {
        if (values!= null) {
            getSignOffPersonaId().addAll(values);
        }
        return this;
    }

    @Override
    public Activity withWorkOwnerPersonaId(String value) {
        setWorkOwnerPersonaId(value);
        return this;
    }

    @Override
    public Activity withDueDate(Integer value) {
        setDueDate(value);
        return this;
    }

    @Override
    public Activity withDueDateUnits(DateUnit value) {
        setDueDateUnits(value);
        return this;
    }

    @Override
    public Activity withId(String value) {
        setId(value);
        return this;
    }

    @Override
    public Activity withSignOffPersonaId(List<String> signOffPersonaId) {
        setSignOffPersonaId(signOffPersonaId);
        return this;
    }

}

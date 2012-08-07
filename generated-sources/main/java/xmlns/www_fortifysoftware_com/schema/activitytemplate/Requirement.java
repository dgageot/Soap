
package xmlns.www_fortifysoftware_com.schema.activitytemplate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import xmlns.www_fortifysoftware_com.schema.enumconstants.DateUnit;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{xmlns://www.fortifysoftware.com/schema/activitytemplate}ActivityBase">
 *       &lt;sequence>
 *         &lt;element name="ActivityId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
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
    "activityId"
})
@XmlRootElement(name = "Requirement")
public class Requirement
    extends ActivityBase
{

    @XmlElement(name = "ActivityId", required = true)
    protected List<String> activityId;

    /**
     * Default no-arg constructor
     * 
     */
    public Requirement() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public Requirement(final String name, final String description, final String permissionLevel, final List<String> signOffPersonaId, final String workOwnerPersonaId, final Integer dueDate, final DateUnit dueDateUnits, final String id, final List<String> activityId) {
        super(name, description, permissionLevel, signOffPersonaId, workOwnerPersonaId, dueDate, dueDateUnits, id);
        this.activityId = activityId;
    }

    /**
     * Gets the value of the activityId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the activityId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActivityId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getActivityId() {
        if (activityId == null) {
            activityId = new ArrayList<String>();
        }
        return this.activityId;
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
     * Sets the value of the activityId property.
     * 
     * @param activityId
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivityId(List<String> activityId) {
        this.activityId = activityId;
    }

    public Requirement withActivityId(String... values) {
        if (values!= null) {
            for (String value: values) {
                getActivityId().add(value);
            }
        }
        return this;
    }

    public Requirement withActivityId(Collection<String> values) {
        if (values!= null) {
            getActivityId().addAll(values);
        }
        return this;
    }

    public Requirement withActivityId(List<String> activityId) {
        setActivityId(activityId);
        return this;
    }

    @Override
    public Requirement withName(String value) {
        setName(value);
        return this;
    }

    @Override
    public Requirement withDescription(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public Requirement withPermissionLevel(String value) {
        setPermissionLevel(value);
        return this;
    }

    @Override
    public Requirement withSignOffPersonaId(String... values) {
        if (values!= null) {
            for (String value: values) {
                getSignOffPersonaId().add(value);
            }
        }
        return this;
    }

    @Override
    public Requirement withSignOffPersonaId(Collection<String> values) {
        if (values!= null) {
            getSignOffPersonaId().addAll(values);
        }
        return this;
    }

    @Override
    public Requirement withWorkOwnerPersonaId(String value) {
        setWorkOwnerPersonaId(value);
        return this;
    }

    @Override
    public Requirement withDueDate(Integer value) {
        setDueDate(value);
        return this;
    }

    @Override
    public Requirement withDueDateUnits(DateUnit value) {
        setDueDateUnits(value);
        return this;
    }

    @Override
    public Requirement withId(String value) {
        setId(value);
        return this;
    }

    @Override
    public Requirement withSignOffPersonaId(List<String> signOffPersonaId) {
        setSignOffPersonaId(signOffPersonaId);
        return this;
    }

}

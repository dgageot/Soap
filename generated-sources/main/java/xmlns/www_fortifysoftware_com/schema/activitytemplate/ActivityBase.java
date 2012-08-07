
package xmlns.www_fortifysoftware_com.schema.activitytemplate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import xmlns.www_fortifysoftware_com.schema.enumconstants.DateUnit;


/**
 * <p>Java class for ActivityBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActivityBase">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PermissionLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SignOffPersonaId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="WorkOwnerPersonaId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DueDate" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DueDateUnits" type="{xmlns://www.fortifysoftware.com/schema/enumConstants}DateUnit" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActivityBase", propOrder = {
    "name",
    "description",
    "permissionLevel",
    "signOffPersonaId",
    "workOwnerPersonaId",
    "dueDate",
    "dueDateUnits"
})
@XmlSeeAlso({
    Activity.class,
    Requirement.class,
    RequirementTemplate.class
})
public class ActivityBase {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "PermissionLevel")
    protected String permissionLevel;
    @XmlElement(name = "SignOffPersonaId")
    protected List<String> signOffPersonaId;
    @XmlElement(name = "WorkOwnerPersonaId")
    protected String workOwnerPersonaId;
    @XmlElement(name = "DueDate")
    protected Integer dueDate;
    @XmlElement(name = "DueDateUnits")
    protected DateUnit dueDateUnits;
    @XmlAttribute(required = true)
    protected String id;

    /**
     * Default no-arg constructor
     * 
     */
    public ActivityBase() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ActivityBase(final String name, final String description, final String permissionLevel, final List<String> signOffPersonaId, final String workOwnerPersonaId, final Integer dueDate, final DateUnit dueDateUnits, final String id) {
        this.name = name;
        this.description = description;
        this.permissionLevel = permissionLevel;
        this.signOffPersonaId = signOffPersonaId;
        this.workOwnerPersonaId = workOwnerPersonaId;
        this.dueDate = dueDate;
        this.dueDateUnits = dueDateUnits;
        this.id = id;
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
     * Gets the value of the permissionLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPermissionLevel() {
        return permissionLevel;
    }

    /**
     * Sets the value of the permissionLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPermissionLevel(String value) {
        this.permissionLevel = value;
    }

    /**
     * Gets the value of the signOffPersonaId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the signOffPersonaId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSignOffPersonaId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSignOffPersonaId() {
        if (signOffPersonaId == null) {
            signOffPersonaId = new ArrayList<String>();
        }
        return this.signOffPersonaId;
    }

    /**
     * Gets the value of the workOwnerPersonaId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkOwnerPersonaId() {
        return workOwnerPersonaId;
    }

    /**
     * Sets the value of the workOwnerPersonaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkOwnerPersonaId(String value) {
        this.workOwnerPersonaId = value;
    }

    /**
     * Gets the value of the dueDate property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDueDate() {
        return dueDate;
    }

    /**
     * Sets the value of the dueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDueDate(Integer value) {
        this.dueDate = value;
    }

    /**
     * Gets the value of the dueDateUnits property.
     * 
     * @return
     *     possible object is
     *     {@link DateUnit }
     *     
     */
    public DateUnit getDueDateUnits() {
        return dueDateUnits;
    }

    /**
     * Sets the value of the dueDateUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateUnit }
     *     
     */
    public void setDueDateUnits(DateUnit value) {
        this.dueDateUnits = value;
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
     * Sets the value of the signOffPersonaId property.
     * 
     * @param signOffPersonaId
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignOffPersonaId(List<String> signOffPersonaId) {
        this.signOffPersonaId = signOffPersonaId;
    }

    public ActivityBase withName(String value) {
        setName(value);
        return this;
    }

    public ActivityBase withDescription(String value) {
        setDescription(value);
        return this;
    }

    public ActivityBase withPermissionLevel(String value) {
        setPermissionLevel(value);
        return this;
    }

    public ActivityBase withSignOffPersonaId(String... values) {
        if (values!= null) {
            for (String value: values) {
                getSignOffPersonaId().add(value);
            }
        }
        return this;
    }

    public ActivityBase withSignOffPersonaId(Collection<String> values) {
        if (values!= null) {
            getSignOffPersonaId().addAll(values);
        }
        return this;
    }

    public ActivityBase withWorkOwnerPersonaId(String value) {
        setWorkOwnerPersonaId(value);
        return this;
    }

    public ActivityBase withDueDate(Integer value) {
        setDueDate(value);
        return this;
    }

    public ActivityBase withDueDateUnits(DateUnit value) {
        setDueDateUnits(value);
        return this;
    }

    public ActivityBase withId(String value) {
        setId(value);
        return this;
    }

    public ActivityBase withSignOffPersonaId(List<String> signOffPersonaId) {
        setSignOffPersonaId(signOffPersonaId);
        return this;
    }

}

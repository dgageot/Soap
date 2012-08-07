
package xmlns.www_fortifysoftware_com.schema.wstypes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import xmlns.www_fortifysoftware_com.schema.enumconstants.AlertableEntity;


/**
 * <p>Java class for AlertDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlertDefinition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="monitoredEntityType" type="{xmlns://www.fortifysoftware.com/schema/enumConstants}AlertableEntity"/>
 *         &lt;element name="monitoredInstanceGuid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="createdBy" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="creationDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="alertAllProjectVersionUsers" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="monitoredEntityName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="alertAllChildren" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="userCanModify" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="alertTriggers" type="{xmlns://www.fortifysoftware.com/schema/wsTypes}AlertTrigger" maxOccurs="unbounded"/>
 *         &lt;element name="alertStakeholders" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlertDefinition", propOrder = {
    "name",
    "id",
    "description",
    "monitoredEntityType",
    "monitoredInstanceGuid",
    "startDate",
    "endDate",
    "createdBy",
    "creationDate",
    "enabled",
    "alertAllProjectVersionUsers",
    "monitoredEntityName",
    "alertAllChildren",
    "userCanModify",
    "alertTriggers",
    "alertStakeholders"
})
public class AlertDefinition {

    @XmlElement(required = true)
    protected String name;
    protected Long id;
    @XmlElement(required = true)
    protected String description;
    @XmlElement(required = true)
    protected AlertableEntity monitoredEntityType;
    @XmlElement(required = true)
    protected String monitoredInstanceGuid;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;
    @XmlElement(required = true)
    protected String createdBy;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar creationDate;
    protected boolean enabled;
    protected boolean alertAllProjectVersionUsers;
    @XmlElement(required = true)
    protected String monitoredEntityName;
    protected boolean alertAllChildren;
    protected boolean userCanModify;
    @XmlElement(required = true)
    protected List<AlertTrigger> alertTriggers;
    protected boolean alertStakeholders;

    /**
     * Default no-arg constructor
     * 
     */
    public AlertDefinition() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public AlertDefinition(final String name, final Long id, final String description, final AlertableEntity monitoredEntityType, final String monitoredInstanceGuid, final XMLGregorianCalendar startDate, final XMLGregorianCalendar endDate, final String createdBy, final XMLGregorianCalendar creationDate, final boolean enabled, final boolean alertAllProjectVersionUsers, final String monitoredEntityName, final boolean alertAllChildren, final boolean userCanModify, final List<AlertTrigger> alertTriggers, final boolean alertStakeholders) {
        this.name = name;
        this.id = id;
        this.description = description;
        this.monitoredEntityType = monitoredEntityType;
        this.monitoredInstanceGuid = monitoredInstanceGuid;
        this.startDate = startDate;
        this.endDate = endDate;
        this.createdBy = createdBy;
        this.creationDate = creationDate;
        this.enabled = enabled;
        this.alertAllProjectVersionUsers = alertAllProjectVersionUsers;
        this.monitoredEntityName = monitoredEntityName;
        this.alertAllChildren = alertAllChildren;
        this.userCanModify = userCanModify;
        this.alertTriggers = alertTriggers;
        this.alertStakeholders = alertStakeholders;
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
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
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
     * Gets the value of the monitoredEntityType property.
     * 
     * @return
     *     possible object is
     *     {@link AlertableEntity }
     *     
     */
    public AlertableEntity getMonitoredEntityType() {
        return monitoredEntityType;
    }

    /**
     * Sets the value of the monitoredEntityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlertableEntity }
     *     
     */
    public void setMonitoredEntityType(AlertableEntity value) {
        this.monitoredEntityType = value;
    }

    /**
     * Gets the value of the monitoredInstanceGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonitoredInstanceGuid() {
        return monitoredInstanceGuid;
    }

    /**
     * Sets the value of the monitoredInstanceGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonitoredInstanceGuid(String value) {
        this.monitoredInstanceGuid = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the createdBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * Sets the value of the createdBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedBy(String value) {
        this.createdBy = value;
    }

    /**
     * Gets the value of the creationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the value of the creationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDate(XMLGregorianCalendar value) {
        this.creationDate = value;
    }

    /**
     * Gets the value of the enabled property.
     * 
     */
    public boolean isEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     * 
     */
    public void setEnabled(boolean value) {
        this.enabled = value;
    }

    /**
     * Gets the value of the alertAllProjectVersionUsers property.
     * 
     */
    public boolean isAlertAllProjectVersionUsers() {
        return alertAllProjectVersionUsers;
    }

    /**
     * Sets the value of the alertAllProjectVersionUsers property.
     * 
     */
    public void setAlertAllProjectVersionUsers(boolean value) {
        this.alertAllProjectVersionUsers = value;
    }

    /**
     * Gets the value of the monitoredEntityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonitoredEntityName() {
        return monitoredEntityName;
    }

    /**
     * Sets the value of the monitoredEntityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonitoredEntityName(String value) {
        this.monitoredEntityName = value;
    }

    /**
     * Gets the value of the alertAllChildren property.
     * 
     */
    public boolean isAlertAllChildren() {
        return alertAllChildren;
    }

    /**
     * Sets the value of the alertAllChildren property.
     * 
     */
    public void setAlertAllChildren(boolean value) {
        this.alertAllChildren = value;
    }

    /**
     * Gets the value of the userCanModify property.
     * 
     */
    public boolean isUserCanModify() {
        return userCanModify;
    }

    /**
     * Sets the value of the userCanModify property.
     * 
     */
    public void setUserCanModify(boolean value) {
        this.userCanModify = value;
    }

    /**
     * Gets the value of the alertTriggers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alertTriggers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlertTriggers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlertTrigger }
     * 
     * 
     */
    public List<AlertTrigger> getAlertTriggers() {
        if (alertTriggers == null) {
            alertTriggers = new ArrayList<AlertTrigger>();
        }
        return this.alertTriggers;
    }

    /**
     * Gets the value of the alertStakeholders property.
     * 
     */
    public boolean isAlertStakeholders() {
        return alertStakeholders;
    }

    /**
     * Sets the value of the alertStakeholders property.
     * 
     */
    public void setAlertStakeholders(boolean value) {
        this.alertStakeholders = value;
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
     * Sets the value of the alertTriggers property.
     * 
     * @param alertTriggers
     *     allowed object is
     *     {@link AlertTrigger }
     *     
     */
    public void setAlertTriggers(List<AlertTrigger> alertTriggers) {
        this.alertTriggers = alertTriggers;
    }

    public AlertDefinition withName(String value) {
        setName(value);
        return this;
    }

    public AlertDefinition withId(Long value) {
        setId(value);
        return this;
    }

    public AlertDefinition withDescription(String value) {
        setDescription(value);
        return this;
    }

    public AlertDefinition withMonitoredEntityType(AlertableEntity value) {
        setMonitoredEntityType(value);
        return this;
    }

    public AlertDefinition withMonitoredInstanceGuid(String value) {
        setMonitoredInstanceGuid(value);
        return this;
    }

    public AlertDefinition withStartDate(XMLGregorianCalendar value) {
        setStartDate(value);
        return this;
    }

    public AlertDefinition withEndDate(XMLGregorianCalendar value) {
        setEndDate(value);
        return this;
    }

    public AlertDefinition withCreatedBy(String value) {
        setCreatedBy(value);
        return this;
    }

    public AlertDefinition withCreationDate(XMLGregorianCalendar value) {
        setCreationDate(value);
        return this;
    }

    public AlertDefinition withEnabled(boolean value) {
        setEnabled(value);
        return this;
    }

    public AlertDefinition withAlertAllProjectVersionUsers(boolean value) {
        setAlertAllProjectVersionUsers(value);
        return this;
    }

    public AlertDefinition withMonitoredEntityName(String value) {
        setMonitoredEntityName(value);
        return this;
    }

    public AlertDefinition withAlertAllChildren(boolean value) {
        setAlertAllChildren(value);
        return this;
    }

    public AlertDefinition withUserCanModify(boolean value) {
        setUserCanModify(value);
        return this;
    }

    public AlertDefinition withAlertTriggers(AlertTrigger... values) {
        if (values!= null) {
            for (AlertTrigger value: values) {
                getAlertTriggers().add(value);
            }
        }
        return this;
    }

    public AlertDefinition withAlertTriggers(Collection<AlertTrigger> values) {
        if (values!= null) {
            getAlertTriggers().addAll(values);
        }
        return this;
    }

    public AlertDefinition withAlertStakeholders(boolean value) {
        setAlertStakeholders(value);
        return this;
    }

    public AlertDefinition withAlertTriggers(List<AlertTrigger> alertTriggers) {
        setAlertTriggers(alertTriggers);
        return this;
    }

}

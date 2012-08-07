
package xmlns.www_fortifysoftware_com.schema.wstypes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;


/**
 * <p>Java class for PermissionGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PermissionGroup">
 *   &lt;complexContent>
 *     &lt;extension base="{xmlns://www.fortifysoftware.com/schema/wsTypes}PublishBase">
 *       &lt;sequence>
 *         &lt;element name="guid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assignByDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AssignedPermissions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PermissionName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="dependsOn" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PermissionGroup", propOrder = {
    "guid",
    "name",
    "description",
    "assignByDefault",
    "assignedPermissions",
    "dependsOn"
})
public class PermissionGroup
    extends PublishBase
{

    @XmlElement(required = true)
    protected String guid;
    @XmlElement(required = true)
    protected String name;
    protected String description;
    protected Boolean assignByDefault;
    @XmlElement(name = "AssignedPermissions")
    protected PermissionGroup.AssignedPermissions assignedPermissions;
    protected List<String> dependsOn;

    /**
     * Default no-arg constructor
     * 
     */
    public PermissionGroup() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public PermissionGroup(final int publishVersion, final int objectVersion, final String guid, final String name, final String description, final Boolean assignByDefault, final PermissionGroup.AssignedPermissions assignedPermissions, final List<String> dependsOn) {
        super(publishVersion, objectVersion);
        this.guid = guid;
        this.name = name;
        this.description = description;
        this.assignByDefault = assignByDefault;
        this.assignedPermissions = assignedPermissions;
        this.dependsOn = dependsOn;
    }

    /**
     * Gets the value of the guid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuid() {
        return guid;
    }

    /**
     * Sets the value of the guid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuid(String value) {
        this.guid = value;
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
     * Gets the value of the assignByDefault property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAssignByDefault() {
        return assignByDefault;
    }

    /**
     * Sets the value of the assignByDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAssignByDefault(Boolean value) {
        this.assignByDefault = value;
    }

    /**
     * Gets the value of the assignedPermissions property.
     * 
     * @return
     *     possible object is
     *     {@link PermissionGroup.AssignedPermissions }
     *     
     */
    public PermissionGroup.AssignedPermissions getAssignedPermissions() {
        return assignedPermissions;
    }

    /**
     * Sets the value of the assignedPermissions property.
     * 
     * @param value
     *     allowed object is
     *     {@link PermissionGroup.AssignedPermissions }
     *     
     */
    public void setAssignedPermissions(PermissionGroup.AssignedPermissions value) {
        this.assignedPermissions = value;
    }

    /**
     * Gets the value of the dependsOn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dependsOn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDependsOn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDependsOn() {
        if (dependsOn == null) {
            dependsOn = new ArrayList<String>();
        }
        return this.dependsOn;
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
     * Sets the value of the dependsOn property.
     * 
     * @param dependsOn
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDependsOn(List<String> dependsOn) {
        this.dependsOn = dependsOn;
    }

    public PermissionGroup withGuid(String value) {
        setGuid(value);
        return this;
    }

    public PermissionGroup withName(String value) {
        setName(value);
        return this;
    }

    public PermissionGroup withDescription(String value) {
        setDescription(value);
        return this;
    }

    public PermissionGroup withAssignByDefault(Boolean value) {
        setAssignByDefault(value);
        return this;
    }

    public PermissionGroup withAssignedPermissions(PermissionGroup.AssignedPermissions value) {
        setAssignedPermissions(value);
        return this;
    }

    public PermissionGroup withDependsOn(String... values) {
        if (values!= null) {
            for (String value: values) {
                getDependsOn().add(value);
            }
        }
        return this;
    }

    public PermissionGroup withDependsOn(Collection<String> values) {
        if (values!= null) {
            getDependsOn().addAll(values);
        }
        return this;
    }

    public PermissionGroup withDependsOn(List<String> dependsOn) {
        setDependsOn(dependsOn);
        return this;
    }

    @Override
    public PermissionGroup withPublishVersion(int value) {
        setPublishVersion(value);
        return this;
    }

    @Override
    public PermissionGroup withObjectVersion(int value) {
        setObjectVersion(value);
        return this;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="PermissionName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "permissionName"
    })
    public static class AssignedPermissions {

        @XmlElement(name = "PermissionName")
        protected List<String> permissionName;

        /**
         * Default no-arg constructor
         * 
         */
        public AssignedPermissions() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public AssignedPermissions(final List<String> permissionName) {
            this.permissionName = permissionName;
        }

        /**
         * Gets the value of the permissionName property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the permissionName property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPermissionName().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getPermissionName() {
            if (permissionName == null) {
                permissionName = new ArrayList<String>();
            }
            return this.permissionName;
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
         * Sets the value of the permissionName property.
         * 
         * @param permissionName
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPermissionName(List<String> permissionName) {
            this.permissionName = permissionName;
        }

        public PermissionGroup.AssignedPermissions withPermissionName(String... values) {
            if (values!= null) {
                for (String value: values) {
                    getPermissionName().add(value);
                }
            }
            return this;
        }

        public PermissionGroup.AssignedPermissions withPermissionName(Collection<String> values) {
            if (values!= null) {
                getPermissionName().addAll(values);
            }
            return this;
        }

        public PermissionGroup.AssignedPermissions withPermissionName(List<String> permissionName) {
            setPermissionName(permissionName);
            return this;
        }

    }

}

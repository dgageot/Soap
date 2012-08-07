
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
 * <p>Java class for PermissionTemplate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PermissionTemplate">
 *   &lt;complexContent>
 *     &lt;extension base="{xmlns://www.fortifysoftware.com/schema/wsTypes}PublishBase">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="builtIn" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="isDefault" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="userOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="sortOrder" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
 *         &lt;element name="AssignedPermissionTypes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PermissionType" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AssignedPermissionGroups" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PermissionGroupGuid" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PermissionTemplate", propOrder = {
    "name",
    "displayName",
    "description",
    "builtIn",
    "isDefault",
    "userOnly",
    "sortOrder",
    "assignedPermissions",
    "assignedPermissionTypes",
    "assignedPermissionGroups"
})
public class PermissionTemplate
    extends PublishBase
{

    @XmlElement(required = true)
    protected String name;
    protected String displayName;
    protected String description;
    protected boolean builtIn;
    protected boolean isDefault;
    protected Boolean userOnly;
    protected Integer sortOrder;
    @XmlElement(name = "AssignedPermissions")
    protected PermissionTemplate.AssignedPermissions assignedPermissions;
    @XmlElement(name = "AssignedPermissionTypes")
    protected PermissionTemplate.AssignedPermissionTypes assignedPermissionTypes;
    @XmlElement(name = "AssignedPermissionGroups")
    protected PermissionTemplate.AssignedPermissionGroups assignedPermissionGroups;

    /**
     * Default no-arg constructor
     * 
     */
    public PermissionTemplate() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public PermissionTemplate(final int publishVersion, final int objectVersion, final String name, final String displayName, final String description, final boolean builtIn, final boolean isDefault, final Boolean userOnly, final Integer sortOrder, final PermissionTemplate.AssignedPermissions assignedPermissions, final PermissionTemplate.AssignedPermissionTypes assignedPermissionTypes, final PermissionTemplate.AssignedPermissionGroups assignedPermissionGroups) {
        super(publishVersion, objectVersion);
        this.name = name;
        this.displayName = displayName;
        this.description = description;
        this.builtIn = builtIn;
        this.isDefault = isDefault;
        this.userOnly = userOnly;
        this.sortOrder = sortOrder;
        this.assignedPermissions = assignedPermissions;
        this.assignedPermissionTypes = assignedPermissionTypes;
        this.assignedPermissionGroups = assignedPermissionGroups;
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
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
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
     * Gets the value of the builtIn property.
     * 
     */
    public boolean isBuiltIn() {
        return builtIn;
    }

    /**
     * Sets the value of the builtIn property.
     * 
     */
    public void setBuiltIn(boolean value) {
        this.builtIn = value;
    }

    /**
     * Gets the value of the isDefault property.
     * 
     */
    public boolean isIsDefault() {
        return isDefault;
    }

    /**
     * Sets the value of the isDefault property.
     * 
     */
    public void setIsDefault(boolean value) {
        this.isDefault = value;
    }

    /**
     * Gets the value of the userOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserOnly() {
        return userOnly;
    }

    /**
     * Sets the value of the userOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserOnly(Boolean value) {
        this.userOnly = value;
    }

    /**
     * Gets the value of the sortOrder property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSortOrder() {
        return sortOrder;
    }

    /**
     * Sets the value of the sortOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSortOrder(Integer value) {
        this.sortOrder = value;
    }

    /**
     * Gets the value of the assignedPermissions property.
     * 
     * @return
     *     possible object is
     *     {@link PermissionTemplate.AssignedPermissions }
     *     
     */
    public PermissionTemplate.AssignedPermissions getAssignedPermissions() {
        return assignedPermissions;
    }

    /**
     * Sets the value of the assignedPermissions property.
     * 
     * @param value
     *     allowed object is
     *     {@link PermissionTemplate.AssignedPermissions }
     *     
     */
    public void setAssignedPermissions(PermissionTemplate.AssignedPermissions value) {
        this.assignedPermissions = value;
    }

    /**
     * Gets the value of the assignedPermissionTypes property.
     * 
     * @return
     *     possible object is
     *     {@link PermissionTemplate.AssignedPermissionTypes }
     *     
     */
    public PermissionTemplate.AssignedPermissionTypes getAssignedPermissionTypes() {
        return assignedPermissionTypes;
    }

    /**
     * Sets the value of the assignedPermissionTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link PermissionTemplate.AssignedPermissionTypes }
     *     
     */
    public void setAssignedPermissionTypes(PermissionTemplate.AssignedPermissionTypes value) {
        this.assignedPermissionTypes = value;
    }

    /**
     * Gets the value of the assignedPermissionGroups property.
     * 
     * @return
     *     possible object is
     *     {@link PermissionTemplate.AssignedPermissionGroups }
     *     
     */
    public PermissionTemplate.AssignedPermissionGroups getAssignedPermissionGroups() {
        return assignedPermissionGroups;
    }

    /**
     * Sets the value of the assignedPermissionGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link PermissionTemplate.AssignedPermissionGroups }
     *     
     */
    public void setAssignedPermissionGroups(PermissionTemplate.AssignedPermissionGroups value) {
        this.assignedPermissionGroups = value;
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

    public PermissionTemplate withName(String value) {
        setName(value);
        return this;
    }

    public PermissionTemplate withDisplayName(String value) {
        setDisplayName(value);
        return this;
    }

    public PermissionTemplate withDescription(String value) {
        setDescription(value);
        return this;
    }

    public PermissionTemplate withBuiltIn(boolean value) {
        setBuiltIn(value);
        return this;
    }

    public PermissionTemplate withIsDefault(boolean value) {
        setIsDefault(value);
        return this;
    }

    public PermissionTemplate withUserOnly(Boolean value) {
        setUserOnly(value);
        return this;
    }

    public PermissionTemplate withSortOrder(Integer value) {
        setSortOrder(value);
        return this;
    }

    public PermissionTemplate withAssignedPermissions(PermissionTemplate.AssignedPermissions value) {
        setAssignedPermissions(value);
        return this;
    }

    public PermissionTemplate withAssignedPermissionTypes(PermissionTemplate.AssignedPermissionTypes value) {
        setAssignedPermissionTypes(value);
        return this;
    }

    public PermissionTemplate withAssignedPermissionGroups(PermissionTemplate.AssignedPermissionGroups value) {
        setAssignedPermissionGroups(value);
        return this;
    }

    @Override
    public PermissionTemplate withPublishVersion(int value) {
        setPublishVersion(value);
        return this;
    }

    @Override
    public PermissionTemplate withObjectVersion(int value) {
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
     *         &lt;element name="PermissionGroupGuid" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "permissionGroupGuid"
    })
    public static class AssignedPermissionGroups {

        @XmlElement(name = "PermissionGroupGuid")
        protected List<String> permissionGroupGuid;

        /**
         * Default no-arg constructor
         * 
         */
        public AssignedPermissionGroups() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public AssignedPermissionGroups(final List<String> permissionGroupGuid) {
            this.permissionGroupGuid = permissionGroupGuid;
        }

        /**
         * Gets the value of the permissionGroupGuid property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the permissionGroupGuid property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPermissionGroupGuid().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getPermissionGroupGuid() {
            if (permissionGroupGuid == null) {
                permissionGroupGuid = new ArrayList<String>();
            }
            return this.permissionGroupGuid;
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
         * Sets the value of the permissionGroupGuid property.
         * 
         * @param permissionGroupGuid
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPermissionGroupGuid(List<String> permissionGroupGuid) {
            this.permissionGroupGuid = permissionGroupGuid;
        }

        public PermissionTemplate.AssignedPermissionGroups withPermissionGroupGuid(String... values) {
            if (values!= null) {
                for (String value: values) {
                    getPermissionGroupGuid().add(value);
                }
            }
            return this;
        }

        public PermissionTemplate.AssignedPermissionGroups withPermissionGroupGuid(Collection<String> values) {
            if (values!= null) {
                getPermissionGroupGuid().addAll(values);
            }
            return this;
        }

        public PermissionTemplate.AssignedPermissionGroups withPermissionGroupGuid(List<String> permissionGroupGuid) {
            setPermissionGroupGuid(permissionGroupGuid);
            return this;
        }

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

        public PermissionTemplate.AssignedPermissions withPermissionName(String... values) {
            if (values!= null) {
                for (String value: values) {
                    getPermissionName().add(value);
                }
            }
            return this;
        }

        public PermissionTemplate.AssignedPermissions withPermissionName(Collection<String> values) {
            if (values!= null) {
                getPermissionName().addAll(values);
            }
            return this;
        }

        public PermissionTemplate.AssignedPermissions withPermissionName(List<String> permissionName) {
            setPermissionName(permissionName);
            return this;
        }

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
     *         &lt;element name="PermissionType" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
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
        "permissionType"
    })
    public static class AssignedPermissionTypes {

        @XmlElement(name = "PermissionType", type = Integer.class)
        protected List<Integer> permissionType;

        /**
         * Default no-arg constructor
         * 
         */
        public AssignedPermissionTypes() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public AssignedPermissionTypes(final List<Integer> permissionType) {
            this.permissionType = permissionType;
        }

        /**
         * Gets the value of the permissionType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the permissionType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPermissionType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Integer }
         * 
         * 
         */
        public List<Integer> getPermissionType() {
            if (permissionType == null) {
                permissionType = new ArrayList<Integer>();
            }
            return this.permissionType;
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
         * Sets the value of the permissionType property.
         * 
         * @param permissionType
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setPermissionType(List<Integer> permissionType) {
            this.permissionType = permissionType;
        }

        public PermissionTemplate.AssignedPermissionTypes withPermissionType(Integer... values) {
            if (values!= null) {
                for (Integer value: values) {
                    getPermissionType().add(value);
                }
            }
            return this;
        }

        public PermissionTemplate.AssignedPermissionTypes withPermissionType(Collection<Integer> values) {
            if (values!= null) {
                getPermissionType().addAll(values);
            }
            return this;
        }

        public PermissionTemplate.AssignedPermissionTypes withPermissionType(List<Integer> permissionType) {
            setPermissionType(permissionType);
            return this;
        }

    }

}

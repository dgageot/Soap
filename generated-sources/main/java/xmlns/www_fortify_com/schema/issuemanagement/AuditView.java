
package xmlns.www_fortify_com.schema.issuemanagement;

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
import xmlns.www_fortifysoftware_com.schema.wstypes.TagDefinition;


/**
 * <p>Java class for AuditView complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuditView">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Tag" type="{xmlns://www.fortifysoftware.com/schema/wsTypes}TagDefinition" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="UserList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="User" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="FilterSets" type="{xmlns://www.fortify.com/schema/issuemanagement}FilterSetDescription" maxOccurs="unbounded"/>
 *         &lt;element name="EnabledFilterSetId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EnabledFolderId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EnabledFolders" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="GroupingProfiles" type="{xmlns://www.fortify.com/schema/issuemanagement}GroupingProfile" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuditView", propOrder = {
    "tag",
    "userList",
    "filterSets",
    "enabledFilterSetId",
    "enabledFolderId",
    "enabledFolders",
    "groupingProfiles"
})
public class AuditView {

    @XmlElement(name = "Tag")
    protected List<TagDefinition> tag;
    @XmlElement(name = "UserList", required = true)
    protected AuditView.UserList userList;
    @XmlElement(name = "FilterSets", required = true)
    protected List<FilterSetDescription> filterSets;
    @XmlElement(name = "EnabledFilterSetId", required = true)
    protected String enabledFilterSetId;
    @XmlElement(name = "EnabledFolderId", required = true)
    protected String enabledFolderId;
    @XmlElement(name = "EnabledFolders", required = true)
    protected String enabledFolders;
    @XmlElement(name = "GroupingProfiles")
    protected List<GroupingProfile> groupingProfiles;

    /**
     * Default no-arg constructor
     * 
     */
    public AuditView() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public AuditView(final List<TagDefinition> tag, final AuditView.UserList userList, final List<FilterSetDescription> filterSets, final String enabledFilterSetId, final String enabledFolderId, final String enabledFolders, final List<GroupingProfile> groupingProfiles) {
        this.tag = tag;
        this.userList = userList;
        this.filterSets = filterSets;
        this.enabledFilterSetId = enabledFilterSetId;
        this.enabledFolderId = enabledFolderId;
        this.enabledFolders = enabledFolders;
        this.groupingProfiles = groupingProfiles;
    }

    /**
     * Gets the value of the tag property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tag property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTag().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TagDefinition }
     * 
     * 
     */
    public List<TagDefinition> getTag() {
        if (tag == null) {
            tag = new ArrayList<TagDefinition>();
        }
        return this.tag;
    }

    /**
     * Gets the value of the userList property.
     * 
     * @return
     *     possible object is
     *     {@link AuditView.UserList }
     *     
     */
    public AuditView.UserList getUserList() {
        return userList;
    }

    /**
     * Sets the value of the userList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuditView.UserList }
     *     
     */
    public void setUserList(AuditView.UserList value) {
        this.userList = value;
    }

    /**
     * Gets the value of the filterSets property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the filterSets property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFilterSets().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FilterSetDescription }
     * 
     * 
     */
    public List<FilterSetDescription> getFilterSets() {
        if (filterSets == null) {
            filterSets = new ArrayList<FilterSetDescription>();
        }
        return this.filterSets;
    }

    /**
     * Gets the value of the enabledFilterSetId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnabledFilterSetId() {
        return enabledFilterSetId;
    }

    /**
     * Sets the value of the enabledFilterSetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnabledFilterSetId(String value) {
        this.enabledFilterSetId = value;
    }

    /**
     * Gets the value of the enabledFolderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnabledFolderId() {
        return enabledFolderId;
    }

    /**
     * Sets the value of the enabledFolderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnabledFolderId(String value) {
        this.enabledFolderId = value;
    }

    /**
     * Gets the value of the enabledFolders property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnabledFolders() {
        return enabledFolders;
    }

    /**
     * Sets the value of the enabledFolders property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnabledFolders(String value) {
        this.enabledFolders = value;
    }

    /**
     * Gets the value of the groupingProfiles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groupingProfiles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroupingProfiles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GroupingProfile }
     * 
     * 
     */
    public List<GroupingProfile> getGroupingProfiles() {
        if (groupingProfiles == null) {
            groupingProfiles = new ArrayList<GroupingProfile>();
        }
        return this.groupingProfiles;
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
     * Sets the value of the tag property.
     * 
     * @param tag
     *     allowed object is
     *     {@link TagDefinition }
     *     
     */
    public void setTag(List<TagDefinition> tag) {
        this.tag = tag;
    }

    /**
     * Sets the value of the filterSets property.
     * 
     * @param filterSets
     *     allowed object is
     *     {@link FilterSetDescription }
     *     
     */
    public void setFilterSets(List<FilterSetDescription> filterSets) {
        this.filterSets = filterSets;
    }

    /**
     * Sets the value of the groupingProfiles property.
     * 
     * @param groupingProfiles
     *     allowed object is
     *     {@link GroupingProfile }
     *     
     */
    public void setGroupingProfiles(List<GroupingProfile> groupingProfiles) {
        this.groupingProfiles = groupingProfiles;
    }

    public AuditView withTag(TagDefinition... values) {
        if (values!= null) {
            for (TagDefinition value: values) {
                getTag().add(value);
            }
        }
        return this;
    }

    public AuditView withTag(Collection<TagDefinition> values) {
        if (values!= null) {
            getTag().addAll(values);
        }
        return this;
    }

    public AuditView withUserList(AuditView.UserList value) {
        setUserList(value);
        return this;
    }

    public AuditView withFilterSets(FilterSetDescription... values) {
        if (values!= null) {
            for (FilterSetDescription value: values) {
                getFilterSets().add(value);
            }
        }
        return this;
    }

    public AuditView withFilterSets(Collection<FilterSetDescription> values) {
        if (values!= null) {
            getFilterSets().addAll(values);
        }
        return this;
    }

    public AuditView withEnabledFilterSetId(String value) {
        setEnabledFilterSetId(value);
        return this;
    }

    public AuditView withEnabledFolderId(String value) {
        setEnabledFolderId(value);
        return this;
    }

    public AuditView withEnabledFolders(String value) {
        setEnabledFolders(value);
        return this;
    }

    public AuditView withGroupingProfiles(GroupingProfile... values) {
        if (values!= null) {
            for (GroupingProfile value: values) {
                getGroupingProfiles().add(value);
            }
        }
        return this;
    }

    public AuditView withGroupingProfiles(Collection<GroupingProfile> values) {
        if (values!= null) {
            getGroupingProfiles().addAll(values);
        }
        return this;
    }

    public AuditView withTag(List<TagDefinition> tag) {
        setTag(tag);
        return this;
    }

    public AuditView withFilterSets(List<FilterSetDescription> filterSets) {
        setFilterSets(filterSets);
        return this;
    }

    public AuditView withGroupingProfiles(List<GroupingProfile> groupingProfiles) {
        setGroupingProfiles(groupingProfiles);
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
     *         &lt;element name="User" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
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
        "user"
    })
    public static class UserList {

        @XmlElement(name = "User", required = true)
        protected List<String> user;

        /**
         * Default no-arg constructor
         * 
         */
        public UserList() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public UserList(final List<String> user) {
            this.user = user;
        }

        /**
         * Gets the value of the user property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the user property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getUser().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getUser() {
            if (user == null) {
                user = new ArrayList<String>();
            }
            return this.user;
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
         * Sets the value of the user property.
         * 
         * @param user
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUser(List<String> user) {
            this.user = user;
        }

        public AuditView.UserList withUser(String... values) {
            if (values!= null) {
                for (String value: values) {
                    getUser().add(value);
                }
            }
            return this;
        }

        public AuditView.UserList withUser(Collection<String> values) {
            if (values!= null) {
                getUser().addAll(values);
            }
            return this;
        }

        public AuditView.UserList withUser(List<String> user) {
            setUser(user);
            return this;
        }

    }

}

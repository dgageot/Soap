
package xmlns.www_fortifysoftware_com.schema.wstypes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.fortify.schema.fws.MigrateUserRequest;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;


/**
 * <p>Java class for User complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="User">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="UserName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SeedClearPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Salt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RequirePasswordChange" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="PasswordNeverExpire" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastPasswordChange" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="FailedLoginAttempts" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DateFrozen" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Suspended" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="remoteKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PermissionTemplates" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PermissionTemplateName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "User", propOrder = {
    "id",
    "userName",
    "seedClearPassword",
    "password",
    "salt",
    "requirePasswordChange",
    "passwordNeverExpire",
    "firstName",
    "lastName",
    "email",
    "lastPasswordChange",
    "failedLoginAttempts",
    "dateFrozen",
    "suspended",
    "remoteKey",
    "permissionTemplates"
})
@XmlSeeAlso({
    MigrateUserRequest.class
})
public class User {

    protected Long id;
    @XmlElement(name = "UserName", required = true)
    protected String userName;
    @XmlElement(name = "SeedClearPassword")
    protected String seedClearPassword;
    @XmlElement(name = "Password")
    protected String password;
    @XmlElement(name = "Salt")
    protected String salt;
    @XmlElement(name = "RequirePasswordChange")
    protected boolean requirePasswordChange;
    @XmlElement(name = "PasswordNeverExpire")
    protected boolean passwordNeverExpire;
    @XmlElement(name = "FirstName")
    protected String firstName;
    @XmlElement(name = "LastName")
    protected String lastName;
    @XmlElement(name = "Email")
    protected String email;
    @XmlElement(name = "LastPasswordChange")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastPasswordChange;
    @XmlElement(name = "FailedLoginAttempts")
    protected int failedLoginAttempts;
    @XmlElement(name = "DateFrozen")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateFrozen;
    @XmlElement(name = "Suspended")
    protected boolean suspended;
    protected String remoteKey;
    @XmlElement(name = "PermissionTemplates")
    protected User.PermissionTemplates permissionTemplates;

    /**
     * Default no-arg constructor
     * 
     */
    public User() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public User(final Long id, final String userName, final String seedClearPassword, final String password, final String salt, final boolean requirePasswordChange, final boolean passwordNeverExpire, final String firstName, final String lastName, final String email, final XMLGregorianCalendar lastPasswordChange, final int failedLoginAttempts, final XMLGregorianCalendar dateFrozen, final boolean suspended, final String remoteKey, final User.PermissionTemplates permissionTemplates) {
        this.id = id;
        this.userName = userName;
        this.seedClearPassword = seedClearPassword;
        this.password = password;
        this.salt = salt;
        this.requirePasswordChange = requirePasswordChange;
        this.passwordNeverExpire = passwordNeverExpire;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.lastPasswordChange = lastPasswordChange;
        this.failedLoginAttempts = failedLoginAttempts;
        this.dateFrozen = dateFrozen;
        this.suspended = suspended;
        this.remoteKey = remoteKey;
        this.permissionTemplates = permissionTemplates;
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
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the seedClearPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeedClearPassword() {
        return seedClearPassword;
    }

    /**
     * Sets the value of the seedClearPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeedClearPassword(String value) {
        this.seedClearPassword = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the salt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalt() {
        return salt;
    }

    /**
     * Sets the value of the salt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalt(String value) {
        this.salt = value;
    }

    /**
     * Gets the value of the requirePasswordChange property.
     * 
     */
    public boolean isRequirePasswordChange() {
        return requirePasswordChange;
    }

    /**
     * Sets the value of the requirePasswordChange property.
     * 
     */
    public void setRequirePasswordChange(boolean value) {
        this.requirePasswordChange = value;
    }

    /**
     * Gets the value of the passwordNeverExpire property.
     * 
     */
    public boolean isPasswordNeverExpire() {
        return passwordNeverExpire;
    }

    /**
     * Sets the value of the passwordNeverExpire property.
     * 
     */
    public void setPasswordNeverExpire(boolean value) {
        this.passwordNeverExpire = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the lastPasswordChange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastPasswordChange() {
        return lastPasswordChange;
    }

    /**
     * Sets the value of the lastPasswordChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastPasswordChange(XMLGregorianCalendar value) {
        this.lastPasswordChange = value;
    }

    /**
     * Gets the value of the failedLoginAttempts property.
     * 
     */
    public int getFailedLoginAttempts() {
        return failedLoginAttempts;
    }

    /**
     * Sets the value of the failedLoginAttempts property.
     * 
     */
    public void setFailedLoginAttempts(int value) {
        this.failedLoginAttempts = value;
    }

    /**
     * Gets the value of the dateFrozen property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateFrozen() {
        return dateFrozen;
    }

    /**
     * Sets the value of the dateFrozen property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateFrozen(XMLGregorianCalendar value) {
        this.dateFrozen = value;
    }

    /**
     * Gets the value of the suspended property.
     * 
     */
    public boolean isSuspended() {
        return suspended;
    }

    /**
     * Sets the value of the suspended property.
     * 
     */
    public void setSuspended(boolean value) {
        this.suspended = value;
    }

    /**
     * Gets the value of the remoteKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteKey() {
        return remoteKey;
    }

    /**
     * Sets the value of the remoteKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteKey(String value) {
        this.remoteKey = value;
    }

    /**
     * Gets the value of the permissionTemplates property.
     * 
     * @return
     *     possible object is
     *     {@link User.PermissionTemplates }
     *     
     */
    public User.PermissionTemplates getPermissionTemplates() {
        return permissionTemplates;
    }

    /**
     * Sets the value of the permissionTemplates property.
     * 
     * @param value
     *     allowed object is
     *     {@link User.PermissionTemplates }
     *     
     */
    public void setPermissionTemplates(User.PermissionTemplates value) {
        this.permissionTemplates = value;
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

    public User withId(Long value) {
        setId(value);
        return this;
    }

    public User withUserName(String value) {
        setUserName(value);
        return this;
    }

    public User withSeedClearPassword(String value) {
        setSeedClearPassword(value);
        return this;
    }

    public User withPassword(String value) {
        setPassword(value);
        return this;
    }

    public User withSalt(String value) {
        setSalt(value);
        return this;
    }

    public User withRequirePasswordChange(boolean value) {
        setRequirePasswordChange(value);
        return this;
    }

    public User withPasswordNeverExpire(boolean value) {
        setPasswordNeverExpire(value);
        return this;
    }

    public User withFirstName(String value) {
        setFirstName(value);
        return this;
    }

    public User withLastName(String value) {
        setLastName(value);
        return this;
    }

    public User withEmail(String value) {
        setEmail(value);
        return this;
    }

    public User withLastPasswordChange(XMLGregorianCalendar value) {
        setLastPasswordChange(value);
        return this;
    }

    public User withFailedLoginAttempts(int value) {
        setFailedLoginAttempts(value);
        return this;
    }

    public User withDateFrozen(XMLGregorianCalendar value) {
        setDateFrozen(value);
        return this;
    }

    public User withSuspended(boolean value) {
        setSuspended(value);
        return this;
    }

    public User withRemoteKey(String value) {
        setRemoteKey(value);
        return this;
    }

    public User withPermissionTemplates(User.PermissionTemplates value) {
        setPermissionTemplates(value);
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
     *         &lt;element name="PermissionTemplateName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "permissionTemplateName"
    })
    public static class PermissionTemplates {

        @XmlElement(name = "PermissionTemplateName")
        protected List<String> permissionTemplateName;

        /**
         * Default no-arg constructor
         * 
         */
        public PermissionTemplates() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public PermissionTemplates(final List<String> permissionTemplateName) {
            this.permissionTemplateName = permissionTemplateName;
        }

        /**
         * Gets the value of the permissionTemplateName property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the permissionTemplateName property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPermissionTemplateName().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getPermissionTemplateName() {
            if (permissionTemplateName == null) {
                permissionTemplateName = new ArrayList<String>();
            }
            return this.permissionTemplateName;
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
         * Sets the value of the permissionTemplateName property.
         * 
         * @param permissionTemplateName
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPermissionTemplateName(List<String> permissionTemplateName) {
            this.permissionTemplateName = permissionTemplateName;
        }

        public User.PermissionTemplates withPermissionTemplateName(String... values) {
            if (values!= null) {
                for (String value: values) {
                    getPermissionTemplateName().add(value);
                }
            }
            return this;
        }

        public User.PermissionTemplates withPermissionTemplateName(Collection<String> values) {
            if (values!= null) {
                getPermissionTemplateName().addAll(values);
            }
            return this;
        }

        public User.PermissionTemplates withPermissionTemplateName(List<String> permissionTemplateName) {
            setPermissionTemplateName(permissionTemplateName);
            return this;
        }

    }

}

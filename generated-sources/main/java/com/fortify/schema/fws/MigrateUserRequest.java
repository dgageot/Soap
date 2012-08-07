
package com.fortify.schema.fws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import xmlns.www_fortifysoftware_com.schema.wstypes.User;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{xmlns://www.fortifysoftware.com/schema/wsTypes}User">
 *       &lt;sequence>
 *         &lt;element name="SharedSecret" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "sharedSecret"
})
@XmlRootElement(name = "MigrateUserRequest")
public class MigrateUserRequest
    extends User
{

    @XmlElement(name = "SharedSecret", required = true)
    protected String sharedSecret;

    /**
     * Default no-arg constructor
     * 
     */
    public MigrateUserRequest() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public MigrateUserRequest(final Long id, final String userName, final String seedClearPassword, final String password, final String salt, final boolean requirePasswordChange, final boolean passwordNeverExpire, final String firstName, final String lastName, final String email, final XMLGregorianCalendar lastPasswordChange, final int failedLoginAttempts, final XMLGregorianCalendar dateFrozen, final boolean suspended, final String remoteKey, final User.PermissionTemplates permissionTemplates, final String sharedSecret) {
        super(id, userName, seedClearPassword, password, salt, requirePasswordChange, passwordNeverExpire, firstName, lastName, email, lastPasswordChange, failedLoginAttempts, dateFrozen, suspended, remoteKey, permissionTemplates);
        this.sharedSecret = sharedSecret;
    }

    /**
     * Gets the value of the sharedSecret property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSharedSecret() {
        return sharedSecret;
    }

    /**
     * Sets the value of the sharedSecret property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSharedSecret(String value) {
        this.sharedSecret = value;
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

    public MigrateUserRequest withSharedSecret(String value) {
        setSharedSecret(value);
        return this;
    }

    @Override
    public MigrateUserRequest withId(Long value) {
        setId(value);
        return this;
    }

    @Override
    public MigrateUserRequest withUserName(String value) {
        setUserName(value);
        return this;
    }

    @Override
    public MigrateUserRequest withSeedClearPassword(String value) {
        setSeedClearPassword(value);
        return this;
    }

    @Override
    public MigrateUserRequest withPassword(String value) {
        setPassword(value);
        return this;
    }

    @Override
    public MigrateUserRequest withSalt(String value) {
        setSalt(value);
        return this;
    }

    @Override
    public MigrateUserRequest withRequirePasswordChange(boolean value) {
        setRequirePasswordChange(value);
        return this;
    }

    @Override
    public MigrateUserRequest withPasswordNeverExpire(boolean value) {
        setPasswordNeverExpire(value);
        return this;
    }

    @Override
    public MigrateUserRequest withFirstName(String value) {
        setFirstName(value);
        return this;
    }

    @Override
    public MigrateUserRequest withLastName(String value) {
        setLastName(value);
        return this;
    }

    @Override
    public MigrateUserRequest withEmail(String value) {
        setEmail(value);
        return this;
    }

    @Override
    public MigrateUserRequest withLastPasswordChange(XMLGregorianCalendar value) {
        setLastPasswordChange(value);
        return this;
    }

    @Override
    public MigrateUserRequest withFailedLoginAttempts(int value) {
        setFailedLoginAttempts(value);
        return this;
    }

    @Override
    public MigrateUserRequest withDateFrozen(XMLGregorianCalendar value) {
        setDateFrozen(value);
        return this;
    }

    @Override
    public MigrateUserRequest withSuspended(boolean value) {
        setSuspended(value);
        return this;
    }

    @Override
    public MigrateUserRequest withRemoteKey(String value) {
        setRemoteKey(value);
        return this;
    }

    @Override
    public MigrateUserRequest withPermissionTemplates(User.PermissionTemplates value) {
        setPermissionTemplates(value);
        return this;
    }

}

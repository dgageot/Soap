
package xmlns.www_fortifysoftware_com.schema.wstypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;


/**
 * <p>Java class for LdapGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LdapGroup">
 *   &lt;complexContent>
 *     &lt;extension base="{xmlns://www.fortifysoftware.com/schema/wsTypes}LdapEntity">
 *       &lt;sequence>
 *         &lt;element name="GroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LdapGroup", propOrder = {
    "groupName"
})
public class LdapGroup
    extends LdapEntity
{

    @XmlElement(name = "GroupName")
    protected String groupName;

    /**
     * Default no-arg constructor
     * 
     */
    public LdapGroup() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public LdapGroup(final String dn, final LdapEntity.PermissionTemplates permissionTemplates, final String groupName) {
        super(dn, permissionTemplates);
        this.groupName = groupName;
    }

    /**
     * Gets the value of the groupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * Sets the value of the groupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupName(String value) {
        this.groupName = value;
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

    public LdapGroup withGroupName(String value) {
        setGroupName(value);
        return this;
    }

    @Override
    public LdapGroup withDn(String value) {
        setDn(value);
        return this;
    }

    @Override
    public LdapGroup withPermissionTemplates(LdapEntity.PermissionTemplates value) {
        setPermissionTemplates(value);
        return this;
    }

}

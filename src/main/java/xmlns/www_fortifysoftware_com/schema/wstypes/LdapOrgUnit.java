
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
 * <p>Java class for LdapOrgUnit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LdapOrgUnit">
 *   &lt;complexContent>
 *     &lt;extension base="{xmlns://www.fortifysoftware.com/schema/wsTypes}LdapEntity">
 *       &lt;sequence>
 *         &lt;element name="OrgUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LdapOrgUnit", propOrder = {
    "orgUnitName"
})
public class LdapOrgUnit
    extends LdapEntity
{

    @XmlElement(name = "OrgUnitName")
    protected String orgUnitName;

    /**
     * Default no-arg constructor
     * 
     */
    public LdapOrgUnit() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public LdapOrgUnit(final String dn, final LdapEntity.PermissionTemplates permissionTemplates, final String orgUnitName) {
        super(dn, permissionTemplates);
        this.orgUnitName = orgUnitName;
    }

    /**
     * Gets the value of the orgUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgUnitName() {
        return orgUnitName;
    }

    /**
     * Sets the value of the orgUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgUnitName(String value) {
        this.orgUnitName = value;
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

    public LdapOrgUnit withOrgUnitName(String value) {
        setOrgUnitName(value);
        return this;
    }

    @Override
    public LdapOrgUnit withDn(String value) {
        setDn(value);
        return this;
    }

    @Override
    public LdapOrgUnit withPermissionTemplates(LdapEntity.PermissionTemplates value) {
        setPermissionTemplates(value);
        return this;
    }

}

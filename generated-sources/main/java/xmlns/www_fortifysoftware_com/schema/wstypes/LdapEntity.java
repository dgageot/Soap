
package xmlns.www_fortifysoftware_com.schema.wstypes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;


/**
 * <p>Java class for LdapEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LdapEntity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DN" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "LdapEntity", propOrder = {
    "dn",
    "permissionTemplates"
})
@XmlSeeAlso({
    LdapGroup.class,
    LdapUser.class,
    LdapOrgUnit.class
})
public class LdapEntity {

    @XmlElement(name = "DN", required = true)
    protected String dn;
    @XmlElement(name = "PermissionTemplates")
    protected LdapEntity.PermissionTemplates permissionTemplates;

    /**
     * Default no-arg constructor
     * 
     */
    public LdapEntity() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public LdapEntity(final String dn, final LdapEntity.PermissionTemplates permissionTemplates) {
        this.dn = dn;
        this.permissionTemplates = permissionTemplates;
    }

    /**
     * Gets the value of the dn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDn() {
        return dn;
    }

    /**
     * Sets the value of the dn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDn(String value) {
        this.dn = value;
    }

    /**
     * Gets the value of the permissionTemplates property.
     * 
     * @return
     *     possible object is
     *     {@link LdapEntity.PermissionTemplates }
     *     
     */
    public LdapEntity.PermissionTemplates getPermissionTemplates() {
        return permissionTemplates;
    }

    /**
     * Sets the value of the permissionTemplates property.
     * 
     * @param value
     *     allowed object is
     *     {@link LdapEntity.PermissionTemplates }
     *     
     */
    public void setPermissionTemplates(LdapEntity.PermissionTemplates value) {
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

    public LdapEntity withDn(String value) {
        setDn(value);
        return this;
    }

    public LdapEntity withPermissionTemplates(LdapEntity.PermissionTemplates value) {
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

        public LdapEntity.PermissionTemplates withPermissionTemplateName(String... values) {
            if (values!= null) {
                for (String value: values) {
                    getPermissionTemplateName().add(value);
                }
            }
            return this;
        }

        public LdapEntity.PermissionTemplates withPermissionTemplateName(Collection<String> values) {
            if (values!= null) {
                getPermissionTemplateName().addAll(values);
            }
            return this;
        }

        public LdapEntity.PermissionTemplates withPermissionTemplateName(List<String> permissionTemplateName) {
            setPermissionTemplateName(permissionTemplateName);
            return this;
        }

    }

}

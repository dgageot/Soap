
package xmlns.www_fortifysoftware_com.schema.seed;

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
import xmlns.www_fortifysoftware_com.schema.wstypes.PermissionGroup;


/**
 * <p>Java class for PermissionGroupList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PermissionGroupList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PermissionGroup" type="{xmlns://www.fortifysoftware.com/schema/wsTypes}PermissionGroup" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PermissionGroupList", propOrder = {
    "permissionGroup"
})
public class PermissionGroupList {

    @XmlElement(name = "PermissionGroup")
    protected List<PermissionGroup> permissionGroup;

    /**
     * Default no-arg constructor
     * 
     */
    public PermissionGroupList() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public PermissionGroupList(final List<PermissionGroup> permissionGroup) {
        this.permissionGroup = permissionGroup;
    }

    /**
     * Gets the value of the permissionGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the permissionGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPermissionGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PermissionGroup }
     * 
     * 
     */
    public List<PermissionGroup> getPermissionGroup() {
        if (permissionGroup == null) {
            permissionGroup = new ArrayList<PermissionGroup>();
        }
        return this.permissionGroup;
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
     * Sets the value of the permissionGroup property.
     * 
     * @param permissionGroup
     *     allowed object is
     *     {@link PermissionGroup }
     *     
     */
    public void setPermissionGroup(List<PermissionGroup> permissionGroup) {
        this.permissionGroup = permissionGroup;
    }

    public PermissionGroupList withPermissionGroup(PermissionGroup... values) {
        if (values!= null) {
            for (PermissionGroup value: values) {
                getPermissionGroup().add(value);
            }
        }
        return this;
    }

    public PermissionGroupList withPermissionGroup(Collection<PermissionGroup> values) {
        if (values!= null) {
            getPermissionGroup().addAll(values);
        }
        return this;
    }

    public PermissionGroupList withPermissionGroup(List<PermissionGroup> permissionGroup) {
        setPermissionGroup(permissionGroup);
        return this;
    }

}

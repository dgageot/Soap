
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
import xmlns.www_fortifysoftware_com.schema.wstypes.PermissionTemplate;


/**
 * <p>Java class for PermissionTemplateList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PermissionTemplateList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PermissionTemplate" type="{xmlns://www.fortifysoftware.com/schema/wsTypes}PermissionTemplate" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PermissionTemplateList", propOrder = {
    "permissionTemplate"
})
public class PermissionTemplateList {

    @XmlElement(name = "PermissionTemplate")
    protected List<PermissionTemplate> permissionTemplate;

    /**
     * Default no-arg constructor
     * 
     */
    public PermissionTemplateList() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public PermissionTemplateList(final List<PermissionTemplate> permissionTemplate) {
        this.permissionTemplate = permissionTemplate;
    }

    /**
     * Gets the value of the permissionTemplate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the permissionTemplate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPermissionTemplate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PermissionTemplate }
     * 
     * 
     */
    public List<PermissionTemplate> getPermissionTemplate() {
        if (permissionTemplate == null) {
            permissionTemplate = new ArrayList<PermissionTemplate>();
        }
        return this.permissionTemplate;
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
     * Sets the value of the permissionTemplate property.
     * 
     * @param permissionTemplate
     *     allowed object is
     *     {@link PermissionTemplate }
     *     
     */
    public void setPermissionTemplate(List<PermissionTemplate> permissionTemplate) {
        this.permissionTemplate = permissionTemplate;
    }

    public PermissionTemplateList withPermissionTemplate(PermissionTemplate... values) {
        if (values!= null) {
            for (PermissionTemplate value: values) {
                getPermissionTemplate().add(value);
            }
        }
        return this;
    }

    public PermissionTemplateList withPermissionTemplate(Collection<PermissionTemplate> values) {
        if (values!= null) {
            getPermissionTemplate().addAll(values);
        }
        return this;
    }

    public PermissionTemplateList withPermissionTemplate(List<PermissionTemplate> permissionTemplate) {
        setPermissionTemplate(permissionTemplate);
        return this;
    }

}

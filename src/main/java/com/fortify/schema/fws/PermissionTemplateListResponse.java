
package com.fortify.schema.fws;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import xmlns.www_fortifysoftware_com.schema.wstypes.PermissionTemplate;
import xmlns.www_fortifysoftware_com.schema.wstypes.RootCause;
import xmlns.www_fortifysoftware_com.schema.wstypes.Status;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{xmlns://www.fortifysoftware.com/schema/wsTypes}status">
 *       &lt;sequence>
 *         &lt;element name="PermissionTemplate" type="{xmlns://www.fortifysoftware.com/schema/wsTypes}PermissionTemplate" maxOccurs="unbounded" minOccurs="0"/>
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
    "permissionTemplate"
})
@XmlRootElement(name = "PermissionTemplateListResponse")
public class PermissionTemplateListResponse
    extends Status
{

    @XmlElement(name = "PermissionTemplate")
    protected List<PermissionTemplate> permissionTemplate;

    /**
     * Default no-arg constructor
     * 
     */
    public PermissionTemplateListResponse() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public PermissionTemplateListResponse(final long code, final String msg, final List<RootCause> rootCause, final List<PermissionTemplate> permissionTemplate) {
        super(code, msg, rootCause);
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

    public PermissionTemplateListResponse withPermissionTemplate(PermissionTemplate... values) {
        if (values!= null) {
            for (PermissionTemplate value: values) {
                getPermissionTemplate().add(value);
            }
        }
        return this;
    }

    public PermissionTemplateListResponse withPermissionTemplate(Collection<PermissionTemplate> values) {
        if (values!= null) {
            getPermissionTemplate().addAll(values);
        }
        return this;
    }

    public PermissionTemplateListResponse withPermissionTemplate(List<PermissionTemplate> permissionTemplate) {
        setPermissionTemplate(permissionTemplate);
        return this;
    }

    @Override
    public PermissionTemplateListResponse withCode(long value) {
        setCode(value);
        return this;
    }

    @Override
    public PermissionTemplateListResponse withMsg(String value) {
        setMsg(value);
        return this;
    }

    @Override
    public PermissionTemplateListResponse withRootCause(RootCause... values) {
        if (values!= null) {
            for (RootCause value: values) {
                getRootCause().add(value);
            }
        }
        return this;
    }

    @Override
    public PermissionTemplateListResponse withRootCause(Collection<RootCause> values) {
        if (values!= null) {
            getRootCause().addAll(values);
        }
        return this;
    }

    @Override
    public PermissionTemplateListResponse withRootCause(List<RootCause> rootCause) {
        setRootCause(rootCause);
        return this;
    }

}

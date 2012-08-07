
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
import xmlns.www_fortifysoftware_com.schema.wstypes.MetaDataSelectedValue;
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
 *         &lt;element name="ProjectMetaDataValue" type="{xmlns://www.fortifysoftware.com/schema/wsTypes}MetaDataSelectedValue" maxOccurs="unbounded" minOccurs="0"/>
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
    "projectMetaDataValue"
})
@XmlRootElement(name = "ProjectMetaDataValuesListResponse")
public class ProjectMetaDataValuesListResponse
    extends Status
{

    @XmlElement(name = "ProjectMetaDataValue")
    protected List<MetaDataSelectedValue> projectMetaDataValue;

    /**
     * Default no-arg constructor
     * 
     */
    public ProjectMetaDataValuesListResponse() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ProjectMetaDataValuesListResponse(final long code, final String msg, final List<RootCause> rootCause, final List<MetaDataSelectedValue> projectMetaDataValue) {
        super(code, msg, rootCause);
        this.projectMetaDataValue = projectMetaDataValue;
    }

    /**
     * Gets the value of the projectMetaDataValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the projectMetaDataValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProjectMetaDataValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MetaDataSelectedValue }
     * 
     * 
     */
    public List<MetaDataSelectedValue> getProjectMetaDataValue() {
        if (projectMetaDataValue == null) {
            projectMetaDataValue = new ArrayList<MetaDataSelectedValue>();
        }
        return this.projectMetaDataValue;
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
     * Sets the value of the projectMetaDataValue property.
     * 
     * @param projectMetaDataValue
     *     allowed object is
     *     {@link MetaDataSelectedValue }
     *     
     */
    public void setProjectMetaDataValue(List<MetaDataSelectedValue> projectMetaDataValue) {
        this.projectMetaDataValue = projectMetaDataValue;
    }

    public ProjectMetaDataValuesListResponse withProjectMetaDataValue(MetaDataSelectedValue... values) {
        if (values!= null) {
            for (MetaDataSelectedValue value: values) {
                getProjectMetaDataValue().add(value);
            }
        }
        return this;
    }

    public ProjectMetaDataValuesListResponse withProjectMetaDataValue(Collection<MetaDataSelectedValue> values) {
        if (values!= null) {
            getProjectMetaDataValue().addAll(values);
        }
        return this;
    }

    public ProjectMetaDataValuesListResponse withProjectMetaDataValue(List<MetaDataSelectedValue> projectMetaDataValue) {
        setProjectMetaDataValue(projectMetaDataValue);
        return this;
    }

    @Override
    public ProjectMetaDataValuesListResponse withCode(long value) {
        setCode(value);
        return this;
    }

    @Override
    public ProjectMetaDataValuesListResponse withMsg(String value) {
        setMsg(value);
        return this;
    }

    @Override
    public ProjectMetaDataValuesListResponse withRootCause(RootCause... values) {
        if (values!= null) {
            for (RootCause value: values) {
                getRootCause().add(value);
            }
        }
        return this;
    }

    @Override
    public ProjectMetaDataValuesListResponse withRootCause(Collection<RootCause> values) {
        if (values!= null) {
            getRootCause().addAll(values);
        }
        return this;
    }

    @Override
    public ProjectMetaDataValuesListResponse withRootCause(List<RootCause> rootCause) {
        setRootCause(rootCause);
        return this;
    }

}

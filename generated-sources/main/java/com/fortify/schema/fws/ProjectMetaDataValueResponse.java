
package com.fortify.schema.fws;

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
 *         &lt;element name="ProjectMetaDataValue" type="{xmlns://www.fortifysoftware.com/schema/wsTypes}MetaDataSelectedValue" minOccurs="0"/>
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
@XmlRootElement(name = "ProjectMetaDataValueResponse")
public class ProjectMetaDataValueResponse
    extends Status
{

    @XmlElement(name = "ProjectMetaDataValue")
    protected MetaDataSelectedValue projectMetaDataValue;

    /**
     * Default no-arg constructor
     * 
     */
    public ProjectMetaDataValueResponse() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ProjectMetaDataValueResponse(final long code, final String msg, final List<RootCause> rootCause, final MetaDataSelectedValue projectMetaDataValue) {
        super(code, msg, rootCause);
        this.projectMetaDataValue = projectMetaDataValue;
    }

    /**
     * Gets the value of the projectMetaDataValue property.
     * 
     * @return
     *     possible object is
     *     {@link MetaDataSelectedValue }
     *     
     */
    public MetaDataSelectedValue getProjectMetaDataValue() {
        return projectMetaDataValue;
    }

    /**
     * Sets the value of the projectMetaDataValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link MetaDataSelectedValue }
     *     
     */
    public void setProjectMetaDataValue(MetaDataSelectedValue value) {
        this.projectMetaDataValue = value;
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

    public ProjectMetaDataValueResponse withProjectMetaDataValue(MetaDataSelectedValue value) {
        setProjectMetaDataValue(value);
        return this;
    }

    @Override
    public ProjectMetaDataValueResponse withCode(long value) {
        setCode(value);
        return this;
    }

    @Override
    public ProjectMetaDataValueResponse withMsg(String value) {
        setMsg(value);
        return this;
    }

    @Override
    public ProjectMetaDataValueResponse withRootCause(RootCause... values) {
        if (values!= null) {
            for (RootCause value: values) {
                getRootCause().add(value);
            }
        }
        return this;
    }

    @Override
    public ProjectMetaDataValueResponse withRootCause(Collection<RootCause> values) {
        if (values!= null) {
            getRootCause().addAll(values);
        }
        return this;
    }

    @Override
    public ProjectMetaDataValueResponse withRootCause(List<RootCause> rootCause) {
        setRootCause(rootCause);
        return this;
    }

}

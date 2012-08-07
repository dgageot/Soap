
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
import xmlns.www_fortifysoftware_com.schema.wstypes.MetaDataDefinition;
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
 *         &lt;element name="ProjectMetaDataDefinition" type="{xmlns://www.fortifysoftware.com/schema/wsTypes}MetaDataDefinition" minOccurs="0"/>
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
    "projectMetaDataDefinition"
})
@XmlRootElement(name = "ProjectMetaDataDefinitionResponse")
public class ProjectMetaDataDefinitionResponse
    extends Status
{

    @XmlElement(name = "ProjectMetaDataDefinition")
    protected MetaDataDefinition projectMetaDataDefinition;

    /**
     * Default no-arg constructor
     * 
     */
    public ProjectMetaDataDefinitionResponse() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ProjectMetaDataDefinitionResponse(final long code, final String msg, final List<RootCause> rootCause, final MetaDataDefinition projectMetaDataDefinition) {
        super(code, msg, rootCause);
        this.projectMetaDataDefinition = projectMetaDataDefinition;
    }

    /**
     * Gets the value of the projectMetaDataDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link MetaDataDefinition }
     *     
     */
    public MetaDataDefinition getProjectMetaDataDefinition() {
        return projectMetaDataDefinition;
    }

    /**
     * Sets the value of the projectMetaDataDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link MetaDataDefinition }
     *     
     */
    public void setProjectMetaDataDefinition(MetaDataDefinition value) {
        this.projectMetaDataDefinition = value;
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

    public ProjectMetaDataDefinitionResponse withProjectMetaDataDefinition(MetaDataDefinition value) {
        setProjectMetaDataDefinition(value);
        return this;
    }

    @Override
    public ProjectMetaDataDefinitionResponse withCode(long value) {
        setCode(value);
        return this;
    }

    @Override
    public ProjectMetaDataDefinitionResponse withMsg(String value) {
        setMsg(value);
        return this;
    }

    @Override
    public ProjectMetaDataDefinitionResponse withRootCause(RootCause... values) {
        if (values!= null) {
            for (RootCause value: values) {
                getRootCause().add(value);
            }
        }
        return this;
    }

    @Override
    public ProjectMetaDataDefinitionResponse withRootCause(Collection<RootCause> values) {
        if (values!= null) {
            getRootCause().addAll(values);
        }
        return this;
    }

    @Override
    public ProjectMetaDataDefinitionResponse withRootCause(List<RootCause> rootCause) {
        setRootCause(rootCause);
        return this;
    }

}

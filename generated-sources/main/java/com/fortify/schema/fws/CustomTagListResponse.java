
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
import xmlns.www_fortifysoftware_com.schema.wstypes.RootCause;
import xmlns.www_fortifysoftware_com.schema.wstypes.Status;
import xmlns.www_fortifysoftware_com.schema.wstypes.TagDefinition;


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
 *         &lt;element name="TagDefinition" type="{xmlns://www.fortifysoftware.com/schema/wsTypes}TagDefinition" maxOccurs="unbounded" minOccurs="0"/>
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
    "tagDefinition"
})
@XmlRootElement(name = "CustomTagListResponse")
public class CustomTagListResponse
    extends Status
{

    @XmlElement(name = "TagDefinition")
    protected List<TagDefinition> tagDefinition;

    /**
     * Default no-arg constructor
     * 
     */
    public CustomTagListResponse() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public CustomTagListResponse(final long code, final String msg, final List<RootCause> rootCause, final List<TagDefinition> tagDefinition) {
        super(code, msg, rootCause);
        this.tagDefinition = tagDefinition;
    }

    /**
     * Gets the value of the tagDefinition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tagDefinition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTagDefinition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TagDefinition }
     * 
     * 
     */
    public List<TagDefinition> getTagDefinition() {
        if (tagDefinition == null) {
            tagDefinition = new ArrayList<TagDefinition>();
        }
        return this.tagDefinition;
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
     * Sets the value of the tagDefinition property.
     * 
     * @param tagDefinition
     *     allowed object is
     *     {@link TagDefinition }
     *     
     */
    public void setTagDefinition(List<TagDefinition> tagDefinition) {
        this.tagDefinition = tagDefinition;
    }

    public CustomTagListResponse withTagDefinition(TagDefinition... values) {
        if (values!= null) {
            for (TagDefinition value: values) {
                getTagDefinition().add(value);
            }
        }
        return this;
    }

    public CustomTagListResponse withTagDefinition(Collection<TagDefinition> values) {
        if (values!= null) {
            getTagDefinition().addAll(values);
        }
        return this;
    }

    public CustomTagListResponse withTagDefinition(List<TagDefinition> tagDefinition) {
        setTagDefinition(tagDefinition);
        return this;
    }

    @Override
    public CustomTagListResponse withCode(long value) {
        setCode(value);
        return this;
    }

    @Override
    public CustomTagListResponse withMsg(String value) {
        setMsg(value);
        return this;
    }

    @Override
    public CustomTagListResponse withRootCause(RootCause... values) {
        if (values!= null) {
            for (RootCause value: values) {
                getRootCause().add(value);
            }
        }
        return this;
    }

    @Override
    public CustomTagListResponse withRootCause(Collection<RootCause> values) {
        if (values!= null) {
            getRootCause().addAll(values);
        }
        return this;
    }

    @Override
    public CustomTagListResponse withRootCause(List<RootCause> rootCause) {
        setRootCause(rootCause);
        return this;
    }

}

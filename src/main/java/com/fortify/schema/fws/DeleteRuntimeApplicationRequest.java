
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
import xmlns.www_fortifysoftware_com.schema.wstypes.RuntimeApplicationIdentifier;


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
 *         &lt;element name="RuntimeApplicationId" type="{xmlns://www.fortifysoftware.com/schema/wsTypes}RuntimeApplicationIdentifier" maxOccurs="unbounded"/>
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
    "runtimeApplicationId"
})
@XmlRootElement(name = "DeleteRuntimeApplicationRequest")
public class DeleteRuntimeApplicationRequest {

    @XmlElement(name = "RuntimeApplicationId", required = true)
    protected List<RuntimeApplicationIdentifier> runtimeApplicationId;

    /**
     * Default no-arg constructor
     * 
     */
    public DeleteRuntimeApplicationRequest() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public DeleteRuntimeApplicationRequest(final List<RuntimeApplicationIdentifier> runtimeApplicationId) {
        this.runtimeApplicationId = runtimeApplicationId;
    }

    /**
     * Gets the value of the runtimeApplicationId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the runtimeApplicationId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRuntimeApplicationId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RuntimeApplicationIdentifier }
     * 
     * 
     */
    public List<RuntimeApplicationIdentifier> getRuntimeApplicationId() {
        if (runtimeApplicationId == null) {
            runtimeApplicationId = new ArrayList<RuntimeApplicationIdentifier>();
        }
        return this.runtimeApplicationId;
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
     * Sets the value of the runtimeApplicationId property.
     * 
     * @param runtimeApplicationId
     *     allowed object is
     *     {@link RuntimeApplicationIdentifier }
     *     
     */
    public void setRuntimeApplicationId(List<RuntimeApplicationIdentifier> runtimeApplicationId) {
        this.runtimeApplicationId = runtimeApplicationId;
    }

    public DeleteRuntimeApplicationRequest withRuntimeApplicationId(RuntimeApplicationIdentifier... values) {
        if (values!= null) {
            for (RuntimeApplicationIdentifier value: values) {
                getRuntimeApplicationId().add(value);
            }
        }
        return this;
    }

    public DeleteRuntimeApplicationRequest withRuntimeApplicationId(Collection<RuntimeApplicationIdentifier> values) {
        if (values!= null) {
            getRuntimeApplicationId().addAll(values);
        }
        return this;
    }

    public DeleteRuntimeApplicationRequest withRuntimeApplicationId(List<RuntimeApplicationIdentifier> runtimeApplicationId) {
        setRuntimeApplicationId(runtimeApplicationId);
        return this;
    }

}

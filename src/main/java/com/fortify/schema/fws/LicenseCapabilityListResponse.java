
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
import xmlns.www_fortifysoftware_com.schema.wstypes.LicenseCapability;
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
 *         &lt;element name="LicenseCapability" type="{xmlns://www.fortifysoftware.com/schema/wsTypes}LicenseCapability" maxOccurs="unbounded" minOccurs="0"/>
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
    "licenseCapability"
})
@XmlRootElement(name = "LicenseCapabilityListResponse")
public class LicenseCapabilityListResponse
    extends Status
{

    @XmlElement(name = "LicenseCapability")
    protected List<LicenseCapability> licenseCapability;

    /**
     * Default no-arg constructor
     * 
     */
    public LicenseCapabilityListResponse() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public LicenseCapabilityListResponse(final long code, final String msg, final List<RootCause> rootCause, final List<LicenseCapability> licenseCapability) {
        super(code, msg, rootCause);
        this.licenseCapability = licenseCapability;
    }

    /**
     * Gets the value of the licenseCapability property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the licenseCapability property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLicenseCapability().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LicenseCapability }
     * 
     * 
     */
    public List<LicenseCapability> getLicenseCapability() {
        if (licenseCapability == null) {
            licenseCapability = new ArrayList<LicenseCapability>();
        }
        return this.licenseCapability;
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
     * Sets the value of the licenseCapability property.
     * 
     * @param licenseCapability
     *     allowed object is
     *     {@link LicenseCapability }
     *     
     */
    public void setLicenseCapability(List<LicenseCapability> licenseCapability) {
        this.licenseCapability = licenseCapability;
    }

    public LicenseCapabilityListResponse withLicenseCapability(LicenseCapability... values) {
        if (values!= null) {
            for (LicenseCapability value: values) {
                getLicenseCapability().add(value);
            }
        }
        return this;
    }

    public LicenseCapabilityListResponse withLicenseCapability(Collection<LicenseCapability> values) {
        if (values!= null) {
            getLicenseCapability().addAll(values);
        }
        return this;
    }

    public LicenseCapabilityListResponse withLicenseCapability(List<LicenseCapability> licenseCapability) {
        setLicenseCapability(licenseCapability);
        return this;
    }

    @Override
    public LicenseCapabilityListResponse withCode(long value) {
        setCode(value);
        return this;
    }

    @Override
    public LicenseCapabilityListResponse withMsg(String value) {
        setMsg(value);
        return this;
    }

    @Override
    public LicenseCapabilityListResponse withRootCause(RootCause... values) {
        if (values!= null) {
            for (RootCause value: values) {
                getRootCause().add(value);
            }
        }
        return this;
    }

    @Override
    public LicenseCapabilityListResponse withRootCause(Collection<RootCause> values) {
        if (values!= null) {
            getRootCause().addAll(values);
        }
        return this;
    }

    @Override
    public LicenseCapabilityListResponse withRootCause(List<RootCause> rootCause) {
        setRootCause(rootCause);
        return this;
    }

}

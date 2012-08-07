
package xmlns.www_fortifysoftware_com.schema.runtime;

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


/**
 * <p>Java class for Federation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Federation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HostAddress" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DefaultFederation" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ConfigurationId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Federation", propOrder = {
    "name",
    "description",
    "hostAddress",
    "defaultFederation",
    "configurationId"
})
public class Federation {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "HostAddress")
    protected List<String> hostAddress;
    @XmlElement(name = "DefaultFederation")
    protected boolean defaultFederation;
    @XmlElement(name = "ConfigurationId", required = true)
    protected String configurationId;

    /**
     * Default no-arg constructor
     * 
     */
    public Federation() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public Federation(final String name, final String description, final List<String> hostAddress, final boolean defaultFederation, final String configurationId) {
        this.name = name;
        this.description = description;
        this.hostAddress = hostAddress;
        this.defaultFederation = defaultFederation;
        this.configurationId = configurationId;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the hostAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHostAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getHostAddress() {
        if (hostAddress == null) {
            hostAddress = new ArrayList<String>();
        }
        return this.hostAddress;
    }

    /**
     * Gets the value of the defaultFederation property.
     * 
     */
    public boolean isDefaultFederation() {
        return defaultFederation;
    }

    /**
     * Sets the value of the defaultFederation property.
     * 
     */
    public void setDefaultFederation(boolean value) {
        this.defaultFederation = value;
    }

    /**
     * Gets the value of the configurationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfigurationId() {
        return configurationId;
    }

    /**
     * Sets the value of the configurationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfigurationId(String value) {
        this.configurationId = value;
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
     * Sets the value of the hostAddress property.
     * 
     * @param hostAddress
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostAddress(List<String> hostAddress) {
        this.hostAddress = hostAddress;
    }

    public Federation withName(String value) {
        setName(value);
        return this;
    }

    public Federation withDescription(String value) {
        setDescription(value);
        return this;
    }

    public Federation withHostAddress(String... values) {
        if (values!= null) {
            for (String value: values) {
                getHostAddress().add(value);
            }
        }
        return this;
    }

    public Federation withHostAddress(Collection<String> values) {
        if (values!= null) {
            getHostAddress().addAll(values);
        }
        return this;
    }

    public Federation withDefaultFederation(boolean value) {
        setDefaultFederation(value);
        return this;
    }

    public Federation withConfigurationId(String value) {
        setConfigurationId(value);
        return this;
    }

    public Federation withHostAddress(List<String> hostAddress) {
        setHostAddress(hostAddress);
        return this;
    }

}

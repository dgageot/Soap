
package xmlns.www_fortifysoftware_com.schema.seed;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;


/**
 * <p>Java class for Bootstrap complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Bootstrap">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SeedEntries" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="BundleIdentifier" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="BundleVersion" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CompatibleVersion" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Bootstrap", propOrder = {
    "seedEntries"
})
public class Bootstrap {

    @XmlElement(name = "SeedEntries")
    protected List<String> seedEntries;
    @XmlAttribute(name = "BundleIdentifier", required = true)
    protected String bundleIdentifier;
    @XmlAttribute(name = "BundleVersion", required = true)
    protected String bundleVersion;
    @XmlAttribute(name = "CompatibleVersion", required = true)
    protected String compatibleVersion;

    /**
     * Default no-arg constructor
     * 
     */
    public Bootstrap() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public Bootstrap(final List<String> seedEntries, final String bundleIdentifier, final String bundleVersion, final String compatibleVersion) {
        this.seedEntries = seedEntries;
        this.bundleIdentifier = bundleIdentifier;
        this.bundleVersion = bundleVersion;
        this.compatibleVersion = compatibleVersion;
    }

    /**
     * Gets the value of the seedEntries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seedEntries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeedEntries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSeedEntries() {
        if (seedEntries == null) {
            seedEntries = new ArrayList<String>();
        }
        return this.seedEntries;
    }

    /**
     * Gets the value of the bundleIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBundleIdentifier() {
        return bundleIdentifier;
    }

    /**
     * Sets the value of the bundleIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBundleIdentifier(String value) {
        this.bundleIdentifier = value;
    }

    /**
     * Gets the value of the bundleVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBundleVersion() {
        return bundleVersion;
    }

    /**
     * Sets the value of the bundleVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBundleVersion(String value) {
        this.bundleVersion = value;
    }

    /**
     * Gets the value of the compatibleVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompatibleVersion() {
        return compatibleVersion;
    }

    /**
     * Sets the value of the compatibleVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompatibleVersion(String value) {
        this.compatibleVersion = value;
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
     * Sets the value of the seedEntries property.
     * 
     * @param seedEntries
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeedEntries(List<String> seedEntries) {
        this.seedEntries = seedEntries;
    }

    public Bootstrap withSeedEntries(String... values) {
        if (values!= null) {
            for (String value: values) {
                getSeedEntries().add(value);
            }
        }
        return this;
    }

    public Bootstrap withSeedEntries(Collection<String> values) {
        if (values!= null) {
            getSeedEntries().addAll(values);
        }
        return this;
    }

    public Bootstrap withBundleIdentifier(String value) {
        setBundleIdentifier(value);
        return this;
    }

    public Bootstrap withBundleVersion(String value) {
        setBundleVersion(value);
        return this;
    }

    public Bootstrap withCompatibleVersion(String value) {
        setCompatibleVersion(value);
        return this;
    }

    public Bootstrap withSeedEntries(List<String> seedEntries) {
        setSeedEntries(seedEntries);
        return this;
    }

}

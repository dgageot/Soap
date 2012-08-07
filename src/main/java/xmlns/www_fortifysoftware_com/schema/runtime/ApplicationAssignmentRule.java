
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
import xmlns.www_fortifysoftware_com.schema.wstypes.SearchSpecBase;


/**
 * <p>Java class for ApplicationAssignmentRule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApplicationAssignmentRule">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SearchSpec" type="{xmlns://www.fortifysoftware.com/schema/wsTypes}SearchSpecBase" minOccurs="0"/>
 *         &lt;element name="Hostname" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RuntimeApplicationName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplicationAssignmentRule", propOrder = {
    "name",
    "description",
    "searchSpec",
    "hostname",
    "runtimeApplicationName"
})
public class ApplicationAssignmentRule {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "SearchSpec")
    protected SearchSpecBase searchSpec;
    @XmlElement(name = "Hostname")
    protected List<String> hostname;
    @XmlElement(name = "RuntimeApplicationName", required = true)
    protected String runtimeApplicationName;

    /**
     * Default no-arg constructor
     * 
     */
    public ApplicationAssignmentRule() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ApplicationAssignmentRule(final String name, final String description, final SearchSpecBase searchSpec, final List<String> hostname, final String runtimeApplicationName) {
        this.name = name;
        this.description = description;
        this.searchSpec = searchSpec;
        this.hostname = hostname;
        this.runtimeApplicationName = runtimeApplicationName;
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
     * Gets the value of the searchSpec property.
     * 
     * @return
     *     possible object is
     *     {@link SearchSpecBase }
     *     
     */
    public SearchSpecBase getSearchSpec() {
        return searchSpec;
    }

    /**
     * Sets the value of the searchSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchSpecBase }
     *     
     */
    public void setSearchSpec(SearchSpecBase value) {
        this.searchSpec = value;
    }

    /**
     * Gets the value of the hostname property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostname property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHostname().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getHostname() {
        if (hostname == null) {
            hostname = new ArrayList<String>();
        }
        return this.hostname;
    }

    /**
     * Gets the value of the runtimeApplicationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuntimeApplicationName() {
        return runtimeApplicationName;
    }

    /**
     * Sets the value of the runtimeApplicationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuntimeApplicationName(String value) {
        this.runtimeApplicationName = value;
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
     * Sets the value of the hostname property.
     * 
     * @param hostname
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostname(List<String> hostname) {
        this.hostname = hostname;
    }

    public ApplicationAssignmentRule withName(String value) {
        setName(value);
        return this;
    }

    public ApplicationAssignmentRule withDescription(String value) {
        setDescription(value);
        return this;
    }

    public ApplicationAssignmentRule withSearchSpec(SearchSpecBase value) {
        setSearchSpec(value);
        return this;
    }

    public ApplicationAssignmentRule withHostname(String... values) {
        if (values!= null) {
            for (String value: values) {
                getHostname().add(value);
            }
        }
        return this;
    }

    public ApplicationAssignmentRule withHostname(Collection<String> values) {
        if (values!= null) {
            getHostname().addAll(values);
        }
        return this;
    }

    public ApplicationAssignmentRule withRuntimeApplicationName(String value) {
        setRuntimeApplicationName(value);
        return this;
    }

    public ApplicationAssignmentRule withHostname(List<String> hostname) {
        setHostname(hostname);
        return this;
    }

}

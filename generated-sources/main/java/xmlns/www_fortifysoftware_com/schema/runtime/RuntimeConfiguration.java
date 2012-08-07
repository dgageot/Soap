
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
 * <p>Java class for RuntimeConfiguration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RuntimeConfiguration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Guid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ConfigurationFile" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Rulepack" type="{xmlns://www.fortifysoftware.com/schema/runtime}Rulepack" maxOccurs="unbounded"/>
 *         &lt;element name="SettingsFile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConsoleEventHandlersFile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RuntimeConfiguration", propOrder = {
    "name",
    "description",
    "guid",
    "configurationFile",
    "rulepack",
    "settingsFile",
    "consoleEventHandlersFile"
})
public class RuntimeConfiguration {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Guid", required = true)
    protected String guid;
    @XmlElement(name = "ConfigurationFile", required = true)
    protected String configurationFile;
    @XmlElement(name = "Rulepack", required = true)
    protected List<Rulepack> rulepack;
    @XmlElement(name = "SettingsFile")
    protected String settingsFile;
    @XmlElement(name = "ConsoleEventHandlersFile")
    protected String consoleEventHandlersFile;

    /**
     * Default no-arg constructor
     * 
     */
    public RuntimeConfiguration() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public RuntimeConfiguration(final String name, final String description, final String guid, final String configurationFile, final List<Rulepack> rulepack, final String settingsFile, final String consoleEventHandlersFile) {
        this.name = name;
        this.description = description;
        this.guid = guid;
        this.configurationFile = configurationFile;
        this.rulepack = rulepack;
        this.settingsFile = settingsFile;
        this.consoleEventHandlersFile = consoleEventHandlersFile;
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
     * Gets the value of the guid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuid() {
        return guid;
    }

    /**
     * Sets the value of the guid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuid(String value) {
        this.guid = value;
    }

    /**
     * Gets the value of the configurationFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfigurationFile() {
        return configurationFile;
    }

    /**
     * Sets the value of the configurationFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfigurationFile(String value) {
        this.configurationFile = value;
    }

    /**
     * Gets the value of the rulepack property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rulepack property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRulepack().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Rulepack }
     * 
     * 
     */
    public List<Rulepack> getRulepack() {
        if (rulepack == null) {
            rulepack = new ArrayList<Rulepack>();
        }
        return this.rulepack;
    }

    /**
     * Gets the value of the settingsFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettingsFile() {
        return settingsFile;
    }

    /**
     * Sets the value of the settingsFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettingsFile(String value) {
        this.settingsFile = value;
    }

    /**
     * Gets the value of the consoleEventHandlersFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsoleEventHandlersFile() {
        return consoleEventHandlersFile;
    }

    /**
     * Sets the value of the consoleEventHandlersFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsoleEventHandlersFile(String value) {
        this.consoleEventHandlersFile = value;
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
     * Sets the value of the rulepack property.
     * 
     * @param rulepack
     *     allowed object is
     *     {@link Rulepack }
     *     
     */
    public void setRulepack(List<Rulepack> rulepack) {
        this.rulepack = rulepack;
    }

    public RuntimeConfiguration withName(String value) {
        setName(value);
        return this;
    }

    public RuntimeConfiguration withDescription(String value) {
        setDescription(value);
        return this;
    }

    public RuntimeConfiguration withGuid(String value) {
        setGuid(value);
        return this;
    }

    public RuntimeConfiguration withConfigurationFile(String value) {
        setConfigurationFile(value);
        return this;
    }

    public RuntimeConfiguration withRulepack(Rulepack... values) {
        if (values!= null) {
            for (Rulepack value: values) {
                getRulepack().add(value);
            }
        }
        return this;
    }

    public RuntimeConfiguration withRulepack(Collection<Rulepack> values) {
        if (values!= null) {
            getRulepack().addAll(values);
        }
        return this;
    }

    public RuntimeConfiguration withSettingsFile(String value) {
        setSettingsFile(value);
        return this;
    }

    public RuntimeConfiguration withConsoleEventHandlersFile(String value) {
        setConsoleEventHandlersFile(value);
        return this;
    }

    public RuntimeConfiguration withRulepack(List<Rulepack> rulepack) {
        setRulepack(rulepack);
        return this;
    }

}

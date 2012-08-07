
package xmlns.www_fortifysoftware_com.schema.runtime;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import xmlns.www_fortifysoftware_com.schema.enumconstants.HostStatus;
import xmlns.www_fortifysoftware_com.schema.enumconstants.HostType;


/**
 * <p>Java class for Host complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Host">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Hostname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LastCommunication" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="HostType" type="{xmlns://www.fortifysoftware.com/schema/enumConstants}HostType" minOccurs="0"/>
 *         &lt;element name="HostStatus" type="{xmlns://www.fortifysoftware.com/schema/enumConstants}HostStatus" minOccurs="0"/>
 *         &lt;element name="StatusMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShouldHaveCert" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OperatingSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OperatingSystemVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VirtualMachine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VirtualMachineVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FederationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Host", propOrder = {
    "address",
    "hostname",
    "enabled",
    "lastCommunication",
    "hostType",
    "hostStatus",
    "statusMessage",
    "shouldHaveCert",
    "operatingSystem",
    "operatingSystemVersion",
    "virtualMachine",
    "virtualMachineVersion",
    "federationName"
})
public class Host {

    @XmlElement(name = "Address", required = true)
    protected String address;
    @XmlElement(name = "Hostname")
    protected String hostname;
    @XmlElement(name = "Enabled")
    protected Boolean enabled;
    @XmlElement(name = "LastCommunication")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastCommunication;
    @XmlElement(name = "HostType")
    protected HostType hostType;
    @XmlElement(name = "HostStatus")
    protected HostStatus hostStatus;
    @XmlElement(name = "StatusMessage")
    protected String statusMessage;
    @XmlElement(name = "ShouldHaveCert")
    protected Boolean shouldHaveCert;
    @XmlElement(name = "OperatingSystem")
    protected String operatingSystem;
    @XmlElement(name = "OperatingSystemVersion")
    protected String operatingSystemVersion;
    @XmlElement(name = "VirtualMachine")
    protected String virtualMachine;
    @XmlElement(name = "VirtualMachineVersion")
    protected String virtualMachineVersion;
    @XmlElement(name = "FederationName")
    protected String federationName;

    /**
     * Default no-arg constructor
     * 
     */
    public Host() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public Host(final String address, final String hostname, final Boolean enabled, final XMLGregorianCalendar lastCommunication, final HostType hostType, final HostStatus hostStatus, final String statusMessage, final Boolean shouldHaveCert, final String operatingSystem, final String operatingSystemVersion, final String virtualMachine, final String virtualMachineVersion, final String federationName) {
        this.address = address;
        this.hostname = hostname;
        this.enabled = enabled;
        this.lastCommunication = lastCommunication;
        this.hostType = hostType;
        this.hostStatus = hostStatus;
        this.statusMessage = statusMessage;
        this.shouldHaveCert = shouldHaveCert;
        this.operatingSystem = operatingSystem;
        this.operatingSystemVersion = operatingSystemVersion;
        this.virtualMachine = virtualMachine;
        this.virtualMachineVersion = virtualMachineVersion;
        this.federationName = federationName;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the hostname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostname() {
        return hostname;
    }

    /**
     * Sets the value of the hostname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostname(String value) {
        this.hostname = value;
    }

    /**
     * Gets the value of the enabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnabled(Boolean value) {
        this.enabled = value;
    }

    /**
     * Gets the value of the lastCommunication property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastCommunication() {
        return lastCommunication;
    }

    /**
     * Sets the value of the lastCommunication property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastCommunication(XMLGregorianCalendar value) {
        this.lastCommunication = value;
    }

    /**
     * Gets the value of the hostType property.
     * 
     * @return
     *     possible object is
     *     {@link HostType }
     *     
     */
    public HostType getHostType() {
        return hostType;
    }

    /**
     * Sets the value of the hostType property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostType }
     *     
     */
    public void setHostType(HostType value) {
        this.hostType = value;
    }

    /**
     * Gets the value of the hostStatus property.
     * 
     * @return
     *     possible object is
     *     {@link HostStatus }
     *     
     */
    public HostStatus getHostStatus() {
        return hostStatus;
    }

    /**
     * Sets the value of the hostStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostStatus }
     *     
     */
    public void setHostStatus(HostStatus value) {
        this.hostStatus = value;
    }

    /**
     * Gets the value of the statusMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusMessage() {
        return statusMessage;
    }

    /**
     * Sets the value of the statusMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusMessage(String value) {
        this.statusMessage = value;
    }

    /**
     * Gets the value of the shouldHaveCert property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShouldHaveCert() {
        return shouldHaveCert;
    }

    /**
     * Sets the value of the shouldHaveCert property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShouldHaveCert(Boolean value) {
        this.shouldHaveCert = value;
    }

    /**
     * Gets the value of the operatingSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatingSystem() {
        return operatingSystem;
    }

    /**
     * Sets the value of the operatingSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatingSystem(String value) {
        this.operatingSystem = value;
    }

    /**
     * Gets the value of the operatingSystemVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatingSystemVersion() {
        return operatingSystemVersion;
    }

    /**
     * Sets the value of the operatingSystemVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatingSystemVersion(String value) {
        this.operatingSystemVersion = value;
    }

    /**
     * Gets the value of the virtualMachine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVirtualMachine() {
        return virtualMachine;
    }

    /**
     * Sets the value of the virtualMachine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVirtualMachine(String value) {
        this.virtualMachine = value;
    }

    /**
     * Gets the value of the virtualMachineVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVirtualMachineVersion() {
        return virtualMachineVersion;
    }

    /**
     * Sets the value of the virtualMachineVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVirtualMachineVersion(String value) {
        this.virtualMachineVersion = value;
    }

    /**
     * Gets the value of the federationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFederationName() {
        return federationName;
    }

    /**
     * Sets the value of the federationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFederationName(String value) {
        this.federationName = value;
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

    public Host withAddress(String value) {
        setAddress(value);
        return this;
    }

    public Host withHostname(String value) {
        setHostname(value);
        return this;
    }

    public Host withEnabled(Boolean value) {
        setEnabled(value);
        return this;
    }

    public Host withLastCommunication(XMLGregorianCalendar value) {
        setLastCommunication(value);
        return this;
    }

    public Host withHostType(HostType value) {
        setHostType(value);
        return this;
    }

    public Host withHostStatus(HostStatus value) {
        setHostStatus(value);
        return this;
    }

    public Host withStatusMessage(String value) {
        setStatusMessage(value);
        return this;
    }

    public Host withShouldHaveCert(Boolean value) {
        setShouldHaveCert(value);
        return this;
    }

    public Host withOperatingSystem(String value) {
        setOperatingSystem(value);
        return this;
    }

    public Host withOperatingSystemVersion(String value) {
        setOperatingSystemVersion(value);
        return this;
    }

    public Host withVirtualMachine(String value) {
        setVirtualMachine(value);
        return this;
    }

    public Host withVirtualMachineVersion(String value) {
        setVirtualMachineVersion(value);
        return this;
    }

    public Host withFederationName(String value) {
        setFederationName(value);
        return this;
    }

}

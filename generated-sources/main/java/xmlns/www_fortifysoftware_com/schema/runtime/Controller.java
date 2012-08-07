
package xmlns.www_fortifysoftware_com.schema.runtime;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;


/**
 * <p>Java class for Controller complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Controller">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AllowNewClients" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="KeystoreFile" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Integrity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Controller", propOrder = {
    "allowNewClients",
    "keystoreFile",
    "integrity"
})
public class Controller {

    @XmlElement(name = "AllowNewClients")
    protected boolean allowNewClients;
    @XmlElement(name = "KeystoreFile", required = true)
    protected String keystoreFile;
    @XmlElement(name = "Integrity", required = true)
    protected String integrity;

    /**
     * Default no-arg constructor
     * 
     */
    public Controller() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public Controller(final boolean allowNewClients, final String keystoreFile, final String integrity) {
        this.allowNewClients = allowNewClients;
        this.keystoreFile = keystoreFile;
        this.integrity = integrity;
    }

    /**
     * Gets the value of the allowNewClients property.
     * 
     */
    public boolean isAllowNewClients() {
        return allowNewClients;
    }

    /**
     * Sets the value of the allowNewClients property.
     * 
     */
    public void setAllowNewClients(boolean value) {
        this.allowNewClients = value;
    }

    /**
     * Gets the value of the keystoreFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeystoreFile() {
        return keystoreFile;
    }

    /**
     * Sets the value of the keystoreFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeystoreFile(String value) {
        this.keystoreFile = value;
    }

    /**
     * Gets the value of the integrity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntegrity() {
        return integrity;
    }

    /**
     * Sets the value of the integrity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntegrity(String value) {
        this.integrity = value;
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

    public Controller withAllowNewClients(boolean value) {
        setAllowNewClients(value);
        return this;
    }

    public Controller withKeystoreFile(String value) {
        setKeystoreFile(value);
        return this;
    }

    public Controller withIntegrity(String value) {
        setIntegrity(value);
        return this;
    }

}

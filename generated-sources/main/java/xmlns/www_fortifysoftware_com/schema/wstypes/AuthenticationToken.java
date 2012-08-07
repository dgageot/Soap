
package xmlns.www_fortifysoftware_com.schema.wstypes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
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


/**
 * <p>Java class for AuthenticationToken complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuthenticationToken">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="creationIp" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="creationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="terminalDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="actionPermitted" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="terminalAction" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthenticationToken", propOrder = {
    "id",
    "username",
    "creationIp",
    "creationDate",
    "terminalDate",
    "actionPermitted",
    "terminalAction"
})
public class AuthenticationToken {

    protected long id;
    @XmlElement(required = true)
    protected String username;
    @XmlElement(required = true)
    protected String creationIp;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar terminalDate;
    protected List<String> actionPermitted;
    protected List<String> terminalAction;

    /**
     * Default no-arg constructor
     * 
     */
    public AuthenticationToken() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public AuthenticationToken(final long id, final String username, final String creationIp, final XMLGregorianCalendar creationDate, final XMLGregorianCalendar terminalDate, final List<String> actionPermitted, final List<String> terminalAction) {
        this.id = id;
        this.username = username;
        this.creationIp = creationIp;
        this.creationDate = creationDate;
        this.terminalDate = terminalDate;
        this.actionPermitted = actionPermitted;
        this.terminalAction = terminalAction;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Gets the value of the creationIp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreationIp() {
        return creationIp;
    }

    /**
     * Sets the value of the creationIp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreationIp(String value) {
        this.creationIp = value;
    }

    /**
     * Gets the value of the creationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the value of the creationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDate(XMLGregorianCalendar value) {
        this.creationDate = value;
    }

    /**
     * Gets the value of the terminalDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTerminalDate() {
        return terminalDate;
    }

    /**
     * Sets the value of the terminalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTerminalDate(XMLGregorianCalendar value) {
        this.terminalDate = value;
    }

    /**
     * Gets the value of the actionPermitted property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the actionPermitted property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActionPermitted().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getActionPermitted() {
        if (actionPermitted == null) {
            actionPermitted = new ArrayList<String>();
        }
        return this.actionPermitted;
    }

    /**
     * Gets the value of the terminalAction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the terminalAction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTerminalAction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTerminalAction() {
        if (terminalAction == null) {
            terminalAction = new ArrayList<String>();
        }
        return this.terminalAction;
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
     * Sets the value of the actionPermitted property.
     * 
     * @param actionPermitted
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionPermitted(List<String> actionPermitted) {
        this.actionPermitted = actionPermitted;
    }

    /**
     * Sets the value of the terminalAction property.
     * 
     * @param terminalAction
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalAction(List<String> terminalAction) {
        this.terminalAction = terminalAction;
    }

    public AuthenticationToken withId(long value) {
        setId(value);
        return this;
    }

    public AuthenticationToken withUsername(String value) {
        setUsername(value);
        return this;
    }

    public AuthenticationToken withCreationIp(String value) {
        setCreationIp(value);
        return this;
    }

    public AuthenticationToken withCreationDate(XMLGregorianCalendar value) {
        setCreationDate(value);
        return this;
    }

    public AuthenticationToken withTerminalDate(XMLGregorianCalendar value) {
        setTerminalDate(value);
        return this;
    }

    public AuthenticationToken withActionPermitted(String... values) {
        if (values!= null) {
            for (String value: values) {
                getActionPermitted().add(value);
            }
        }
        return this;
    }

    public AuthenticationToken withActionPermitted(Collection<String> values) {
        if (values!= null) {
            getActionPermitted().addAll(values);
        }
        return this;
    }

    public AuthenticationToken withTerminalAction(String... values) {
        if (values!= null) {
            for (String value: values) {
                getTerminalAction().add(value);
            }
        }
        return this;
    }

    public AuthenticationToken withTerminalAction(Collection<String> values) {
        if (values!= null) {
            getTerminalAction().addAll(values);
        }
        return this;
    }

    public AuthenticationToken withActionPermitted(List<String> actionPermitted) {
        setActionPermitted(actionPermitted);
        return this;
    }

    public AuthenticationToken withTerminalAction(List<String> terminalAction) {
        setTerminalAction(terminalAction);
        return this;
    }

}

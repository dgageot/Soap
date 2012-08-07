
package xmlns.www_fortify_com.schema.audit;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;


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
 *         &lt;element ref="{xmlns://www.fortify.com/schema/audit}Tag"/>
 *         &lt;element name="EditTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="OldValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="resolve" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "tag",
    "editTime",
    "oldValue",
    "username"
})
@XmlRootElement(name = "TagHistory")
public class TagHistory {

    @XmlElement(name = "Tag", required = true)
    protected Tag tag;
    @XmlElement(name = "EditTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar editTime;
    @XmlElement(name = "OldValue")
    protected String oldValue;
    @XmlElement(name = "Username")
    protected String username;
    @XmlAttribute
    protected Boolean resolve;

    /**
     * Default no-arg constructor
     * 
     */
    public TagHistory() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public TagHistory(final Tag tag, final XMLGregorianCalendar editTime, final String oldValue, final String username, final Boolean resolve) {
        this.tag = tag;
        this.editTime = editTime;
        this.oldValue = oldValue;
        this.username = username;
        this.resolve = resolve;
    }

    /**
     * Gets the value of the tag property.
     * 
     * @return
     *     possible object is
     *     {@link Tag }
     *     
     */
    public Tag getTag() {
        return tag;
    }

    /**
     * Sets the value of the tag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tag }
     *     
     */
    public void setTag(Tag value) {
        this.tag = value;
    }

    /**
     * Gets the value of the editTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEditTime() {
        return editTime;
    }

    /**
     * Sets the value of the editTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEditTime(XMLGregorianCalendar value) {
        this.editTime = value;
    }

    /**
     * Gets the value of the oldValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldValue() {
        return oldValue;
    }

    /**
     * Sets the value of the oldValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldValue(String value) {
        this.oldValue = value;
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
     * Gets the value of the resolve property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isResolve() {
        return resolve;
    }

    /**
     * Sets the value of the resolve property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setResolve(Boolean value) {
        this.resolve = value;
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

    public TagHistory withTag(Tag value) {
        setTag(value);
        return this;
    }

    public TagHistory withEditTime(XMLGregorianCalendar value) {
        setEditTime(value);
        return this;
    }

    public TagHistory withOldValue(String value) {
        setOldValue(value);
        return this;
    }

    public TagHistory withUsername(String value) {
        setUsername(value);
        return this;
    }

    public TagHistory withResolve(Boolean value) {
        setResolve(value);
        return this;
    }

}

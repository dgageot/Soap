
package xmlns.www_fortifysoftware_com.schema.runtime;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;


/**
 * <p>Java class for StackTrace complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StackTrace">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CheckSum" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TraceBody" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StackTrace", propOrder = {
    "checkSum",
    "traceBody"
})
@XmlSeeAlso({
    EventStack.class,
    ExceptionStack.class
})
public class StackTrace {

    @XmlElement(name = "CheckSum", required = true)
    protected String checkSum;
    @XmlElement(name = "TraceBody", required = true)
    protected String traceBody;
    @XmlAttribute(required = true)
    protected String id;

    /**
     * Default no-arg constructor
     * 
     */
    public StackTrace() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public StackTrace(final String checkSum, final String traceBody, final String id) {
        this.checkSum = checkSum;
        this.traceBody = traceBody;
        this.id = id;
    }

    /**
     * Gets the value of the checkSum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckSum() {
        return checkSum;
    }

    /**
     * Sets the value of the checkSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckSum(String value) {
        this.checkSum = value;
    }

    /**
     * Gets the value of the traceBody property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraceBody() {
        return traceBody;
    }

    /**
     * Sets the value of the traceBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraceBody(String value) {
        this.traceBody = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
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

    public StackTrace withCheckSum(String value) {
        setCheckSum(value);
        return this;
    }

    public StackTrace withTraceBody(String value) {
        setTraceBody(value);
        return this;
    }

    public StackTrace withId(String value) {
        setId(value);
        return this;
    }

}

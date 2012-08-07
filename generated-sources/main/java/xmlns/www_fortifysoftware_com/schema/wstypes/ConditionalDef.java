
package xmlns.www_fortifysoftware_com.schema.wstypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
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
 *         &lt;element name="Conditional" type="{xmlns://www.fortifysoftware.com/schema/wsTypes}Conditional"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "conditional"
})
@XmlRootElement(name = "ConditionalDef")
public class ConditionalDef {

    @XmlElement(name = "Conditional", required = true)
    protected Conditional conditional;

    /**
     * Default no-arg constructor
     * 
     */
    public ConditionalDef() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ConditionalDef(final Conditional conditional) {
        this.conditional = conditional;
    }

    /**
     * Gets the value of the conditional property.
     * 
     * @return
     *     possible object is
     *     {@link Conditional }
     *     
     */
    public Conditional getConditional() {
        return conditional;
    }

    /**
     * Sets the value of the conditional property.
     * 
     * @param value
     *     allowed object is
     *     {@link Conditional }
     *     
     */
    public void setConditional(Conditional value) {
        this.conditional = value;
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

    public ConditionalDef withConditional(Conditional value) {
        setConditional(value);
        return this;
    }

}

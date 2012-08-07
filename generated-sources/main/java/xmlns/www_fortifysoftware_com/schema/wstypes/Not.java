
package xmlns.www_fortifysoftware_com.schema.wstypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;


/**
 * Evaulates to the logical inverse of the
 *             subnode.
 *           
 * 
 * <p>Java class for Not complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Not">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;group ref="{xmlns://www.fortifysoftware.com/schema/wsTypes}ConditionalNodes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Not", propOrder = {
    "and",
    "or",
    "not",
    "ruleCondition"
})
public class Not {

    @XmlElement(name = "And")
    protected And and;
    @XmlElement(name = "Or")
    protected Or or;
    @XmlElement(name = "Not")
    protected Not not;
    @XmlElement(name = "RuleCondition")
    protected RuleCondition ruleCondition;

    /**
     * Default no-arg constructor
     * 
     */
    public Not() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public Not(final And and, final Or or, final Not not, final RuleCondition ruleCondition) {
        this.and = and;
        this.or = or;
        this.not = not;
        this.ruleCondition = ruleCondition;
    }

    /**
     * Gets the value of the and property.
     * 
     * @return
     *     possible object is
     *     {@link And }
     *     
     */
    public And getAnd() {
        return and;
    }

    /**
     * Sets the value of the and property.
     * 
     * @param value
     *     allowed object is
     *     {@link And }
     *     
     */
    public void setAnd(And value) {
        this.and = value;
    }

    /**
     * Gets the value of the or property.
     * 
     * @return
     *     possible object is
     *     {@link Or }
     *     
     */
    public Or getOr() {
        return or;
    }

    /**
     * Sets the value of the or property.
     * 
     * @param value
     *     allowed object is
     *     {@link Or }
     *     
     */
    public void setOr(Or value) {
        this.or = value;
    }

    /**
     * Gets the value of the not property.
     * 
     * @return
     *     possible object is
     *     {@link Not }
     *     
     */
    public Not getNot() {
        return not;
    }

    /**
     * Sets the value of the not property.
     * 
     * @param value
     *     allowed object is
     *     {@link Not }
     *     
     */
    public void setNot(Not value) {
        this.not = value;
    }

    /**
     * Gets the value of the ruleCondition property.
     * 
     * @return
     *     possible object is
     *     {@link RuleCondition }
     *     
     */
    public RuleCondition getRuleCondition() {
        return ruleCondition;
    }

    /**
     * Sets the value of the ruleCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link RuleCondition }
     *     
     */
    public void setRuleCondition(RuleCondition value) {
        this.ruleCondition = value;
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

    public Not withAnd(And value) {
        setAnd(value);
        return this;
    }

    public Not withOr(Or value) {
        setOr(value);
        return this;
    }

    public Not withNot(Not value) {
        setNot(value);
        return this;
    }

    public Not withRuleCondition(RuleCondition value) {
        setRuleCondition(value);
        return this;
    }

}

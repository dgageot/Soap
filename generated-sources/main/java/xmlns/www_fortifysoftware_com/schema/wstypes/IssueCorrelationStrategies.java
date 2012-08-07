
package xmlns.www_fortifysoftware_com.schema.wstypes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
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
 *         &lt;element ref="{xmlns://www.fortifysoftware.com/schema/wsTypes}IssueCorrelationRule" maxOccurs="unbounded"/>
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
    "issueCorrelationRule"
})
@XmlRootElement(name = "IssueCorrelationStrategies")
public class IssueCorrelationStrategies {

    @XmlElement(name = "IssueCorrelationRule", required = true)
    protected List<IssueCorrelationRule> issueCorrelationRule;

    /**
     * Default no-arg constructor
     * 
     */
    public IssueCorrelationStrategies() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public IssueCorrelationStrategies(final List<IssueCorrelationRule> issueCorrelationRule) {
        this.issueCorrelationRule = issueCorrelationRule;
    }

    /**
     * Gets the value of the issueCorrelationRule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the issueCorrelationRule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIssueCorrelationRule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IssueCorrelationRule }
     * 
     * 
     */
    public List<IssueCorrelationRule> getIssueCorrelationRule() {
        if (issueCorrelationRule == null) {
            issueCorrelationRule = new ArrayList<IssueCorrelationRule>();
        }
        return this.issueCorrelationRule;
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
     * Sets the value of the issueCorrelationRule property.
     * 
     * @param issueCorrelationRule
     *     allowed object is
     *     {@link IssueCorrelationRule }
     *     
     */
    public void setIssueCorrelationRule(List<IssueCorrelationRule> issueCorrelationRule) {
        this.issueCorrelationRule = issueCorrelationRule;
    }

    public IssueCorrelationStrategies withIssueCorrelationRule(IssueCorrelationRule... values) {
        if (values!= null) {
            for (IssueCorrelationRule value: values) {
                getIssueCorrelationRule().add(value);
            }
        }
        return this;
    }

    public IssueCorrelationStrategies withIssueCorrelationRule(Collection<IssueCorrelationRule> values) {
        if (values!= null) {
            getIssueCorrelationRule().addAll(values);
        }
        return this;
    }

    public IssueCorrelationStrategies withIssueCorrelationRule(List<IssueCorrelationRule> issueCorrelationRule) {
        setIssueCorrelationRule(issueCorrelationRule);
        return this;
    }

}

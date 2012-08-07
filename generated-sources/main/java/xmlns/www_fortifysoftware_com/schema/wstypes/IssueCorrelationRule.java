
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
 *     &lt;extension base="{xmlns://www.fortifysoftware.com/schema/wsTypes}PublishBase">
 *       &lt;sequence>
 *         &lt;element name="StrategyDisplayName" type="{xmlns://www.fortifysoftware.com/schema/wsTypes}LocalizedString"/>
 *         &lt;element name="Guid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Filter" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NameTemplate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ComponentNameTemplate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Attribute" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         &lt;element name="RuleType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "strategyDisplayName",
    "guid",
    "filter",
    "nameTemplate",
    "componentNameTemplate",
    "attribute",
    "ruleType"
})
@XmlRootElement(name = "IssueCorrelationRule")
public class IssueCorrelationRule
    extends PublishBase
{

    @XmlElement(name = "StrategyDisplayName", required = true)
    protected LocalizedString strategyDisplayName;
    @XmlElement(name = "Guid", required = true)
    protected String guid;
    @XmlElement(name = "Filter", required = true)
    protected String filter;
    @XmlElement(name = "NameTemplate", required = true)
    protected String nameTemplate;
    @XmlElement(name = "ComponentNameTemplate", required = true)
    protected String componentNameTemplate;
    @XmlElement(name = "Attribute", required = true)
    protected List<String> attribute;
    @XmlElement(name = "RuleType", required = true)
    protected String ruleType;

    /**
     * Default no-arg constructor
     * 
     */
    public IssueCorrelationRule() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public IssueCorrelationRule(final int publishVersion, final int objectVersion, final LocalizedString strategyDisplayName, final String guid, final String filter, final String nameTemplate, final String componentNameTemplate, final List<String> attribute, final String ruleType) {
        super(publishVersion, objectVersion);
        this.strategyDisplayName = strategyDisplayName;
        this.guid = guid;
        this.filter = filter;
        this.nameTemplate = nameTemplate;
        this.componentNameTemplate = componentNameTemplate;
        this.attribute = attribute;
        this.ruleType = ruleType;
    }

    /**
     * Gets the value of the strategyDisplayName property.
     * 
     * @return
     *     possible object is
     *     {@link LocalizedString }
     *     
     */
    public LocalizedString getStrategyDisplayName() {
        return strategyDisplayName;
    }

    /**
     * Sets the value of the strategyDisplayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalizedString }
     *     
     */
    public void setStrategyDisplayName(LocalizedString value) {
        this.strategyDisplayName = value;
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
     * Gets the value of the filter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilter() {
        return filter;
    }

    /**
     * Sets the value of the filter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilter(String value) {
        this.filter = value;
    }

    /**
     * Gets the value of the nameTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameTemplate() {
        return nameTemplate;
    }

    /**
     * Sets the value of the nameTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameTemplate(String value) {
        this.nameTemplate = value;
    }

    /**
     * Gets the value of the componentNameTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComponentNameTemplate() {
        return componentNameTemplate;
    }

    /**
     * Sets the value of the componentNameTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComponentNameTemplate(String value) {
        this.componentNameTemplate = value;
    }

    /**
     * Gets the value of the attribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAttribute() {
        if (attribute == null) {
            attribute = new ArrayList<String>();
        }
        return this.attribute;
    }

    /**
     * Gets the value of the ruleType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuleType() {
        return ruleType;
    }

    /**
     * Sets the value of the ruleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuleType(String value) {
        this.ruleType = value;
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
     * Sets the value of the attribute property.
     * 
     * @param attribute
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttribute(List<String> attribute) {
        this.attribute = attribute;
    }

    public IssueCorrelationRule withStrategyDisplayName(LocalizedString value) {
        setStrategyDisplayName(value);
        return this;
    }

    public IssueCorrelationRule withGuid(String value) {
        setGuid(value);
        return this;
    }

    public IssueCorrelationRule withFilter(String value) {
        setFilter(value);
        return this;
    }

    public IssueCorrelationRule withNameTemplate(String value) {
        setNameTemplate(value);
        return this;
    }

    public IssueCorrelationRule withComponentNameTemplate(String value) {
        setComponentNameTemplate(value);
        return this;
    }

    public IssueCorrelationRule withAttribute(String... values) {
        if (values!= null) {
            for (String value: values) {
                getAttribute().add(value);
            }
        }
        return this;
    }

    public IssueCorrelationRule withAttribute(Collection<String> values) {
        if (values!= null) {
            getAttribute().addAll(values);
        }
        return this;
    }

    public IssueCorrelationRule withRuleType(String value) {
        setRuleType(value);
        return this;
    }

    public IssueCorrelationRule withAttribute(List<String> attribute) {
        setAttribute(attribute);
        return this;
    }

    @Override
    public IssueCorrelationRule withPublishVersion(int value) {
        setPublishVersion(value);
        return this;
    }

    @Override
    public IssueCorrelationRule withObjectVersion(int value) {
        setObjectVersion(value);
        return this;
    }

}

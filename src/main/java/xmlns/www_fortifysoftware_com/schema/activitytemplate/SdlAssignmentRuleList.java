
package xmlns.www_fortifysoftware_com.schema.activitytemplate;

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
import xmlns.www_fortifysoftware_com.schema.wstypes.TemplateAssignmentRule;


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
 *         &lt;element name="TemplateAssignmentRule" type="{xmlns://www.fortifysoftware.com/schema/wsTypes}TemplateAssignmentRule" maxOccurs="unbounded"/>
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
    "templateAssignmentRule"
})
@XmlRootElement(name = "SDLAssignmentRuleList")
public class SdlAssignmentRuleList {

    @XmlElement(name = "TemplateAssignmentRule", required = true)
    protected List<TemplateAssignmentRule> templateAssignmentRule;

    /**
     * Default no-arg constructor
     * 
     */
    public SdlAssignmentRuleList() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public SdlAssignmentRuleList(final List<TemplateAssignmentRule> templateAssignmentRule) {
        this.templateAssignmentRule = templateAssignmentRule;
    }

    /**
     * Gets the value of the templateAssignmentRule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the templateAssignmentRule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTemplateAssignmentRule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TemplateAssignmentRule }
     * 
     * 
     */
    public List<TemplateAssignmentRule> getTemplateAssignmentRule() {
        if (templateAssignmentRule == null) {
            templateAssignmentRule = new ArrayList<TemplateAssignmentRule>();
        }
        return this.templateAssignmentRule;
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
     * Sets the value of the templateAssignmentRule property.
     * 
     * @param templateAssignmentRule
     *     allowed object is
     *     {@link TemplateAssignmentRule }
     *     
     */
    public void setTemplateAssignmentRule(List<TemplateAssignmentRule> templateAssignmentRule) {
        this.templateAssignmentRule = templateAssignmentRule;
    }

    public SdlAssignmentRuleList withTemplateAssignmentRule(TemplateAssignmentRule... values) {
        if (values!= null) {
            for (TemplateAssignmentRule value: values) {
                getTemplateAssignmentRule().add(value);
            }
        }
        return this;
    }

    public SdlAssignmentRuleList withTemplateAssignmentRule(Collection<TemplateAssignmentRule> values) {
        if (values!= null) {
            getTemplateAssignmentRule().addAll(values);
        }
        return this;
    }

    public SdlAssignmentRuleList withTemplateAssignmentRule(List<TemplateAssignmentRule> templateAssignmentRule) {
        setTemplateAssignmentRule(templateAssignmentRule);
        return this;
    }

}

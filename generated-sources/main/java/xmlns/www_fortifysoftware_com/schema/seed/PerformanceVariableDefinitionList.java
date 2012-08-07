
package xmlns.www_fortifysoftware_com.schema.seed;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import xmlns.www_fortifysoftware_com.schema.activitytemplate.EquationVariable;
import xmlns.www_fortifysoftware_com.schema.activitytemplate.PerformanceIndicator;


/**
 * <p>Java class for PerformanceVariableDefinitionList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PerformanceVariableDefinitionList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PerformanceIndicator" type="{xmlns://www.fortifysoftware.com/schema/activitytemplate}PerformanceIndicator" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SimpleVariable" type="{xmlns://www.fortifysoftware.com/schema/activitytemplate}EquationVariable" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PerformanceVariableDefinitionList", propOrder = {
    "performanceIndicator",
    "simpleVariable"
})
public class PerformanceVariableDefinitionList {

    @XmlElement(name = "PerformanceIndicator")
    protected List<PerformanceIndicator> performanceIndicator;
    @XmlElement(name = "SimpleVariable")
    protected List<EquationVariable> simpleVariable;

    /**
     * Default no-arg constructor
     * 
     */
    public PerformanceVariableDefinitionList() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public PerformanceVariableDefinitionList(final List<PerformanceIndicator> performanceIndicator, final List<EquationVariable> simpleVariable) {
        this.performanceIndicator = performanceIndicator;
        this.simpleVariable = simpleVariable;
    }

    /**
     * Gets the value of the performanceIndicator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the performanceIndicator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPerformanceIndicator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PerformanceIndicator }
     * 
     * 
     */
    public List<PerformanceIndicator> getPerformanceIndicator() {
        if (performanceIndicator == null) {
            performanceIndicator = new ArrayList<PerformanceIndicator>();
        }
        return this.performanceIndicator;
    }

    /**
     * Gets the value of the simpleVariable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the simpleVariable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSimpleVariable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EquationVariable }
     * 
     * 
     */
    public List<EquationVariable> getSimpleVariable() {
        if (simpleVariable == null) {
            simpleVariable = new ArrayList<EquationVariable>();
        }
        return this.simpleVariable;
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
     * Sets the value of the performanceIndicator property.
     * 
     * @param performanceIndicator
     *     allowed object is
     *     {@link PerformanceIndicator }
     *     
     */
    public void setPerformanceIndicator(List<PerformanceIndicator> performanceIndicator) {
        this.performanceIndicator = performanceIndicator;
    }

    /**
     * Sets the value of the simpleVariable property.
     * 
     * @param simpleVariable
     *     allowed object is
     *     {@link EquationVariable }
     *     
     */
    public void setSimpleVariable(List<EquationVariable> simpleVariable) {
        this.simpleVariable = simpleVariable;
    }

    public PerformanceVariableDefinitionList withPerformanceIndicator(PerformanceIndicator... values) {
        if (values!= null) {
            for (PerformanceIndicator value: values) {
                getPerformanceIndicator().add(value);
            }
        }
        return this;
    }

    public PerformanceVariableDefinitionList withPerformanceIndicator(Collection<PerformanceIndicator> values) {
        if (values!= null) {
            getPerformanceIndicator().addAll(values);
        }
        return this;
    }

    public PerformanceVariableDefinitionList withSimpleVariable(EquationVariable... values) {
        if (values!= null) {
            for (EquationVariable value: values) {
                getSimpleVariable().add(value);
            }
        }
        return this;
    }

    public PerformanceVariableDefinitionList withSimpleVariable(Collection<EquationVariable> values) {
        if (values!= null) {
            getSimpleVariable().addAll(values);
        }
        return this;
    }

    public PerformanceVariableDefinitionList withPerformanceIndicator(List<PerformanceIndicator> performanceIndicator) {
        setPerformanceIndicator(performanceIndicator);
        return this;
    }

    public PerformanceVariableDefinitionList withSimpleVariable(List<EquationVariable> simpleVariable) {
        setSimpleVariable(simpleVariable);
        return this;
    }

}

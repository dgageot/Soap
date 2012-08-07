
package xmlns.www_fortifysoftware_com.schema.activitytemplate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import xmlns.www_fortifysoftware_com.schema.enumconstants.ComparisonType;


/**
 * <p>Java class for ProjectState complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProjectState">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PerformanceIndicatorId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ComparisonType" type="{xmlns://www.fortifysoftware.com/schema/enumConstants}ComparisonType"/>
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProjectState", propOrder = {
    "performanceIndicatorId",
    "comparisonType",
    "value"
})
public class ProjectState {

    @XmlElement(name = "PerformanceIndicatorId", required = true)
    protected String performanceIndicatorId;
    @XmlElement(name = "ComparisonType", required = true)
    protected ComparisonType comparisonType;
    @XmlElement(name = "Value")
    protected float value;

    /**
     * Default no-arg constructor
     * 
     */
    public ProjectState() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ProjectState(final String performanceIndicatorId, final ComparisonType comparisonType, final float value) {
        this.performanceIndicatorId = performanceIndicatorId;
        this.comparisonType = comparisonType;
        this.value = value;
    }

    /**
     * Gets the value of the performanceIndicatorId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerformanceIndicatorId() {
        return performanceIndicatorId;
    }

    /**
     * Sets the value of the performanceIndicatorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerformanceIndicatorId(String value) {
        this.performanceIndicatorId = value;
    }

    /**
     * Gets the value of the comparisonType property.
     * 
     * @return
     *     possible object is
     *     {@link ComparisonType }
     *     
     */
    public ComparisonType getComparisonType() {
        return comparisonType;
    }

    /**
     * Sets the value of the comparisonType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComparisonType }
     *     
     */
    public void setComparisonType(ComparisonType value) {
        this.comparisonType = value;
    }

    /**
     * Gets the value of the value property.
     * 
     */
    public float getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     */
    public void setValue(float value) {
        this.value = value;
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

    public ProjectState withPerformanceIndicatorId(String value) {
        setPerformanceIndicatorId(value);
        return this;
    }

    public ProjectState withComparisonType(ComparisonType value) {
        setComparisonType(value);
        return this;
    }

    public ProjectState withValue(float value) {
        setValue(value);
        return this;
    }

}


package xmlns.www_fortifysoftware_com.schema.wstypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;


/**
 * <p>Java class for GroupingCondition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GroupingCondition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="xAxisSearchConstant" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="yAxisSearchConstant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="seriesAxisSearchConstant" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *       &lt;attribute name="count" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupingCondition", propOrder = {
    "xAxisSearchConstant",
    "yAxisSearchConstant",
    "seriesAxisSearchConstant"
})
public class GroupingCondition {

    @XmlElement(required = true)
    protected String xAxisSearchConstant;
    protected String yAxisSearchConstant;
    @XmlElement(required = true)
    protected String seriesAxisSearchConstant;
    @XmlAttribute
    protected Boolean count;

    /**
     * Default no-arg constructor
     * 
     */
    public GroupingCondition() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public GroupingCondition(final String xAxisSearchConstant, final String yAxisSearchConstant, final String seriesAxisSearchConstant, final Boolean count) {
        this.xAxisSearchConstant = xAxisSearchConstant;
        this.yAxisSearchConstant = yAxisSearchConstant;
        this.seriesAxisSearchConstant = seriesAxisSearchConstant;
        this.count = count;
    }

    /**
     * Gets the value of the xAxisSearchConstant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXAxisSearchConstant() {
        return xAxisSearchConstant;
    }

    /**
     * Sets the value of the xAxisSearchConstant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXAxisSearchConstant(String value) {
        this.xAxisSearchConstant = value;
    }

    /**
     * Gets the value of the yAxisSearchConstant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYAxisSearchConstant() {
        return yAxisSearchConstant;
    }

    /**
     * Sets the value of the yAxisSearchConstant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYAxisSearchConstant(String value) {
        this.yAxisSearchConstant = value;
    }

    /**
     * Gets the value of the seriesAxisSearchConstant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeriesAxisSearchConstant() {
        return seriesAxisSearchConstant;
    }

    /**
     * Sets the value of the seriesAxisSearchConstant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeriesAxisSearchConstant(String value) {
        this.seriesAxisSearchConstant = value;
    }

    /**
     * Gets the value of the count property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCount(Boolean value) {
        this.count = value;
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

    public GroupingCondition withXAxisSearchConstant(String value) {
        setXAxisSearchConstant(value);
        return this;
    }

    public GroupingCondition withYAxisSearchConstant(String value) {
        setYAxisSearchConstant(value);
        return this;
    }

    public GroupingCondition withSeriesAxisSearchConstant(String value) {
        setSeriesAxisSearchConstant(value);
        return this;
    }

    public GroupingCondition withCount(Boolean value) {
        setCount(value);
        return this;
    }

}

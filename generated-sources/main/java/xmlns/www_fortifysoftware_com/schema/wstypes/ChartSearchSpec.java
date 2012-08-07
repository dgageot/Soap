
package xmlns.www_fortifysoftware_com.schema.wstypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *     &lt;extension base="{xmlns://www.fortifysoftware.com/schema/wsTypes}SearchSpecBase">
 *       &lt;sequence>
 *         &lt;element name="GroupingCondition" type="{xmlns://www.fortifysoftware.com/schema/wsTypes}GroupingCondition"/>
 *         &lt;element name="DateSpecificity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SliceCountMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OtherAttributes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="maxSlices" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "groupingCondition",
    "dateSpecificity",
    "sliceCountMethod",
    "otherAttributes"
})
@XmlRootElement(name = "ChartSearchSpec")
public class ChartSearchSpec
    extends SearchSpecBase
{

    @XmlElement(name = "GroupingCondition", required = true)
    protected GroupingCondition groupingCondition;
    @XmlElement(name = "DateSpecificity")
    protected String dateSpecificity;
    @XmlElement(name = "SliceCountMethod")
    protected String sliceCountMethod;
    @XmlElement(name = "OtherAttributes")
    protected String otherAttributes;
    @XmlAttribute
    protected Integer maxSlices;

    /**
     * Default no-arg constructor
     * 
     */
    public ChartSearchSpec() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ChartSearchSpec(final FilterCondition searchCondition, final OrderCondition orderCondition, final Integer startIndex, final Integer pageSize, final GroupingCondition groupingCondition, final String dateSpecificity, final String sliceCountMethod, final String otherAttributes, final Integer maxSlices) {
        super(searchCondition, orderCondition, startIndex, pageSize);
        this.groupingCondition = groupingCondition;
        this.dateSpecificity = dateSpecificity;
        this.sliceCountMethod = sliceCountMethod;
        this.otherAttributes = otherAttributes;
        this.maxSlices = maxSlices;
    }

    /**
     * Gets the value of the groupingCondition property.
     * 
     * @return
     *     possible object is
     *     {@link GroupingCondition }
     *     
     */
    public GroupingCondition getGroupingCondition() {
        return groupingCondition;
    }

    /**
     * Sets the value of the groupingCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupingCondition }
     *     
     */
    public void setGroupingCondition(GroupingCondition value) {
        this.groupingCondition = value;
    }

    /**
     * Gets the value of the dateSpecificity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateSpecificity() {
        return dateSpecificity;
    }

    /**
     * Sets the value of the dateSpecificity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateSpecificity(String value) {
        this.dateSpecificity = value;
    }

    /**
     * Gets the value of the sliceCountMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSliceCountMethod() {
        return sliceCountMethod;
    }

    /**
     * Sets the value of the sliceCountMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSliceCountMethod(String value) {
        this.sliceCountMethod = value;
    }

    /**
     * Gets the value of the otherAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherAttributes() {
        return otherAttributes;
    }

    /**
     * Sets the value of the otherAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherAttributes(String value) {
        this.otherAttributes = value;
    }

    /**
     * Gets the value of the maxSlices property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxSlices() {
        return maxSlices;
    }

    /**
     * Sets the value of the maxSlices property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxSlices(Integer value) {
        this.maxSlices = value;
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

    public ChartSearchSpec withGroupingCondition(GroupingCondition value) {
        setGroupingCondition(value);
        return this;
    }

    public ChartSearchSpec withDateSpecificity(String value) {
        setDateSpecificity(value);
        return this;
    }

    public ChartSearchSpec withSliceCountMethod(String value) {
        setSliceCountMethod(value);
        return this;
    }

    public ChartSearchSpec withOtherAttributes(String value) {
        setOtherAttributes(value);
        return this;
    }

    public ChartSearchSpec withMaxSlices(Integer value) {
        setMaxSlices(value);
        return this;
    }

    @Override
    public ChartSearchSpec withSearchCondition(FilterCondition value) {
        setSearchCondition(value);
        return this;
    }

    @Override
    public ChartSearchSpec withOrderCondition(OrderCondition value) {
        setOrderCondition(value);
        return this;
    }

    @Override
    public ChartSearchSpec withStartIndex(Integer value) {
        setStartIndex(value);
        return this;
    }

    @Override
    public ChartSearchSpec withPageSize(Integer value) {
        setPageSize(value);
        return this;
    }

}


package xmlns.www_fortifysoftware_com.schema.wstypes;

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
 * <p>Java class for SearchSpecBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchSpecBase">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SearchCondition" type="{xmlns://www.fortifysoftware.com/schema/wsTypes}FilterCondition" minOccurs="0"/>
 *         &lt;element name="OrderCondition" type="{xmlns://www.fortifysoftware.com/schema/wsTypes}OrderCondition" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="startIndex" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="pageSize" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchSpecBase", propOrder = {
    "searchCondition",
    "orderCondition"
})
@XmlSeeAlso({
    ChartSearchSpec.class,
    SearchSpec.class
})
public class SearchSpecBase {

    @XmlElement(name = "SearchCondition")
    protected FilterCondition searchCondition;
    @XmlElement(name = "OrderCondition")
    protected OrderCondition orderCondition;
    @XmlAttribute
    protected Integer startIndex;
    @XmlAttribute
    protected Integer pageSize;

    /**
     * Default no-arg constructor
     * 
     */
    public SearchSpecBase() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public SearchSpecBase(final FilterCondition searchCondition, final OrderCondition orderCondition, final Integer startIndex, final Integer pageSize) {
        this.searchCondition = searchCondition;
        this.orderCondition = orderCondition;
        this.startIndex = startIndex;
        this.pageSize = pageSize;
    }

    /**
     * Gets the value of the searchCondition property.
     * 
     * @return
     *     possible object is
     *     {@link FilterCondition }
     *     
     */
    public FilterCondition getSearchCondition() {
        return searchCondition;
    }

    /**
     * Sets the value of the searchCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterCondition }
     *     
     */
    public void setSearchCondition(FilterCondition value) {
        this.searchCondition = value;
    }

    /**
     * Gets the value of the orderCondition property.
     * 
     * @return
     *     possible object is
     *     {@link OrderCondition }
     *     
     */
    public OrderCondition getOrderCondition() {
        return orderCondition;
    }

    /**
     * Sets the value of the orderCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderCondition }
     *     
     */
    public void setOrderCondition(OrderCondition value) {
        this.orderCondition = value;
    }

    /**
     * Gets the value of the startIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStartIndex() {
        return startIndex;
    }

    /**
     * Sets the value of the startIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStartIndex(Integer value) {
        this.startIndex = value;
    }

    /**
     * Gets the value of the pageSize property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * Sets the value of the pageSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPageSize(Integer value) {
        this.pageSize = value;
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

    public SearchSpecBase withSearchCondition(FilterCondition value) {
        setSearchCondition(value);
        return this;
    }

    public SearchSpecBase withOrderCondition(OrderCondition value) {
        setOrderCondition(value);
        return this;
    }

    public SearchSpecBase withStartIndex(Integer value) {
        setStartIndex(value);
        return this;
    }

    public SearchSpecBase withPageSize(Integer value) {
        setPageSize(value);
        return this;
    }

}

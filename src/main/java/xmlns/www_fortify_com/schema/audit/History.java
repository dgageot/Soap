
package xmlns.www_fortify_com.schema.audit;

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


/**
 * <p>Java class for History complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="History">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{xmlns://www.fortify.com/schema/audit}TagHistory" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "History", propOrder = {
    "tagHistory"
})
public class History {

    @XmlElement(name = "TagHistory")
    protected List<TagHistory> tagHistory;

    /**
     * Default no-arg constructor
     * 
     */
    public History() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public History(final List<TagHistory> tagHistory) {
        this.tagHistory = tagHistory;
    }

    /**
     * Gets the value of the tagHistory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tagHistory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTagHistory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TagHistory }
     * 
     * 
     */
    public List<TagHistory> getTagHistory() {
        if (tagHistory == null) {
            tagHistory = new ArrayList<TagHistory>();
        }
        return this.tagHistory;
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
     * Sets the value of the tagHistory property.
     * 
     * @param tagHistory
     *     allowed object is
     *     {@link TagHistory }
     *     
     */
    public void setTagHistory(List<TagHistory> tagHistory) {
        this.tagHistory = tagHistory;
    }

    public History withTagHistory(TagHistory... values) {
        if (values!= null) {
            for (TagHistory value: values) {
                getTagHistory().add(value);
            }
        }
        return this;
    }

    public History withTagHistory(Collection<TagHistory> values) {
        if (values!= null) {
            getTagHistory().addAll(values);
        }
        return this;
    }

    public History withTagHistory(List<TagHistory> tagHistory) {
        setTagHistory(tagHistory);
        return this;
    }

}

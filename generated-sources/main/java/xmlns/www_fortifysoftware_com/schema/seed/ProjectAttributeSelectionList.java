
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
import xmlns.www_fortifysoftware_com.schema.wstypes.MetaDataSelectedValue;


/**
 * <p>Java class for ProjectAttributeSelectionList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProjectAttributeSelectionList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProjectAttributeSelection" type="{xmlns://www.fortifysoftware.com/schema/wsTypes}MetaDataSelectedValue" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProjectAttributeSelectionList", propOrder = {
    "projectAttributeSelection"
})
public class ProjectAttributeSelectionList {

    @XmlElement(name = "ProjectAttributeSelection")
    protected List<MetaDataSelectedValue> projectAttributeSelection;

    /**
     * Default no-arg constructor
     * 
     */
    public ProjectAttributeSelectionList() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ProjectAttributeSelectionList(final List<MetaDataSelectedValue> projectAttributeSelection) {
        this.projectAttributeSelection = projectAttributeSelection;
    }

    /**
     * Gets the value of the projectAttributeSelection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the projectAttributeSelection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProjectAttributeSelection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MetaDataSelectedValue }
     * 
     * 
     */
    public List<MetaDataSelectedValue> getProjectAttributeSelection() {
        if (projectAttributeSelection == null) {
            projectAttributeSelection = new ArrayList<MetaDataSelectedValue>();
        }
        return this.projectAttributeSelection;
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
     * Sets the value of the projectAttributeSelection property.
     * 
     * @param projectAttributeSelection
     *     allowed object is
     *     {@link MetaDataSelectedValue }
     *     
     */
    public void setProjectAttributeSelection(List<MetaDataSelectedValue> projectAttributeSelection) {
        this.projectAttributeSelection = projectAttributeSelection;
    }

    public ProjectAttributeSelectionList withProjectAttributeSelection(MetaDataSelectedValue... values) {
        if (values!= null) {
            for (MetaDataSelectedValue value: values) {
                getProjectAttributeSelection().add(value);
            }
        }
        return this;
    }

    public ProjectAttributeSelectionList withProjectAttributeSelection(Collection<MetaDataSelectedValue> values) {
        if (values!= null) {
            getProjectAttributeSelection().addAll(values);
        }
        return this;
    }

    public ProjectAttributeSelectionList withProjectAttributeSelection(List<MetaDataSelectedValue> projectAttributeSelection) {
        setProjectAttributeSelection(projectAttributeSelection);
        return this;
    }

}

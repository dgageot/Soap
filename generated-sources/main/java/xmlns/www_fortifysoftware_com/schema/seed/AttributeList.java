
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
import xmlns.www_fortifysoftware_com.schema.wstypes.MetaDataDefinition;


/**
 * <p>Java class for AttributeList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AttributeList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProjectMetaDataDefinition" type="{xmlns://www.fortifysoftware.com/schema/wsTypes}MetaDataDefinition" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttributeList", propOrder = {
    "projectMetaDataDefinition"
})
public class AttributeList {

    @XmlElement(name = "ProjectMetaDataDefinition")
    protected List<MetaDataDefinition> projectMetaDataDefinition;

    /**
     * Default no-arg constructor
     * 
     */
    public AttributeList() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public AttributeList(final List<MetaDataDefinition> projectMetaDataDefinition) {
        this.projectMetaDataDefinition = projectMetaDataDefinition;
    }

    /**
     * Gets the value of the projectMetaDataDefinition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the projectMetaDataDefinition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProjectMetaDataDefinition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MetaDataDefinition }
     * 
     * 
     */
    public List<MetaDataDefinition> getProjectMetaDataDefinition() {
        if (projectMetaDataDefinition == null) {
            projectMetaDataDefinition = new ArrayList<MetaDataDefinition>();
        }
        return this.projectMetaDataDefinition;
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
     * Sets the value of the projectMetaDataDefinition property.
     * 
     * @param projectMetaDataDefinition
     *     allowed object is
     *     {@link MetaDataDefinition }
     *     
     */
    public void setProjectMetaDataDefinition(List<MetaDataDefinition> projectMetaDataDefinition) {
        this.projectMetaDataDefinition = projectMetaDataDefinition;
    }

    public AttributeList withProjectMetaDataDefinition(MetaDataDefinition... values) {
        if (values!= null) {
            for (MetaDataDefinition value: values) {
                getProjectMetaDataDefinition().add(value);
            }
        }
        return this;
    }

    public AttributeList withProjectMetaDataDefinition(Collection<MetaDataDefinition> values) {
        if (values!= null) {
            getProjectMetaDataDefinition().addAll(values);
        }
        return this;
    }

    public AttributeList withProjectMetaDataDefinition(List<MetaDataDefinition> projectMetaDataDefinition) {
        setProjectMetaDataDefinition(projectMetaDataDefinition);
        return this;
    }

}

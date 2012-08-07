
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


/**
 * <p>Java class for ProjectVersionsList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProjectVersionsList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccessSet" type="{xmlns://www.fortifysoftware.com/schema/seed}AccessSet" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProjectVersionsList", propOrder = {
    "accessSet"
})
public class ProjectVersionsList {

    @XmlElement(name = "AccessSet")
    protected List<AccessSet> accessSet;

    /**
     * Default no-arg constructor
     * 
     */
    public ProjectVersionsList() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ProjectVersionsList(final List<AccessSet> accessSet) {
        this.accessSet = accessSet;
    }

    /**
     * Gets the value of the accessSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accessSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccessSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccessSet }
     * 
     * 
     */
    public List<AccessSet> getAccessSet() {
        if (accessSet == null) {
            accessSet = new ArrayList<AccessSet>();
        }
        return this.accessSet;
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
     * Sets the value of the accessSet property.
     * 
     * @param accessSet
     *     allowed object is
     *     {@link AccessSet }
     *     
     */
    public void setAccessSet(List<AccessSet> accessSet) {
        this.accessSet = accessSet;
    }

    public ProjectVersionsList withAccessSet(AccessSet... values) {
        if (values!= null) {
            for (AccessSet value: values) {
                getAccessSet().add(value);
            }
        }
        return this;
    }

    public ProjectVersionsList withAccessSet(Collection<AccessSet> values) {
        if (values!= null) {
            getAccessSet().addAll(values);
        }
        return this;
    }

    public ProjectVersionsList withAccessSet(List<AccessSet> accessSet) {
        setAccessSet(accessSet);
        return this;
    }

}

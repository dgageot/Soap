
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
 *         &lt;element name="Activity" type="{xmlns://www.fortifysoftware.com/schema/activitytemplate}Activity" maxOccurs="unbounded" minOccurs="0"/>
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
    "activity"
})
@XmlRootElement(name = "ActivityDefinition")
public class ActivityDefinition {

    @XmlElement(name = "Activity")
    protected List<Activity> activity;

    /**
     * Default no-arg constructor
     * 
     */
    public ActivityDefinition() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ActivityDefinition(final List<Activity> activity) {
        this.activity = activity;
    }

    /**
     * Gets the value of the activity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the activity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActivity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Activity }
     * 
     * 
     */
    public List<Activity> getActivity() {
        if (activity == null) {
            activity = new ArrayList<Activity>();
        }
        return this.activity;
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
     * Sets the value of the activity property.
     * 
     * @param activity
     *     allowed object is
     *     {@link Activity }
     *     
     */
    public void setActivity(List<Activity> activity) {
        this.activity = activity;
    }

    public ActivityDefinition withActivity(Activity... values) {
        if (values!= null) {
            for (Activity value: values) {
                getActivity().add(value);
            }
        }
        return this;
    }

    public ActivityDefinition withActivity(Collection<Activity> values) {
        if (values!= null) {
            getActivity().addAll(values);
        }
        return this;
    }

    public ActivityDefinition withActivity(List<Activity> activity) {
        setActivity(activity);
        return this;
    }

}


package xmlns.www_fortifysoftware_com.schema.wstypes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.fortify.schema.fws.AddRuntimeApplicationRequest;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import xmlns.www_fortifysoftware_com.schema.runtime.RuntimeApplication;


/**
 * <p>Java class for RuntimeApplicationSpecification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RuntimeApplicationSpecification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RuntimeApplication" type="{xmlns://www.fortifysoftware.com/schema/runtime}RuntimeApplication"/>
 *         &lt;element name="ProjectMetaDataSelectedValues" type="{xmlns://www.fortifysoftware.com/schema/wsTypes}MetaDataSelectedValue" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RuntimeApplicationSpecification", propOrder = {
    "runtimeApplication",
    "projectMetaDataSelectedValues"
})
@XmlSeeAlso({
    AddRuntimeApplicationRequest.class
})
public class RuntimeApplicationSpecification {

    @XmlElement(name = "RuntimeApplication", required = true)
    protected RuntimeApplication runtimeApplication;
    @XmlElement(name = "ProjectMetaDataSelectedValues")
    protected List<MetaDataSelectedValue> projectMetaDataSelectedValues;

    /**
     * Default no-arg constructor
     * 
     */
    public RuntimeApplicationSpecification() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public RuntimeApplicationSpecification(final RuntimeApplication runtimeApplication, final List<MetaDataSelectedValue> projectMetaDataSelectedValues) {
        this.runtimeApplication = runtimeApplication;
        this.projectMetaDataSelectedValues = projectMetaDataSelectedValues;
    }

    /**
     * Gets the value of the runtimeApplication property.
     * 
     * @return
     *     possible object is
     *     {@link RuntimeApplication }
     *     
     */
    public RuntimeApplication getRuntimeApplication() {
        return runtimeApplication;
    }

    /**
     * Sets the value of the runtimeApplication property.
     * 
     * @param value
     *     allowed object is
     *     {@link RuntimeApplication }
     *     
     */
    public void setRuntimeApplication(RuntimeApplication value) {
        this.runtimeApplication = value;
    }

    /**
     * Gets the value of the projectMetaDataSelectedValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the projectMetaDataSelectedValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProjectMetaDataSelectedValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MetaDataSelectedValue }
     * 
     * 
     */
    public List<MetaDataSelectedValue> getProjectMetaDataSelectedValues() {
        if (projectMetaDataSelectedValues == null) {
            projectMetaDataSelectedValues = new ArrayList<MetaDataSelectedValue>();
        }
        return this.projectMetaDataSelectedValues;
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
     * Sets the value of the projectMetaDataSelectedValues property.
     * 
     * @param projectMetaDataSelectedValues
     *     allowed object is
     *     {@link MetaDataSelectedValue }
     *     
     */
    public void setProjectMetaDataSelectedValues(List<MetaDataSelectedValue> projectMetaDataSelectedValues) {
        this.projectMetaDataSelectedValues = projectMetaDataSelectedValues;
    }

    public RuntimeApplicationSpecification withRuntimeApplication(RuntimeApplication value) {
        setRuntimeApplication(value);
        return this;
    }

    public RuntimeApplicationSpecification withProjectMetaDataSelectedValues(MetaDataSelectedValue... values) {
        if (values!= null) {
            for (MetaDataSelectedValue value: values) {
                getProjectMetaDataSelectedValues().add(value);
            }
        }
        return this;
    }

    public RuntimeApplicationSpecification withProjectMetaDataSelectedValues(Collection<MetaDataSelectedValue> values) {
        if (values!= null) {
            getProjectMetaDataSelectedValues().addAll(values);
        }
        return this;
    }

    public RuntimeApplicationSpecification withProjectMetaDataSelectedValues(List<MetaDataSelectedValue> projectMetaDataSelectedValues) {
        setProjectMetaDataSelectedValues(projectMetaDataSelectedValues);
        return this;
    }

}

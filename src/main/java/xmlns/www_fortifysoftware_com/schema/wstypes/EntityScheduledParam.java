
package xmlns.www_fortifysoftware_com.schema.wstypes;

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
import xmlns.www_fortifysoftware_com.schema.enumconstants.ReportParamType;


/**
 * <p>Java class for EntityScheduledParam complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityScheduledParam">
 *   &lt;complexContent>
 *     &lt;extension base="{xmlns://www.fortifysoftware.com/schema/wsTypes}ScheduledReportParameter">
 *       &lt;sequence>
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityScheduledParam", propOrder = {
    "value"
})
public class EntityScheduledParam
    extends ScheduledReportParameter
{

    @XmlElement(name = "Value", type = Long.class)
    protected List<Long> value;

    /**
     * Default no-arg constructor
     * 
     */
    public EntityScheduledParam() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public EntityScheduledParam(final ReportParamType reportParamType, final String name, final String identifier, final List<Long> value) {
        super(reportParamType, name, identifier);
        this.value = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the value property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getValue() {
        if (value == null) {
            value = new ArrayList<Long>();
        }
        return this.value;
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
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setValue(List<Long> value) {
        this.value = value;
    }

    public EntityScheduledParam withValue(Long... values) {
        if (values!= null) {
            for (Long value: values) {
                getValue().add(value);
            }
        }
        return this;
    }

    public EntityScheduledParam withValue(Collection<Long> values) {
        if (values!= null) {
            getValue().addAll(values);
        }
        return this;
    }

    public EntityScheduledParam withValue(List<Long> value) {
        setValue(value);
        return this;
    }

    @Override
    public EntityScheduledParam withReportParamType(ReportParamType value) {
        setReportParamType(value);
        return this;
    }

    @Override
    public EntityScheduledParam withName(String value) {
        setName(value);
        return this;
    }

    @Override
    public EntityScheduledParam withIdentifier(String value) {
        setIdentifier(value);
        return this;
    }

}

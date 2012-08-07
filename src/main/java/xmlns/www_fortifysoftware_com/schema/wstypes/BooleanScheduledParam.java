
package xmlns.www_fortifysoftware_com.schema.wstypes;

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
 * <p>Java class for BooleanScheduledParam complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BooleanScheduledParam">
 *   &lt;complexContent>
 *     &lt;extension base="{xmlns://www.fortifysoftware.com/schema/wsTypes}ScheduledReportParameter">
 *       &lt;sequence>
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BooleanScheduledParam", propOrder = {
    "value"
})
public class BooleanScheduledParam
    extends ScheduledReportParameter
{

    @XmlElement(name = "Value")
    protected boolean value;

    /**
     * Default no-arg constructor
     * 
     */
    public BooleanScheduledParam() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public BooleanScheduledParam(final ReportParamType reportParamType, final String name, final String identifier, final boolean value) {
        super(reportParamType, name, identifier);
        this.value = value;
    }

    /**
     * Gets the value of the value property.
     * 
     */
    public boolean isValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     */
    public void setValue(boolean value) {
        this.value = value;
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

    public BooleanScheduledParam withValue(boolean value) {
        setValue(value);
        return this;
    }

    @Override
    public BooleanScheduledParam withReportParamType(ReportParamType value) {
        setReportParamType(value);
        return this;
    }

    @Override
    public BooleanScheduledParam withName(String value) {
        setName(value);
        return this;
    }

    @Override
    public BooleanScheduledParam withIdentifier(String value) {
        setIdentifier(value);
        return this;
    }

}

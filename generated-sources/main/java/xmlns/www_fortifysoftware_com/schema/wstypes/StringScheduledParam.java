
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
 * <p>Java class for StringScheduledParam complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StringScheduledParam">
 *   &lt;complexContent>
 *     &lt;extension base="{xmlns://www.fortifysoftware.com/schema/wsTypes}ScheduledReportParameter">
 *       &lt;sequence>
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StringScheduledParam", propOrder = {
    "value"
})
public class StringScheduledParam
    extends ScheduledReportParameter
{

    @XmlElement(name = "Value", required = true)
    protected String value;

    /**
     * Default no-arg constructor
     * 
     */
    public StringScheduledParam() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public StringScheduledParam(final ReportParamType reportParamType, final String name, final String identifier, final String value) {
        super(reportParamType, name, identifier);
        this.value = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
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

    public StringScheduledParam withValue(String value) {
        setValue(value);
        return this;
    }

    @Override
    public StringScheduledParam withReportParamType(ReportParamType value) {
        setReportParamType(value);
        return this;
    }

    @Override
    public StringScheduledParam withName(String value) {
        setName(value);
        return this;
    }

    @Override
    public StringScheduledParam withIdentifier(String value) {
        setIdentifier(value);
        return this;
    }

}


package xmlns.www_fortifysoftware_com.schema.wstypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import xmlns.www_fortifysoftware_com.schema.enumconstants.ReportParamType;


/**
 * <p>Java class for ScheduledReportParameter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScheduledReportParameter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReportParamType" type="{xmlns://www.fortifysoftware.com/schema/enumConstants}ReportParamType"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScheduledReportParameter", propOrder = {
    "reportParamType",
    "name",
    "identifier"
})
@XmlSeeAlso({
    EntityScheduledParam.class,
    BooleanScheduledParam.class,
    DateScheduledParam.class,
    StringScheduledParam.class
})
public class ScheduledReportParameter {

    @XmlElement(name = "ReportParamType", required = true)
    protected ReportParamType reportParamType;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Identifier", required = true)
    protected String identifier;

    /**
     * Default no-arg constructor
     * 
     */
    public ScheduledReportParameter() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ScheduledReportParameter(final ReportParamType reportParamType, final String name, final String identifier) {
        this.reportParamType = reportParamType;
        this.name = name;
        this.identifier = identifier;
    }

    /**
     * Gets the value of the reportParamType property.
     * 
     * @return
     *     possible object is
     *     {@link ReportParamType }
     *     
     */
    public ReportParamType getReportParamType() {
        return reportParamType;
    }

    /**
     * Sets the value of the reportParamType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportParamType }
     *     
     */
    public void setReportParamType(ReportParamType value) {
        this.reportParamType = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifier(String value) {
        this.identifier = value;
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

    public ScheduledReportParameter withReportParamType(ReportParamType value) {
        setReportParamType(value);
        return this;
    }

    public ScheduledReportParameter withName(String value) {
        setName(value);
        return this;
    }

    public ScheduledReportParameter withIdentifier(String value) {
        setIdentifier(value);
        return this;
    }

}

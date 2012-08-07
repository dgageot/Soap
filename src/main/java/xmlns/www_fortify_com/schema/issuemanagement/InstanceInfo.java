
package xmlns.www_fortify_com.schema.issuemanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;


/**
 * <p>Java class for InstanceInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InstanceInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SinkFunction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SourceFunction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IssueLocation" type="{xmlns://www.fortify.com/schema/issuemanagement}IssueLocation"/>
 *       &lt;/sequence>
 *       &lt;attribute name="severity" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="confidence" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstanceInfo", propOrder = {
    "sinkFunction",
    "sourceFunction",
    "issueLocation"
})
public class InstanceInfo {

    @XmlElement(name = "SinkFunction")
    protected String sinkFunction;
    @XmlElement(name = "SourceFunction")
    protected String sourceFunction;
    @XmlElement(name = "IssueLocation", required = true)
    protected IssueLocation issueLocation;
    @XmlAttribute(required = true)
    protected double severity;
    @XmlAttribute(required = true)
    protected double confidence;

    /**
     * Default no-arg constructor
     * 
     */
    public InstanceInfo() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public InstanceInfo(final String sinkFunction, final String sourceFunction, final IssueLocation issueLocation, final double severity, final double confidence) {
        this.sinkFunction = sinkFunction;
        this.sourceFunction = sourceFunction;
        this.issueLocation = issueLocation;
        this.severity = severity;
        this.confidence = confidence;
    }

    /**
     * Gets the value of the sinkFunction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSinkFunction() {
        return sinkFunction;
    }

    /**
     * Sets the value of the sinkFunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSinkFunction(String value) {
        this.sinkFunction = value;
    }

    /**
     * Gets the value of the sourceFunction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceFunction() {
        return sourceFunction;
    }

    /**
     * Sets the value of the sourceFunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceFunction(String value) {
        this.sourceFunction = value;
    }

    /**
     * Gets the value of the issueLocation property.
     * 
     * @return
     *     possible object is
     *     {@link IssueLocation }
     *     
     */
    public IssueLocation getIssueLocation() {
        return issueLocation;
    }

    /**
     * Sets the value of the issueLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssueLocation }
     *     
     */
    public void setIssueLocation(IssueLocation value) {
        this.issueLocation = value;
    }

    /**
     * Gets the value of the severity property.
     * 
     */
    public double getSeverity() {
        return severity;
    }

    /**
     * Sets the value of the severity property.
     * 
     */
    public void setSeverity(double value) {
        this.severity = value;
    }

    /**
     * Gets the value of the confidence property.
     * 
     */
    public double getConfidence() {
        return confidence;
    }

    /**
     * Sets the value of the confidence property.
     * 
     */
    public void setConfidence(double value) {
        this.confidence = value;
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

    public InstanceInfo withSinkFunction(String value) {
        setSinkFunction(value);
        return this;
    }

    public InstanceInfo withSourceFunction(String value) {
        setSourceFunction(value);
        return this;
    }

    public InstanceInfo withIssueLocation(IssueLocation value) {
        setIssueLocation(value);
        return this;
    }

    public InstanceInfo withSeverity(double value) {
        setSeverity(value);
        return this;
    }

    public InstanceInfo withConfidence(double value) {
        setConfidence(value);
        return this;
    }

}

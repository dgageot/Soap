
package xmlns.www_fortifysoftware_com.schema.activitytemplate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import xmlns.www_fortifysoftware_com.schema.wstypes.PublishBase;


/**
 * <p>Java class for PerformanceIndicator complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PerformanceIndicator">
 *   &lt;complexContent>
 *     &lt;extension base="{xmlns://www.fortifysoftware.com/schema/wsTypes}PublishBase">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Equation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Range" use="required" type="{xmlns://www.fortifysoftware.com/schema/activitytemplate}MeasurementRange" />
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="locked" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PerformanceIndicator", propOrder = {
    "name",
    "description",
    "equation"
})
public class PerformanceIndicator
    extends PublishBase
{

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Equation", required = true)
    protected String equation;
    @XmlAttribute(name = "Range", required = true)
    protected MeasurementRange range;
    @XmlAttribute(required = true)
    protected String id;
    @XmlAttribute
    protected Boolean locked;

    /**
     * Default no-arg constructor
     * 
     */
    public PerformanceIndicator() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public PerformanceIndicator(final int publishVersion, final int objectVersion, final String name, final String description, final String equation, final MeasurementRange range, final String id, final Boolean locked) {
        super(publishVersion, objectVersion);
        this.name = name;
        this.description = description;
        this.equation = equation;
        this.range = range;
        this.id = id;
        this.locked = locked;
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
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the equation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquation() {
        return equation;
    }

    /**
     * Sets the value of the equation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquation(String value) {
        this.equation = value;
    }

    /**
     * Gets the value of the range property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementRange }
     *     
     */
    public MeasurementRange getRange() {
        return range;
    }

    /**
     * Sets the value of the range property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementRange }
     *     
     */
    public void setRange(MeasurementRange value) {
        this.range = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the locked property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocked() {
        return locked;
    }

    /**
     * Sets the value of the locked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocked(Boolean value) {
        this.locked = value;
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

    public PerformanceIndicator withName(String value) {
        setName(value);
        return this;
    }

    public PerformanceIndicator withDescription(String value) {
        setDescription(value);
        return this;
    }

    public PerformanceIndicator withEquation(String value) {
        setEquation(value);
        return this;
    }

    public PerformanceIndicator withRange(MeasurementRange value) {
        setRange(value);
        return this;
    }

    public PerformanceIndicator withId(String value) {
        setId(value);
        return this;
    }

    public PerformanceIndicator withLocked(Boolean value) {
        setLocked(value);
        return this;
    }

    @Override
    public PerformanceIndicator withPublishVersion(int value) {
        setPublishVersion(value);
        return this;
    }

    @Override
    public PerformanceIndicator withObjectVersion(int value) {
        setObjectVersion(value);
        return this;
    }

}

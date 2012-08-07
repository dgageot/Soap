
package xmlns.www_fortifysoftware_com.schema.wstypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;


/**
 * <p>Java class for MeasurementHistory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeasurementHistory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MeasurementHistoryId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="MeasurementId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="MeasurementGuid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MeasurementValue" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="Snapshot" type="{xmlns://www.fortifysoftware.com/schema/wsTypes}Snapshot"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeasurementHistory", propOrder = {
    "measurementHistoryId",
    "measurementId",
    "measurementGuid",
    "measurementValue",
    "snapshot"
})
public class MeasurementHistory {

    @XmlElement(name = "MeasurementHistoryId")
    protected long measurementHistoryId;
    @XmlElement(name = "MeasurementId")
    protected long measurementId;
    @XmlElement(name = "MeasurementGuid")
    protected String measurementGuid;
    @XmlElement(name = "MeasurementValue")
    protected float measurementValue;
    @XmlElement(name = "Snapshot", required = true)
    protected Snapshot snapshot;

    /**
     * Default no-arg constructor
     * 
     */
    public MeasurementHistory() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public MeasurementHistory(final long measurementHistoryId, final long measurementId, final String measurementGuid, final float measurementValue, final Snapshot snapshot) {
        this.measurementHistoryId = measurementHistoryId;
        this.measurementId = measurementId;
        this.measurementGuid = measurementGuid;
        this.measurementValue = measurementValue;
        this.snapshot = snapshot;
    }

    /**
     * Gets the value of the measurementHistoryId property.
     * 
     */
    public long getMeasurementHistoryId() {
        return measurementHistoryId;
    }

    /**
     * Sets the value of the measurementHistoryId property.
     * 
     */
    public void setMeasurementHistoryId(long value) {
        this.measurementHistoryId = value;
    }

    /**
     * Gets the value of the measurementId property.
     * 
     */
    public long getMeasurementId() {
        return measurementId;
    }

    /**
     * Sets the value of the measurementId property.
     * 
     */
    public void setMeasurementId(long value) {
        this.measurementId = value;
    }

    /**
     * Gets the value of the measurementGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasurementGuid() {
        return measurementGuid;
    }

    /**
     * Sets the value of the measurementGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasurementGuid(String value) {
        this.measurementGuid = value;
    }

    /**
     * Gets the value of the measurementValue property.
     * 
     */
    public float getMeasurementValue() {
        return measurementValue;
    }

    /**
     * Sets the value of the measurementValue property.
     * 
     */
    public void setMeasurementValue(float value) {
        this.measurementValue = value;
    }

    /**
     * Gets the value of the snapshot property.
     * 
     * @return
     *     possible object is
     *     {@link Snapshot }
     *     
     */
    public Snapshot getSnapshot() {
        return snapshot;
    }

    /**
     * Sets the value of the snapshot property.
     * 
     * @param value
     *     allowed object is
     *     {@link Snapshot }
     *     
     */
    public void setSnapshot(Snapshot value) {
        this.snapshot = value;
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

    public MeasurementHistory withMeasurementHistoryId(long value) {
        setMeasurementHistoryId(value);
        return this;
    }

    public MeasurementHistory withMeasurementId(long value) {
        setMeasurementId(value);
        return this;
    }

    public MeasurementHistory withMeasurementGuid(String value) {
        setMeasurementGuid(value);
        return this;
    }

    public MeasurementHistory withMeasurementValue(float value) {
        setMeasurementValue(value);
        return this;
    }

    public MeasurementHistory withSnapshot(Snapshot value) {
        setSnapshot(value);
        return this;
    }

}


package xmlns.www_fortifysoftware_com.schema.wstypes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;


/**
 * <p>Java class for Snapshot complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Snapshot">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="VariableEntry" type="{xmlns://www.fortifysoftware.com/schema/wsTypes}MeasurementEntry" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PerformanceIndicatorEntry" type="{xmlns://www.fortifysoftware.com/schema/wsTypes}MeasurementEntry" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ProjectVersionID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Snapshot", propOrder = {
    "date",
    "variableEntry",
    "performanceIndicatorEntry",
    "projectVersionId"
})
public class Snapshot {

    @XmlElement(name = "Date", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date;
    @XmlElement(name = "VariableEntry")
    protected List<MeasurementEntry> variableEntry;
    @XmlElement(name = "PerformanceIndicatorEntry")
    protected List<MeasurementEntry> performanceIndicatorEntry;
    @XmlElement(name = "ProjectVersionID")
    protected Long projectVersionId;

    /**
     * Default no-arg constructor
     * 
     */
    public Snapshot() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public Snapshot(final XMLGregorianCalendar date, final List<MeasurementEntry> variableEntry, final List<MeasurementEntry> performanceIndicatorEntry, final Long projectVersionId) {
        this.date = date;
        this.variableEntry = variableEntry;
        this.performanceIndicatorEntry = performanceIndicatorEntry;
        this.projectVersionId = projectVersionId;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Gets the value of the variableEntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the variableEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVariableEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementEntry }
     * 
     * 
     */
    public List<MeasurementEntry> getVariableEntry() {
        if (variableEntry == null) {
            variableEntry = new ArrayList<MeasurementEntry>();
        }
        return this.variableEntry;
    }

    /**
     * Gets the value of the performanceIndicatorEntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the performanceIndicatorEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPerformanceIndicatorEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementEntry }
     * 
     * 
     */
    public List<MeasurementEntry> getPerformanceIndicatorEntry() {
        if (performanceIndicatorEntry == null) {
            performanceIndicatorEntry = new ArrayList<MeasurementEntry>();
        }
        return this.performanceIndicatorEntry;
    }

    /**
     * Gets the value of the projectVersionId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProjectVersionId() {
        return projectVersionId;
    }

    /**
     * Sets the value of the projectVersionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProjectVersionId(Long value) {
        this.projectVersionId = value;
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
     * Sets the value of the variableEntry property.
     * 
     * @param variableEntry
     *     allowed object is
     *     {@link MeasurementEntry }
     *     
     */
    public void setVariableEntry(List<MeasurementEntry> variableEntry) {
        this.variableEntry = variableEntry;
    }

    /**
     * Sets the value of the performanceIndicatorEntry property.
     * 
     * @param performanceIndicatorEntry
     *     allowed object is
     *     {@link MeasurementEntry }
     *     
     */
    public void setPerformanceIndicatorEntry(List<MeasurementEntry> performanceIndicatorEntry) {
        this.performanceIndicatorEntry = performanceIndicatorEntry;
    }

    public Snapshot withDate(XMLGregorianCalendar value) {
        setDate(value);
        return this;
    }

    public Snapshot withVariableEntry(MeasurementEntry... values) {
        if (values!= null) {
            for (MeasurementEntry value: values) {
                getVariableEntry().add(value);
            }
        }
        return this;
    }

    public Snapshot withVariableEntry(Collection<MeasurementEntry> values) {
        if (values!= null) {
            getVariableEntry().addAll(values);
        }
        return this;
    }

    public Snapshot withPerformanceIndicatorEntry(MeasurementEntry... values) {
        if (values!= null) {
            for (MeasurementEntry value: values) {
                getPerformanceIndicatorEntry().add(value);
            }
        }
        return this;
    }

    public Snapshot withPerformanceIndicatorEntry(Collection<MeasurementEntry> values) {
        if (values!= null) {
            getPerformanceIndicatorEntry().addAll(values);
        }
        return this;
    }

    public Snapshot withProjectVersionId(Long value) {
        setProjectVersionId(value);
        return this;
    }

    public Snapshot withVariableEntry(List<MeasurementEntry> variableEntry) {
        setVariableEntry(variableEntry);
        return this;
    }

    public Snapshot withPerformanceIndicatorEntry(List<MeasurementEntry> performanceIndicatorEntry) {
        setPerformanceIndicatorEntry(performanceIndicatorEntry);
        return this;
    }

}


package xmlns.www_fortifysoftware_com.schema.seed;

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
import xmlns.www_fortifysoftware_com.schema.wstypes.ReportDefinition;


/**
 * <p>Java class for ReportDefinitionList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReportDefinitionList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReportDefinition" type="{xmlns://www.fortifysoftware.com/schema/wsTypes}ReportDefinition" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportDefinitionList", propOrder = {
    "reportDefinition"
})
public class ReportDefinitionList {

    @XmlElement(name = "ReportDefinition")
    protected List<ReportDefinition> reportDefinition;

    /**
     * Default no-arg constructor
     * 
     */
    public ReportDefinitionList() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ReportDefinitionList(final List<ReportDefinition> reportDefinition) {
        this.reportDefinition = reportDefinition;
    }

    /**
     * Gets the value of the reportDefinition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reportDefinition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReportDefinition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReportDefinition }
     * 
     * 
     */
    public List<ReportDefinition> getReportDefinition() {
        if (reportDefinition == null) {
            reportDefinition = new ArrayList<ReportDefinition>();
        }
        return this.reportDefinition;
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
     * Sets the value of the reportDefinition property.
     * 
     * @param reportDefinition
     *     allowed object is
     *     {@link ReportDefinition }
     *     
     */
    public void setReportDefinition(List<ReportDefinition> reportDefinition) {
        this.reportDefinition = reportDefinition;
    }

    public ReportDefinitionList withReportDefinition(ReportDefinition... values) {
        if (values!= null) {
            for (ReportDefinition value: values) {
                getReportDefinition().add(value);
            }
        }
        return this;
    }

    public ReportDefinitionList withReportDefinition(Collection<ReportDefinition> values) {
        if (values!= null) {
            getReportDefinition().addAll(values);
        }
        return this;
    }

    public ReportDefinitionList withReportDefinition(List<ReportDefinition> reportDefinition) {
        setReportDefinition(reportDefinition);
        return this;
    }

}

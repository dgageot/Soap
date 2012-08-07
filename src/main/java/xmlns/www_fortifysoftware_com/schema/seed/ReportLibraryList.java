
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
import xmlns.www_fortifysoftware_com.schema.wstypes.ReportLibrary;


/**
 * <p>Java class for ReportLibraryList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReportLibraryList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReportLibrary" type="{xmlns://www.fortifysoftware.com/schema/wsTypes}ReportLibrary" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportLibraryList", propOrder = {
    "reportLibrary"
})
public class ReportLibraryList {

    @XmlElement(name = "ReportLibrary")
    protected List<ReportLibrary> reportLibrary;

    /**
     * Default no-arg constructor
     * 
     */
    public ReportLibraryList() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ReportLibraryList(final List<ReportLibrary> reportLibrary) {
        this.reportLibrary = reportLibrary;
    }

    /**
     * Gets the value of the reportLibrary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reportLibrary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReportLibrary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReportLibrary }
     * 
     * 
     */
    public List<ReportLibrary> getReportLibrary() {
        if (reportLibrary == null) {
            reportLibrary = new ArrayList<ReportLibrary>();
        }
        return this.reportLibrary;
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
     * Sets the value of the reportLibrary property.
     * 
     * @param reportLibrary
     *     allowed object is
     *     {@link ReportLibrary }
     *     
     */
    public void setReportLibrary(List<ReportLibrary> reportLibrary) {
        this.reportLibrary = reportLibrary;
    }

    public ReportLibraryList withReportLibrary(ReportLibrary... values) {
        if (values!= null) {
            for (ReportLibrary value: values) {
                getReportLibrary().add(value);
            }
        }
        return this;
    }

    public ReportLibraryList withReportLibrary(Collection<ReportLibrary> values) {
        if (values!= null) {
            getReportLibrary().addAll(values);
        }
        return this;
    }

    public ReportLibraryList withReportLibrary(List<ReportLibrary> reportLibrary) {
        setReportLibrary(reportLibrary);
        return this;
    }

}

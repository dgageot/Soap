
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


/**
 * <p>Java class for PayloadMetaData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PayloadMetaData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TotalAnalysisFileCount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="TotalDependencyFileCount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="TotalSourceFileCount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="AnalysisFile" type="{xmlns://www.fortifysoftware.com/schema/wsTypes}PayloadEntry" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Warning" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PayloadMetaData", propOrder = {
    "totalAnalysisFileCount",
    "totalDependencyFileCount",
    "totalSourceFileCount",
    "analysisFile",
    "warning"
})
public class PayloadMetaData {

    @XmlElement(name = "TotalAnalysisFileCount")
    protected long totalAnalysisFileCount;
    @XmlElement(name = "TotalDependencyFileCount")
    protected long totalDependencyFileCount;
    @XmlElement(name = "TotalSourceFileCount")
    protected long totalSourceFileCount;
    @XmlElement(name = "AnalysisFile")
    protected List<PayloadEntry> analysisFile;
    @XmlElement(name = "Warning")
    protected List<String> warning;

    /**
     * Default no-arg constructor
     * 
     */
    public PayloadMetaData() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public PayloadMetaData(final long totalAnalysisFileCount, final long totalDependencyFileCount, final long totalSourceFileCount, final List<PayloadEntry> analysisFile, final List<String> warning) {
        this.totalAnalysisFileCount = totalAnalysisFileCount;
        this.totalDependencyFileCount = totalDependencyFileCount;
        this.totalSourceFileCount = totalSourceFileCount;
        this.analysisFile = analysisFile;
        this.warning = warning;
    }

    /**
     * Gets the value of the totalAnalysisFileCount property.
     * 
     */
    public long getTotalAnalysisFileCount() {
        return totalAnalysisFileCount;
    }

    /**
     * Sets the value of the totalAnalysisFileCount property.
     * 
     */
    public void setTotalAnalysisFileCount(long value) {
        this.totalAnalysisFileCount = value;
    }

    /**
     * Gets the value of the totalDependencyFileCount property.
     * 
     */
    public long getTotalDependencyFileCount() {
        return totalDependencyFileCount;
    }

    /**
     * Sets the value of the totalDependencyFileCount property.
     * 
     */
    public void setTotalDependencyFileCount(long value) {
        this.totalDependencyFileCount = value;
    }

    /**
     * Gets the value of the totalSourceFileCount property.
     * 
     */
    public long getTotalSourceFileCount() {
        return totalSourceFileCount;
    }

    /**
     * Sets the value of the totalSourceFileCount property.
     * 
     */
    public void setTotalSourceFileCount(long value) {
        this.totalSourceFileCount = value;
    }

    /**
     * Gets the value of the analysisFile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the analysisFile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnalysisFile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PayloadEntry }
     * 
     * 
     */
    public List<PayloadEntry> getAnalysisFile() {
        if (analysisFile == null) {
            analysisFile = new ArrayList<PayloadEntry>();
        }
        return this.analysisFile;
    }

    /**
     * Gets the value of the warning property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the warning property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWarning().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getWarning() {
        if (warning == null) {
            warning = new ArrayList<String>();
        }
        return this.warning;
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
     * Sets the value of the analysisFile property.
     * 
     * @param analysisFile
     *     allowed object is
     *     {@link PayloadEntry }
     *     
     */
    public void setAnalysisFile(List<PayloadEntry> analysisFile) {
        this.analysisFile = analysisFile;
    }

    /**
     * Sets the value of the warning property.
     * 
     * @param warning
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarning(List<String> warning) {
        this.warning = warning;
    }

    public PayloadMetaData withTotalAnalysisFileCount(long value) {
        setTotalAnalysisFileCount(value);
        return this;
    }

    public PayloadMetaData withTotalDependencyFileCount(long value) {
        setTotalDependencyFileCount(value);
        return this;
    }

    public PayloadMetaData withTotalSourceFileCount(long value) {
        setTotalSourceFileCount(value);
        return this;
    }

    public PayloadMetaData withAnalysisFile(PayloadEntry... values) {
        if (values!= null) {
            for (PayloadEntry value: values) {
                getAnalysisFile().add(value);
            }
        }
        return this;
    }

    public PayloadMetaData withAnalysisFile(Collection<PayloadEntry> values) {
        if (values!= null) {
            getAnalysisFile().addAll(values);
        }
        return this;
    }

    public PayloadMetaData withWarning(String... values) {
        if (values!= null) {
            for (String value: values) {
                getWarning().add(value);
            }
        }
        return this;
    }

    public PayloadMetaData withWarning(Collection<String> values) {
        if (values!= null) {
            getWarning().addAll(values);
        }
        return this;
    }

    public PayloadMetaData withAnalysisFile(List<PayloadEntry> analysisFile) {
        setAnalysisFile(analysisFile);
        return this;
    }

    public PayloadMetaData withWarning(List<String> warning) {
        setWarning(warning);
        return this;
    }

}

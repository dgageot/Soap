
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
 * <p>Java class for ProjectHistory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProjectHistory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProjectIdentifier" type="{xmlns://www.fortifysoftware.com/schema/wsTypes}ProjectIdentifier"/>
 *         &lt;element name="AnalysisResultsFile" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Snapshot" type="{xmlns://www.fortifysoftware.com/schema/wsTypes}Snapshot" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProjectHistory", propOrder = {
    "projectIdentifier",
    "analysisResultsFile",
    "snapshot"
})
public class ProjectHistory {

    @XmlElement(name = "ProjectIdentifier", required = true)
    protected ProjectIdentifier projectIdentifier;
    @XmlElement(name = "AnalysisResultsFile")
    protected List<String> analysisResultsFile;
    @XmlElement(name = "Snapshot")
    protected List<Snapshot> snapshot;

    /**
     * Default no-arg constructor
     * 
     */
    public ProjectHistory() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ProjectHistory(final ProjectIdentifier projectIdentifier, final List<String> analysisResultsFile, final List<Snapshot> snapshot) {
        this.projectIdentifier = projectIdentifier;
        this.analysisResultsFile = analysisResultsFile;
        this.snapshot = snapshot;
    }

    /**
     * Gets the value of the projectIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectIdentifier }
     *     
     */
    public ProjectIdentifier getProjectIdentifier() {
        return projectIdentifier;
    }

    /**
     * Sets the value of the projectIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectIdentifier }
     *     
     */
    public void setProjectIdentifier(ProjectIdentifier value) {
        this.projectIdentifier = value;
    }

    /**
     * Gets the value of the analysisResultsFile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the analysisResultsFile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnalysisResultsFile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAnalysisResultsFile() {
        if (analysisResultsFile == null) {
            analysisResultsFile = new ArrayList<String>();
        }
        return this.analysisResultsFile;
    }

    /**
     * Gets the value of the snapshot property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the snapshot property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSnapshot().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Snapshot }
     * 
     * 
     */
    public List<Snapshot> getSnapshot() {
        if (snapshot == null) {
            snapshot = new ArrayList<Snapshot>();
        }
        return this.snapshot;
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
     * Sets the value of the analysisResultsFile property.
     * 
     * @param analysisResultsFile
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnalysisResultsFile(List<String> analysisResultsFile) {
        this.analysisResultsFile = analysisResultsFile;
    }

    /**
     * Sets the value of the snapshot property.
     * 
     * @param snapshot
     *     allowed object is
     *     {@link Snapshot }
     *     
     */
    public void setSnapshot(List<Snapshot> snapshot) {
        this.snapshot = snapshot;
    }

    public ProjectHistory withProjectIdentifier(ProjectIdentifier value) {
        setProjectIdentifier(value);
        return this;
    }

    public ProjectHistory withAnalysisResultsFile(String... values) {
        if (values!= null) {
            for (String value: values) {
                getAnalysisResultsFile().add(value);
            }
        }
        return this;
    }

    public ProjectHistory withAnalysisResultsFile(Collection<String> values) {
        if (values!= null) {
            getAnalysisResultsFile().addAll(values);
        }
        return this;
    }

    public ProjectHistory withSnapshot(Snapshot... values) {
        if (values!= null) {
            for (Snapshot value: values) {
                getSnapshot().add(value);
            }
        }
        return this;
    }

    public ProjectHistory withSnapshot(Collection<Snapshot> values) {
        if (values!= null) {
            getSnapshot().addAll(values);
        }
        return this;
    }

    public ProjectHistory withAnalysisResultsFile(List<String> analysisResultsFile) {
        setAnalysisResultsFile(analysisResultsFile);
        return this;
    }

    public ProjectHistory withSnapshot(List<Snapshot> snapshot) {
        setSnapshot(snapshot);
        return this;
    }

}

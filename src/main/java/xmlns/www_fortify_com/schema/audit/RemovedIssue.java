
package xmlns.www_fortify_com.schema.audit;

import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{xmlns://www.fortify.com/schema/audit}IssueBase">
 *       &lt;sequence>
 *         &lt;element name="Category" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Product" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="File" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Line" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Confidence" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="Severity" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="Probability" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="Accuracy" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="Impact" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="RemoveScanDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "category",
    "product",
    "file",
    "line",
    "confidence",
    "severity",
    "probability",
    "accuracy",
    "impact",
    "removeScanDate"
})
@XmlRootElement(name = "RemovedIssue")
public class RemovedIssue
    extends IssueBase
{

    @XmlElement(name = "Category", required = true)
    protected String category;
    @XmlElement(name = "Product", required = true)
    protected String product;
    @XmlElement(name = "File")
    protected String file;
    @XmlElement(name = "Line")
    protected Integer line;
    @XmlElement(name = "Confidence")
    protected Float confidence;
    @XmlElement(name = "Severity")
    protected Float severity;
    @XmlElement(name = "Probability")
    protected Float probability;
    @XmlElement(name = "Accuracy")
    protected Float accuracy;
    @XmlElement(name = "Impact")
    protected Float impact;
    @XmlElement(name = "RemoveScanDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar removeScanDate;

    /**
     * Default no-arg constructor
     * 
     */
    public RemovedIssue() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public RemovedIssue(final List<Tag> tag, final String assignedUser, final History managerAuditTrail, final History clientAuditTrail, final ThreadedComments threadedComments, final List<Object> any, final String instanceId, final Boolean suppressed, final Boolean hidden, final Boolean removed, final int revision, final String category, final String product, final String file, final Integer line, final Float confidence, final Float severity, final Float probability, final Float accuracy, final Float impact, final XMLGregorianCalendar removeScanDate) {
        super(tag, assignedUser, managerAuditTrail, clientAuditTrail, threadedComments, any, instanceId, suppressed, hidden, removed, revision);
        this.category = category;
        this.product = product;
        this.file = file;
        this.line = line;
        this.confidence = confidence;
        this.severity = severity;
        this.probability = probability;
        this.accuracy = accuracy;
        this.impact = impact;
        this.removeScanDate = removeScanDate;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProduct(String value) {
        this.product = value;
    }

    /**
     * Gets the value of the file property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFile() {
        return file;
    }

    /**
     * Sets the value of the file property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFile(String value) {
        this.file = value;
    }

    /**
     * Gets the value of the line property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLine() {
        return line;
    }

    /**
     * Sets the value of the line property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLine(Integer value) {
        this.line = value;
    }

    /**
     * Gets the value of the confidence property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getConfidence() {
        return confidence;
    }

    /**
     * Sets the value of the confidence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setConfidence(Float value) {
        this.confidence = value;
    }

    /**
     * Gets the value of the severity property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSeverity() {
        return severity;
    }

    /**
     * Sets the value of the severity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSeverity(Float value) {
        this.severity = value;
    }

    /**
     * Gets the value of the probability property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getProbability() {
        return probability;
    }

    /**
     * Sets the value of the probability property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setProbability(Float value) {
        this.probability = value;
    }

    /**
     * Gets the value of the accuracy property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAccuracy() {
        return accuracy;
    }

    /**
     * Sets the value of the accuracy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAccuracy(Float value) {
        this.accuracy = value;
    }

    /**
     * Gets the value of the impact property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getImpact() {
        return impact;
    }

    /**
     * Sets the value of the impact property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setImpact(Float value) {
        this.impact = value;
    }

    /**
     * Gets the value of the removeScanDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRemoveScanDate() {
        return removeScanDate;
    }

    /**
     * Sets the value of the removeScanDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRemoveScanDate(XMLGregorianCalendar value) {
        this.removeScanDate = value;
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

    public RemovedIssue withCategory(String value) {
        setCategory(value);
        return this;
    }

    public RemovedIssue withProduct(String value) {
        setProduct(value);
        return this;
    }

    public RemovedIssue withFile(String value) {
        setFile(value);
        return this;
    }

    public RemovedIssue withLine(Integer value) {
        setLine(value);
        return this;
    }

    public RemovedIssue withConfidence(Float value) {
        setConfidence(value);
        return this;
    }

    public RemovedIssue withSeverity(Float value) {
        setSeverity(value);
        return this;
    }

    public RemovedIssue withProbability(Float value) {
        setProbability(value);
        return this;
    }

    public RemovedIssue withAccuracy(Float value) {
        setAccuracy(value);
        return this;
    }

    public RemovedIssue withImpact(Float value) {
        setImpact(value);
        return this;
    }

    public RemovedIssue withRemoveScanDate(XMLGregorianCalendar value) {
        setRemoveScanDate(value);
        return this;
    }

    @Override
    public RemovedIssue withTag(Tag... values) {
        if (values!= null) {
            for (Tag value: values) {
                getTag().add(value);
            }
        }
        return this;
    }

    @Override
    public RemovedIssue withTag(Collection<Tag> values) {
        if (values!= null) {
            getTag().addAll(values);
        }
        return this;
    }

    @Override
    public RemovedIssue withAssignedUser(String value) {
        setAssignedUser(value);
        return this;
    }

    @Override
    public RemovedIssue withManagerAuditTrail(History value) {
        setManagerAuditTrail(value);
        return this;
    }

    @Override
    public RemovedIssue withClientAuditTrail(History value) {
        setClientAuditTrail(value);
        return this;
    }

    @Override
    public RemovedIssue withThreadedComments(ThreadedComments value) {
        setThreadedComments(value);
        return this;
    }

    @Override
    public RemovedIssue withAny(Object... values) {
        if (values!= null) {
            for (Object value: values) {
                getAny().add(value);
            }
        }
        return this;
    }

    @Override
    public RemovedIssue withAny(Collection<Object> values) {
        if (values!= null) {
            getAny().addAll(values);
        }
        return this;
    }

    @Override
    public RemovedIssue withInstanceId(String value) {
        setInstanceId(value);
        return this;
    }

    @Override
    public RemovedIssue withSuppressed(Boolean value) {
        setSuppressed(value);
        return this;
    }

    @Override
    public RemovedIssue withHidden(Boolean value) {
        setHidden(value);
        return this;
    }

    @Override
    public RemovedIssue withRemoved(Boolean value) {
        setRemoved(value);
        return this;
    }

    @Override
    public RemovedIssue withRevision(int value) {
        setRevision(value);
        return this;
    }

    @Override
    public RemovedIssue withTag(List<Tag> tag) {
        setTag(tag);
        return this;
    }

    @Override
    public RemovedIssue withAny(List<Object> any) {
        setAny(any);
        return this;
    }

}

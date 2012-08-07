
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
 *         &lt;element name="File" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Line" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CreationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="RuleId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "file",
    "line",
    "creationDate",
    "ruleId"
})
@XmlRootElement(name = "CustomIssue")
public class CustomIssue
    extends IssueBase
{

    @XmlElement(name = "Category", required = true)
    protected String category;
    @XmlElement(name = "File")
    protected String file;
    @XmlElement(name = "Line")
    protected Integer line;
    @XmlElement(name = "CreationDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationDate;
    @XmlElement(name = "RuleId")
    protected String ruleId;

    /**
     * Default no-arg constructor
     * 
     */
    public CustomIssue() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public CustomIssue(final List<Tag> tag, final String assignedUser, final History managerAuditTrail, final History clientAuditTrail, final ThreadedComments threadedComments, final List<Object> any, final String instanceId, final Boolean suppressed, final Boolean hidden, final Boolean removed, final int revision, final String category, final String file, final Integer line, final XMLGregorianCalendar creationDate, final String ruleId) {
        super(tag, assignedUser, managerAuditTrail, clientAuditTrail, threadedComments, any, instanceId, suppressed, hidden, removed, revision);
        this.category = category;
        this.file = file;
        this.line = line;
        this.creationDate = creationDate;
        this.ruleId = ruleId;
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
     * Gets the value of the creationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the value of the creationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDate(XMLGregorianCalendar value) {
        this.creationDate = value;
    }

    /**
     * Gets the value of the ruleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuleId() {
        return ruleId;
    }

    /**
     * Sets the value of the ruleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuleId(String value) {
        this.ruleId = value;
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

    public CustomIssue withCategory(String value) {
        setCategory(value);
        return this;
    }

    public CustomIssue withFile(String value) {
        setFile(value);
        return this;
    }

    public CustomIssue withLine(Integer value) {
        setLine(value);
        return this;
    }

    public CustomIssue withCreationDate(XMLGregorianCalendar value) {
        setCreationDate(value);
        return this;
    }

    public CustomIssue withRuleId(String value) {
        setRuleId(value);
        return this;
    }

    @Override
    public CustomIssue withTag(Tag... values) {
        if (values!= null) {
            for (Tag value: values) {
                getTag().add(value);
            }
        }
        return this;
    }

    @Override
    public CustomIssue withTag(Collection<Tag> values) {
        if (values!= null) {
            getTag().addAll(values);
        }
        return this;
    }

    @Override
    public CustomIssue withAssignedUser(String value) {
        setAssignedUser(value);
        return this;
    }

    @Override
    public CustomIssue withManagerAuditTrail(History value) {
        setManagerAuditTrail(value);
        return this;
    }

    @Override
    public CustomIssue withClientAuditTrail(History value) {
        setClientAuditTrail(value);
        return this;
    }

    @Override
    public CustomIssue withThreadedComments(ThreadedComments value) {
        setThreadedComments(value);
        return this;
    }

    @Override
    public CustomIssue withAny(Object... values) {
        if (values!= null) {
            for (Object value: values) {
                getAny().add(value);
            }
        }
        return this;
    }

    @Override
    public CustomIssue withAny(Collection<Object> values) {
        if (values!= null) {
            getAny().addAll(values);
        }
        return this;
    }

    @Override
    public CustomIssue withInstanceId(String value) {
        setInstanceId(value);
        return this;
    }

    @Override
    public CustomIssue withSuppressed(Boolean value) {
        setSuppressed(value);
        return this;
    }

    @Override
    public CustomIssue withHidden(Boolean value) {
        setHidden(value);
        return this;
    }

    @Override
    public CustomIssue withRemoved(Boolean value) {
        setRemoved(value);
        return this;
    }

    @Override
    public CustomIssue withRevision(int value) {
        setRevision(value);
        return this;
    }

    @Override
    public CustomIssue withTag(List<Tag> tag) {
        setTag(tag);
        return this;
    }

    @Override
    public CustomIssue withAny(List<Object> any) {
        setAny(any);
        return this;
    }

}


package xmlns.www_fortify_com.schema.audit;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import xmlns.www_fortify_com.schema.issuemanagement.IssueInstance;


/**
 * <p>Java class for IssueBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IssueBase">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{xmlns://www.fortify.com/schema/audit}Tag" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AssignedUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ManagerAuditTrail" type="{xmlns://www.fortify.com/schema/audit}History" minOccurs="0"/>
 *         &lt;element name="ClientAuditTrail" type="{xmlns://www.fortify.com/schema/audit}History" minOccurs="0"/>
 *         &lt;element ref="{xmlns://www.fortify.com/schema/audit}ThreadedComments" minOccurs="0"/>
 *         &lt;any/>
 *       &lt;/sequence>
 *       &lt;attribute name="instanceId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="suppressed" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="hidden" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="removed" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="revision" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IssueBase", propOrder = {
    "tag",
    "assignedUser",
    "managerAuditTrail",
    "clientAuditTrail",
    "threadedComments",
    "any"
})
@XmlSeeAlso({
    IssueInstance.class,
    RemovedIssue.class,
    CustomIssue.class,
    Issue.class
})
public class IssueBase {

    @XmlElement(name = "Tag")
    protected List<Tag> tag;
    @XmlElement(name = "AssignedUser")
    protected String assignedUser;
    @XmlElement(name = "ManagerAuditTrail")
    protected History managerAuditTrail;
    @XmlElement(name = "ClientAuditTrail")
    protected History clientAuditTrail;
    @XmlElement(name = "ThreadedComments")
    protected ThreadedComments threadedComments;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute(required = true)
    protected String instanceId;
    @XmlAttribute
    protected Boolean suppressed;
    @XmlAttribute
    protected Boolean hidden;
    @XmlAttribute
    protected Boolean removed;
    @XmlAttribute(required = true)
    protected int revision;

    /**
     * Default no-arg constructor
     * 
     */
    public IssueBase() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public IssueBase(final List<Tag> tag, final String assignedUser, final History managerAuditTrail, final History clientAuditTrail, final ThreadedComments threadedComments, final List<Object> any, final String instanceId, final Boolean suppressed, final Boolean hidden, final Boolean removed, final int revision) {
        this.tag = tag;
        this.assignedUser = assignedUser;
        this.managerAuditTrail = managerAuditTrail;
        this.clientAuditTrail = clientAuditTrail;
        this.threadedComments = threadedComments;
        this.any = any;
        this.instanceId = instanceId;
        this.suppressed = suppressed;
        this.hidden = hidden;
        this.removed = removed;
        this.revision = revision;
    }

    /**
     * Gets the value of the tag property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tag property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTag().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tag }
     * 
     * 
     */
    public List<Tag> getTag() {
        if (tag == null) {
            tag = new ArrayList<Tag>();
        }
        return this.tag;
    }

    /**
     * Gets the value of the assignedUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssignedUser() {
        return assignedUser;
    }

    /**
     * Sets the value of the assignedUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssignedUser(String value) {
        this.assignedUser = value;
    }

    /**
     * Gets the value of the managerAuditTrail property.
     * 
     * @return
     *     possible object is
     *     {@link History }
     *     
     */
    public History getManagerAuditTrail() {
        return managerAuditTrail;
    }

    /**
     * Sets the value of the managerAuditTrail property.
     * 
     * @param value
     *     allowed object is
     *     {@link History }
     *     
     */
    public void setManagerAuditTrail(History value) {
        this.managerAuditTrail = value;
    }

    /**
     * Gets the value of the clientAuditTrail property.
     * 
     * @return
     *     possible object is
     *     {@link History }
     *     
     */
    public History getClientAuditTrail() {
        return clientAuditTrail;
    }

    /**
     * Sets the value of the clientAuditTrail property.
     * 
     * @param value
     *     allowed object is
     *     {@link History }
     *     
     */
    public void setClientAuditTrail(History value) {
        this.clientAuditTrail = value;
    }

    /**
     * Gets the value of the threadedComments property.
     * 
     * @return
     *     possible object is
     *     {@link ThreadedComments }
     *     
     */
    public ThreadedComments getThreadedComments() {
        return threadedComments;
    }

    /**
     * Sets the value of the threadedComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThreadedComments }
     *     
     */
    public void setThreadedComments(ThreadedComments value) {
        this.threadedComments = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

    /**
     * Gets the value of the instanceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * Sets the value of the instanceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstanceId(String value) {
        this.instanceId = value;
    }

    /**
     * Gets the value of the suppressed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSuppressed() {
        return suppressed;
    }

    /**
     * Sets the value of the suppressed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSuppressed(Boolean value) {
        this.suppressed = value;
    }

    /**
     * Gets the value of the hidden property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHidden() {
        return hidden;
    }

    /**
     * Sets the value of the hidden property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHidden(Boolean value) {
        this.hidden = value;
    }

    /**
     * Gets the value of the removed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRemoved() {
        return removed;
    }

    /**
     * Sets the value of the removed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRemoved(Boolean value) {
        this.removed = value;
    }

    /**
     * Gets the value of the revision property.
     * 
     */
    public int getRevision() {
        return revision;
    }

    /**
     * Sets the value of the revision property.
     * 
     */
    public void setRevision(int value) {
        this.revision = value;
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
     * Sets the value of the tag property.
     * 
     * @param tag
     *     allowed object is
     *     {@link Tag }
     *     
     */
    public void setTag(List<Tag> tag) {
        this.tag = tag;
    }

    /**
     * Sets the value of the any property.
     * 
     * @param any
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAny(List<Object> any) {
        this.any = any;
    }

    public IssueBase withTag(Tag... values) {
        if (values!= null) {
            for (Tag value: values) {
                getTag().add(value);
            }
        }
        return this;
    }

    public IssueBase withTag(Collection<Tag> values) {
        if (values!= null) {
            getTag().addAll(values);
        }
        return this;
    }

    public IssueBase withAssignedUser(String value) {
        setAssignedUser(value);
        return this;
    }

    public IssueBase withManagerAuditTrail(History value) {
        setManagerAuditTrail(value);
        return this;
    }

    public IssueBase withClientAuditTrail(History value) {
        setClientAuditTrail(value);
        return this;
    }

    public IssueBase withThreadedComments(ThreadedComments value) {
        setThreadedComments(value);
        return this;
    }

    public IssueBase withAny(Object... values) {
        if (values!= null) {
            for (Object value: values) {
                getAny().add(value);
            }
        }
        return this;
    }

    public IssueBase withAny(Collection<Object> values) {
        if (values!= null) {
            getAny().addAll(values);
        }
        return this;
    }

    public IssueBase withInstanceId(String value) {
        setInstanceId(value);
        return this;
    }

    public IssueBase withSuppressed(Boolean value) {
        setSuppressed(value);
        return this;
    }

    public IssueBase withHidden(Boolean value) {
        setHidden(value);
        return this;
    }

    public IssueBase withRemoved(Boolean value) {
        setRemoved(value);
        return this;
    }

    public IssueBase withRevision(int value) {
        setRevision(value);
        return this;
    }

    public IssueBase withTag(List<Tag> tag) {
        setTag(tag);
        return this;
    }

    public IssueBase withAny(List<Object> any) {
        setAny(any);
        return this;
    }

}

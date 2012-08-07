
package xmlns.www_fortify_com.schema.issuemanagement;

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
import xmlns.www_fortify_com.schema.audit.History;
import xmlns.www_fortify_com.schema.audit.IssueBase;
import xmlns.www_fortify_com.schema.audit.Tag;
import xmlns.www_fortify_com.schema.audit.ThreadedComments;


/**
 * <p>Java class for IssueInstance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IssueInstance">
 *   &lt;complexContent>
 *     &lt;extension base="{xmlns://www.fortify.com/schema/audit}IssueBase">
 *       &lt;sequence>
 *         &lt;element name="ClassInfo" type="{xmlns://www.fortify.com/schema/issuemanagement}ClassInfo"/>
 *         &lt;element name="InstanceInfo" type="{xmlns://www.fortify.com/schema/issuemanagement}InstanceInfo"/>
 *         &lt;element name="GroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IssueInstance", propOrder = {
    "classInfo",
    "instanceInfo",
    "groupName"
})
public class IssueInstance
    extends IssueBase
{

    @XmlElement(name = "ClassInfo", required = true)
    protected ClassInfo classInfo;
    @XmlElement(name = "InstanceInfo", required = true)
    protected InstanceInfo instanceInfo;
    @XmlElement(name = "GroupName")
    protected String groupName;

    /**
     * Default no-arg constructor
     * 
     */
    public IssueInstance() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public IssueInstance(final List<Tag> tag, final String assignedUser, final History managerAuditTrail, final History clientAuditTrail, final ThreadedComments threadedComments, final List<Object> any, final String instanceId, final Boolean suppressed, final Boolean hidden, final Boolean removed, final int revision, final ClassInfo classInfo, final InstanceInfo instanceInfo, final String groupName) {
        super(tag, assignedUser, managerAuditTrail, clientAuditTrail, threadedComments, any, instanceId, suppressed, hidden, removed, revision);
        this.classInfo = classInfo;
        this.instanceInfo = instanceInfo;
        this.groupName = groupName;
    }

    /**
     * Gets the value of the classInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ClassInfo }
     *     
     */
    public ClassInfo getClassInfo() {
        return classInfo;
    }

    /**
     * Sets the value of the classInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassInfo }
     *     
     */
    public void setClassInfo(ClassInfo value) {
        this.classInfo = value;
    }

    /**
     * Gets the value of the instanceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link InstanceInfo }
     *     
     */
    public InstanceInfo getInstanceInfo() {
        return instanceInfo;
    }

    /**
     * Sets the value of the instanceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstanceInfo }
     *     
     */
    public void setInstanceInfo(InstanceInfo value) {
        this.instanceInfo = value;
    }

    /**
     * Gets the value of the groupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * Sets the value of the groupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupName(String value) {
        this.groupName = value;
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

    public IssueInstance withClassInfo(ClassInfo value) {
        setClassInfo(value);
        return this;
    }

    public IssueInstance withInstanceInfo(InstanceInfo value) {
        setInstanceInfo(value);
        return this;
    }

    public IssueInstance withGroupName(String value) {
        setGroupName(value);
        return this;
    }

    @Override
    public IssueInstance withTag(Tag... values) {
        if (values!= null) {
            for (Tag value: values) {
                getTag().add(value);
            }
        }
        return this;
    }

    @Override
    public IssueInstance withTag(Collection<Tag> values) {
        if (values!= null) {
            getTag().addAll(values);
        }
        return this;
    }

    @Override
    public IssueInstance withAssignedUser(String value) {
        setAssignedUser(value);
        return this;
    }

    @Override
    public IssueInstance withManagerAuditTrail(History value) {
        setManagerAuditTrail(value);
        return this;
    }

    @Override
    public IssueInstance withClientAuditTrail(History value) {
        setClientAuditTrail(value);
        return this;
    }

    @Override
    public IssueInstance withThreadedComments(ThreadedComments value) {
        setThreadedComments(value);
        return this;
    }

    @Override
    public IssueInstance withAny(Object... values) {
        if (values!= null) {
            for (Object value: values) {
                getAny().add(value);
            }
        }
        return this;
    }

    @Override
    public IssueInstance withAny(Collection<Object> values) {
        if (values!= null) {
            getAny().addAll(values);
        }
        return this;
    }

    @Override
    public IssueInstance withInstanceId(String value) {
        setInstanceId(value);
        return this;
    }

    @Override
    public IssueInstance withSuppressed(Boolean value) {
        setSuppressed(value);
        return this;
    }

    @Override
    public IssueInstance withHidden(Boolean value) {
        setHidden(value);
        return this;
    }

    @Override
    public IssueInstance withRemoved(Boolean value) {
        setRemoved(value);
        return this;
    }

    @Override
    public IssueInstance withRevision(int value) {
        setRevision(value);
        return this;
    }

    @Override
    public IssueInstance withTag(List<Tag> tag) {
        setTag(tag);
        return this;
    }

    @Override
    public IssueInstance withAny(List<Object> any) {
        setAny(any);
        return this;
    }

}

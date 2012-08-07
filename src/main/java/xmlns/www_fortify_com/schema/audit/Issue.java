
package xmlns.www_fortify_com.schema.audit;

import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
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
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "Issue")
public class Issue
    extends IssueBase
{


    /**
     * Default no-arg constructor
     * 
     */
    public Issue() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public Issue(final List<Tag> tag, final String assignedUser, final History managerAuditTrail, final History clientAuditTrail, final ThreadedComments threadedComments, final List<Object> any, final String instanceId, final Boolean suppressed, final Boolean hidden, final Boolean removed, final int revision) {
        super(tag, assignedUser, managerAuditTrail, clientAuditTrail, threadedComments, any, instanceId, suppressed, hidden, removed, revision);
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

    @Override
    public Issue withTag(Tag... values) {
        if (values!= null) {
            for (Tag value: values) {
                getTag().add(value);
            }
        }
        return this;
    }

    @Override
    public Issue withTag(Collection<Tag> values) {
        if (values!= null) {
            getTag().addAll(values);
        }
        return this;
    }

    @Override
    public Issue withAssignedUser(String value) {
        setAssignedUser(value);
        return this;
    }

    @Override
    public Issue withManagerAuditTrail(History value) {
        setManagerAuditTrail(value);
        return this;
    }

    @Override
    public Issue withClientAuditTrail(History value) {
        setClientAuditTrail(value);
        return this;
    }

    @Override
    public Issue withThreadedComments(ThreadedComments value) {
        setThreadedComments(value);
        return this;
    }

    @Override
    public Issue withAny(Object... values) {
        if (values!= null) {
            for (Object value: values) {
                getAny().add(value);
            }
        }
        return this;
    }

    @Override
    public Issue withAny(Collection<Object> values) {
        if (values!= null) {
            getAny().addAll(values);
        }
        return this;
    }

    @Override
    public Issue withInstanceId(String value) {
        setInstanceId(value);
        return this;
    }

    @Override
    public Issue withSuppressed(Boolean value) {
        setSuppressed(value);
        return this;
    }

    @Override
    public Issue withHidden(Boolean value) {
        setHidden(value);
        return this;
    }

    @Override
    public Issue withRemoved(Boolean value) {
        setRemoved(value);
        return this;
    }

    @Override
    public Issue withRevision(int value) {
        setRevision(value);
        return this;
    }

    @Override
    public Issue withTag(List<Tag> tag) {
        setTag(tag);
        return this;
    }

    @Override
    public Issue withAny(List<Object> any) {
        setAny(any);
        return this;
    }

}

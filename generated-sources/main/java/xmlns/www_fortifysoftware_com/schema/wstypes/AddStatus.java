
package xmlns.www_fortifysoftware_com.schema.wstypes;

import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.fortify.schema.fws.AddProjectAndVersionResponse;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;


/**
 * <p>Java class for addStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addStatus">
 *   &lt;complexContent>
 *     &lt;extension base="{xmlns://www.fortifysoftware.com/schema/wsTypes}status">
 *       &lt;sequence>
 *         &lt;element name="entityId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addStatus", propOrder = {
    "entityId"
})
@XmlSeeAlso({
    AddProjectAndVersionResponse.class
})
public class AddStatus
    extends Status
{

    protected long entityId;

    /**
     * Default no-arg constructor
     * 
     */
    public AddStatus() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public AddStatus(final long code, final String msg, final List<RootCause> rootCause, final long entityId) {
        super(code, msg, rootCause);
        this.entityId = entityId;
    }

    /**
     * Gets the value of the entityId property.
     * 
     */
    public long getEntityId() {
        return entityId;
    }

    /**
     * Sets the value of the entityId property.
     * 
     */
    public void setEntityId(long value) {
        this.entityId = value;
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

    public AddStatus withEntityId(long value) {
        setEntityId(value);
        return this;
    }

    @Override
    public AddStatus withCode(long value) {
        setCode(value);
        return this;
    }

    @Override
    public AddStatus withMsg(String value) {
        setMsg(value);
        return this;
    }

    @Override
    public AddStatus withRootCause(RootCause... values) {
        if (values!= null) {
            for (RootCause value: values) {
                getRootCause().add(value);
            }
        }
        return this;
    }

    @Override
    public AddStatus withRootCause(Collection<RootCause> values) {
        if (values!= null) {
            getRootCause().addAll(values);
        }
        return this;
    }

    @Override
    public AddStatus withRootCause(List<RootCause> rootCause) {
        setRootCause(rootCause);
        return this;
    }

}

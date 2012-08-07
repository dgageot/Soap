
package xmlns.www_fortifysoftware_com.schema.runtime;

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
 *     &lt;extension base="{xmlns://www.fortifysoftware.com/schema/runtime}StackTrace">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "EventStack")
public class EventStack
    extends StackTrace
{


    /**
     * Default no-arg constructor
     * 
     */
    public EventStack() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public EventStack(final String checkSum, final String traceBody, final String id) {
        super(checkSum, traceBody, id);
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
    public EventStack withCheckSum(String value) {
        setCheckSum(value);
        return this;
    }

    @Override
    public EventStack withTraceBody(String value) {
        setTraceBody(value);
        return this;
    }

    @Override
    public EventStack withId(String value) {
        setId(value);
        return this;
    }

}

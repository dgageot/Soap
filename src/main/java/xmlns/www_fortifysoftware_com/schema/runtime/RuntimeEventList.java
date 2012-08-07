
package xmlns.www_fortifysoftware_com.schema.runtime;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RuntimeEvent" type="{xmlns://www.fortifysoftware.com/schema/runtime}RuntimeEvent" maxOccurs="unbounded"/>
 *         &lt;element name="StackTrace" type="{xmlns://www.fortifysoftware.com/schema/runtime}StackTrace" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "runtimeEvent",
    "stackTrace"
})
@XmlRootElement(name = "RuntimeEventList")
public class RuntimeEventList {

    @XmlElement(name = "RuntimeEvent", required = true)
    protected List<RuntimeEvent> runtimeEvent;
    @XmlElement(name = "StackTrace")
    protected List<StackTrace> stackTrace;

    /**
     * Default no-arg constructor
     * 
     */
    public RuntimeEventList() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public RuntimeEventList(final List<RuntimeEvent> runtimeEvent, final List<StackTrace> stackTrace) {
        this.runtimeEvent = runtimeEvent;
        this.stackTrace = stackTrace;
    }

    /**
     * Gets the value of the runtimeEvent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the runtimeEvent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRuntimeEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RuntimeEvent }
     * 
     * 
     */
    public List<RuntimeEvent> getRuntimeEvent() {
        if (runtimeEvent == null) {
            runtimeEvent = new ArrayList<RuntimeEvent>();
        }
        return this.runtimeEvent;
    }

    /**
     * Gets the value of the stackTrace property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stackTrace property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStackTrace().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StackTrace }
     * 
     * 
     */
    public List<StackTrace> getStackTrace() {
        if (stackTrace == null) {
            stackTrace = new ArrayList<StackTrace>();
        }
        return this.stackTrace;
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
     * Sets the value of the runtimeEvent property.
     * 
     * @param runtimeEvent
     *     allowed object is
     *     {@link RuntimeEvent }
     *     
     */
    public void setRuntimeEvent(List<RuntimeEvent> runtimeEvent) {
        this.runtimeEvent = runtimeEvent;
    }

    /**
     * Sets the value of the stackTrace property.
     * 
     * @param stackTrace
     *     allowed object is
     *     {@link StackTrace }
     *     
     */
    public void setStackTrace(List<StackTrace> stackTrace) {
        this.stackTrace = stackTrace;
    }

    public RuntimeEventList withRuntimeEvent(RuntimeEvent... values) {
        if (values!= null) {
            for (RuntimeEvent value: values) {
                getRuntimeEvent().add(value);
            }
        }
        return this;
    }

    public RuntimeEventList withRuntimeEvent(Collection<RuntimeEvent> values) {
        if (values!= null) {
            getRuntimeEvent().addAll(values);
        }
        return this;
    }

    public RuntimeEventList withStackTrace(StackTrace... values) {
        if (values!= null) {
            for (StackTrace value: values) {
                getStackTrace().add(value);
            }
        }
        return this;
    }

    public RuntimeEventList withStackTrace(Collection<StackTrace> values) {
        if (values!= null) {
            getStackTrace().addAll(values);
        }
        return this;
    }

    public RuntimeEventList withRuntimeEvent(List<RuntimeEvent> runtimeEvent) {
        setRuntimeEvent(runtimeEvent);
        return this;
    }

    public RuntimeEventList withStackTrace(List<StackTrace> stackTrace) {
        setStackTrace(stackTrace);
        return this;
    }

}

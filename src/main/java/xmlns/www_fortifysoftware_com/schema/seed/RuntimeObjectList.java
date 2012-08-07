
package xmlns.www_fortifysoftware_com.schema.seed;

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
import xmlns.www_fortifysoftware_com.schema.runtime.ApplicationAssignmentRule;
import xmlns.www_fortifysoftware_com.schema.runtime.Controller;
import xmlns.www_fortifysoftware_com.schema.runtime.Federation;
import xmlns.www_fortifysoftware_com.schema.runtime.Host;
import xmlns.www_fortifysoftware_com.schema.runtime.RuntimeApplication;
import xmlns.www_fortifysoftware_com.schema.runtime.RuntimeConfiguration;


/**
 * <p>Java class for RuntimeObjectList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RuntimeObjectList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Rulepack" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RuntimeConfiguration" type="{xmlns://www.fortifysoftware.com/schema/runtime}RuntimeConfiguration" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Federation" type="{xmlns://www.fortifysoftware.com/schema/runtime}Federation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Host" type="{xmlns://www.fortifysoftware.com/schema/runtime}Host" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RuntimeApplication" type="{xmlns://www.fortifysoftware.com/schema/runtime}RuntimeApplication" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EventArchive" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Controller" type="{xmlns://www.fortifysoftware.com/schema/runtime}Controller" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ApplicationAssignmentRule" type="{xmlns://www.fortifysoftware.com/schema/runtime}ApplicationAssignmentRule" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RuntimeObjectList", propOrder = {
    "rulepack",
    "runtimeConfiguration",
    "federation",
    "host",
    "runtimeApplication",
    "eventArchive",
    "controller",
    "applicationAssignmentRule"
})
public class RuntimeObjectList {

    @XmlElement(name = "Rulepack")
    protected List<String> rulepack;
    @XmlElement(name = "RuntimeConfiguration")
    protected List<RuntimeConfiguration> runtimeConfiguration;
    @XmlElement(name = "Federation")
    protected List<Federation> federation;
    @XmlElement(name = "Host")
    protected List<Host> host;
    @XmlElement(name = "RuntimeApplication")
    protected List<RuntimeApplication> runtimeApplication;
    @XmlElement(name = "EventArchive")
    protected List<String> eventArchive;
    @XmlElement(name = "Controller")
    protected List<Controller> controller;
    @XmlElement(name = "ApplicationAssignmentRule")
    protected List<ApplicationAssignmentRule> applicationAssignmentRule;

    /**
     * Default no-arg constructor
     * 
     */
    public RuntimeObjectList() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public RuntimeObjectList(final List<String> rulepack, final List<RuntimeConfiguration> runtimeConfiguration, final List<Federation> federation, final List<Host> host, final List<RuntimeApplication> runtimeApplication, final List<String> eventArchive, final List<Controller> controller, final List<ApplicationAssignmentRule> applicationAssignmentRule) {
        this.rulepack = rulepack;
        this.runtimeConfiguration = runtimeConfiguration;
        this.federation = federation;
        this.host = host;
        this.runtimeApplication = runtimeApplication;
        this.eventArchive = eventArchive;
        this.controller = controller;
        this.applicationAssignmentRule = applicationAssignmentRule;
    }

    /**
     * Gets the value of the rulepack property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rulepack property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRulepack().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRulepack() {
        if (rulepack == null) {
            rulepack = new ArrayList<String>();
        }
        return this.rulepack;
    }

    /**
     * Gets the value of the runtimeConfiguration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the runtimeConfiguration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRuntimeConfiguration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RuntimeConfiguration }
     * 
     * 
     */
    public List<RuntimeConfiguration> getRuntimeConfiguration() {
        if (runtimeConfiguration == null) {
            runtimeConfiguration = new ArrayList<RuntimeConfiguration>();
        }
        return this.runtimeConfiguration;
    }

    /**
     * Gets the value of the federation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the federation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFederation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Federation }
     * 
     * 
     */
    public List<Federation> getFederation() {
        if (federation == null) {
            federation = new ArrayList<Federation>();
        }
        return this.federation;
    }

    /**
     * Gets the value of the host property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the host property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHost().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Host }
     * 
     * 
     */
    public List<Host> getHost() {
        if (host == null) {
            host = new ArrayList<Host>();
        }
        return this.host;
    }

    /**
     * Gets the value of the runtimeApplication property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the runtimeApplication property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRuntimeApplication().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RuntimeApplication }
     * 
     * 
     */
    public List<RuntimeApplication> getRuntimeApplication() {
        if (runtimeApplication == null) {
            runtimeApplication = new ArrayList<RuntimeApplication>();
        }
        return this.runtimeApplication;
    }

    /**
     * Gets the value of the eventArchive property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eventArchive property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEventArchive().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEventArchive() {
        if (eventArchive == null) {
            eventArchive = new ArrayList<String>();
        }
        return this.eventArchive;
    }

    /**
     * Gets the value of the controller property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the controller property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getController().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Controller }
     * 
     * 
     */
    public List<Controller> getController() {
        if (controller == null) {
            controller = new ArrayList<Controller>();
        }
        return this.controller;
    }

    /**
     * Gets the value of the applicationAssignmentRule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applicationAssignmentRule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicationAssignmentRule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApplicationAssignmentRule }
     * 
     * 
     */
    public List<ApplicationAssignmentRule> getApplicationAssignmentRule() {
        if (applicationAssignmentRule == null) {
            applicationAssignmentRule = new ArrayList<ApplicationAssignmentRule>();
        }
        return this.applicationAssignmentRule;
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
     * Sets the value of the rulepack property.
     * 
     * @param rulepack
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRulepack(List<String> rulepack) {
        this.rulepack = rulepack;
    }

    /**
     * Sets the value of the runtimeConfiguration property.
     * 
     * @param runtimeConfiguration
     *     allowed object is
     *     {@link RuntimeConfiguration }
     *     
     */
    public void setRuntimeConfiguration(List<RuntimeConfiguration> runtimeConfiguration) {
        this.runtimeConfiguration = runtimeConfiguration;
    }

    /**
     * Sets the value of the federation property.
     * 
     * @param federation
     *     allowed object is
     *     {@link Federation }
     *     
     */
    public void setFederation(List<Federation> federation) {
        this.federation = federation;
    }

    /**
     * Sets the value of the host property.
     * 
     * @param host
     *     allowed object is
     *     {@link Host }
     *     
     */
    public void setHost(List<Host> host) {
        this.host = host;
    }

    /**
     * Sets the value of the runtimeApplication property.
     * 
     * @param runtimeApplication
     *     allowed object is
     *     {@link RuntimeApplication }
     *     
     */
    public void setRuntimeApplication(List<RuntimeApplication> runtimeApplication) {
        this.runtimeApplication = runtimeApplication;
    }

    /**
     * Sets the value of the eventArchive property.
     * 
     * @param eventArchive
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventArchive(List<String> eventArchive) {
        this.eventArchive = eventArchive;
    }

    /**
     * Sets the value of the controller property.
     * 
     * @param controller
     *     allowed object is
     *     {@link Controller }
     *     
     */
    public void setController(List<Controller> controller) {
        this.controller = controller;
    }

    /**
     * Sets the value of the applicationAssignmentRule property.
     * 
     * @param applicationAssignmentRule
     *     allowed object is
     *     {@link ApplicationAssignmentRule }
     *     
     */
    public void setApplicationAssignmentRule(List<ApplicationAssignmentRule> applicationAssignmentRule) {
        this.applicationAssignmentRule = applicationAssignmentRule;
    }

    public RuntimeObjectList withRulepack(String... values) {
        if (values!= null) {
            for (String value: values) {
                getRulepack().add(value);
            }
        }
        return this;
    }

    public RuntimeObjectList withRulepack(Collection<String> values) {
        if (values!= null) {
            getRulepack().addAll(values);
        }
        return this;
    }

    public RuntimeObjectList withRuntimeConfiguration(RuntimeConfiguration... values) {
        if (values!= null) {
            for (RuntimeConfiguration value: values) {
                getRuntimeConfiguration().add(value);
            }
        }
        return this;
    }

    public RuntimeObjectList withRuntimeConfiguration(Collection<RuntimeConfiguration> values) {
        if (values!= null) {
            getRuntimeConfiguration().addAll(values);
        }
        return this;
    }

    public RuntimeObjectList withFederation(Federation... values) {
        if (values!= null) {
            for (Federation value: values) {
                getFederation().add(value);
            }
        }
        return this;
    }

    public RuntimeObjectList withFederation(Collection<Federation> values) {
        if (values!= null) {
            getFederation().addAll(values);
        }
        return this;
    }

    public RuntimeObjectList withHost(Host... values) {
        if (values!= null) {
            for (Host value: values) {
                getHost().add(value);
            }
        }
        return this;
    }

    public RuntimeObjectList withHost(Collection<Host> values) {
        if (values!= null) {
            getHost().addAll(values);
        }
        return this;
    }

    public RuntimeObjectList withRuntimeApplication(RuntimeApplication... values) {
        if (values!= null) {
            for (RuntimeApplication value: values) {
                getRuntimeApplication().add(value);
            }
        }
        return this;
    }

    public RuntimeObjectList withRuntimeApplication(Collection<RuntimeApplication> values) {
        if (values!= null) {
            getRuntimeApplication().addAll(values);
        }
        return this;
    }

    public RuntimeObjectList withEventArchive(String... values) {
        if (values!= null) {
            for (String value: values) {
                getEventArchive().add(value);
            }
        }
        return this;
    }

    public RuntimeObjectList withEventArchive(Collection<String> values) {
        if (values!= null) {
            getEventArchive().addAll(values);
        }
        return this;
    }

    public RuntimeObjectList withController(Controller... values) {
        if (values!= null) {
            for (Controller value: values) {
                getController().add(value);
            }
        }
        return this;
    }

    public RuntimeObjectList withController(Collection<Controller> values) {
        if (values!= null) {
            getController().addAll(values);
        }
        return this;
    }

    public RuntimeObjectList withApplicationAssignmentRule(ApplicationAssignmentRule... values) {
        if (values!= null) {
            for (ApplicationAssignmentRule value: values) {
                getApplicationAssignmentRule().add(value);
            }
        }
        return this;
    }

    public RuntimeObjectList withApplicationAssignmentRule(Collection<ApplicationAssignmentRule> values) {
        if (values!= null) {
            getApplicationAssignmentRule().addAll(values);
        }
        return this;
    }

    public RuntimeObjectList withRulepack(List<String> rulepack) {
        setRulepack(rulepack);
        return this;
    }

    public RuntimeObjectList withRuntimeConfiguration(List<RuntimeConfiguration> runtimeConfiguration) {
        setRuntimeConfiguration(runtimeConfiguration);
        return this;
    }

    public RuntimeObjectList withFederation(List<Federation> federation) {
        setFederation(federation);
        return this;
    }

    public RuntimeObjectList withHost(List<Host> host) {
        setHost(host);
        return this;
    }

    public RuntimeObjectList withRuntimeApplication(List<RuntimeApplication> runtimeApplication) {
        setRuntimeApplication(runtimeApplication);
        return this;
    }

    public RuntimeObjectList withEventArchive(List<String> eventArchive) {
        setEventArchive(eventArchive);
        return this;
    }

    public RuntimeObjectList withController(List<Controller> controller) {
        setController(controller);
        return this;
    }

    public RuntimeObjectList withApplicationAssignmentRule(List<ApplicationAssignmentRule> applicationAssignmentRule) {
        setApplicationAssignmentRule(applicationAssignmentRule);
        return this;
    }

}

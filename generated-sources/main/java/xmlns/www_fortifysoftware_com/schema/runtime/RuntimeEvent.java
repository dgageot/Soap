
package xmlns.www_fortifysoftware_com.schema.runtime;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;


/**
 * <p>Java class for RuntimeEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RuntimeEvent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Category" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RuleId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MonitorId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExceptionStackChecksum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EventStackChecksum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EventType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DescriptionPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Severity" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="ImpactBias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Audience" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryAudience" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CoveredRta" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CoveredSca" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RequestHeader" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RequestIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SessionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RequestUri" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RequestHost" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RequestPort" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RequestParameter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SuggestedAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AuthenticatedUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Cookie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Referer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserAgent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Trigger" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Action" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Dispatch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Kingdom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Hour" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Attack" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Vulnerability" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Audit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HostId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ApplicationId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="RequestMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RequestScheme" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Alerted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Hostname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HostAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FederationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OtherAttributes" type="{xmlns://www.fortifysoftware.com/schema/runtime}RuntimeEventAttribute" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RuntimeAlerts" type="{xmlns://www.fortifysoftware.com/schema/runtime}RuntimeAlert" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RuntimeEvent", propOrder = {
    "id",
    "category",
    "ruleId",
    "monitorId",
    "exceptionStackChecksum",
    "eventStackChecksum",
    "eventType",
    "timestamp",
    "descriptionPath",
    "severity",
    "impactBias",
    "audience",
    "primaryAudience",
    "coveredRta",
    "coveredSca",
    "requestHeader",
    "requestIp",
    "sessionId",
    "requestUri",
    "requestHost",
    "requestPort",
    "requestParameter",
    "suggestedAction",
    "authenticatedUser",
    "cookie",
    "referer",
    "userAgent",
    "trigger",
    "action",
    "dispatch",
    "kingdom",
    "hour",
    "attack",
    "vulnerability",
    "audit",
    "hostId",
    "applicationId",
    "requestMethod",
    "priority",
    "requestScheme",
    "alerted",
    "hostname",
    "hostAddress",
    "federationName",
    "otherAttributes",
    "runtimeAlerts"
})
public class RuntimeEvent {

    @XmlElement(name = "Id")
    protected long id;
    @XmlElement(name = "Category")
    protected String category;
    @XmlElement(name = "RuleId")
    protected String ruleId;
    @XmlElement(name = "MonitorId")
    protected String monitorId;
    @XmlElement(name = "ExceptionStackChecksum")
    protected String exceptionStackChecksum;
    @XmlElement(name = "EventStackChecksum")
    protected String eventStackChecksum;
    @XmlElement(name = "EventType")
    protected String eventType;
    @XmlElement(name = "Timestamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timestamp;
    @XmlElement(name = "DescriptionPath")
    protected String descriptionPath;
    @XmlElement(name = "Severity")
    protected Float severity;
    @XmlElement(name = "ImpactBias")
    protected String impactBias;
    @XmlElement(name = "Audience")
    protected String audience;
    @XmlElement(name = "PrimaryAudience")
    protected String primaryAudience;
    @XmlElement(name = "CoveredRta")
    protected Boolean coveredRta;
    @XmlElement(name = "CoveredSca")
    protected Boolean coveredSca;
    @XmlElement(name = "RequestHeader")
    protected String requestHeader;
    @XmlElement(name = "RequestIP")
    protected String requestIp;
    @XmlElement(name = "SessionId")
    protected String sessionId;
    @XmlElement(name = "RequestUri")
    protected String requestUri;
    @XmlElement(name = "RequestHost")
    protected String requestHost;
    @XmlElement(name = "RequestPort")
    protected Integer requestPort;
    @XmlElement(name = "RequestParameter")
    protected String requestParameter;
    @XmlElement(name = "SuggestedAction")
    protected String suggestedAction;
    @XmlElement(name = "AuthenticatedUser")
    protected String authenticatedUser;
    @XmlElement(name = "Cookie")
    protected String cookie;
    @XmlElement(name = "Referer")
    protected String referer;
    @XmlElement(name = "UserAgent")
    protected String userAgent;
    @XmlElement(name = "Trigger")
    protected String trigger;
    @XmlElement(name = "Action")
    protected String action;
    @XmlElement(name = "Dispatch")
    protected String dispatch;
    @XmlElement(name = "Kingdom")
    protected String kingdom;
    @XmlElement(name = "Hour")
    protected Integer hour;
    @XmlElement(name = "Attack")
    protected Boolean attack;
    @XmlElement(name = "Vulnerability")
    protected Boolean vulnerability;
    @XmlElement(name = "Audit")
    protected Boolean audit;
    @XmlElement(name = "HostId")
    protected Long hostId;
    @XmlElement(name = "ApplicationId")
    protected Long applicationId;
    @XmlElement(name = "RequestMethod")
    protected String requestMethod;
    @XmlElement(name = "Priority")
    protected String priority;
    @XmlElement(name = "RequestScheme")
    protected String requestScheme;
    @XmlElement(name = "Alerted")
    protected Boolean alerted;
    @XmlElement(name = "Hostname")
    protected String hostname;
    @XmlElement(name = "HostAddress")
    protected String hostAddress;
    @XmlElement(name = "FederationName")
    protected String federationName;
    @XmlElement(name = "OtherAttributes")
    protected List<RuntimeEventAttribute> otherAttributes;
    @XmlElement(name = "RuntimeAlerts")
    protected List<RuntimeAlert> runtimeAlerts;

    /**
     * Default no-arg constructor
     * 
     */
    public RuntimeEvent() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public RuntimeEvent(final long id, final String category, final String ruleId, final String monitorId, final String exceptionStackChecksum, final String eventStackChecksum, final String eventType, final XMLGregorianCalendar timestamp, final String descriptionPath, final Float severity, final String impactBias, final String audience, final String primaryAudience, final Boolean coveredRta, final Boolean coveredSca, final String requestHeader, final String requestIp, final String sessionId, final String requestUri, final String requestHost, final Integer requestPort, final String requestParameter, final String suggestedAction, final String authenticatedUser, final String cookie, final String referer, final String userAgent, final String trigger, final String action, final String dispatch, final String kingdom, final Integer hour, final Boolean attack, final Boolean vulnerability, final Boolean audit, final Long hostId, final Long applicationId, final String requestMethod, final String priority, final String requestScheme, final Boolean alerted, final String hostname, final String hostAddress, final String federationName, final List<RuntimeEventAttribute> otherAttributes, final List<RuntimeAlert> runtimeAlerts) {
        this.id = id;
        this.category = category;
        this.ruleId = ruleId;
        this.monitorId = monitorId;
        this.exceptionStackChecksum = exceptionStackChecksum;
        this.eventStackChecksum = eventStackChecksum;
        this.eventType = eventType;
        this.timestamp = timestamp;
        this.descriptionPath = descriptionPath;
        this.severity = severity;
        this.impactBias = impactBias;
        this.audience = audience;
        this.primaryAudience = primaryAudience;
        this.coveredRta = coveredRta;
        this.coveredSca = coveredSca;
        this.requestHeader = requestHeader;
        this.requestIp = requestIp;
        this.sessionId = sessionId;
        this.requestUri = requestUri;
        this.requestHost = requestHost;
        this.requestPort = requestPort;
        this.requestParameter = requestParameter;
        this.suggestedAction = suggestedAction;
        this.authenticatedUser = authenticatedUser;
        this.cookie = cookie;
        this.referer = referer;
        this.userAgent = userAgent;
        this.trigger = trigger;
        this.action = action;
        this.dispatch = dispatch;
        this.kingdom = kingdom;
        this.hour = hour;
        this.attack = attack;
        this.vulnerability = vulnerability;
        this.audit = audit;
        this.hostId = hostId;
        this.applicationId = applicationId;
        this.requestMethod = requestMethod;
        this.priority = priority;
        this.requestScheme = requestScheme;
        this.alerted = alerted;
        this.hostname = hostname;
        this.hostAddress = hostAddress;
        this.federationName = federationName;
        this.otherAttributes = otherAttributes;
        this.runtimeAlerts = runtimeAlerts;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
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

    /**
     * Gets the value of the monitorId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonitorId() {
        return monitorId;
    }

    /**
     * Sets the value of the monitorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonitorId(String value) {
        this.monitorId = value;
    }

    /**
     * Gets the value of the exceptionStackChecksum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExceptionStackChecksum() {
        return exceptionStackChecksum;
    }

    /**
     * Sets the value of the exceptionStackChecksum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExceptionStackChecksum(String value) {
        this.exceptionStackChecksum = value;
    }

    /**
     * Gets the value of the eventStackChecksum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventStackChecksum() {
        return eventStackChecksum;
    }

    /**
     * Sets the value of the eventStackChecksum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventStackChecksum(String value) {
        this.eventStackChecksum = value;
    }

    /**
     * Gets the value of the eventType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventType() {
        return eventType;
    }

    /**
     * Sets the value of the eventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventType(String value) {
        this.eventType = value;
    }

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimestamp(XMLGregorianCalendar value) {
        this.timestamp = value;
    }

    /**
     * Gets the value of the descriptionPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionPath() {
        return descriptionPath;
    }

    /**
     * Sets the value of the descriptionPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionPath(String value) {
        this.descriptionPath = value;
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
     * Gets the value of the impactBias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImpactBias() {
        return impactBias;
    }

    /**
     * Sets the value of the impactBias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImpactBias(String value) {
        this.impactBias = value;
    }

    /**
     * Gets the value of the audience property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAudience() {
        return audience;
    }

    /**
     * Sets the value of the audience property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAudience(String value) {
        this.audience = value;
    }

    /**
     * Gets the value of the primaryAudience property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryAudience() {
        return primaryAudience;
    }

    /**
     * Sets the value of the primaryAudience property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryAudience(String value) {
        this.primaryAudience = value;
    }

    /**
     * Gets the value of the coveredRta property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCoveredRta() {
        return coveredRta;
    }

    /**
     * Sets the value of the coveredRta property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCoveredRta(Boolean value) {
        this.coveredRta = value;
    }

    /**
     * Gets the value of the coveredSca property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCoveredSca() {
        return coveredSca;
    }

    /**
     * Sets the value of the coveredSca property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCoveredSca(Boolean value) {
        this.coveredSca = value;
    }

    /**
     * Gets the value of the requestHeader property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestHeader() {
        return requestHeader;
    }

    /**
     * Sets the value of the requestHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestHeader(String value) {
        this.requestHeader = value;
    }

    /**
     * Gets the value of the requestIp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestIp() {
        return requestIp;
    }

    /**
     * Sets the value of the requestIp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestIp(String value) {
        this.requestIp = value;
    }

    /**
     * Gets the value of the sessionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * Sets the value of the sessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionId(String value) {
        this.sessionId = value;
    }

    /**
     * Gets the value of the requestUri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestUri() {
        return requestUri;
    }

    /**
     * Sets the value of the requestUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestUri(String value) {
        this.requestUri = value;
    }

    /**
     * Gets the value of the requestHost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestHost() {
        return requestHost;
    }

    /**
     * Sets the value of the requestHost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestHost(String value) {
        this.requestHost = value;
    }

    /**
     * Gets the value of the requestPort property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRequestPort() {
        return requestPort;
    }

    /**
     * Sets the value of the requestPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRequestPort(Integer value) {
        this.requestPort = value;
    }

    /**
     * Gets the value of the requestParameter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestParameter() {
        return requestParameter;
    }

    /**
     * Sets the value of the requestParameter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestParameter(String value) {
        this.requestParameter = value;
    }

    /**
     * Gets the value of the suggestedAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuggestedAction() {
        return suggestedAction;
    }

    /**
     * Sets the value of the suggestedAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuggestedAction(String value) {
        this.suggestedAction = value;
    }

    /**
     * Gets the value of the authenticatedUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthenticatedUser() {
        return authenticatedUser;
    }

    /**
     * Sets the value of the authenticatedUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthenticatedUser(String value) {
        this.authenticatedUser = value;
    }

    /**
     * Gets the value of the cookie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCookie() {
        return cookie;
    }

    /**
     * Sets the value of the cookie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCookie(String value) {
        this.cookie = value;
    }

    /**
     * Gets the value of the referer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferer() {
        return referer;
    }

    /**
     * Sets the value of the referer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferer(String value) {
        this.referer = value;
    }

    /**
     * Gets the value of the userAgent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserAgent() {
        return userAgent;
    }

    /**
     * Sets the value of the userAgent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserAgent(String value) {
        this.userAgent = value;
    }

    /**
     * Gets the value of the trigger property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrigger() {
        return trigger;
    }

    /**
     * Sets the value of the trigger property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrigger(String value) {
        this.trigger = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAction(String value) {
        this.action = value;
    }

    /**
     * Gets the value of the dispatch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDispatch() {
        return dispatch;
    }

    /**
     * Sets the value of the dispatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDispatch(String value) {
        this.dispatch = value;
    }

    /**
     * Gets the value of the kingdom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKingdom() {
        return kingdom;
    }

    /**
     * Sets the value of the kingdom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKingdom(String value) {
        this.kingdom = value;
    }

    /**
     * Gets the value of the hour property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHour() {
        return hour;
    }

    /**
     * Sets the value of the hour property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHour(Integer value) {
        this.hour = value;
    }

    /**
     * Gets the value of the attack property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAttack() {
        return attack;
    }

    /**
     * Sets the value of the attack property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAttack(Boolean value) {
        this.attack = value;
    }

    /**
     * Gets the value of the vulnerability property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVulnerability() {
        return vulnerability;
    }

    /**
     * Sets the value of the vulnerability property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVulnerability(Boolean value) {
        this.vulnerability = value;
    }

    /**
     * Gets the value of the audit property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAudit() {
        return audit;
    }

    /**
     * Sets the value of the audit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAudit(Boolean value) {
        this.audit = value;
    }

    /**
     * Gets the value of the hostId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getHostId() {
        return hostId;
    }

    /**
     * Sets the value of the hostId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHostId(Long value) {
        this.hostId = value;
    }

    /**
     * Gets the value of the applicationId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getApplicationId() {
        return applicationId;
    }

    /**
     * Sets the value of the applicationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setApplicationId(Long value) {
        this.applicationId = value;
    }

    /**
     * Gets the value of the requestMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestMethod() {
        return requestMethod;
    }

    /**
     * Sets the value of the requestMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestMethod(String value) {
        this.requestMethod = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriority(String value) {
        this.priority = value;
    }

    /**
     * Gets the value of the requestScheme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestScheme() {
        return requestScheme;
    }

    /**
     * Sets the value of the requestScheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestScheme(String value) {
        this.requestScheme = value;
    }

    /**
     * Gets the value of the alerted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAlerted() {
        return alerted;
    }

    /**
     * Sets the value of the alerted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAlerted(Boolean value) {
        this.alerted = value;
    }

    /**
     * Gets the value of the hostname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostname() {
        return hostname;
    }

    /**
     * Sets the value of the hostname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostname(String value) {
        this.hostname = value;
    }

    /**
     * Gets the value of the hostAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostAddress() {
        return hostAddress;
    }

    /**
     * Sets the value of the hostAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostAddress(String value) {
        this.hostAddress = value;
    }

    /**
     * Gets the value of the federationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFederationName() {
        return federationName;
    }

    /**
     * Sets the value of the federationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFederationName(String value) {
        this.federationName = value;
    }

    /**
     * Gets the value of the otherAttributes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherAttributes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherAttributes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RuntimeEventAttribute }
     * 
     * 
     */
    public List<RuntimeEventAttribute> getOtherAttributes() {
        if (otherAttributes == null) {
            otherAttributes = new ArrayList<RuntimeEventAttribute>();
        }
        return this.otherAttributes;
    }

    /**
     * Gets the value of the runtimeAlerts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the runtimeAlerts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRuntimeAlerts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RuntimeAlert }
     * 
     * 
     */
    public List<RuntimeAlert> getRuntimeAlerts() {
        if (runtimeAlerts == null) {
            runtimeAlerts = new ArrayList<RuntimeAlert>();
        }
        return this.runtimeAlerts;
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
     * Sets the value of the otherAttributes property.
     * 
     * @param otherAttributes
     *     allowed object is
     *     {@link RuntimeEventAttribute }
     *     
     */
    public void setOtherAttributes(List<RuntimeEventAttribute> otherAttributes) {
        this.otherAttributes = otherAttributes;
    }

    /**
     * Sets the value of the runtimeAlerts property.
     * 
     * @param runtimeAlerts
     *     allowed object is
     *     {@link RuntimeAlert }
     *     
     */
    public void setRuntimeAlerts(List<RuntimeAlert> runtimeAlerts) {
        this.runtimeAlerts = runtimeAlerts;
    }

    public RuntimeEvent withId(long value) {
        setId(value);
        return this;
    }

    public RuntimeEvent withCategory(String value) {
        setCategory(value);
        return this;
    }

    public RuntimeEvent withRuleId(String value) {
        setRuleId(value);
        return this;
    }

    public RuntimeEvent withMonitorId(String value) {
        setMonitorId(value);
        return this;
    }

    public RuntimeEvent withExceptionStackChecksum(String value) {
        setExceptionStackChecksum(value);
        return this;
    }

    public RuntimeEvent withEventStackChecksum(String value) {
        setEventStackChecksum(value);
        return this;
    }

    public RuntimeEvent withEventType(String value) {
        setEventType(value);
        return this;
    }

    public RuntimeEvent withTimestamp(XMLGregorianCalendar value) {
        setTimestamp(value);
        return this;
    }

    public RuntimeEvent withDescriptionPath(String value) {
        setDescriptionPath(value);
        return this;
    }

    public RuntimeEvent withSeverity(Float value) {
        setSeverity(value);
        return this;
    }

    public RuntimeEvent withImpactBias(String value) {
        setImpactBias(value);
        return this;
    }

    public RuntimeEvent withAudience(String value) {
        setAudience(value);
        return this;
    }

    public RuntimeEvent withPrimaryAudience(String value) {
        setPrimaryAudience(value);
        return this;
    }

    public RuntimeEvent withCoveredRta(Boolean value) {
        setCoveredRta(value);
        return this;
    }

    public RuntimeEvent withCoveredSca(Boolean value) {
        setCoveredSca(value);
        return this;
    }

    public RuntimeEvent withRequestHeader(String value) {
        setRequestHeader(value);
        return this;
    }

    public RuntimeEvent withRequestIp(String value) {
        setRequestIp(value);
        return this;
    }

    public RuntimeEvent withSessionId(String value) {
        setSessionId(value);
        return this;
    }

    public RuntimeEvent withRequestUri(String value) {
        setRequestUri(value);
        return this;
    }

    public RuntimeEvent withRequestHost(String value) {
        setRequestHost(value);
        return this;
    }

    public RuntimeEvent withRequestPort(Integer value) {
        setRequestPort(value);
        return this;
    }

    public RuntimeEvent withRequestParameter(String value) {
        setRequestParameter(value);
        return this;
    }

    public RuntimeEvent withSuggestedAction(String value) {
        setSuggestedAction(value);
        return this;
    }

    public RuntimeEvent withAuthenticatedUser(String value) {
        setAuthenticatedUser(value);
        return this;
    }

    public RuntimeEvent withCookie(String value) {
        setCookie(value);
        return this;
    }

    public RuntimeEvent withReferer(String value) {
        setReferer(value);
        return this;
    }

    public RuntimeEvent withUserAgent(String value) {
        setUserAgent(value);
        return this;
    }

    public RuntimeEvent withTrigger(String value) {
        setTrigger(value);
        return this;
    }

    public RuntimeEvent withAction(String value) {
        setAction(value);
        return this;
    }

    public RuntimeEvent withDispatch(String value) {
        setDispatch(value);
        return this;
    }

    public RuntimeEvent withKingdom(String value) {
        setKingdom(value);
        return this;
    }

    public RuntimeEvent withHour(Integer value) {
        setHour(value);
        return this;
    }

    public RuntimeEvent withAttack(Boolean value) {
        setAttack(value);
        return this;
    }

    public RuntimeEvent withVulnerability(Boolean value) {
        setVulnerability(value);
        return this;
    }

    public RuntimeEvent withAudit(Boolean value) {
        setAudit(value);
        return this;
    }

    public RuntimeEvent withHostId(Long value) {
        setHostId(value);
        return this;
    }

    public RuntimeEvent withApplicationId(Long value) {
        setApplicationId(value);
        return this;
    }

    public RuntimeEvent withRequestMethod(String value) {
        setRequestMethod(value);
        return this;
    }

    public RuntimeEvent withPriority(String value) {
        setPriority(value);
        return this;
    }

    public RuntimeEvent withRequestScheme(String value) {
        setRequestScheme(value);
        return this;
    }

    public RuntimeEvent withAlerted(Boolean value) {
        setAlerted(value);
        return this;
    }

    public RuntimeEvent withHostname(String value) {
        setHostname(value);
        return this;
    }

    public RuntimeEvent withHostAddress(String value) {
        setHostAddress(value);
        return this;
    }

    public RuntimeEvent withFederationName(String value) {
        setFederationName(value);
        return this;
    }

    public RuntimeEvent withOtherAttributes(RuntimeEventAttribute... values) {
        if (values!= null) {
            for (RuntimeEventAttribute value: values) {
                getOtherAttributes().add(value);
            }
        }
        return this;
    }

    public RuntimeEvent withOtherAttributes(Collection<RuntimeEventAttribute> values) {
        if (values!= null) {
            getOtherAttributes().addAll(values);
        }
        return this;
    }

    public RuntimeEvent withRuntimeAlerts(RuntimeAlert... values) {
        if (values!= null) {
            for (RuntimeAlert value: values) {
                getRuntimeAlerts().add(value);
            }
        }
        return this;
    }

    public RuntimeEvent withRuntimeAlerts(Collection<RuntimeAlert> values) {
        if (values!= null) {
            getRuntimeAlerts().addAll(values);
        }
        return this;
    }

    public RuntimeEvent withOtherAttributes(List<RuntimeEventAttribute> otherAttributes) {
        setOtherAttributes(otherAttributes);
        return this;
    }

    public RuntimeEvent withRuntimeAlerts(List<RuntimeAlert> runtimeAlerts) {
        setRuntimeAlerts(runtimeAlerts);
        return this;
    }

}

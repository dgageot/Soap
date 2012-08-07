
package xmlns.www_fortifysoftware_com.schema.wstypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.fortify.schema.fws.AuditViewRequest;
import com.fortify.schema.fws.DescriptionAndRecommendationRequest;
import com.fortify.schema.fws.GroupingValuesRequest;
import com.fortify.schema.fws.InvalidateAuditSessionRequest;
import com.fortify.schema.fws.IssueListRequest;
import com.fortify.schema.fws.PerformAuditActionRequest;
import com.fortify.schema.fws.SubmitBugRequest;
import com.fortify.schema.fws.TraceNodesRequest;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;


/**
 * <p>Java class for ManagedSessionRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManagedSessionRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="sessionId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManagedSessionRequest")
@XmlSeeAlso({
    AuditViewRequest.class,
    SubmitBugRequest.class,
    DescriptionAndRecommendationRequest.class,
    TraceNodesRequest.class,
    InvalidateAuditSessionRequest.class,
    IssueListRequest.class,
    GroupingValuesRequest.class,
    PerformAuditActionRequest.class
})
public class ManagedSessionRequest {

    @XmlAttribute(required = true)
    protected String sessionId;

    /**
     * Default no-arg constructor
     * 
     */
    public ManagedSessionRequest() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ManagedSessionRequest(final String sessionId) {
        this.sessionId = sessionId;
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

    public ManagedSessionRequest withSessionId(String value) {
        setSessionId(value);
        return this;
    }

}

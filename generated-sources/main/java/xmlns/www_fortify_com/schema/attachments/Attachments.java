
package xmlns.www_fortify_com.schema.attachments;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element ref="{xmlns://www.fortify.com/schema/attachments}IssueAttachments" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "issueAttachments"
})
@XmlRootElement(name = "Attachments")
public class Attachments {

    @XmlElement(name = "IssueAttachments")
    protected List<IssueAttachments> issueAttachments;
    @XmlAttribute(required = true)
    protected String version;

    /**
     * Default no-arg constructor
     * 
     */
    public Attachments() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public Attachments(final List<IssueAttachments> issueAttachments, final String version) {
        this.issueAttachments = issueAttachments;
        this.version = version;
    }

    /**
     * Gets the value of the issueAttachments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the issueAttachments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIssueAttachments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IssueAttachments }
     * 
     * 
     */
    public List<IssueAttachments> getIssueAttachments() {
        if (issueAttachments == null) {
            issueAttachments = new ArrayList<IssueAttachments>();
        }
        return this.issueAttachments;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
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
     * Sets the value of the issueAttachments property.
     * 
     * @param issueAttachments
     *     allowed object is
     *     {@link IssueAttachments }
     *     
     */
    public void setIssueAttachments(List<IssueAttachments> issueAttachments) {
        this.issueAttachments = issueAttachments;
    }

    public Attachments withIssueAttachments(IssueAttachments... values) {
        if (values!= null) {
            for (IssueAttachments value: values) {
                getIssueAttachments().add(value);
            }
        }
        return this;
    }

    public Attachments withIssueAttachments(Collection<IssueAttachments> values) {
        if (values!= null) {
            getIssueAttachments().addAll(values);
        }
        return this;
    }

    public Attachments withVersion(String value) {
        setVersion(value);
        return this;
    }

    public Attachments withIssueAttachments(List<IssueAttachments> issueAttachments) {
        setIssueAttachments(issueAttachments);
        return this;
    }

}

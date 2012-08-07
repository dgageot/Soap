
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
 *         &lt;element ref="{xmlns://www.fortify.com/schema/attachments}Attachment" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="issueInstanceId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="revision" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "attachment"
})
@XmlRootElement(name = "IssueAttachments")
public class IssueAttachments {

    @XmlElement(name = "Attachment", required = true)
    protected List<Attachment> attachment;
    @XmlAttribute(required = true)
    protected String issueInstanceId;
    @XmlAttribute(required = true)
    protected int revision;

    /**
     * Default no-arg constructor
     * 
     */
    public IssueAttachments() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public IssueAttachments(final List<Attachment> attachment, final String issueInstanceId, final int revision) {
        this.attachment = attachment;
        this.issueInstanceId = issueInstanceId;
        this.revision = revision;
    }

    /**
     * Gets the value of the attachment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttachment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Attachment }
     * 
     * 
     */
    public List<Attachment> getAttachment() {
        if (attachment == null) {
            attachment = new ArrayList<Attachment>();
        }
        return this.attachment;
    }

    /**
     * Gets the value of the issueInstanceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssueInstanceId() {
        return issueInstanceId;
    }

    /**
     * Sets the value of the issueInstanceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssueInstanceId(String value) {
        this.issueInstanceId = value;
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
     * Sets the value of the attachment property.
     * 
     * @param attachment
     *     allowed object is
     *     {@link Attachment }
     *     
     */
    public void setAttachment(List<Attachment> attachment) {
        this.attachment = attachment;
    }

    public IssueAttachments withAttachment(Attachment... values) {
        if (values!= null) {
            for (Attachment value: values) {
                getAttachment().add(value);
            }
        }
        return this;
    }

    public IssueAttachments withAttachment(Collection<Attachment> values) {
        if (values!= null) {
            getAttachment().addAll(values);
        }
        return this;
    }

    public IssueAttachments withIssueInstanceId(String value) {
        setIssueInstanceId(value);
        return this;
    }

    public IssueAttachments withRevision(int value) {
        setRevision(value);
        return this;
    }

    public IssueAttachments withAttachment(List<Attachment> attachment) {
        setAttachment(attachment);
        return this;
    }

}


package xmlns.www_fortify_com.schema.audit;

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
 *         &lt;element ref="{xmlns://www.fortify.com/schema/audit}Comment" maxOccurs="unbounded" minOccurs="0"/>
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
    "comment"
})
@XmlRootElement(name = "ThreadedComments")
public class ThreadedComments {

    @XmlElement(name = "Comment")
    protected List<Comment> comment;

    /**
     * Default no-arg constructor
     * 
     */
    public ThreadedComments() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ThreadedComments(final List<Comment> comment) {
        this.comment = comment;
    }

    /**
     * Gets the value of the comment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Comment }
     * 
     * 
     */
    public List<Comment> getComment() {
        if (comment == null) {
            comment = new ArrayList<Comment>();
        }
        return this.comment;
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
     * Sets the value of the comment property.
     * 
     * @param comment
     *     allowed object is
     *     {@link Comment }
     *     
     */
    public void setComment(List<Comment> comment) {
        this.comment = comment;
    }

    public ThreadedComments withComment(Comment... values) {
        if (values!= null) {
            for (Comment value: values) {
                getComment().add(value);
            }
        }
        return this;
    }

    public ThreadedComments withComment(Collection<Comment> values) {
        if (values!= null) {
            getComment().addAll(values);
        }
        return this;
    }

    public ThreadedComments withComment(List<Comment> comment) {
        setComment(comment);
        return this;
    }

}

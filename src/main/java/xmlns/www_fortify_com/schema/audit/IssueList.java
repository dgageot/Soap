
package xmlns.www_fortify_com.schema.audit;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
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
 *         &lt;element ref="{xmlns://www.fortify.com/schema/audit}Issue" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{xmlns://www.fortify.com/schema/audit}CustomIssue" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{xmlns://www.fortify.com/schema/audit}RemovedIssue" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;any/>
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
    "issue",
    "customIssue",
    "removedIssue",
    "any"
})
@XmlRootElement(name = "IssueList")
public class IssueList {

    @XmlElement(name = "Issue")
    protected List<Issue> issue;
    @XmlElement(name = "CustomIssue")
    protected List<CustomIssue> customIssue;
    @XmlElement(name = "RemovedIssue")
    protected List<RemovedIssue> removedIssue;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Default no-arg constructor
     * 
     */
    public IssueList() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public IssueList(final List<Issue> issue, final List<CustomIssue> customIssue, final List<RemovedIssue> removedIssue, final List<Object> any) {
        this.issue = issue;
        this.customIssue = customIssue;
        this.removedIssue = removedIssue;
        this.any = any;
    }

    /**
     * Gets the value of the issue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the issue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIssue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Issue }
     * 
     * 
     */
    public List<Issue> getIssue() {
        if (issue == null) {
            issue = new ArrayList<Issue>();
        }
        return this.issue;
    }

    /**
     * Gets the value of the customIssue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customIssue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomIssue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomIssue }
     * 
     * 
     */
    public List<CustomIssue> getCustomIssue() {
        if (customIssue == null) {
            customIssue = new ArrayList<CustomIssue>();
        }
        return this.customIssue;
    }

    /**
     * Gets the value of the removedIssue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the removedIssue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemovedIssue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RemovedIssue }
     * 
     * 
     */
    public List<RemovedIssue> getRemovedIssue() {
        if (removedIssue == null) {
            removedIssue = new ArrayList<RemovedIssue>();
        }
        return this.removedIssue;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
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
     * Sets the value of the issue property.
     * 
     * @param issue
     *     allowed object is
     *     {@link Issue }
     *     
     */
    public void setIssue(List<Issue> issue) {
        this.issue = issue;
    }

    /**
     * Sets the value of the customIssue property.
     * 
     * @param customIssue
     *     allowed object is
     *     {@link CustomIssue }
     *     
     */
    public void setCustomIssue(List<CustomIssue> customIssue) {
        this.customIssue = customIssue;
    }

    /**
     * Sets the value of the removedIssue property.
     * 
     * @param removedIssue
     *     allowed object is
     *     {@link RemovedIssue }
     *     
     */
    public void setRemovedIssue(List<RemovedIssue> removedIssue) {
        this.removedIssue = removedIssue;
    }

    /**
     * Sets the value of the any property.
     * 
     * @param any
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAny(List<Object> any) {
        this.any = any;
    }

    public IssueList withIssue(Issue... values) {
        if (values!= null) {
            for (Issue value: values) {
                getIssue().add(value);
            }
        }
        return this;
    }

    public IssueList withIssue(Collection<Issue> values) {
        if (values!= null) {
            getIssue().addAll(values);
        }
        return this;
    }

    public IssueList withCustomIssue(CustomIssue... values) {
        if (values!= null) {
            for (CustomIssue value: values) {
                getCustomIssue().add(value);
            }
        }
        return this;
    }

    public IssueList withCustomIssue(Collection<CustomIssue> values) {
        if (values!= null) {
            getCustomIssue().addAll(values);
        }
        return this;
    }

    public IssueList withRemovedIssue(RemovedIssue... values) {
        if (values!= null) {
            for (RemovedIssue value: values) {
                getRemovedIssue().add(value);
            }
        }
        return this;
    }

    public IssueList withRemovedIssue(Collection<RemovedIssue> values) {
        if (values!= null) {
            getRemovedIssue().addAll(values);
        }
        return this;
    }

    public IssueList withAny(Object... values) {
        if (values!= null) {
            for (Object value: values) {
                getAny().add(value);
            }
        }
        return this;
    }

    public IssueList withAny(Collection<Object> values) {
        if (values!= null) {
            getAny().addAll(values);
        }
        return this;
    }

    public IssueList withIssue(List<Issue> issue) {
        setIssue(issue);
        return this;
    }

    public IssueList withCustomIssue(List<CustomIssue> customIssue) {
        setCustomIssue(customIssue);
        return this;
    }

    public IssueList withRemovedIssue(List<RemovedIssue> removedIssue) {
        setRemovedIssue(removedIssue);
        return this;
    }

    public IssueList withAny(List<Object> any) {
        setAny(any);
        return this;
    }

}

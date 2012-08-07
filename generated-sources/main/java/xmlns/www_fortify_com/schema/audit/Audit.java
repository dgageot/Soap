
package xmlns.www_fortify_com.schema.audit;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
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
 *         &lt;element ref="{xmlns://www.fortify.com/schema/audit}ProjectInfo"/>
 *         &lt;element ref="{xmlns://www.fortify.com/schema/audit}IssueList"/>
 *         &lt;any/>
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
    "projectInfo",
    "issueList",
    "any"
})
@XmlRootElement(name = "Audit")
public class Audit {

    @XmlElement(name = "ProjectInfo", required = true)
    protected ProjectInfo projectInfo;
    @XmlElement(name = "IssueList", required = true)
    protected IssueList issueList;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute(required = true)
    protected String version;

    /**
     * Default no-arg constructor
     * 
     */
    public Audit() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public Audit(final ProjectInfo projectInfo, final IssueList issueList, final List<Object> any, final String version) {
        this.projectInfo = projectInfo;
        this.issueList = issueList;
        this.any = any;
        this.version = version;
    }

    /**
     * Gets the value of the projectInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectInfo }
     *     
     */
    public ProjectInfo getProjectInfo() {
        return projectInfo;
    }

    /**
     * Sets the value of the projectInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectInfo }
     *     
     */
    public void setProjectInfo(ProjectInfo value) {
        this.projectInfo = value;
    }

    /**
     * Gets the value of the issueList property.
     * 
     * @return
     *     possible object is
     *     {@link IssueList }
     *     
     */
    public IssueList getIssueList() {
        return issueList;
    }

    /**
     * Sets the value of the issueList property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssueList }
     *     
     */
    public void setIssueList(IssueList value) {
        this.issueList = value;
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

    public Audit withProjectInfo(ProjectInfo value) {
        setProjectInfo(value);
        return this;
    }

    public Audit withIssueList(IssueList value) {
        setIssueList(value);
        return this;
    }

    public Audit withAny(Object... values) {
        if (values!= null) {
            for (Object value: values) {
                getAny().add(value);
            }
        }
        return this;
    }

    public Audit withAny(Collection<Object> values) {
        if (values!= null) {
            getAny().addAll(values);
        }
        return this;
    }

    public Audit withVersion(String value) {
        setVersion(value);
        return this;
    }

    public Audit withAny(List<Object> any) {
        setAny(any);
        return this;
    }

}

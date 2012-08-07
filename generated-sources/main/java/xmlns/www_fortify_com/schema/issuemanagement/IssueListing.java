
package xmlns.www_fortify_com.schema.issuemanagement;

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
import xmlns.www_fortifysoftware_com.schema.wstypes.ProjectIdentifier;


/**
 * <p>Java class for IssueListing complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IssueListing">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProjectIdentifier" type="{xmlns://www.fortifysoftware.com/schema/wsTypes}ProjectIdentifier"/>
 *         &lt;element name="ListDescription" type="{xmlns://www.fortify.com/schema/issuemanagement}IssueListDescription"/>
 *         &lt;element name="Issues">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Issue" type="{xmlns://www.fortify.com/schema/issuemanagement}IssueInstance" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="GroupingValues" type="{xmlns://www.fortify.com/schema/issuemanagement}GroupingValue" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IssueListing", propOrder = {
    "projectIdentifier",
    "listDescription",
    "issues",
    "groupingValues"
})
public class IssueListing {

    @XmlElement(name = "ProjectIdentifier", required = true)
    protected ProjectIdentifier projectIdentifier;
    @XmlElement(name = "ListDescription", required = true)
    protected IssueListDescription listDescription;
    @XmlElement(name = "Issues", required = true)
    protected IssueListing.Issues issues;
    @XmlElement(name = "GroupingValues")
    protected List<GroupingValue> groupingValues;

    /**
     * Default no-arg constructor
     * 
     */
    public IssueListing() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public IssueListing(final ProjectIdentifier projectIdentifier, final IssueListDescription listDescription, final IssueListing.Issues issues, final List<GroupingValue> groupingValues) {
        this.projectIdentifier = projectIdentifier;
        this.listDescription = listDescription;
        this.issues = issues;
        this.groupingValues = groupingValues;
    }

    /**
     * Gets the value of the projectIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectIdentifier }
     *     
     */
    public ProjectIdentifier getProjectIdentifier() {
        return projectIdentifier;
    }

    /**
     * Sets the value of the projectIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectIdentifier }
     *     
     */
    public void setProjectIdentifier(ProjectIdentifier value) {
        this.projectIdentifier = value;
    }

    /**
     * Gets the value of the listDescription property.
     * 
     * @return
     *     possible object is
     *     {@link IssueListDescription }
     *     
     */
    public IssueListDescription getListDescription() {
        return listDescription;
    }

    /**
     * Sets the value of the listDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssueListDescription }
     *     
     */
    public void setListDescription(IssueListDescription value) {
        this.listDescription = value;
    }

    /**
     * Gets the value of the issues property.
     * 
     * @return
     *     possible object is
     *     {@link IssueListing.Issues }
     *     
     */
    public IssueListing.Issues getIssues() {
        return issues;
    }

    /**
     * Sets the value of the issues property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssueListing.Issues }
     *     
     */
    public void setIssues(IssueListing.Issues value) {
        this.issues = value;
    }

    /**
     * Gets the value of the groupingValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groupingValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroupingValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GroupingValue }
     * 
     * 
     */
    public List<GroupingValue> getGroupingValues() {
        if (groupingValues == null) {
            groupingValues = new ArrayList<GroupingValue>();
        }
        return this.groupingValues;
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
     * Sets the value of the groupingValues property.
     * 
     * @param groupingValues
     *     allowed object is
     *     {@link GroupingValue }
     *     
     */
    public void setGroupingValues(List<GroupingValue> groupingValues) {
        this.groupingValues = groupingValues;
    }

    public IssueListing withProjectIdentifier(ProjectIdentifier value) {
        setProjectIdentifier(value);
        return this;
    }

    public IssueListing withListDescription(IssueListDescription value) {
        setListDescription(value);
        return this;
    }

    public IssueListing withIssues(IssueListing.Issues value) {
        setIssues(value);
        return this;
    }

    public IssueListing withGroupingValues(GroupingValue... values) {
        if (values!= null) {
            for (GroupingValue value: values) {
                getGroupingValues().add(value);
            }
        }
        return this;
    }

    public IssueListing withGroupingValues(Collection<GroupingValue> values) {
        if (values!= null) {
            getGroupingValues().addAll(values);
        }
        return this;
    }

    public IssueListing withGroupingValues(List<GroupingValue> groupingValues) {
        setGroupingValues(groupingValues);
        return this;
    }


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
     *         &lt;element name="Issue" type="{xmlns://www.fortify.com/schema/issuemanagement}IssueInstance" maxOccurs="unbounded" minOccurs="0"/>
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
        "issue"
    })
    public static class Issues {

        @XmlElement(name = "Issue")
        protected List<IssueInstance> issue;

        /**
         * Default no-arg constructor
         * 
         */
        public Issues() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public Issues(final List<IssueInstance> issue) {
            this.issue = issue;
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
         * {@link IssueInstance }
         * 
         * 
         */
        public List<IssueInstance> getIssue() {
            if (issue == null) {
                issue = new ArrayList<IssueInstance>();
            }
            return this.issue;
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
         *     {@link IssueInstance }
         *     
         */
        public void setIssue(List<IssueInstance> issue) {
            this.issue = issue;
        }

        public IssueListing.Issues withIssue(IssueInstance... values) {
            if (values!= null) {
                for (IssueInstance value: values) {
                    getIssue().add(value);
                }
            }
            return this;
        }

        public IssueListing.Issues withIssue(Collection<IssueInstance> values) {
            if (values!= null) {
                getIssue().addAll(values);
            }
            return this;
        }

        public IssueListing.Issues withIssue(List<IssueInstance> issue) {
            setIssue(issue);
            return this;
        }

    }

}

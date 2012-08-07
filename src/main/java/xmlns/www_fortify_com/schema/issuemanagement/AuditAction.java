
package xmlns.www_fortify_com.schema.issuemanagement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import xmlns.www_fortifysoftware_com.schema.wstypes.ProjectIdentifier;


/**
 * <p>Java class for AuditAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuditAction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProjectIdentifier" type="{xmlns://www.fortifysoftware.com/schema/wsTypes}ProjectIdentifier"/>
 *         &lt;element name="Issues">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="UpdateInstance" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="instanceId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="revision" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="IssueListDescription" type="{xmlns://www.fortify.com/schema/issuemanagement}IssueListDescription"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Action">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="AssignTagValue" type="{xmlns://www.fortify.com/schema/issuemanagement}TagAssignment"/>
 *                   &lt;element name="AddComment" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="AssignToUser" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuditAction", propOrder = {
    "projectIdentifier",
    "issues",
    "action"
})
public class AuditAction {

    @XmlElement(name = "ProjectIdentifier", required = true)
    protected ProjectIdentifier projectIdentifier;
    @XmlElement(name = "Issues", required = true)
    protected AuditAction.Issues issues;
    @XmlElement(name = "Action", required = true)
    protected AuditAction.Action action;

    /**
     * Default no-arg constructor
     * 
     */
    public AuditAction() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public AuditAction(final ProjectIdentifier projectIdentifier, final AuditAction.Issues issues, final AuditAction.Action action) {
        this.projectIdentifier = projectIdentifier;
        this.issues = issues;
        this.action = action;
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
     * Gets the value of the issues property.
     * 
     * @return
     *     possible object is
     *     {@link AuditAction.Issues }
     *     
     */
    public AuditAction.Issues getIssues() {
        return issues;
    }

    /**
     * Sets the value of the issues property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuditAction.Issues }
     *     
     */
    public void setIssues(AuditAction.Issues value) {
        this.issues = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link AuditAction.Action }
     *     
     */
    public AuditAction.Action getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuditAction.Action }
     *     
     */
    public void setAction(AuditAction.Action value) {
        this.action = value;
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

    public AuditAction withProjectIdentifier(ProjectIdentifier value) {
        setProjectIdentifier(value);
        return this;
    }

    public AuditAction withIssues(AuditAction.Issues value) {
        setIssues(value);
        return this;
    }

    public AuditAction withAction(AuditAction.Action value) {
        setAction(value);
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
     *       &lt;choice>
     *         &lt;element name="AssignTagValue" type="{xmlns://www.fortify.com/schema/issuemanagement}TagAssignment"/>
     *         &lt;element name="AddComment" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="AssignToUser" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "assignTagValue",
        "addComment",
        "assignToUser"
    })
    public static class Action {

        @XmlElement(name = "AssignTagValue")
        protected TagAssignment assignTagValue;
        @XmlElement(name = "AddComment")
        protected String addComment;
        @XmlElement(name = "AssignToUser")
        protected String assignToUser;

        /**
         * Default no-arg constructor
         * 
         */
        public Action() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public Action(final TagAssignment assignTagValue, final String addComment, final String assignToUser) {
            this.assignTagValue = assignTagValue;
            this.addComment = addComment;
            this.assignToUser = assignToUser;
        }

        /**
         * Gets the value of the assignTagValue property.
         * 
         * @return
         *     possible object is
         *     {@link TagAssignment }
         *     
         */
        public TagAssignment getAssignTagValue() {
            return assignTagValue;
        }

        /**
         * Sets the value of the assignTagValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link TagAssignment }
         *     
         */
        public void setAssignTagValue(TagAssignment value) {
            this.assignTagValue = value;
        }

        /**
         * Gets the value of the addComment property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAddComment() {
            return addComment;
        }

        /**
         * Sets the value of the addComment property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAddComment(String value) {
            this.addComment = value;
        }

        /**
         * Gets the value of the assignToUser property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssignToUser() {
            return assignToUser;
        }

        /**
         * Sets the value of the assignToUser property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssignToUser(String value) {
            this.assignToUser = value;
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

        public AuditAction.Action withAssignTagValue(TagAssignment value) {
            setAssignTagValue(value);
            return this;
        }

        public AuditAction.Action withAddComment(String value) {
            setAddComment(value);
            return this;
        }

        public AuditAction.Action withAssignToUser(String value) {
            setAssignToUser(value);
            return this;
        }

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
     *       &lt;choice>
     *         &lt;element name="UpdateInstance" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="instanceId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="revision" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="IssueListDescription" type="{xmlns://www.fortify.com/schema/issuemanagement}IssueListDescription"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "updateInstance",
        "issueListDescription"
    })
    public static class Issues {

        @XmlElement(name = "UpdateInstance")
        protected List<AuditAction.Issues.UpdateInstance> updateInstance;
        @XmlElement(name = "IssueListDescription")
        protected IssueListDescription issueListDescription;

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
        public Issues(final List<AuditAction.Issues.UpdateInstance> updateInstance, final IssueListDescription issueListDescription) {
            this.updateInstance = updateInstance;
            this.issueListDescription = issueListDescription;
        }

        /**
         * Gets the value of the updateInstance property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the updateInstance property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getUpdateInstance().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AuditAction.Issues.UpdateInstance }
         * 
         * 
         */
        public List<AuditAction.Issues.UpdateInstance> getUpdateInstance() {
            if (updateInstance == null) {
                updateInstance = new ArrayList<AuditAction.Issues.UpdateInstance>();
            }
            return this.updateInstance;
        }

        /**
         * Gets the value of the issueListDescription property.
         * 
         * @return
         *     possible object is
         *     {@link IssueListDescription }
         *     
         */
        public IssueListDescription getIssueListDescription() {
            return issueListDescription;
        }

        /**
         * Sets the value of the issueListDescription property.
         * 
         * @param value
         *     allowed object is
         *     {@link IssueListDescription }
         *     
         */
        public void setIssueListDescription(IssueListDescription value) {
            this.issueListDescription = value;
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
         * Sets the value of the updateInstance property.
         * 
         * @param updateInstance
         *     allowed object is
         *     {@link AuditAction.Issues.UpdateInstance }
         *     
         */
        public void setUpdateInstance(List<AuditAction.Issues.UpdateInstance> updateInstance) {
            this.updateInstance = updateInstance;
        }

        public AuditAction.Issues withUpdateInstance(AuditAction.Issues.UpdateInstance... values) {
            if (values!= null) {
                for (AuditAction.Issues.UpdateInstance value: values) {
                    getUpdateInstance().add(value);
                }
            }
            return this;
        }

        public AuditAction.Issues withUpdateInstance(Collection<AuditAction.Issues.UpdateInstance> values) {
            if (values!= null) {
                getUpdateInstance().addAll(values);
            }
            return this;
        }

        public AuditAction.Issues withIssueListDescription(IssueListDescription value) {
            setIssueListDescription(value);
            return this;
        }

        public AuditAction.Issues withUpdateInstance(List<AuditAction.Issues.UpdateInstance> updateInstance) {
            setUpdateInstance(updateInstance);
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
         *       &lt;attribute name="instanceId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="revision" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class UpdateInstance {

            @XmlAttribute(required = true)
            protected String instanceId;
            @XmlAttribute(required = true)
            protected int revision;

            /**
             * Default no-arg constructor
             * 
             */
            public UpdateInstance() {
                super();
            }

            /**
             * Fully-initialising value constructor
             * 
             */
            public UpdateInstance(final String instanceId, final int revision) {
                this.instanceId = instanceId;
                this.revision = revision;
            }

            /**
             * Gets the value of the instanceId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInstanceId() {
                return instanceId;
            }

            /**
             * Sets the value of the instanceId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInstanceId(String value) {
                this.instanceId = value;
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

            public AuditAction.Issues.UpdateInstance withInstanceId(String value) {
                setInstanceId(value);
                return this;
            }

            public AuditAction.Issues.UpdateInstance withRevision(int value) {
                setRevision(value);
                return this;
            }

        }

    }

}

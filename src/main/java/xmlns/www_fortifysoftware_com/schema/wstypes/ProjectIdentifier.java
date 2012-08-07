
package xmlns.www_fortifysoftware_com.schema.wstypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.fortify.schema.fws.CreateAuditSessionRequest;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;


/**
 * <p>Java class for ProjectIdentifier complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProjectIdentifier">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="ProjectVersionIdentifier">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="ProjectName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ProjectVersionName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/all>
 *                 &lt;attribute name="ProjectVersionId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ProjectVersionId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProjectIdentifier", propOrder = {
    "projectVersionIdentifier",
    "projectVersionId"
})
@XmlSeeAlso({
    CreateAuditSessionRequest.class
})
public class ProjectIdentifier {

    @XmlElement(name = "ProjectVersionIdentifier")
    protected ProjectIdentifier.ProjectVersionIdentifier projectVersionIdentifier;
    @XmlElement(name = "ProjectVersionId")
    protected Long projectVersionId;

    /**
     * Default no-arg constructor
     * 
     */
    public ProjectIdentifier() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ProjectIdentifier(final ProjectIdentifier.ProjectVersionIdentifier projectVersionIdentifier, final Long projectVersionId) {
        this.projectVersionIdentifier = projectVersionIdentifier;
        this.projectVersionId = projectVersionId;
    }

    /**
     * Gets the value of the projectVersionIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectIdentifier.ProjectVersionIdentifier }
     *     
     */
    public ProjectIdentifier.ProjectVersionIdentifier getProjectVersionIdentifier() {
        return projectVersionIdentifier;
    }

    /**
     * Sets the value of the projectVersionIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectIdentifier.ProjectVersionIdentifier }
     *     
     */
    public void setProjectVersionIdentifier(ProjectIdentifier.ProjectVersionIdentifier value) {
        this.projectVersionIdentifier = value;
    }

    /**
     * Gets the value of the projectVersionId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProjectVersionId() {
        return projectVersionId;
    }

    /**
     * Sets the value of the projectVersionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProjectVersionId(Long value) {
        this.projectVersionId = value;
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

    public ProjectIdentifier withProjectVersionIdentifier(ProjectIdentifier.ProjectVersionIdentifier value) {
        setProjectVersionIdentifier(value);
        return this;
    }

    public ProjectIdentifier withProjectVersionId(Long value) {
        setProjectVersionId(value);
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
     *       &lt;all>
     *         &lt;element name="ProjectName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="ProjectVersionName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/all>
     *       &lt;attribute name="ProjectVersionId" type="{http://www.w3.org/2001/XMLSchema}long" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class ProjectVersionIdentifier {

        @XmlElement(name = "ProjectName", required = true)
        protected String projectName;
        @XmlElement(name = "ProjectVersionName", required = true)
        protected String projectVersionName;
        @XmlAttribute(name = "ProjectVersionId")
        protected Long projectVersionId;

        /**
         * Default no-arg constructor
         * 
         */
        public ProjectVersionIdentifier() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public ProjectVersionIdentifier(final String projectName, final String projectVersionName, final Long projectVersionId) {
            this.projectName = projectName;
            this.projectVersionName = projectVersionName;
            this.projectVersionId = projectVersionId;
        }

        /**
         * Gets the value of the projectName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProjectName() {
            return projectName;
        }

        /**
         * Sets the value of the projectName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProjectName(String value) {
            this.projectName = value;
        }

        /**
         * Gets the value of the projectVersionName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProjectVersionName() {
            return projectVersionName;
        }

        /**
         * Sets the value of the projectVersionName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProjectVersionName(String value) {
            this.projectVersionName = value;
        }

        /**
         * Gets the value of the projectVersionId property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getProjectVersionId() {
            return projectVersionId;
        }

        /**
         * Sets the value of the projectVersionId property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setProjectVersionId(Long value) {
            this.projectVersionId = value;
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

        public ProjectIdentifier.ProjectVersionIdentifier withProjectName(String value) {
            setProjectName(value);
            return this;
        }

        public ProjectIdentifier.ProjectVersionIdentifier withProjectVersionName(String value) {
            setProjectVersionName(value);
            return this;
        }

        public ProjectIdentifier.ProjectVersionIdentifier withProjectVersionId(Long value) {
            setProjectVersionId(value);
            return this;
        }

    }

}

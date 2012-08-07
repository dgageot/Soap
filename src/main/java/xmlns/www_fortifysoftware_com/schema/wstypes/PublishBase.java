
package xmlns.www_fortifysoftware_com.schema.wstypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import xmlns.www_fortifysoftware_com.schema.activitytemplate.Document;
import xmlns.www_fortifysoftware_com.schema.activitytemplate.PerformanceIndicator;
import xmlns.www_fortifysoftware_com.schema.activitytemplate.Variable;


/**
 * <p>Java class for PublishBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PublishBase">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="publishVersion" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="objectVersion" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PublishBase")
@XmlSeeAlso({
    TemplateAssignmentRule.class,
    Document.class,
    PerformanceIndicator.class,
    Persona.class,
    Variable.class,
    ReportDefinition.class,
    ReportLibrary.class,
    MetaDataDefinition.class,
    PermissionGroup.class,
    PermissionTemplate.class,
    ProjectTemplate.class,
    IssueCorrelationRule.class
})
public class PublishBase {

    @XmlAttribute(required = true)
    protected int publishVersion;
    @XmlAttribute(required = true)
    protected int objectVersion;

    /**
     * Default no-arg constructor
     * 
     */
    public PublishBase() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public PublishBase(final int publishVersion, final int objectVersion) {
        this.publishVersion = publishVersion;
        this.objectVersion = objectVersion;
    }

    /**
     * Gets the value of the publishVersion property.
     * 
     */
    public int getPublishVersion() {
        return publishVersion;
    }

    /**
     * Sets the value of the publishVersion property.
     * 
     */
    public void setPublishVersion(int value) {
        this.publishVersion = value;
    }

    /**
     * Gets the value of the objectVersion property.
     * 
     */
    public int getObjectVersion() {
        return objectVersion;
    }

    /**
     * Sets the value of the objectVersion property.
     * 
     */
    public void setObjectVersion(int value) {
        this.objectVersion = value;
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

    public PublishBase withPublishVersion(int value) {
        setPublishVersion(value);
        return this;
    }

    public PublishBase withObjectVersion(int value) {
        setObjectVersion(value);
        return this;
    }

}

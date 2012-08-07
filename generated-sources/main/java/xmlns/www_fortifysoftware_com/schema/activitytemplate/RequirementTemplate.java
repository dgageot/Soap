
package xmlns.www_fortifysoftware_com.schema.activitytemplate;

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
import xmlns.www_fortifysoftware_com.schema.enumconstants.DateUnit;
import xmlns.www_fortifysoftware_com.schema.enumconstants.TemplateMode;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{xmlns://www.fortifysoftware.com/schema/activitytemplate}ActivityBase">
 *       &lt;sequence>
 *         &lt;element ref="{xmlns://www.fortifysoftware.com/schema/activitytemplate}Requirement" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ProjectTemplateId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *       &lt;attribute name="mode" use="required" type="{xmlns://www.fortifysoftware.com/schema/enumConstants}TemplateMode" />
 *       &lt;attribute name="defaultTemplate" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="publishVersion" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="objectVersion" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "requirement",
    "projectTemplateId"
})
@XmlRootElement(name = "RequirementTemplate")
public class RequirementTemplate
    extends ActivityBase
{

    @XmlElement(name = "Requirement")
    protected List<Requirement> requirement;
    @XmlElement(name = "ProjectTemplateId", required = true)
    protected String projectTemplateId;
    @XmlAttribute(required = true)
    protected TemplateMode mode;
    @XmlAttribute
    protected Boolean defaultTemplate;
    @XmlAttribute(required = true)
    protected int publishVersion;
    @XmlAttribute(required = true)
    protected int objectVersion;

    /**
     * Default no-arg constructor
     * 
     */
    public RequirementTemplate() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public RequirementTemplate(final String name, final String description, final String permissionLevel, final List<String> signOffPersonaId, final String workOwnerPersonaId, final Integer dueDate, final DateUnit dueDateUnits, final String id, final List<Requirement> requirement, final String projectTemplateId, final TemplateMode mode, final Boolean defaultTemplate, final int publishVersion, final int objectVersion) {
        super(name, description, permissionLevel, signOffPersonaId, workOwnerPersonaId, dueDate, dueDateUnits, id);
        this.requirement = requirement;
        this.projectTemplateId = projectTemplateId;
        this.mode = mode;
        this.defaultTemplate = defaultTemplate;
        this.publishVersion = publishVersion;
        this.objectVersion = objectVersion;
    }

    /**
     * Gets the value of the requirement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requirement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequirement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Requirement }
     * 
     * 
     */
    public List<Requirement> getRequirement() {
        if (requirement == null) {
            requirement = new ArrayList<Requirement>();
        }
        return this.requirement;
    }

    /**
     * Gets the value of the projectTemplateId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectTemplateId() {
        return projectTemplateId;
    }

    /**
     * Sets the value of the projectTemplateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectTemplateId(String value) {
        this.projectTemplateId = value;
    }

    /**
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link TemplateMode }
     *     
     */
    public TemplateMode getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TemplateMode }
     *     
     */
    public void setMode(TemplateMode value) {
        this.mode = value;
    }

    /**
     * Gets the value of the defaultTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDefaultTemplate() {
        return defaultTemplate;
    }

    /**
     * Sets the value of the defaultTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDefaultTemplate(Boolean value) {
        this.defaultTemplate = value;
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

    /**
     * Sets the value of the requirement property.
     * 
     * @param requirement
     *     allowed object is
     *     {@link Requirement }
     *     
     */
    public void setRequirement(List<Requirement> requirement) {
        this.requirement = requirement;
    }

    public RequirementTemplate withRequirement(Requirement... values) {
        if (values!= null) {
            for (Requirement value: values) {
                getRequirement().add(value);
            }
        }
        return this;
    }

    public RequirementTemplate withRequirement(Collection<Requirement> values) {
        if (values!= null) {
            getRequirement().addAll(values);
        }
        return this;
    }

    public RequirementTemplate withProjectTemplateId(String value) {
        setProjectTemplateId(value);
        return this;
    }

    public RequirementTemplate withMode(TemplateMode value) {
        setMode(value);
        return this;
    }

    public RequirementTemplate withDefaultTemplate(Boolean value) {
        setDefaultTemplate(value);
        return this;
    }

    public RequirementTemplate withPublishVersion(int value) {
        setPublishVersion(value);
        return this;
    }

    public RequirementTemplate withObjectVersion(int value) {
        setObjectVersion(value);
        return this;
    }

    public RequirementTemplate withRequirement(List<Requirement> requirement) {
        setRequirement(requirement);
        return this;
    }

    @Override
    public RequirementTemplate withName(String value) {
        setName(value);
        return this;
    }

    @Override
    public RequirementTemplate withDescription(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public RequirementTemplate withPermissionLevel(String value) {
        setPermissionLevel(value);
        return this;
    }

    @Override
    public RequirementTemplate withSignOffPersonaId(String... values) {
        if (values!= null) {
            for (String value: values) {
                getSignOffPersonaId().add(value);
            }
        }
        return this;
    }

    @Override
    public RequirementTemplate withSignOffPersonaId(Collection<String> values) {
        if (values!= null) {
            getSignOffPersonaId().addAll(values);
        }
        return this;
    }

    @Override
    public RequirementTemplate withWorkOwnerPersonaId(String value) {
        setWorkOwnerPersonaId(value);
        return this;
    }

    @Override
    public RequirementTemplate withDueDate(Integer value) {
        setDueDate(value);
        return this;
    }

    @Override
    public RequirementTemplate withDueDateUnits(DateUnit value) {
        setDueDateUnits(value);
        return this;
    }

    @Override
    public RequirementTemplate withId(String value) {
        setId(value);
        return this;
    }

    @Override
    public RequirementTemplate withSignOffPersonaId(List<String> signOffPersonaId) {
        setSignOffPersonaId(signOffPersonaId);
        return this;
    }

}

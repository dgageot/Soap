
package xmlns.www_fortifysoftware_com.schema.wstypes;

import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.fortify.schema.fws.AssignToProjectVersionRequest;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;


/**
 * <p>Java class for AccessAssignment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccessAssignment">
 *   &lt;complexContent>
 *     &lt;extension base="{xmlns://www.fortifysoftware.com/schema/wsTypes}AccessAssignmentBase">
 *       &lt;sequence>
 *         &lt;element name="ProjectIdentifier" type="{xmlns://www.fortifysoftware.com/schema/wsTypes}ProjectIdentifier"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccessAssignment", propOrder = {
    "projectIdentifier"
})
@XmlSeeAlso({
    AssignToProjectVersionRequest.class
})
public class AccessAssignment
    extends AccessAssignmentBase
{

    @XmlElement(name = "ProjectIdentifier", required = true)
    protected ProjectIdentifier projectIdentifier;

    /**
     * Default no-arg constructor
     * 
     */
    public AccessAssignment() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public AccessAssignment(final List<String> username, final List<String> ldapDn, final ProjectIdentifier projectIdentifier) {
        super(username, ldapDn);
        this.projectIdentifier = projectIdentifier;
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

    public AccessAssignment withProjectIdentifier(ProjectIdentifier value) {
        setProjectIdentifier(value);
        return this;
    }

    @Override
    public AccessAssignment withUsername(String... values) {
        if (values!= null) {
            for (String value: values) {
                getUsername().add(value);
            }
        }
        return this;
    }

    @Override
    public AccessAssignment withUsername(Collection<String> values) {
        if (values!= null) {
            getUsername().addAll(values);
        }
        return this;
    }

    @Override
    public AccessAssignment withLdapDn(String... values) {
        if (values!= null) {
            for (String value: values) {
                getLdapDn().add(value);
            }
        }
        return this;
    }

    @Override
    public AccessAssignment withLdapDn(Collection<String> values) {
        if (values!= null) {
            getLdapDn().addAll(values);
        }
        return this;
    }

    @Override
    public AccessAssignment withUsername(List<String> username) {
        setUsername(username);
        return this;
    }

    @Override
    public AccessAssignment withLdapDn(List<String> ldapDn) {
        setLdapDn(ldapDn);
        return this;
    }

}

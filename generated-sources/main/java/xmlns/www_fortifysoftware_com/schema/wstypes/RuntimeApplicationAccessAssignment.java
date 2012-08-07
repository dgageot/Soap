
package xmlns.www_fortifysoftware_com.schema.wstypes;

import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.fortify.schema.fws.AssignToRuntimeApplicationRequest;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;


/**
 * <p>Java class for RuntimeApplicationAccessAssignment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RuntimeApplicationAccessAssignment">
 *   &lt;complexContent>
 *     &lt;extension base="{xmlns://www.fortifysoftware.com/schema/wsTypes}AccessAssignmentBase">
 *       &lt;sequence>
 *         &lt;element name="RuntimeApplicationId" type="{xmlns://www.fortifysoftware.com/schema/wsTypes}RuntimeApplicationIdentifier"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RuntimeApplicationAccessAssignment", propOrder = {
    "runtimeApplicationId"
})
@XmlSeeAlso({
    AssignToRuntimeApplicationRequest.class
})
public class RuntimeApplicationAccessAssignment
    extends AccessAssignmentBase
{

    @XmlElement(name = "RuntimeApplicationId", required = true)
    protected RuntimeApplicationIdentifier runtimeApplicationId;

    /**
     * Default no-arg constructor
     * 
     */
    public RuntimeApplicationAccessAssignment() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public RuntimeApplicationAccessAssignment(final List<String> username, final List<String> ldapDn, final RuntimeApplicationIdentifier runtimeApplicationId) {
        super(username, ldapDn);
        this.runtimeApplicationId = runtimeApplicationId;
    }

    /**
     * Gets the value of the runtimeApplicationId property.
     * 
     * @return
     *     possible object is
     *     {@link RuntimeApplicationIdentifier }
     *     
     */
    public RuntimeApplicationIdentifier getRuntimeApplicationId() {
        return runtimeApplicationId;
    }

    /**
     * Sets the value of the runtimeApplicationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link RuntimeApplicationIdentifier }
     *     
     */
    public void setRuntimeApplicationId(RuntimeApplicationIdentifier value) {
        this.runtimeApplicationId = value;
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

    public RuntimeApplicationAccessAssignment withRuntimeApplicationId(RuntimeApplicationIdentifier value) {
        setRuntimeApplicationId(value);
        return this;
    }

    @Override
    public RuntimeApplicationAccessAssignment withUsername(String... values) {
        if (values!= null) {
            for (String value: values) {
                getUsername().add(value);
            }
        }
        return this;
    }

    @Override
    public RuntimeApplicationAccessAssignment withUsername(Collection<String> values) {
        if (values!= null) {
            getUsername().addAll(values);
        }
        return this;
    }

    @Override
    public RuntimeApplicationAccessAssignment withLdapDn(String... values) {
        if (values!= null) {
            for (String value: values) {
                getLdapDn().add(value);
            }
        }
        return this;
    }

    @Override
    public RuntimeApplicationAccessAssignment withLdapDn(Collection<String> values) {
        if (values!= null) {
            getLdapDn().addAll(values);
        }
        return this;
    }

    @Override
    public RuntimeApplicationAccessAssignment withUsername(List<String> username) {
        setUsername(username);
        return this;
    }

    @Override
    public RuntimeApplicationAccessAssignment withLdapDn(List<String> ldapDn) {
        setLdapDn(ldapDn);
        return this;
    }

}

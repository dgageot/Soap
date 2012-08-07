
package xmlns.www_fortifysoftware_com.schema.activitytemplate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;


/**
 * <p>Java class for EquationVariable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EquationVariable">
 *   &lt;complexContent>
 *     &lt;extension base="{xmlns://www.fortifysoftware.com/schema/activitytemplate}Variable">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquationVariable")
public class EquationVariable
    extends Variable
{


    /**
     * Default no-arg constructor
     * 
     */
    public EquationVariable() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public EquationVariable(final int publishVersion, final int objectVersion, final String description, final String searchString, final String variable, final Boolean locked) {
        super(publishVersion, objectVersion, description, searchString, variable, locked);
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

    @Override
    public EquationVariable withDescription(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public EquationVariable withSearchString(String value) {
        setSearchString(value);
        return this;
    }

    @Override
    public EquationVariable withVariable(String value) {
        setVariable(value);
        return this;
    }

    @Override
    public EquationVariable withLocked(Boolean value) {
        setLocked(value);
        return this;
    }

    @Override
    public EquationVariable withPublishVersion(int value) {
        setPublishVersion(value);
        return this;
    }

    @Override
    public EquationVariable withObjectVersion(int value) {
        setObjectVersion(value);
        return this;
    }

}


package xmlns.www_fortifysoftware_com.schema.activitytemplate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import xmlns.www_fortifysoftware_com.schema.wstypes.PublishBase;


/**
 * <p>Java class for Variable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Variable">
 *   &lt;complexContent>
 *     &lt;extension base="{xmlns://www.fortifysoftware.com/schema/wsTypes}PublishBase">
 *       &lt;sequence>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SearchString" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *       &lt;attribute name="variable" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="locked" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Variable", propOrder = {
    "description",
    "searchString"
})
@XmlSeeAlso({
    EquationVariable.class
})
public abstract class Variable
    extends PublishBase
{

    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "SearchString", required = true)
    protected String searchString;
    @XmlAttribute(required = true)
    protected String variable;
    @XmlAttribute
    protected Boolean locked;

    /**
     * Default no-arg constructor
     * 
     */
    public Variable() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public Variable(final int publishVersion, final int objectVersion, final String description, final String searchString, final String variable, final Boolean locked) {
        super(publishVersion, objectVersion);
        this.description = description;
        this.searchString = searchString;
        this.variable = variable;
        this.locked = locked;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the searchString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchString() {
        return searchString;
    }

    /**
     * Sets the value of the searchString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchString(String value) {
        this.searchString = value;
    }

    /**
     * Gets the value of the variable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVariable() {
        return variable;
    }

    /**
     * Sets the value of the variable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVariable(String value) {
        this.variable = value;
    }

    /**
     * Gets the value of the locked property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocked() {
        return locked;
    }

    /**
     * Sets the value of the locked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocked(Boolean value) {
        this.locked = value;
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

    public Variable withDescription(String value) {
        setDescription(value);
        return this;
    }

    public Variable withSearchString(String value) {
        setSearchString(value);
        return this;
    }

    public Variable withVariable(String value) {
        setVariable(value);
        return this;
    }

    public Variable withLocked(Boolean value) {
        setLocked(value);
        return this;
    }

    @Override
    public Variable withPublishVersion(int value) {
        setPublishVersion(value);
        return this;
    }

    @Override
    public Variable withObjectVersion(int value) {
        setObjectVersion(value);
        return this;
    }

}

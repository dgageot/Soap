
package xmlns.www_fortifysoftware_com.schema.wstypes;

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


/**
 * <p>Java class for MetaDataSelectedValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MetaDataSelectedValue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProjectVersionId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="MetaDataDefinitionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;choice>
 *           &lt;element name="Value" type="{xmlns://www.fortifysoftware.com/schema/wsTypes}MetaDataValue" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="FreeFormValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="ObjectVersion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MetaDataSelectedValue", propOrder = {
    "projectVersionId",
    "metaDataDefinitionId",
    "value",
    "freeFormValue",
    "objectVersion"
})
public class MetaDataSelectedValue {

    @XmlElement(name = "ProjectVersionId")
    protected Long projectVersionId;
    @XmlElement(name = "MetaDataDefinitionId", required = true)
    protected String metaDataDefinitionId;
    @XmlElement(name = "Value")
    protected List<MetaDataValue> value;
    @XmlElement(name = "FreeFormValue")
    protected String freeFormValue;
    @XmlElement(name = "ObjectVersion")
    protected Integer objectVersion;

    /**
     * Default no-arg constructor
     * 
     */
    public MetaDataSelectedValue() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public MetaDataSelectedValue(final Long projectVersionId, final String metaDataDefinitionId, final List<MetaDataValue> value, final String freeFormValue, final Integer objectVersion) {
        this.projectVersionId = projectVersionId;
        this.metaDataDefinitionId = metaDataDefinitionId;
        this.value = value;
        this.freeFormValue = freeFormValue;
        this.objectVersion = objectVersion;
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

    /**
     * Gets the value of the metaDataDefinitionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetaDataDefinitionId() {
        return metaDataDefinitionId;
    }

    /**
     * Sets the value of the metaDataDefinitionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetaDataDefinitionId(String value) {
        this.metaDataDefinitionId = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the value property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MetaDataValue }
     * 
     * 
     */
    public List<MetaDataValue> getValue() {
        if (value == null) {
            value = new ArrayList<MetaDataValue>();
        }
        return this.value;
    }

    /**
     * Gets the value of the freeFormValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreeFormValue() {
        return freeFormValue;
    }

    /**
     * Sets the value of the freeFormValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreeFormValue(String value) {
        this.freeFormValue = value;
    }

    /**
     * Gets the value of the objectVersion property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getObjectVersion() {
        return objectVersion;
    }

    /**
     * Sets the value of the objectVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setObjectVersion(Integer value) {
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
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link MetaDataValue }
     *     
     */
    public void setValue(List<MetaDataValue> value) {
        this.value = value;
    }

    public MetaDataSelectedValue withProjectVersionId(Long value) {
        setProjectVersionId(value);
        return this;
    }

    public MetaDataSelectedValue withMetaDataDefinitionId(String value) {
        setMetaDataDefinitionId(value);
        return this;
    }

    public MetaDataSelectedValue withValue(MetaDataValue... values) {
        if (values!= null) {
            for (MetaDataValue value: values) {
                getValue().add(value);
            }
        }
        return this;
    }

    public MetaDataSelectedValue withValue(Collection<MetaDataValue> values) {
        if (values!= null) {
            getValue().addAll(values);
        }
        return this;
    }

    public MetaDataSelectedValue withFreeFormValue(String value) {
        setFreeFormValue(value);
        return this;
    }

    public MetaDataSelectedValue withObjectVersion(Integer value) {
        setObjectVersion(value);
        return this;
    }

    public MetaDataSelectedValue withValue(List<MetaDataValue> value) {
        setValue(value);
        return this;
    }

}

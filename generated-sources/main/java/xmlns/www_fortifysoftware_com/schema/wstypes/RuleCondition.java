
package xmlns.www_fortifysoftware_com.schema.wstypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;


/**
 * <p>Java class for RuleCondition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RuleCondition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MetaDataId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MataDataValueId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RuleCondition", propOrder = {
    "metaDataId",
    "mataDataValueId"
})
public class RuleCondition {

    @XmlElement(name = "MetaDataId", required = true)
    protected String metaDataId;
    @XmlElement(name = "MataDataValueId", required = true)
    protected String mataDataValueId;

    /**
     * Default no-arg constructor
     * 
     */
    public RuleCondition() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public RuleCondition(final String metaDataId, final String mataDataValueId) {
        this.metaDataId = metaDataId;
        this.mataDataValueId = mataDataValueId;
    }

    /**
     * Gets the value of the metaDataId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetaDataId() {
        return metaDataId;
    }

    /**
     * Sets the value of the metaDataId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetaDataId(String value) {
        this.metaDataId = value;
    }

    /**
     * Gets the value of the mataDataValueId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMataDataValueId() {
        return mataDataValueId;
    }

    /**
     * Sets the value of the mataDataValueId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMataDataValueId(String value) {
        this.mataDataValueId = value;
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

    public RuleCondition withMetaDataId(String value) {
        setMetaDataId(value);
        return this;
    }

    public RuleCondition withMataDataValueId(String value) {
        setMataDataValueId(value);
        return this;
    }

}

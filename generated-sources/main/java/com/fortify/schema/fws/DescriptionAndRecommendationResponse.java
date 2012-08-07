
package com.fortify.schema.fws;

import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import xmlns.www_fortifysoftware_com.schema.wstypes.RootCause;
import xmlns.www_fortifysoftware_com.schema.wstypes.Status;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{xmlns://www.fortifysoftware.com/schema/wsTypes}status">
 *       &lt;sequence>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Recommendation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Abstract" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "description",
    "recommendation",
    "_abstract"
})
@XmlRootElement(name = "DescriptionAndRecommendationResponse")
public class DescriptionAndRecommendationResponse
    extends Status
{

    @XmlElement(name = "Description", required = true)
    protected String description;
    @XmlElement(name = "Recommendation", required = true)
    protected String recommendation;
    @XmlElement(name = "Abstract", required = true)
    protected String _abstract;

    /**
     * Default no-arg constructor
     * 
     */
    public DescriptionAndRecommendationResponse() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public DescriptionAndRecommendationResponse(final long code, final String msg, final List<RootCause> rootCause, final String description, final String recommendation, final String _abstract) {
        super(code, msg, rootCause);
        this.description = description;
        this.recommendation = recommendation;
        this._abstract = _abstract;
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
     * Gets the value of the recommendation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecommendation() {
        return recommendation;
    }

    /**
     * Sets the value of the recommendation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecommendation(String value) {
        this.recommendation = value;
    }

    /**
     * Gets the value of the abstract property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbstract() {
        return _abstract;
    }

    /**
     * Sets the value of the abstract property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbstract(String value) {
        this._abstract = value;
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

    public DescriptionAndRecommendationResponse withDescription(String value) {
        setDescription(value);
        return this;
    }

    public DescriptionAndRecommendationResponse withRecommendation(String value) {
        setRecommendation(value);
        return this;
    }

    public DescriptionAndRecommendationResponse withAbstract(String value) {
        setAbstract(value);
        return this;
    }

    @Override
    public DescriptionAndRecommendationResponse withCode(long value) {
        setCode(value);
        return this;
    }

    @Override
    public DescriptionAndRecommendationResponse withMsg(String value) {
        setMsg(value);
        return this;
    }

    @Override
    public DescriptionAndRecommendationResponse withRootCause(RootCause... values) {
        if (values!= null) {
            for (RootCause value: values) {
                getRootCause().add(value);
            }
        }
        return this;
    }

    @Override
    public DescriptionAndRecommendationResponse withRootCause(Collection<RootCause> values) {
        if (values!= null) {
            getRootCause().addAll(values);
        }
        return this;
    }

    @Override
    public DescriptionAndRecommendationResponse withRootCause(List<RootCause> rootCause) {
        setRootCause(rootCause);
        return this;
    }

}

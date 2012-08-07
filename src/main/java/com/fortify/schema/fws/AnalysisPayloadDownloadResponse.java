
package com.fortify.schema.fws;

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
import xmlns.www_fortifysoftware_com.schema.wstypes.RootCause;
import xmlns.www_fortifysoftware_com.schema.wstypes.Status;
import xmlns.www_fortifysoftware_com.schema.wstypes.Techstack;


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
 *         &lt;element name="TechStack" type="{xmlns://www.fortifysoftware.com/schema/wsTypes}techstack"/>
 *         &lt;element name="scaExclude" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="hasAttachment" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "techStack",
    "scaExclude"
})
@XmlRootElement(name = "AnalysisPayloadDownloadResponse")
public class AnalysisPayloadDownloadResponse
    extends Status
{

    @XmlElement(name = "TechStack", required = true)
    protected Techstack techStack;
    protected List<String> scaExclude;
    @XmlAttribute
    protected Boolean hasAttachment;

    /**
     * Default no-arg constructor
     * 
     */
    public AnalysisPayloadDownloadResponse() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public AnalysisPayloadDownloadResponse(final long code, final String msg, final List<RootCause> rootCause, final Techstack techStack, final List<String> scaExclude, final Boolean hasAttachment) {
        super(code, msg, rootCause);
        this.techStack = techStack;
        this.scaExclude = scaExclude;
        this.hasAttachment = hasAttachment;
    }

    /**
     * Gets the value of the techStack property.
     * 
     * @return
     *     possible object is
     *     {@link Techstack }
     *     
     */
    public Techstack getTechStack() {
        return techStack;
    }

    /**
     * Sets the value of the techStack property.
     * 
     * @param value
     *     allowed object is
     *     {@link Techstack }
     *     
     */
    public void setTechStack(Techstack value) {
        this.techStack = value;
    }

    /**
     * Gets the value of the scaExclude property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scaExclude property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScaExclude().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getScaExclude() {
        if (scaExclude == null) {
            scaExclude = new ArrayList<String>();
        }
        return this.scaExclude;
    }

    /**
     * Gets the value of the hasAttachment property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasAttachment() {
        return hasAttachment;
    }

    /**
     * Sets the value of the hasAttachment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasAttachment(Boolean value) {
        this.hasAttachment = value;
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
     * Sets the value of the scaExclude property.
     * 
     * @param scaExclude
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScaExclude(List<String> scaExclude) {
        this.scaExclude = scaExclude;
    }

    public AnalysisPayloadDownloadResponse withTechStack(Techstack value) {
        setTechStack(value);
        return this;
    }

    public AnalysisPayloadDownloadResponse withScaExclude(String... values) {
        if (values!= null) {
            for (String value: values) {
                getScaExclude().add(value);
            }
        }
        return this;
    }

    public AnalysisPayloadDownloadResponse withScaExclude(Collection<String> values) {
        if (values!= null) {
            getScaExclude().addAll(values);
        }
        return this;
    }

    public AnalysisPayloadDownloadResponse withHasAttachment(Boolean value) {
        setHasAttachment(value);
        return this;
    }

    public AnalysisPayloadDownloadResponse withScaExclude(List<String> scaExclude) {
        setScaExclude(scaExclude);
        return this;
    }

    @Override
    public AnalysisPayloadDownloadResponse withCode(long value) {
        setCode(value);
        return this;
    }

    @Override
    public AnalysisPayloadDownloadResponse withMsg(String value) {
        setMsg(value);
        return this;
    }

    @Override
    public AnalysisPayloadDownloadResponse withRootCause(RootCause... values) {
        if (values!= null) {
            for (RootCause value: values) {
                getRootCause().add(value);
            }
        }
        return this;
    }

    @Override
    public AnalysisPayloadDownloadResponse withRootCause(Collection<RootCause> values) {
        if (values!= null) {
            getRootCause().addAll(values);
        }
        return this;
    }

    @Override
    public AnalysisPayloadDownloadResponse withRootCause(List<RootCause> rootCause) {
        setRootCause(rootCause);
        return this;
    }

}

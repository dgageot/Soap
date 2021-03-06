
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
import xmlns.www_fortifysoftware_com.schema.activitytemplate.DocumentDefinition;
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
 *         &lt;element ref="{xmlns://www.fortifysoftware.com/schema/activitytemplate}DocumentDefinition"/>
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
    "documentDefinition"
})
@XmlRootElement(name = "DocumentDefinitionListResponse")
public class DocumentDefinitionListResponse
    extends Status
{

    @XmlElement(name = "DocumentDefinition", namespace = "xmlns://www.fortifysoftware.com/schema/activitytemplate", required = true)
    protected DocumentDefinition documentDefinition;

    /**
     * Default no-arg constructor
     * 
     */
    public DocumentDefinitionListResponse() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public DocumentDefinitionListResponse(final long code, final String msg, final List<RootCause> rootCause, final DocumentDefinition documentDefinition) {
        super(code, msg, rootCause);
        this.documentDefinition = documentDefinition;
    }

    /**
     * Gets the value of the documentDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentDefinition }
     *     
     */
    public DocumentDefinition getDocumentDefinition() {
        return documentDefinition;
    }

    /**
     * Sets the value of the documentDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentDefinition }
     *     
     */
    public void setDocumentDefinition(DocumentDefinition value) {
        this.documentDefinition = value;
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

    public DocumentDefinitionListResponse withDocumentDefinition(DocumentDefinition value) {
        setDocumentDefinition(value);
        return this;
    }

    @Override
    public DocumentDefinitionListResponse withCode(long value) {
        setCode(value);
        return this;
    }

    @Override
    public DocumentDefinitionListResponse withMsg(String value) {
        setMsg(value);
        return this;
    }

    @Override
    public DocumentDefinitionListResponse withRootCause(RootCause... values) {
        if (values!= null) {
            for (RootCause value: values) {
                getRootCause().add(value);
            }
        }
        return this;
    }

    @Override
    public DocumentDefinitionListResponse withRootCause(Collection<RootCause> values) {
        if (values!= null) {
            getRootCause().addAll(values);
        }
        return this;
    }

    @Override
    public DocumentDefinitionListResponse withRootCause(List<RootCause> rootCause) {
        setRootCause(rootCause);
        return this;
    }

}

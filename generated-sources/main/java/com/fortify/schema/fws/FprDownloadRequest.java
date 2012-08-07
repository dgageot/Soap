
package com.fortify.schema.fws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import xmlns.www_fortifysoftware_com.schema.wstypes.ProjectIdentifier;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fortify.com/schema/fws}ClientVersionRequest">
 *       &lt;sequence>
 *         &lt;element name="ProjectVersionId" type="{xmlns://www.fortifysoftware.com/schema/wsTypes}ProjectIdentifier"/>
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
    "projectVersionId"
})
@XmlRootElement(name = "FPRDownloadRequest")
public class FprDownloadRequest
    extends ClientVersionRequest
{

    @XmlElement(name = "ProjectVersionId", required = true)
    protected ProjectIdentifier projectVersionId;

    /**
     * Default no-arg constructor
     * 
     */
    public FprDownloadRequest() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public FprDownloadRequest(final String clientVersion, final ProjectIdentifier projectVersionId) {
        super(clientVersion);
        this.projectVersionId = projectVersionId;
    }

    /**
     * Gets the value of the projectVersionId property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectIdentifier }
     *     
     */
    public ProjectIdentifier getProjectVersionId() {
        return projectVersionId;
    }

    /**
     * Sets the value of the projectVersionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectIdentifier }
     *     
     */
    public void setProjectVersionId(ProjectIdentifier value) {
        this.projectVersionId = value;
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

    public FprDownloadRequest withProjectVersionId(ProjectIdentifier value) {
        setProjectVersionId(value);
        return this;
    }

    @Override
    public FprDownloadRequest withClientVersion(String value) {
        setClientVersion(value);
        return this;
    }

}

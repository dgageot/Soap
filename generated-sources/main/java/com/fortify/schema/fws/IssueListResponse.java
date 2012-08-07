
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
import xmlns.www_fortify_com.schema.issuemanagement.IssueListing;
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
 *         &lt;element name="IssueList" type="{xmlns://www.fortify.com/schema/issuemanagement}IssueListing"/>
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
    "issueList"
})
@XmlRootElement(name = "IssueListResponse")
public class IssueListResponse
    extends Status
{

    @XmlElement(name = "IssueList", required = true)
    protected IssueListing issueList;

    /**
     * Default no-arg constructor
     * 
     */
    public IssueListResponse() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public IssueListResponse(final long code, final String msg, final List<RootCause> rootCause, final IssueListing issueList) {
        super(code, msg, rootCause);
        this.issueList = issueList;
    }

    /**
     * Gets the value of the issueList property.
     * 
     * @return
     *     possible object is
     *     {@link IssueListing }
     *     
     */
    public IssueListing getIssueList() {
        return issueList;
    }

    /**
     * Sets the value of the issueList property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssueListing }
     *     
     */
    public void setIssueList(IssueListing value) {
        this.issueList = value;
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

    public IssueListResponse withIssueList(IssueListing value) {
        setIssueList(value);
        return this;
    }

    @Override
    public IssueListResponse withCode(long value) {
        setCode(value);
        return this;
    }

    @Override
    public IssueListResponse withMsg(String value) {
        setMsg(value);
        return this;
    }

    @Override
    public IssueListResponse withRootCause(RootCause... values) {
        if (values!= null) {
            for (RootCause value: values) {
                getRootCause().add(value);
            }
        }
        return this;
    }

    @Override
    public IssueListResponse withRootCause(Collection<RootCause> values) {
        if (values!= null) {
            getRootCause().addAll(values);
        }
        return this;
    }

    @Override
    public IssueListResponse withRootCause(List<RootCause> rootCause) {
        setRootCause(rootCause);
        return this;
    }

}

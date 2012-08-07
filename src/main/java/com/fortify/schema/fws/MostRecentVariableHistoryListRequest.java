
package com.fortify.schema.fws;

import java.util.ArrayList;
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
 *         &lt;element name="ProjectVersionIDs" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="VariableGuids" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
    "projectVersionIDs",
    "variableGuids"
})
@XmlRootElement(name = "MostRecentVariableHistoryListRequest")
public class MostRecentVariableHistoryListRequest
    extends Status
{

    @XmlElement(name = "ProjectVersionIDs", type = Long.class)
    protected List<Long> projectVersionIDs;
    @XmlElement(name = "VariableGuids")
    protected List<String> variableGuids;

    /**
     * Default no-arg constructor
     * 
     */
    public MostRecentVariableHistoryListRequest() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public MostRecentVariableHistoryListRequest(final long code, final String msg, final List<RootCause> rootCause, final List<Long> projectVersionIDs, final List<String> variableGuids) {
        super(code, msg, rootCause);
        this.projectVersionIDs = projectVersionIDs;
        this.variableGuids = variableGuids;
    }

    /**
     * Gets the value of the projectVersionIDs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the projectVersionIDs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProjectVersionIDs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getProjectVersionIDs() {
        if (projectVersionIDs == null) {
            projectVersionIDs = new ArrayList<Long>();
        }
        return this.projectVersionIDs;
    }

    /**
     * Gets the value of the variableGuids property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the variableGuids property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVariableGuids().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getVariableGuids() {
        if (variableGuids == null) {
            variableGuids = new ArrayList<String>();
        }
        return this.variableGuids;
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
     * Sets the value of the projectVersionIDs property.
     * 
     * @param projectVersionIDs
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProjectVersionIDs(List<Long> projectVersionIDs) {
        this.projectVersionIDs = projectVersionIDs;
    }

    /**
     * Sets the value of the variableGuids property.
     * 
     * @param variableGuids
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVariableGuids(List<String> variableGuids) {
        this.variableGuids = variableGuids;
    }

    public MostRecentVariableHistoryListRequest withProjectVersionIDs(Long... values) {
        if (values!= null) {
            for (Long value: values) {
                getProjectVersionIDs().add(value);
            }
        }
        return this;
    }

    public MostRecentVariableHistoryListRequest withProjectVersionIDs(Collection<Long> values) {
        if (values!= null) {
            getProjectVersionIDs().addAll(values);
        }
        return this;
    }

    public MostRecentVariableHistoryListRequest withVariableGuids(String... values) {
        if (values!= null) {
            for (String value: values) {
                getVariableGuids().add(value);
            }
        }
        return this;
    }

    public MostRecentVariableHistoryListRequest withVariableGuids(Collection<String> values) {
        if (values!= null) {
            getVariableGuids().addAll(values);
        }
        return this;
    }

    public MostRecentVariableHistoryListRequest withProjectVersionIDs(List<Long> projectVersionIDs) {
        setProjectVersionIDs(projectVersionIDs);
        return this;
    }

    public MostRecentVariableHistoryListRequest withVariableGuids(List<String> variableGuids) {
        setVariableGuids(variableGuids);
        return this;
    }

    @Override
    public MostRecentVariableHistoryListRequest withCode(long value) {
        setCode(value);
        return this;
    }

    @Override
    public MostRecentVariableHistoryListRequest withMsg(String value) {
        setMsg(value);
        return this;
    }

    @Override
    public MostRecentVariableHistoryListRequest withRootCause(RootCause... values) {
        if (values!= null) {
            for (RootCause value: values) {
                getRootCause().add(value);
            }
        }
        return this;
    }

    @Override
    public MostRecentVariableHistoryListRequest withRootCause(Collection<RootCause> values) {
        if (values!= null) {
            getRootCause().addAll(values);
        }
        return this;
    }

    @Override
    public MostRecentVariableHistoryListRequest withRootCause(List<RootCause> rootCause) {
        setRootCause(rootCause);
        return this;
    }

}

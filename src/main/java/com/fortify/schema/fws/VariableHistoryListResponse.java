
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
import xmlns.www_fortifysoftware_com.schema.wstypes.VariableHistory;


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
 *         &lt;element name="VariableHistories" type="{xmlns://www.fortifysoftware.com/schema/wsTypes}VariableHistory" maxOccurs="unbounded" minOccurs="0"/>
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
    "variableHistories"
})
@XmlRootElement(name = "VariableHistoryListResponse")
public class VariableHistoryListResponse
    extends Status
{

    @XmlElement(name = "VariableHistories")
    protected List<VariableHistory> variableHistories;

    /**
     * Default no-arg constructor
     * 
     */
    public VariableHistoryListResponse() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public VariableHistoryListResponse(final long code, final String msg, final List<RootCause> rootCause, final List<VariableHistory> variableHistories) {
        super(code, msg, rootCause);
        this.variableHistories = variableHistories;
    }

    /**
     * Gets the value of the variableHistories property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the variableHistories property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVariableHistories().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VariableHistory }
     * 
     * 
     */
    public List<VariableHistory> getVariableHistories() {
        if (variableHistories == null) {
            variableHistories = new ArrayList<VariableHistory>();
        }
        return this.variableHistories;
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
     * Sets the value of the variableHistories property.
     * 
     * @param variableHistories
     *     allowed object is
     *     {@link VariableHistory }
     *     
     */
    public void setVariableHistories(List<VariableHistory> variableHistories) {
        this.variableHistories = variableHistories;
    }

    public VariableHistoryListResponse withVariableHistories(VariableHistory... values) {
        if (values!= null) {
            for (VariableHistory value: values) {
                getVariableHistories().add(value);
            }
        }
        return this;
    }

    public VariableHistoryListResponse withVariableHistories(Collection<VariableHistory> values) {
        if (values!= null) {
            getVariableHistories().addAll(values);
        }
        return this;
    }

    public VariableHistoryListResponse withVariableHistories(List<VariableHistory> variableHistories) {
        setVariableHistories(variableHistories);
        return this;
    }

    @Override
    public VariableHistoryListResponse withCode(long value) {
        setCode(value);
        return this;
    }

    @Override
    public VariableHistoryListResponse withMsg(String value) {
        setMsg(value);
        return this;
    }

    @Override
    public VariableHistoryListResponse withRootCause(RootCause... values) {
        if (values!= null) {
            for (RootCause value: values) {
                getRootCause().add(value);
            }
        }
        return this;
    }

    @Override
    public VariableHistoryListResponse withRootCause(Collection<RootCause> values) {
        if (values!= null) {
            getRootCause().addAll(values);
        }
        return this;
    }

    @Override
    public VariableHistoryListResponse withRootCause(List<RootCause> rootCause) {
        setRootCause(rootCause);
        return this;
    }

}

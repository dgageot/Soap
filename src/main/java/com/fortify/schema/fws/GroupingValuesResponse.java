
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
import xmlns.www_fortify_com.schema.issuemanagement.GroupingValue;
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
 *         &lt;element name="GroupingValues" type="{xmlns://www.fortify.com/schema/issuemanagement}GroupingValue" maxOccurs="unbounded" minOccurs="0"/>
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
    "groupingValues"
})
@XmlRootElement(name = "GroupingValuesResponse")
public class GroupingValuesResponse
    extends Status
{

    @XmlElement(name = "GroupingValues")
    protected List<GroupingValue> groupingValues;

    /**
     * Default no-arg constructor
     * 
     */
    public GroupingValuesResponse() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public GroupingValuesResponse(final long code, final String msg, final List<RootCause> rootCause, final List<GroupingValue> groupingValues) {
        super(code, msg, rootCause);
        this.groupingValues = groupingValues;
    }

    /**
     * Gets the value of the groupingValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groupingValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroupingValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GroupingValue }
     * 
     * 
     */
    public List<GroupingValue> getGroupingValues() {
        if (groupingValues == null) {
            groupingValues = new ArrayList<GroupingValue>();
        }
        return this.groupingValues;
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
     * Sets the value of the groupingValues property.
     * 
     * @param groupingValues
     *     allowed object is
     *     {@link GroupingValue }
     *     
     */
    public void setGroupingValues(List<GroupingValue> groupingValues) {
        this.groupingValues = groupingValues;
    }

    public GroupingValuesResponse withGroupingValues(GroupingValue... values) {
        if (values!= null) {
            for (GroupingValue value: values) {
                getGroupingValues().add(value);
            }
        }
        return this;
    }

    public GroupingValuesResponse withGroupingValues(Collection<GroupingValue> values) {
        if (values!= null) {
            getGroupingValues().addAll(values);
        }
        return this;
    }

    public GroupingValuesResponse withGroupingValues(List<GroupingValue> groupingValues) {
        setGroupingValues(groupingValues);
        return this;
    }

    @Override
    public GroupingValuesResponse withCode(long value) {
        setCode(value);
        return this;
    }

    @Override
    public GroupingValuesResponse withMsg(String value) {
        setMsg(value);
        return this;
    }

    @Override
    public GroupingValuesResponse withRootCause(RootCause... values) {
        if (values!= null) {
            for (RootCause value: values) {
                getRootCause().add(value);
            }
        }
        return this;
    }

    @Override
    public GroupingValuesResponse withRootCause(Collection<RootCause> values) {
        if (values!= null) {
            getRootCause().addAll(values);
        }
        return this;
    }

    @Override
    public GroupingValuesResponse withRootCause(List<RootCause> rootCause) {
        setRootCause(rootCause);
        return this;
    }

}

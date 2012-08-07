
package xmlns.www_fortify_com.schema.issuemanagement;

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
 * <p>Java class for IssueListDescription complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IssueListDescription">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FilterSetId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FolderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StartPage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PageSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SearchRestriction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AssignedUserRestriction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IncludeSuppressed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IncludeRemoved" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IncludeHidden" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SortColumn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SortDescending" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="GroupingName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GroupingValues" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IssueListDescription", propOrder = {
    "filterSetId",
    "folderId",
    "startPage",
    "pageSize",
    "searchRestriction",
    "assignedUserRestriction",
    "includeSuppressed",
    "includeRemoved",
    "includeHidden",
    "sortColumn",
    "sortDescending",
    "groupingName",
    "groupingValues"
})
public class IssueListDescription {

    @XmlElement(name = "FilterSetId")
    protected String filterSetId;
    @XmlElement(name = "FolderId")
    protected String folderId;
    @XmlElement(name = "StartPage")
    protected Integer startPage;
    @XmlElement(name = "PageSize")
    protected Integer pageSize;
    @XmlElement(name = "SearchRestriction")
    protected String searchRestriction;
    @XmlElement(name = "AssignedUserRestriction")
    protected String assignedUserRestriction;
    @XmlElement(name = "IncludeSuppressed")
    protected Boolean includeSuppressed;
    @XmlElement(name = "IncludeRemoved")
    protected Boolean includeRemoved;
    @XmlElement(name = "IncludeHidden")
    protected Boolean includeHidden;
    @XmlElement(name = "SortColumn")
    protected String sortColumn;
    @XmlElement(name = "SortDescending")
    protected Boolean sortDescending;
    @XmlElement(name = "GroupingName")
    protected String groupingName;
    @XmlElement(name = "GroupingValues")
    protected List<String> groupingValues;

    /**
     * Default no-arg constructor
     * 
     */
    public IssueListDescription() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public IssueListDescription(final String filterSetId, final String folderId, final Integer startPage, final Integer pageSize, final String searchRestriction, final String assignedUserRestriction, final Boolean includeSuppressed, final Boolean includeRemoved, final Boolean includeHidden, final String sortColumn, final Boolean sortDescending, final String groupingName, final List<String> groupingValues) {
        this.filterSetId = filterSetId;
        this.folderId = folderId;
        this.startPage = startPage;
        this.pageSize = pageSize;
        this.searchRestriction = searchRestriction;
        this.assignedUserRestriction = assignedUserRestriction;
        this.includeSuppressed = includeSuppressed;
        this.includeRemoved = includeRemoved;
        this.includeHidden = includeHidden;
        this.sortColumn = sortColumn;
        this.sortDescending = sortDescending;
        this.groupingName = groupingName;
        this.groupingValues = groupingValues;
    }

    /**
     * Gets the value of the filterSetId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilterSetId() {
        return filterSetId;
    }

    /**
     * Sets the value of the filterSetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilterSetId(String value) {
        this.filterSetId = value;
    }

    /**
     * Gets the value of the folderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFolderId() {
        return folderId;
    }

    /**
     * Sets the value of the folderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFolderId(String value) {
        this.folderId = value;
    }

    /**
     * Gets the value of the startPage property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStartPage() {
        return startPage;
    }

    /**
     * Sets the value of the startPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStartPage(Integer value) {
        this.startPage = value;
    }

    /**
     * Gets the value of the pageSize property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * Sets the value of the pageSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPageSize(Integer value) {
        this.pageSize = value;
    }

    /**
     * Gets the value of the searchRestriction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchRestriction() {
        return searchRestriction;
    }

    /**
     * Sets the value of the searchRestriction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchRestriction(String value) {
        this.searchRestriction = value;
    }

    /**
     * Gets the value of the assignedUserRestriction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssignedUserRestriction() {
        return assignedUserRestriction;
    }

    /**
     * Sets the value of the assignedUserRestriction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssignedUserRestriction(String value) {
        this.assignedUserRestriction = value;
    }

    /**
     * Gets the value of the includeSuppressed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeSuppressed() {
        return includeSuppressed;
    }

    /**
     * Sets the value of the includeSuppressed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeSuppressed(Boolean value) {
        this.includeSuppressed = value;
    }

    /**
     * Gets the value of the includeRemoved property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeRemoved() {
        return includeRemoved;
    }

    /**
     * Sets the value of the includeRemoved property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeRemoved(Boolean value) {
        this.includeRemoved = value;
    }

    /**
     * Gets the value of the includeHidden property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeHidden() {
        return includeHidden;
    }

    /**
     * Sets the value of the includeHidden property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeHidden(Boolean value) {
        this.includeHidden = value;
    }

    /**
     * Gets the value of the sortColumn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSortColumn() {
        return sortColumn;
    }

    /**
     * Sets the value of the sortColumn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSortColumn(String value) {
        this.sortColumn = value;
    }

    /**
     * Gets the value of the sortDescending property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSortDescending() {
        return sortDescending;
    }

    /**
     * Sets the value of the sortDescending property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSortDescending(Boolean value) {
        this.sortDescending = value;
    }

    /**
     * Gets the value of the groupingName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupingName() {
        return groupingName;
    }

    /**
     * Sets the value of the groupingName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupingName(String value) {
        this.groupingName = value;
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
     * {@link String }
     * 
     * 
     */
    public List<String> getGroupingValues() {
        if (groupingValues == null) {
            groupingValues = new ArrayList<String>();
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
     *     {@link String }
     *     
     */
    public void setGroupingValues(List<String> groupingValues) {
        this.groupingValues = groupingValues;
    }

    public IssueListDescription withFilterSetId(String value) {
        setFilterSetId(value);
        return this;
    }

    public IssueListDescription withFolderId(String value) {
        setFolderId(value);
        return this;
    }

    public IssueListDescription withStartPage(Integer value) {
        setStartPage(value);
        return this;
    }

    public IssueListDescription withPageSize(Integer value) {
        setPageSize(value);
        return this;
    }

    public IssueListDescription withSearchRestriction(String value) {
        setSearchRestriction(value);
        return this;
    }

    public IssueListDescription withAssignedUserRestriction(String value) {
        setAssignedUserRestriction(value);
        return this;
    }

    public IssueListDescription withIncludeSuppressed(Boolean value) {
        setIncludeSuppressed(value);
        return this;
    }

    public IssueListDescription withIncludeRemoved(Boolean value) {
        setIncludeRemoved(value);
        return this;
    }

    public IssueListDescription withIncludeHidden(Boolean value) {
        setIncludeHidden(value);
        return this;
    }

    public IssueListDescription withSortColumn(String value) {
        setSortColumn(value);
        return this;
    }

    public IssueListDescription withSortDescending(Boolean value) {
        setSortDescending(value);
        return this;
    }

    public IssueListDescription withGroupingName(String value) {
        setGroupingName(value);
        return this;
    }

    public IssueListDescription withGroupingValues(String... values) {
        if (values!= null) {
            for (String value: values) {
                getGroupingValues().add(value);
            }
        }
        return this;
    }

    public IssueListDescription withGroupingValues(Collection<String> values) {
        if (values!= null) {
            getGroupingValues().addAll(values);
        }
        return this;
    }

    public IssueListDescription withGroupingValues(List<String> groupingValues) {
        setGroupingValues(groupingValues);
        return this;
    }

}

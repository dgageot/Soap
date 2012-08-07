
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
import xmlns.www_fortifysoftware_com.schema.enumconstants.TraceNodeType;


/**
 * <p>Java class for TraceNode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TraceNode">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NodeType" type="{xmlns://www.fortifysoftware.com/schema/enumConstants}TraceNodeType"/>
 *         &lt;element name="Location" type="{xmlns://www.fortify.com/schema/issuemanagement}IssueLocation" minOccurs="0"/>
 *         &lt;element name="Primary" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Detail" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ChildNodes" type="{xmlns://www.fortify.com/schema/issuemanagement}TraceNode" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EvidenceHTML" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ToolTip" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TraceNode", propOrder = {
    "text",
    "nodeType",
    "location",
    "primary",
    "detail",
    "childNodes",
    "evidenceHtml",
    "toolTip"
})
public class TraceNode {

    @XmlElement(name = "Text", required = true)
    protected String text;
    @XmlElement(name = "NodeType", required = true)
    protected TraceNodeType nodeType;
    @XmlElement(name = "Location")
    protected IssueLocation location;
    @XmlElement(name = "Primary")
    protected boolean primary;
    @XmlElement(name = "Detail")
    protected boolean detail;
    @XmlElement(name = "ChildNodes")
    protected List<TraceNode> childNodes;
    @XmlElement(name = "EvidenceHTML", required = true)
    protected String evidenceHtml;
    @XmlElement(name = "ToolTip", required = true)
    protected String toolTip;

    /**
     * Default no-arg constructor
     * 
     */
    public TraceNode() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public TraceNode(final String text, final TraceNodeType nodeType, final IssueLocation location, final boolean primary, final boolean detail, final List<TraceNode> childNodes, final String evidenceHtml, final String toolTip) {
        this.text = text;
        this.nodeType = nodeType;
        this.location = location;
        this.primary = primary;
        this.detail = detail;
        this.childNodes = childNodes;
        this.evidenceHtml = evidenceHtml;
        this.toolTip = toolTip;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

    /**
     * Gets the value of the nodeType property.
     * 
     * @return
     *     possible object is
     *     {@link TraceNodeType }
     *     
     */
    public TraceNodeType getNodeType() {
        return nodeType;
    }

    /**
     * Sets the value of the nodeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TraceNodeType }
     *     
     */
    public void setNodeType(TraceNodeType value) {
        this.nodeType = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link IssueLocation }
     *     
     */
    public IssueLocation getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssueLocation }
     *     
     */
    public void setLocation(IssueLocation value) {
        this.location = value;
    }

    /**
     * Gets the value of the primary property.
     * 
     */
    public boolean isPrimary() {
        return primary;
    }

    /**
     * Sets the value of the primary property.
     * 
     */
    public void setPrimary(boolean value) {
        this.primary = value;
    }

    /**
     * Gets the value of the detail property.
     * 
     */
    public boolean isDetail() {
        return detail;
    }

    /**
     * Sets the value of the detail property.
     * 
     */
    public void setDetail(boolean value) {
        this.detail = value;
    }

    /**
     * Gets the value of the childNodes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the childNodes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChildNodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TraceNode }
     * 
     * 
     */
    public List<TraceNode> getChildNodes() {
        if (childNodes == null) {
            childNodes = new ArrayList<TraceNode>();
        }
        return this.childNodes;
    }

    /**
     * Gets the value of the evidenceHtml property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvidenceHtml() {
        return evidenceHtml;
    }

    /**
     * Sets the value of the evidenceHtml property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvidenceHtml(String value) {
        this.evidenceHtml = value;
    }

    /**
     * Gets the value of the toolTip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToolTip() {
        return toolTip;
    }

    /**
     * Sets the value of the toolTip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToolTip(String value) {
        this.toolTip = value;
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
     * Sets the value of the childNodes property.
     * 
     * @param childNodes
     *     allowed object is
     *     {@link TraceNode }
     *     
     */
    public void setChildNodes(List<TraceNode> childNodes) {
        this.childNodes = childNodes;
    }

    public TraceNode withText(String value) {
        setText(value);
        return this;
    }

    public TraceNode withNodeType(TraceNodeType value) {
        setNodeType(value);
        return this;
    }

    public TraceNode withLocation(IssueLocation value) {
        setLocation(value);
        return this;
    }

    public TraceNode withPrimary(boolean value) {
        setPrimary(value);
        return this;
    }

    public TraceNode withDetail(boolean value) {
        setDetail(value);
        return this;
    }

    public TraceNode withChildNodes(TraceNode... values) {
        if (values!= null) {
            for (TraceNode value: values) {
                getChildNodes().add(value);
            }
        }
        return this;
    }

    public TraceNode withChildNodes(Collection<TraceNode> values) {
        if (values!= null) {
            getChildNodes().addAll(values);
        }
        return this;
    }

    public TraceNode withEvidenceHtml(String value) {
        setEvidenceHtml(value);
        return this;
    }

    public TraceNode withToolTip(String value) {
        setToolTip(value);
        return this;
    }

    public TraceNode withChildNodes(List<TraceNode> childNodes) {
        setChildNodes(childNodes);
        return this;
    }

}

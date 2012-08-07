
package xmlns.www_fortify_com.schema.issuemanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;


/**
 * <p>Java class for IssueLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IssueLocation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Package" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClassName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Function" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FilePath" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LineNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="URL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SourceFilePath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IssueLocation", propOrder = {
    "_package",
    "className",
    "function",
    "filePath",
    "lineNumber",
    "url",
    "sourceFilePath"
})
public class IssueLocation {

    @XmlElement(name = "Package")
    protected String _package;
    @XmlElement(name = "ClassName")
    protected String className;
    @XmlElement(name = "Function")
    protected String function;
    @XmlElement(name = "FilePath", required = true)
    protected String filePath;
    @XmlElement(name = "LineNumber")
    protected int lineNumber;
    @XmlElement(name = "URL", required = true)
    protected String url;
    @XmlElement(name = "SourceFilePath")
    protected String sourceFilePath;

    /**
     * Default no-arg constructor
     * 
     */
    public IssueLocation() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public IssueLocation(final String _package, final String className, final String function, final String filePath, final int lineNumber, final String url, final String sourceFilePath) {
        this._package = _package;
        this.className = className;
        this.function = function;
        this.filePath = filePath;
        this.lineNumber = lineNumber;
        this.url = url;
        this.sourceFilePath = sourceFilePath;
    }

    /**
     * Gets the value of the package property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackage() {
        return _package;
    }

    /**
     * Sets the value of the package property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackage(String value) {
        this._package = value;
    }

    /**
     * Gets the value of the className property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassName() {
        return className;
    }

    /**
     * Sets the value of the className property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassName(String value) {
        this.className = value;
    }

    /**
     * Gets the value of the function property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunction() {
        return function;
    }

    /**
     * Sets the value of the function property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunction(String value) {
        this.function = value;
    }

    /**
     * Gets the value of the filePath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilePath() {
        return filePath;
    }

    /**
     * Sets the value of the filePath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilePath(String value) {
        this.filePath = value;
    }

    /**
     * Gets the value of the lineNumber property.
     * 
     */
    public int getLineNumber() {
        return lineNumber;
    }

    /**
     * Sets the value of the lineNumber property.
     * 
     */
    public void setLineNumber(int value) {
        this.lineNumber = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the sourceFilePath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceFilePath() {
        return sourceFilePath;
    }

    /**
     * Sets the value of the sourceFilePath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceFilePath(String value) {
        this.sourceFilePath = value;
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

    public IssueLocation withPackage(String value) {
        setPackage(value);
        return this;
    }

    public IssueLocation withClassName(String value) {
        setClassName(value);
        return this;
    }

    public IssueLocation withFunction(String value) {
        setFunction(value);
        return this;
    }

    public IssueLocation withFilePath(String value) {
        setFilePath(value);
        return this;
    }

    public IssueLocation withLineNumber(int value) {
        setLineNumber(value);
        return this;
    }

    public IssueLocation withUrl(String value) {
        setUrl(value);
        return this;
    }

    public IssueLocation withSourceFilePath(String value) {
        setSourceFilePath(value);
        return this;
    }

}

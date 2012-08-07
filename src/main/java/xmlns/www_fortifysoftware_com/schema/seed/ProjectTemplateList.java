
package xmlns.www_fortifysoftware_com.schema.seed;

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
 * <p>Java class for ProjectTemplateList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProjectTemplateList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TemplateEntryPath" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProjectTemplateList", propOrder = {
    "templateEntryPath"
})
public class ProjectTemplateList {

    @XmlElement(name = "TemplateEntryPath", required = true)
    protected List<String> templateEntryPath;

    /**
     * Default no-arg constructor
     * 
     */
    public ProjectTemplateList() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ProjectTemplateList(final List<String> templateEntryPath) {
        this.templateEntryPath = templateEntryPath;
    }

    /**
     * Gets the value of the templateEntryPath property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the templateEntryPath property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTemplateEntryPath().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTemplateEntryPath() {
        if (templateEntryPath == null) {
            templateEntryPath = new ArrayList<String>();
        }
        return this.templateEntryPath;
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
     * Sets the value of the templateEntryPath property.
     * 
     * @param templateEntryPath
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplateEntryPath(List<String> templateEntryPath) {
        this.templateEntryPath = templateEntryPath;
    }

    public ProjectTemplateList withTemplateEntryPath(String... values) {
        if (values!= null) {
            for (String value: values) {
                getTemplateEntryPath().add(value);
            }
        }
        return this;
    }

    public ProjectTemplateList withTemplateEntryPath(Collection<String> values) {
        if (values!= null) {
            getTemplateEntryPath().addAll(values);
        }
        return this;
    }

    public ProjectTemplateList withTemplateEntryPath(List<String> templateEntryPath) {
        setTemplateEntryPath(templateEntryPath);
        return this;
    }

}

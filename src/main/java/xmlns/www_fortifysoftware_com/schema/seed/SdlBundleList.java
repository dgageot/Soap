
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
 * <p>Java class for SDLBundleList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SDLBundleList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EntryReference" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SDLBundleList", propOrder = {
    "entryReference"
})
public class SdlBundleList {

    @XmlElement(name = "EntryReference")
    protected List<String> entryReference;

    /**
     * Default no-arg constructor
     * 
     */
    public SdlBundleList() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public SdlBundleList(final List<String> entryReference) {
        this.entryReference = entryReference;
    }

    /**
     * Gets the value of the entryReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entryReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntryReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEntryReference() {
        if (entryReference == null) {
            entryReference = new ArrayList<String>();
        }
        return this.entryReference;
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
     * Sets the value of the entryReference property.
     * 
     * @param entryReference
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntryReference(List<String> entryReference) {
        this.entryReference = entryReference;
    }

    public SdlBundleList withEntryReference(String... values) {
        if (values!= null) {
            for (String value: values) {
                getEntryReference().add(value);
            }
        }
        return this;
    }

    public SdlBundleList withEntryReference(Collection<String> values) {
        if (values!= null) {
            getEntryReference().addAll(values);
        }
        return this;
    }

    public SdlBundleList withEntryReference(List<String> entryReference) {
        setEntryReference(entryReference);
        return this;
    }

}

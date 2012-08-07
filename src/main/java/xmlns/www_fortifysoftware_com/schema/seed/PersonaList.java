
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
import xmlns.www_fortifysoftware_com.schema.wstypes.Persona;


/**
 * <p>Java class for PersonaList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonaList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Persona" type="{xmlns://www.fortifysoftware.com/schema/wsTypes}Persona" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonaList", propOrder = {
    "persona"
})
public class PersonaList {

    @XmlElement(name = "Persona")
    protected List<Persona> persona;

    /**
     * Default no-arg constructor
     * 
     */
    public PersonaList() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public PersonaList(final List<Persona> persona) {
        this.persona = persona;
    }

    /**
     * Gets the value of the persona property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the persona property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersona().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Persona }
     * 
     * 
     */
    public List<Persona> getPersona() {
        if (persona == null) {
            persona = new ArrayList<Persona>();
        }
        return this.persona;
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
     * Sets the value of the persona property.
     * 
     * @param persona
     *     allowed object is
     *     {@link Persona }
     *     
     */
    public void setPersona(List<Persona> persona) {
        this.persona = persona;
    }

    public PersonaList withPersona(Persona... values) {
        if (values!= null) {
            for (Persona value: values) {
                getPersona().add(value);
            }
        }
        return this;
    }

    public PersonaList withPersona(Collection<Persona> values) {
        if (values!= null) {
            getPersona().addAll(values);
        }
        return this;
    }

    public PersonaList withPersona(List<Persona> persona) {
        setPersona(persona);
        return this;
    }

}

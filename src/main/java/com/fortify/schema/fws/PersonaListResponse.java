
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
import xmlns.www_fortifysoftware_com.schema.wstypes.Persona;
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
 *         &lt;element name="Persona" type="{xmlns://www.fortifysoftware.com/schema/wsTypes}Persona" maxOccurs="unbounded" minOccurs="0"/>
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
    "persona"
})
@XmlRootElement(name = "PersonaListResponse")
public class PersonaListResponse
    extends Status
{

    @XmlElement(name = "Persona")
    protected List<Persona> persona;

    /**
     * Default no-arg constructor
     * 
     */
    public PersonaListResponse() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public PersonaListResponse(final long code, final String msg, final List<RootCause> rootCause, final List<Persona> persona) {
        super(code, msg, rootCause);
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

    public PersonaListResponse withPersona(Persona... values) {
        if (values!= null) {
            for (Persona value: values) {
                getPersona().add(value);
            }
        }
        return this;
    }

    public PersonaListResponse withPersona(Collection<Persona> values) {
        if (values!= null) {
            getPersona().addAll(values);
        }
        return this;
    }

    public PersonaListResponse withPersona(List<Persona> persona) {
        setPersona(persona);
        return this;
    }

    @Override
    public PersonaListResponse withCode(long value) {
        setCode(value);
        return this;
    }

    @Override
    public PersonaListResponse withMsg(String value) {
        setMsg(value);
        return this;
    }

    @Override
    public PersonaListResponse withRootCause(RootCause... values) {
        if (values!= null) {
            for (RootCause value: values) {
                getRootCause().add(value);
            }
        }
        return this;
    }

    @Override
    public PersonaListResponse withRootCause(Collection<RootCause> values) {
        if (values!= null) {
            getRootCause().addAll(values);
        }
        return this;
    }

    @Override
    public PersonaListResponse withRootCause(List<RootCause> rootCause) {
        setRootCause(rootCause);
        return this;
    }

}

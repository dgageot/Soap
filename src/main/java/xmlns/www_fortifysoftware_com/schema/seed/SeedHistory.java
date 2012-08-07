
package xmlns.www_fortifysoftware_com.schema.seed;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import xmlns.www_fortify_com.schema.issuemanagement.AuditAction;
import xmlns.www_fortifysoftware_com.schema.wstypes.ProjectIdentifier;


/**
 * <p>Java class for SeedHistory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SeedHistory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProjectIdentifier" type="{xmlns://www.fortifysoftware.com/schema/wsTypes}ProjectIdentifier"/>
 *         &lt;element name="Event" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ResultEntry" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="SSAActivity" type="{xmlns://www.fortifysoftware.com/schema/seed}SSAActivity" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="AuditActivity" type="{xmlns://www.fortify.com/schema/issuemanagement}AuditAction" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Date" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                 &lt;attribute name="DateOffset" type="{http://www.w3.org/2001/XMLSchema}duration" />
 *                 &lt;attribute name="Username" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeedHistory", propOrder = {
    "projectIdentifier",
    "event"
})
public class SeedHistory {

    @XmlElement(name = "ProjectIdentifier", required = true)
    protected ProjectIdentifier projectIdentifier;
    @XmlElement(name = "Event")
    protected List<SeedHistory.Event> event;

    /**
     * Default no-arg constructor
     * 
     */
    public SeedHistory() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public SeedHistory(final ProjectIdentifier projectIdentifier, final List<SeedHistory.Event> event) {
        this.projectIdentifier = projectIdentifier;
        this.event = event;
    }

    /**
     * Gets the value of the projectIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectIdentifier }
     *     
     */
    public ProjectIdentifier getProjectIdentifier() {
        return projectIdentifier;
    }

    /**
     * Sets the value of the projectIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectIdentifier }
     *     
     */
    public void setProjectIdentifier(ProjectIdentifier value) {
        this.projectIdentifier = value;
    }

    /**
     * Gets the value of the event property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the event property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeedHistory.Event }
     * 
     * 
     */
    public List<SeedHistory.Event> getEvent() {
        if (event == null) {
            event = new ArrayList<SeedHistory.Event>();
        }
        return this.event;
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
     * Sets the value of the event property.
     * 
     * @param event
     *     allowed object is
     *     {@link SeedHistory.Event }
     *     
     */
    public void setEvent(List<SeedHistory.Event> event) {
        this.event = event;
    }

    public SeedHistory withProjectIdentifier(ProjectIdentifier value) {
        setProjectIdentifier(value);
        return this;
    }

    public SeedHistory withEvent(SeedHistory.Event... values) {
        if (values!= null) {
            for (SeedHistory.Event value: values) {
                getEvent().add(value);
            }
        }
        return this;
    }

    public SeedHistory withEvent(Collection<SeedHistory.Event> values) {
        if (values!= null) {
            getEvent().addAll(values);
        }
        return this;
    }

    public SeedHistory withEvent(List<SeedHistory.Event> event) {
        setEvent(event);
        return this;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ResultEntry" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="SSAActivity" type="{xmlns://www.fortifysoftware.com/schema/seed}SSAActivity" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="AuditActivity" type="{xmlns://www.fortify.com/schema/issuemanagement}AuditAction" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="Date" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *       &lt;attribute name="DateOffset" type="{http://www.w3.org/2001/XMLSchema}duration" />
     *       &lt;attribute name="Username" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "resultEntry",
        "ssaActivity",
        "auditActivity"
    })
    public static class Event {

        @XmlElement(name = "ResultEntry")
        protected List<String> resultEntry;
        @XmlElement(name = "SSAActivity")
        protected List<SsaActivity> ssaActivity;
        @XmlElement(name = "AuditActivity")
        protected List<AuditAction> auditActivity;
        @XmlAttribute(name = "Date")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar date;
        @XmlAttribute(name = "DateOffset")
        protected Duration dateOffset;
        @XmlAttribute(name = "Username", required = true)
        protected String username;

        /**
         * Default no-arg constructor
         * 
         */
        public Event() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public Event(final List<String> resultEntry, final List<SsaActivity> ssaActivity, final List<AuditAction> auditActivity, final XMLGregorianCalendar date, final Duration dateOffset, final String username) {
            this.resultEntry = resultEntry;
            this.ssaActivity = ssaActivity;
            this.auditActivity = auditActivity;
            this.date = date;
            this.dateOffset = dateOffset;
            this.username = username;
        }

        /**
         * Gets the value of the resultEntry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the resultEntry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getResultEntry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getResultEntry() {
            if (resultEntry == null) {
                resultEntry = new ArrayList<String>();
            }
            return this.resultEntry;
        }

        /**
         * Gets the value of the ssaActivity property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ssaActivity property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSsaActivity().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SsaActivity }
         * 
         * 
         */
        public List<SsaActivity> getSsaActivity() {
            if (ssaActivity == null) {
                ssaActivity = new ArrayList<SsaActivity>();
            }
            return this.ssaActivity;
        }

        /**
         * Gets the value of the auditActivity property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the auditActivity property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAuditActivity().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AuditAction }
         * 
         * 
         */
        public List<AuditAction> getAuditActivity() {
            if (auditActivity == null) {
                auditActivity = new ArrayList<AuditAction>();
            }
            return this.auditActivity;
        }

        /**
         * Gets the value of the date property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDate() {
            return date;
        }

        /**
         * Sets the value of the date property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDate(XMLGregorianCalendar value) {
            this.date = value;
        }

        /**
         * Gets the value of the dateOffset property.
         * 
         * @return
         *     possible object is
         *     {@link Duration }
         *     
         */
        public Duration getDateOffset() {
            return dateOffset;
        }

        /**
         * Sets the value of the dateOffset property.
         * 
         * @param value
         *     allowed object is
         *     {@link Duration }
         *     
         */
        public void setDateOffset(Duration value) {
            this.dateOffset = value;
        }

        /**
         * Gets the value of the username property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUsername() {
            return username;
        }

        /**
         * Sets the value of the username property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUsername(String value) {
            this.username = value;
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
         * Sets the value of the resultEntry property.
         * 
         * @param resultEntry
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setResultEntry(List<String> resultEntry) {
            this.resultEntry = resultEntry;
        }

        /**
         * Sets the value of the ssaActivity property.
         * 
         * @param ssaActivity
         *     allowed object is
         *     {@link SsaActivity }
         *     
         */
        public void setSsaActivity(List<SsaActivity> ssaActivity) {
            this.ssaActivity = ssaActivity;
        }

        /**
         * Sets the value of the auditActivity property.
         * 
         * @param auditActivity
         *     allowed object is
         *     {@link AuditAction }
         *     
         */
        public void setAuditActivity(List<AuditAction> auditActivity) {
            this.auditActivity = auditActivity;
        }

        public SeedHistory.Event withResultEntry(String... values) {
            if (values!= null) {
                for (String value: values) {
                    getResultEntry().add(value);
                }
            }
            return this;
        }

        public SeedHistory.Event withResultEntry(Collection<String> values) {
            if (values!= null) {
                getResultEntry().addAll(values);
            }
            return this;
        }

        public SeedHistory.Event withSsaActivity(SsaActivity... values) {
            if (values!= null) {
                for (SsaActivity value: values) {
                    getSsaActivity().add(value);
                }
            }
            return this;
        }

        public SeedHistory.Event withSsaActivity(Collection<SsaActivity> values) {
            if (values!= null) {
                getSsaActivity().addAll(values);
            }
            return this;
        }

        public SeedHistory.Event withAuditActivity(AuditAction... values) {
            if (values!= null) {
                for (AuditAction value: values) {
                    getAuditActivity().add(value);
                }
            }
            return this;
        }

        public SeedHistory.Event withAuditActivity(Collection<AuditAction> values) {
            if (values!= null) {
                getAuditActivity().addAll(values);
            }
            return this;
        }

        public SeedHistory.Event withDate(XMLGregorianCalendar value) {
            setDate(value);
            return this;
        }

        public SeedHistory.Event withDateOffset(Duration value) {
            setDateOffset(value);
            return this;
        }

        public SeedHistory.Event withUsername(String value) {
            setUsername(value);
            return this;
        }

        public SeedHistory.Event withResultEntry(List<String> resultEntry) {
            setResultEntry(resultEntry);
            return this;
        }

        public SeedHistory.Event withSsaActivity(List<SsaActivity> ssaActivity) {
            setSsaActivity(ssaActivity);
            return this;
        }

        public SeedHistory.Event withAuditActivity(List<AuditAction> auditActivity) {
            setAuditActivity(auditActivity);
            return this;
        }

    }

}

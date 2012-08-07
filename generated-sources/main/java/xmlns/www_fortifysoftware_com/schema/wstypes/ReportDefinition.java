
package xmlns.www_fortifysoftware_com.schema.wstypes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import xmlns.www_fortifysoftware_com.schema.enumconstants.ReportType;


/**
 * <p>Java class for ReportDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReportDefinition">
 *   &lt;complexContent>
 *     &lt;extension base="{xmlns://www.fortifysoftware.com/schema/wsTypes}PublishBase">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RenderingEngine" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ReportType" type="{xmlns://www.fortifysoftware.com/schema/enumConstants}ReportType"/>
 *         &lt;element name="TemplateEntryName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Guid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ReportParameters" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ReportParameter" type="{xmlns://www.fortifysoftware.com/schema/wsTypes}ReportParameter" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportDefinition", propOrder = {
    "name",
    "description",
    "renderingEngine",
    "reportType",
    "templateEntryName",
    "guid",
    "reportParameters"
})
public class ReportDefinition
    extends PublishBase
{

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Description", required = true)
    protected String description;
    @XmlElement(name = "RenderingEngine", required = true)
    protected String renderingEngine;
    @XmlElement(name = "ReportType", required = true)
    protected ReportType reportType;
    @XmlElement(name = "TemplateEntryName", required = true)
    protected String templateEntryName;
    @XmlElement(name = "Guid", required = true)
    protected String guid;
    @XmlElement(name = "ReportParameters")
    protected ReportDefinition.ReportParameters reportParameters;
    @XmlAttribute
    protected Long id;

    /**
     * Default no-arg constructor
     * 
     */
    public ReportDefinition() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ReportDefinition(final int publishVersion, final int objectVersion, final String name, final String description, final String renderingEngine, final ReportType reportType, final String templateEntryName, final String guid, final ReportDefinition.ReportParameters reportParameters, final Long id) {
        super(publishVersion, objectVersion);
        this.name = name;
        this.description = description;
        this.renderingEngine = renderingEngine;
        this.reportType = reportType;
        this.templateEntryName = templateEntryName;
        this.guid = guid;
        this.reportParameters = reportParameters;
        this.id = id;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the renderingEngine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRenderingEngine() {
        return renderingEngine;
    }

    /**
     * Sets the value of the renderingEngine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRenderingEngine(String value) {
        this.renderingEngine = value;
    }

    /**
     * Gets the value of the reportType property.
     * 
     * @return
     *     possible object is
     *     {@link ReportType }
     *     
     */
    public ReportType getReportType() {
        return reportType;
    }

    /**
     * Sets the value of the reportType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportType }
     *     
     */
    public void setReportType(ReportType value) {
        this.reportType = value;
    }

    /**
     * Gets the value of the templateEntryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplateEntryName() {
        return templateEntryName;
    }

    /**
     * Sets the value of the templateEntryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplateEntryName(String value) {
        this.templateEntryName = value;
    }

    /**
     * Gets the value of the guid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuid() {
        return guid;
    }

    /**
     * Sets the value of the guid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuid(String value) {
        this.guid = value;
    }

    /**
     * Gets the value of the reportParameters property.
     * 
     * @return
     *     possible object is
     *     {@link ReportDefinition.ReportParameters }
     *     
     */
    public ReportDefinition.ReportParameters getReportParameters() {
        return reportParameters;
    }

    /**
     * Sets the value of the reportParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportDefinition.ReportParameters }
     *     
     */
    public void setReportParameters(ReportDefinition.ReportParameters value) {
        this.reportParameters = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
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

    public ReportDefinition withName(String value) {
        setName(value);
        return this;
    }

    public ReportDefinition withDescription(String value) {
        setDescription(value);
        return this;
    }

    public ReportDefinition withRenderingEngine(String value) {
        setRenderingEngine(value);
        return this;
    }

    public ReportDefinition withReportType(ReportType value) {
        setReportType(value);
        return this;
    }

    public ReportDefinition withTemplateEntryName(String value) {
        setTemplateEntryName(value);
        return this;
    }

    public ReportDefinition withGuid(String value) {
        setGuid(value);
        return this;
    }

    public ReportDefinition withReportParameters(ReportDefinition.ReportParameters value) {
        setReportParameters(value);
        return this;
    }

    public ReportDefinition withId(Long value) {
        setId(value);
        return this;
    }

    @Override
    public ReportDefinition withPublishVersion(int value) {
        setPublishVersion(value);
        return this;
    }

    @Override
    public ReportDefinition withObjectVersion(int value) {
        setObjectVersion(value);
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
     *         &lt;element name="ReportParameter" type="{xmlns://www.fortifysoftware.com/schema/wsTypes}ReportParameter" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "reportParameter"
    })
    public static class ReportParameters {

        @XmlElement(name = "ReportParameter")
        protected List<ReportParameter> reportParameter;

        /**
         * Default no-arg constructor
         * 
         */
        public ReportParameters() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public ReportParameters(final List<ReportParameter> reportParameter) {
            this.reportParameter = reportParameter;
        }

        /**
         * Gets the value of the reportParameter property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the reportParameter property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getReportParameter().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ReportParameter }
         * 
         * 
         */
        public List<ReportParameter> getReportParameter() {
            if (reportParameter == null) {
                reportParameter = new ArrayList<ReportParameter>();
            }
            return this.reportParameter;
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
         * Sets the value of the reportParameter property.
         * 
         * @param reportParameter
         *     allowed object is
         *     {@link ReportParameter }
         *     
         */
        public void setReportParameter(List<ReportParameter> reportParameter) {
            this.reportParameter = reportParameter;
        }

        public ReportDefinition.ReportParameters withReportParameter(ReportParameter... values) {
            if (values!= null) {
                for (ReportParameter value: values) {
                    getReportParameter().add(value);
                }
            }
            return this;
        }

        public ReportDefinition.ReportParameters withReportParameter(Collection<ReportParameter> values) {
            if (values!= null) {
                getReportParameter().addAll(values);
            }
            return this;
        }

        public ReportDefinition.ReportParameters withReportParameter(List<ReportParameter> reportParameter) {
            setReportParameter(reportParameter);
            return this;
        }

    }

}

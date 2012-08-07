
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
 * <p>Java class for ClassInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClassInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Analyzer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AnalysisEngine" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Kingdom" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SubType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Category" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RuleId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OWASP2004" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OWASP2007" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CWE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WASC24and2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClassInfo", propOrder = {
    "analyzer",
    "analysisEngine",
    "kingdom",
    "type",
    "subType",
    "category",
    "ruleId",
    "owasp2004",
    "owasp2007",
    "cwe",
    "wasc24And2"
})
public class ClassInfo {

    @XmlElement(name = "Analyzer", required = true)
    protected String analyzer;
    @XmlElement(name = "AnalysisEngine", required = true)
    protected String analysisEngine;
    @XmlElement(name = "Kingdom", required = true)
    protected String kingdom;
    @XmlElement(name = "Type", required = true)
    protected String type;
    @XmlElement(name = "SubType", required = true)
    protected String subType;
    @XmlElement(name = "Category", required = true)
    protected String category;
    @XmlElement(name = "RuleId", required = true)
    protected String ruleId;
    @XmlElement(name = "OWASP2004")
    protected String owasp2004;
    @XmlElement(name = "OWASP2007")
    protected String owasp2007;
    @XmlElement(name = "CWE")
    protected String cwe;
    @XmlElement(name = "WASC24and2")
    protected String wasc24And2;

    /**
     * Default no-arg constructor
     * 
     */
    public ClassInfo() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ClassInfo(final String analyzer, final String analysisEngine, final String kingdom, final String type, final String subType, final String category, final String ruleId, final String owasp2004, final String owasp2007, final String cwe, final String wasc24And2) {
        this.analyzer = analyzer;
        this.analysisEngine = analysisEngine;
        this.kingdom = kingdom;
        this.type = type;
        this.subType = subType;
        this.category = category;
        this.ruleId = ruleId;
        this.owasp2004 = owasp2004;
        this.owasp2007 = owasp2007;
        this.cwe = cwe;
        this.wasc24And2 = wasc24And2;
    }

    /**
     * Gets the value of the analyzer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnalyzer() {
        return analyzer;
    }

    /**
     * Sets the value of the analyzer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnalyzer(String value) {
        this.analyzer = value;
    }

    /**
     * Gets the value of the analysisEngine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnalysisEngine() {
        return analysisEngine;
    }

    /**
     * Sets the value of the analysisEngine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnalysisEngine(String value) {
        this.analysisEngine = value;
    }

    /**
     * Gets the value of the kingdom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKingdom() {
        return kingdom;
    }

    /**
     * Sets the value of the kingdom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKingdom(String value) {
        this.kingdom = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the subType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubType() {
        return subType;
    }

    /**
     * Sets the value of the subType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubType(String value) {
        this.subType = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * Gets the value of the ruleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuleId() {
        return ruleId;
    }

    /**
     * Sets the value of the ruleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuleId(String value) {
        this.ruleId = value;
    }

    /**
     * Gets the value of the owasp2004 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwasp2004() {
        return owasp2004;
    }

    /**
     * Sets the value of the owasp2004 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwasp2004(String value) {
        this.owasp2004 = value;
    }

    /**
     * Gets the value of the owasp2007 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwasp2007() {
        return owasp2007;
    }

    /**
     * Sets the value of the owasp2007 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwasp2007(String value) {
        this.owasp2007 = value;
    }

    /**
     * Gets the value of the cwe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCwe() {
        return cwe;
    }

    /**
     * Sets the value of the cwe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCwe(String value) {
        this.cwe = value;
    }

    /**
     * Gets the value of the wasc24And2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWasc24And2() {
        return wasc24And2;
    }

    /**
     * Sets the value of the wasc24And2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWasc24And2(String value) {
        this.wasc24And2 = value;
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

    public ClassInfo withAnalyzer(String value) {
        setAnalyzer(value);
        return this;
    }

    public ClassInfo withAnalysisEngine(String value) {
        setAnalysisEngine(value);
        return this;
    }

    public ClassInfo withKingdom(String value) {
        setKingdom(value);
        return this;
    }

    public ClassInfo withType(String value) {
        setType(value);
        return this;
    }

    public ClassInfo withSubType(String value) {
        setSubType(value);
        return this;
    }

    public ClassInfo withCategory(String value) {
        setCategory(value);
        return this;
    }

    public ClassInfo withRuleId(String value) {
        setRuleId(value);
        return this;
    }

    public ClassInfo withOwasp2004(String value) {
        setOwasp2004(value);
        return this;
    }

    public ClassInfo withOwasp2007(String value) {
        setOwasp2007(value);
        return this;
    }

    public ClassInfo withCwe(String value) {
        setCwe(value);
        return this;
    }

    public ClassInfo withWasc24And2(String value) {
        setWasc24And2(value);
        return this;
    }

}

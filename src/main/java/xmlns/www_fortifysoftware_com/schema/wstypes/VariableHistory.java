
package xmlns.www_fortifysoftware_com.schema.wstypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import xmlns.www_fortifysoftware_com.schema.activitytemplate.Variable;


/**
 * <p>Java class for VariableHistory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VariableHistory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VariableHistoryId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Variable" type="{xmlns://www.fortifysoftware.com/schema/activitytemplate}Variable"/>
 *         &lt;element name="VariableValue" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Snapshot" type="{xmlns://www.fortifysoftware.com/schema/wsTypes}Snapshot"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VariableHistory", propOrder = {
    "variableHistoryId",
    "variable",
    "variableValue",
    "snapshot"
})
public class VariableHistory {

    @XmlElement(name = "VariableHistoryId")
    protected long variableHistoryId;
    @XmlElement(name = "Variable", required = true)
    protected Variable variable;
    @XmlElement(name = "VariableValue")
    protected int variableValue;
    @XmlElement(name = "Snapshot", required = true)
    protected Snapshot snapshot;

    /**
     * Default no-arg constructor
     * 
     */
    public VariableHistory() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public VariableHistory(final long variableHistoryId, final Variable variable, final int variableValue, final Snapshot snapshot) {
        this.variableHistoryId = variableHistoryId;
        this.variable = variable;
        this.variableValue = variableValue;
        this.snapshot = snapshot;
    }

    /**
     * Gets the value of the variableHistoryId property.
     * 
     */
    public long getVariableHistoryId() {
        return variableHistoryId;
    }

    /**
     * Sets the value of the variableHistoryId property.
     * 
     */
    public void setVariableHistoryId(long value) {
        this.variableHistoryId = value;
    }

    /**
     * Gets the value of the variable property.
     * 
     * @return
     *     possible object is
     *     {@link Variable }
     *     
     */
    public Variable getVariable() {
        return variable;
    }

    /**
     * Sets the value of the variable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Variable }
     *     
     */
    public void setVariable(Variable value) {
        this.variable = value;
    }

    /**
     * Gets the value of the variableValue property.
     * 
     */
    public int getVariableValue() {
        return variableValue;
    }

    /**
     * Sets the value of the variableValue property.
     * 
     */
    public void setVariableValue(int value) {
        this.variableValue = value;
    }

    /**
     * Gets the value of the snapshot property.
     * 
     * @return
     *     possible object is
     *     {@link Snapshot }
     *     
     */
    public Snapshot getSnapshot() {
        return snapshot;
    }

    /**
     * Sets the value of the snapshot property.
     * 
     * @param value
     *     allowed object is
     *     {@link Snapshot }
     *     
     */
    public void setSnapshot(Snapshot value) {
        this.snapshot = value;
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

    public VariableHistory withVariableHistoryId(long value) {
        setVariableHistoryId(value);
        return this;
    }

    public VariableHistory withVariable(Variable value) {
        setVariable(value);
        return this;
    }

    public VariableHistory withVariableValue(int value) {
        setVariableValue(value);
        return this;
    }

    public VariableHistory withSnapshot(Snapshot value) {
        setSnapshot(value);
        return this;
    }

}

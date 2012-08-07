
package xmlns.www_fortifysoftware_com.schema.enumconstants;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TraceNodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TraceNodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="IN_CALL"/>
 *     &lt;enumeration value="OUT_CALL"/>
 *     &lt;enumeration value="IN_OUT_CALL"/>
 *     &lt;enumeration value="READ"/>
 *     &lt;enumeration value="READ_GLOBAL "/>
 *     &lt;enumeration value="ASSIGN"/>
 *     &lt;enumeration value="ASSIGN_GLOBAL"/>
 *     &lt;enumeration value="ALIAS"/>
 *     &lt;enumeration value="COMPARE"/>
 *     &lt;enumeration value="RETURN"/>
 *     &lt;enumeration value="REF"/>
 *     &lt;enumeration value="DEREF"/>
 *     &lt;enumeration value="END_SCOPE"/>
 *     &lt;enumeration value="JUMP"/>
 *     &lt;enumeration value="BRANCH_TAKEN"/>
 *     &lt;enumeration value="BRANCH_NOT_TAKEN"/>
 *     &lt;enumeration value="EXTERNAL_ENTRY"/>
 *     &lt;enumeration value="RUNTIME_SINK"/>
 *     &lt;enumeration value="RUNTIME_SOURCE"/>
 *     &lt;enumeration value="RUNTIME_VALIDATION"/>
 *     &lt;enumeration value="GENERIC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TraceNodeType", namespace = "xmlns://www.fortifysoftware.com/schema/enumConstants")
@XmlEnum
public enum TraceNodeType {

    IN_CALL("IN_CALL"),
    OUT_CALL("OUT_CALL"),
    IN_OUT_CALL("IN_OUT_CALL"),
    READ("READ"),
    @XmlEnumValue("READ_GLOBAL ")
    READ_GLOBAL("READ_GLOBAL "),
    ASSIGN("ASSIGN"),
    ASSIGN_GLOBAL("ASSIGN_GLOBAL"),
    ALIAS("ALIAS"),
    COMPARE("COMPARE"),
    RETURN("RETURN"),
    REF("REF"),
    DEREF("DEREF"),
    END_SCOPE("END_SCOPE"),
    JUMP("JUMP"),
    BRANCH_TAKEN("BRANCH_TAKEN"),
    BRANCH_NOT_TAKEN("BRANCH_NOT_TAKEN"),
    EXTERNAL_ENTRY("EXTERNAL_ENTRY"),
    RUNTIME_SINK("RUNTIME_SINK"),
    RUNTIME_SOURCE("RUNTIME_SOURCE"),
    RUNTIME_VALIDATION("RUNTIME_VALIDATION"),
    GENERIC("GENERIC");
    private final String value;

    TraceNodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TraceNodeType fromValue(String v) {
        for (TraceNodeType c: TraceNodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

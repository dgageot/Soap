
package xmlns.www_fortifysoftware_com.schema.enumconstants;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportParamType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReportParamType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SINGLE_PROJECT"/>
 *     &lt;enumeration value="SINGLE_SSA_PROJECT"/>
 *     &lt;enumeration value="MULTI_PROJECT"/>
 *     &lt;enumeration value="MULTI_SSA_PROJECT"/>
 *     &lt;enumeration value="PROJECT_ATTRIBUTE"/>
 *     &lt;enumeration value="STRING"/>
 *     &lt;enumeration value="BOOLEAN"/>
 *     &lt;enumeration value="DATE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReportParamType", namespace = "xmlns://www.fortifysoftware.com/schema/enumConstants")
@XmlEnum
public enum ReportParamType {

    SINGLE_PROJECT,
    SINGLE_SSA_PROJECT,
    MULTI_PROJECT,
    MULTI_SSA_PROJECT,
    PROJECT_ATTRIBUTE,
    STRING,
    BOOLEAN,
    DATE;

    public String value() {
        return name();
    }

    public static ReportParamType fromValue(String v) {
        return valueOf(v);
    }

}

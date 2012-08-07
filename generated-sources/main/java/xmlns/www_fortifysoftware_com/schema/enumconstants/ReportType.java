
package xmlns.www_fortifysoftware_com.schema.enumconstants;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReportType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PROJECT"/>
 *     &lt;enumeration value="SSA_PROJECT"/>
 *     &lt;enumeration value="SSA_PORTFOLIO"/>
 *     &lt;enumeration value="PORTFOLIO"/>
 *     &lt;enumeration value="COMPLIANCE"/>
 *     &lt;enumeration value="ISSUE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReportType", namespace = "xmlns://www.fortifysoftware.com/schema/enumConstants")
@XmlEnum
public enum ReportType {

    PROJECT,
    SSA_PROJECT,
    SSA_PORTFOLIO,
    PORTFOLIO,
    COMPLIANCE,
    ISSUE;

    public String value() {
        return name();
    }

    public static ReportType fromValue(String v) {
        return valueOf(v);
    }

}

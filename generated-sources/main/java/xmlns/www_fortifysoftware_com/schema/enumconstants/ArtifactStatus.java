
package xmlns.www_fortifysoftware_com.schema.enumconstants;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArtifactStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ArtifactStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SCHED_PROCESSING"/>
 *     &lt;enumeration value="PROCESSING"/>
 *     &lt;enumeration value="PROCESS_COMPLETE"/>
 *     &lt;enumeration value="ERROR_PROCESSING"/>
 *     &lt;enumeration value="DISPATCH_ANALYSIS"/>
 *     &lt;enumeration value="DISPATCH_REAUDIT"/>
 *     &lt;enumeration value="QUEUED_ANALYSIS"/>
 *     &lt;enumeration value="REQUEUED_ANALYSIS"/>
 *     &lt;enumeration value="ANALYZING"/>
 *     &lt;enumeration value="ANALYSIS_COMPLETE"/>
 *     &lt;enumeration value="ERROR_ANALYZING"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ArtifactStatus", namespace = "xmlns://www.fortifysoftware.com/schema/enumConstants")
@XmlEnum
public enum ArtifactStatus {

    SCHED_PROCESSING,
    PROCESSING,
    PROCESS_COMPLETE,
    ERROR_PROCESSING,
    DISPATCH_ANALYSIS,
    DISPATCH_REAUDIT,
    QUEUED_ANALYSIS,
    REQUEUED_ANALYSIS,
    ANALYZING,
    ANALYSIS_COMPLETE,
    ERROR_ANALYZING,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static ArtifactStatus fromValue(String v) {
        return valueOf(v);
    }

}

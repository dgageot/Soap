
package xmlns.www_fortifysoftware_com.schema.enumconstants;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HostStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNCONTACTED"/>
 *     &lt;enumeration value="DISCONNECTED"/>
 *     &lt;enumeration value="REJECTED"/>
 *     &lt;enumeration value="DISABLED_CONTACTED"/>
 *     &lt;enumeration value="DISABLED_UNCONTACTED"/>
 *     &lt;enumeration value="REQUIRES_RESTART"/>
 *     &lt;enumeration value="INITIALIZING"/>
 *     &lt;enumeration value="CONFIGURING"/>
 *     &lt;enumeration value="CONFIG_ERROR"/>
 *     &lt;enumeration value="ACTIVE"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HostStatus", namespace = "xmlns://www.fortifysoftware.com/schema/enumConstants")
@XmlEnum
public enum HostStatus {

    UNCONTACTED,
    DISCONNECTED,
    REJECTED,
    DISABLED_CONTACTED,
    DISABLED_UNCONTACTED,
    REQUIRES_RESTART,
    INITIALIZING,
    CONFIGURING,
    CONFIG_ERROR,
    ACTIVE,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static HostStatus fromValue(String v) {
        return valueOf(v);
    }

}


package xmlns.www_fortifysoftware_com.schema.enumconstants;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActivityEventType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActivityEventType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CM_Audit"/>
 *     &lt;enumeration value="SCA_Upload"/>
 *     &lt;enumeration value="PTA_Upload"/>
 *     &lt;enumeration value="RTA_Upload"/>
 *     &lt;enumeration value="SecurityScope_Upload"/>
 *     &lt;enumeration value="Source_Upload"/>
 *     &lt;enumeration value="External_Upload"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActivityEventType", namespace = "xmlns://www.fortifysoftware.com/schema/enumConstants")
@XmlEnum
public enum ActivityEventType {

    @XmlEnumValue("CM_Audit")
    CM_AUDIT("CM_Audit"),
    @XmlEnumValue("SCA_Upload")
    SCA_UPLOAD("SCA_Upload"),
    @XmlEnumValue("PTA_Upload")
    PTA_UPLOAD("PTA_Upload"),
    @XmlEnumValue("RTA_Upload")
    RTA_UPLOAD("RTA_Upload"),
    @XmlEnumValue("SecurityScope_Upload")
    SECURITY_SCOPE_UPLOAD("SecurityScope_Upload"),
    @XmlEnumValue("Source_Upload")
    SOURCE_UPLOAD("Source_Upload"),
    @XmlEnumValue("External_Upload")
    EXTERNAL_UPLOAD("External_Upload");
    private final String value;

    ActivityEventType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ActivityEventType fromValue(String v) {
        for (ActivityEventType c: ActivityEventType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}


package xmlns.www_fortifysoftware_com.schema.seed;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SSAType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SSAType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Requirement"/>
 *     &lt;enumeration value="Activity"/>
 *     &lt;enumeration value="Template"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SSAType")
@XmlEnum
public enum SsaType {

    @XmlEnumValue("Requirement")
    REQUIREMENT("Requirement"),
    @XmlEnumValue("Activity")
    ACTIVITY("Activity"),
    @XmlEnumValue("Template")
    TEMPLATE("Template");
    private final String value;

    SsaType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SsaType fromValue(String v) {
        for (SsaType c: SsaType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

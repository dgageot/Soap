
package xmlns.www_fortifysoftware_com.schema.enumconstants;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlertableEntity.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AlertableEntity">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RT_INSTANCE"/>
 *     &lt;enumeration value="REQ_INSTANCE"/>
 *     &lt;enumeration value="ACTIVITY_INSTANCE"/>
 *     &lt;enumeration value="MEASUREMENT_AGENT"/>
 *     &lt;enumeration value="VARIABLE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AlertableEntity", namespace = "xmlns://www.fortifysoftware.com/schema/enumConstants")
@XmlEnum
public enum AlertableEntity {

    RT_INSTANCE,
    REQ_INSTANCE,
    ACTIVITY_INSTANCE,
    MEASUREMENT_AGENT,
    VARIABLE;

    public String value() {
        return name();
    }

    public static AlertableEntity fromValue(String v) {
        return valueOf(v);
    }

}

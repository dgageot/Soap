
package xmlns.www_fortifysoftware_com.schema.enumconstants;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AppEntityType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AppEntityType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PROJECT_VERSION"/>
 *     &lt;enumeration value="RUNTIME_APP"/>
 *     &lt;enumeration value="NONE"/>
 *     &lt;enumeration value="ALL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AppEntityType", namespace = "xmlns://www.fortifysoftware.com/schema/enumConstants")
@XmlEnum
public enum AppEntityType {

    PROJECT_VERSION,
    RUNTIME_APP,
    NONE,
    ALL;

    public String value() {
        return name();
    }

    public static AppEntityType fromValue(String v) {
        return valueOf(v);
    }

}

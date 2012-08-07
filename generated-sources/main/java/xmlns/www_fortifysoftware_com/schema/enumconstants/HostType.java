
package xmlns.www_fortifysoftware_com.schema.enumconstants;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HostType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="APPLICATION_SERVER"/>
 *     &lt;enumeration value="DATABASE_SERVER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HostType", namespace = "xmlns://www.fortifysoftware.com/schema/enumConstants")
@XmlEnum
public enum HostType {

    APPLICATION_SERVER,
    DATABASE_SERVER;

    public String value() {
        return name();
    }

    public static HostType fromValue(String v) {
        return valueOf(v);
    }

}

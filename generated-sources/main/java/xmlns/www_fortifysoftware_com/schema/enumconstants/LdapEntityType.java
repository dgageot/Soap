
package xmlns.www_fortifysoftware_com.schema.enumconstants;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LdapEntityType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LdapEntityType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="USER"/>
 *     &lt;enumeration value="GROUP"/>
 *     &lt;enumeration value="ORG_UNIT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LdapEntityType", namespace = "xmlns://www.fortifysoftware.com/schema/enumConstants")
@XmlEnum
public enum LdapEntityType {

    USER,
    GROUP,
    ORG_UNIT;

    public String value() {
        return name();
    }

    public static LdapEntityType fromValue(String v) {
        return valueOf(v);
    }

}

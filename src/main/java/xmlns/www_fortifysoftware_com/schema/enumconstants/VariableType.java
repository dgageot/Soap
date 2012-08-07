
package xmlns.www_fortifysoftware_com.schema.enumconstants;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VariableType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VariableType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SYSTEM_DEFINED"/>
 *     &lt;enumeration value="USER_DEFINED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VariableType", namespace = "xmlns://www.fortifysoftware.com/schema/enumConstants")
@XmlEnum
public enum VariableType {

    SYSTEM_DEFINED,
    USER_DEFINED;

    public String value() {
        return name();
    }

    public static VariableType fromValue(String v) {
        return valueOf(v);
    }

}

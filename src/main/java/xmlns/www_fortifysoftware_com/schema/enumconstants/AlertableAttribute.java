
package xmlns.www_fortifysoftware_com.schema.enumconstants;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlertableAttribute.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AlertableAttribute">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SIGN_OFF_STATE"/>
 *     &lt;enumeration value="VALUE_GT"/>
 *     &lt;enumeration value="VALUE_LT"/>
 *     &lt;enumeration value="VALUE_EQ"/>
 *     &lt;enumeration value="VALUE_GTE"/>
 *     &lt;enumeration value="VALUE_LTE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AlertableAttribute", namespace = "xmlns://www.fortifysoftware.com/schema/enumConstants")
@XmlEnum
public enum AlertableAttribute {

    SIGN_OFF_STATE,
    VALUE_GT,
    VALUE_LT,
    VALUE_EQ,
    VALUE_GTE,
    VALUE_LTE;

    public String value() {
        return name();
    }

    public static AlertableAttribute fromValue(String v) {
        return valueOf(v);
    }

}

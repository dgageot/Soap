
package xmlns.www_fortifysoftware_com.schema.enumconstants;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TemplateMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TemplateMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ASSESSMENT"/>
 *     &lt;enumeration value="BASIC"/>
 *     &lt;enumeration value="FULL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TemplateMode", namespace = "xmlns://www.fortifysoftware.com/schema/enumConstants")
@XmlEnum
public enum TemplateMode {

    ASSESSMENT,
    BASIC,
    FULL;

    public String value() {
        return name();
    }

    public static TemplateMode fromValue(String v) {
        return valueOf(v);
    }

}

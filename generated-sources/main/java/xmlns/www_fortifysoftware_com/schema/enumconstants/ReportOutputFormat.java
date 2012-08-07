
package xmlns.www_fortifysoftware_com.schema.enumconstants;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportOutputFormat.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReportOutputFormat">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PDF"/>
 *     &lt;enumeration value="DOC"/>
 *     &lt;enumeration value="XLS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReportOutputFormat", namespace = "xmlns://www.fortifysoftware.com/schema/enumConstants")
@XmlEnum
public enum ReportOutputFormat {

    PDF,
    DOC,
    XLS;

    public String value() {
        return name();
    }

    public static ReportOutputFormat fromValue(String v) {
        return valueOf(v);
    }

}

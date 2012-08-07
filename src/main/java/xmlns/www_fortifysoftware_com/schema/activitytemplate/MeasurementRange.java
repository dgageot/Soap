
package xmlns.www_fortifysoftware_com.schema.activitytemplate;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MeasurementRange.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MeasurementRange">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="percent"/>
 *     &lt;enumeration value="integer"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MeasurementRange")
@XmlEnum
public enum MeasurementRange {

    @XmlEnumValue("percent")
    PERCENT("percent"),
    @XmlEnumValue("integer")
    INTEGER("integer");
    private final String value;

    MeasurementRange(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MeasurementRange fromValue(String v) {
        for (MeasurementRange c: MeasurementRange.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

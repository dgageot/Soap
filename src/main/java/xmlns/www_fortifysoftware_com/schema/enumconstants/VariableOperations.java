
package xmlns.www_fortifysoftware_com.schema.enumconstants;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VariableOperations.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VariableOperations">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="COUNT"/>
 *     &lt;enumeration value="SUM"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VariableOperations", namespace = "xmlns://www.fortifysoftware.com/schema/enumConstants")
@XmlEnum
public enum VariableOperations {

    COUNT,
    SUM;

    public String value() {
        return name();
    }

    public static VariableOperations fromValue(String v) {
        return valueOf(v);
    }

}

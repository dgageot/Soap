
package xmlns.www_fortifysoftware_com.schema.enumconstants;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProjectMetaDataCategory.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProjectMetaDataCategory">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TECHNICAL"/>
 *     &lt;enumeration value="BUSINESS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProjectMetaDataCategory", namespace = "xmlns://www.fortifysoftware.com/schema/enumConstants")
@XmlEnum
public enum ProjectMetaDataCategory {

    TECHNICAL,
    BUSINESS;

    public String value() {
        return name();
    }

    public static ProjectMetaDataCategory fromValue(String v) {
        return valueOf(v);
    }

}

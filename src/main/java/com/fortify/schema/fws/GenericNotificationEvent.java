
package com.fortify.schema.fws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import xmlns.www_fortifysoftware_com.schema.wstypes.NotificationEvent;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{xmlns://www.fortifysoftware.com/schema/wsTypes}notificationEvent">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "GenericNotificationEvent")
public class GenericNotificationEvent
    extends NotificationEvent
{


    /**
     * Default no-arg constructor
     * 
     */
    public GenericNotificationEvent() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public GenericNotificationEvent(final Long projectVersionId, final String userName, final String eventType) {
        super(projectVersionId, userName, eventType);
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

    @Override
    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    @Override
    public GenericNotificationEvent withProjectVersionId(Long value) {
        setProjectVersionId(value);
        return this;
    }

    @Override
    public GenericNotificationEvent withUserName(String value) {
        setUserName(value);
        return this;
    }

    @Override
    public GenericNotificationEvent withEventType(String value) {
        setEventType(value);
        return this;
    }

}

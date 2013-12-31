package com.ericxu131.exwechat.model.event;

import javax.xml.bind.annotation.XmlEnumValue;

/**
 *
 * @author eric
 */
public enum EventType {

    @XmlEnumValue("CLICK")
    CLICK,
    @XmlEnumValue("subscribe")
    SUBSCRIBE,
    @XmlEnumValue("unsubscribe")
    UNSUBSCRIBE,
    @XmlEnumValue("LOCATION")
    LOCATION;

    public Class getEventClass() {
        if (this == CLICK) {
            return ClickEvent.class;
        }
        return null;
    }
}

package com.jpadb.jpa.event;

import lombok.Getter;

/**
 * 事件对象处理
 */
public abstract class  EventPoJo {
    /**
    *事件名称
    */
    @Getter
    private String eventName;
    public EventPoJo(String eventName){
        this.eventName = eventName;
    }
}

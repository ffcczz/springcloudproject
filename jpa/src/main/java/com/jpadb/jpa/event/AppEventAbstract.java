package com.jpadb.jpa.event;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.ApplicationEvent;

/**
 * 自定义事件类型
 */
public abstract class AppEventAbstract extends ApplicationEvent {

    /**
     * 事件对象
     */
    @Setter
    @Getter
    private EventPoJo eventPoJo;
    /**
     * 事件触发
     * @param source
     * @param eventPoJo
     */
    public AppEventAbstract(Object source,EventPoJo eventPoJo) {
        super(source);
        this.eventPoJo = eventPoJo;
    }


}
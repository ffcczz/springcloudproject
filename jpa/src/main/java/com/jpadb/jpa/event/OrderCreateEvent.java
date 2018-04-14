package com.jpadb.jpa.event;

import com.jpadb.jpa.model.CmsOrder;
import lombok.Getter;

/**
 * 自定义本地事件
 */

public class OrderCreateEvent extends AppEventAbstract {
    /**
     * 事件触发
     *
     * @param source
     * @param eventPoJo
     */
    public OrderCreateEvent(Object source, EventPoJo eventPoJo) {
        super(source, eventPoJo);
    }


}

package com.jpadb.jpa.listener;

import com.jpadb.jpa.event.OrderCreateEvent;
import com.jpadb.jpa.eventobj.EventPojoCmsOrder;
import com.jpadb.jpa.model.CmsOrder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * 监听指定的事件
 */
@Slf4j
@Component
public class OrderCreateListener implements ApplicationListener<OrderCreateEvent>{
    @Override
    //@EventListener 接口实现和注解实现二选一，否则会出现执行两次的情况
    @Async("publishPools") //开始事件发布异步,需要在启动类开启异步功能:@EnableAsync
    public void onApplicationEvent(OrderCreateEvent event) {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info("====event start=====");
        EventPojoCmsOrder eventPojoCmsOrder = (EventPojoCmsOrder)event.getEventPoJo();
        log.info("orderid:"+eventPojoCmsOrder.getCmsOrder().getOrderNo());
        log.info("====event end=====");
    }
}

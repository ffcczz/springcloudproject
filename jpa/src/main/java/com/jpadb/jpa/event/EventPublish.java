package com.jpadb.jpa.event;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Component
@Slf4j
public class EventPublish implements ApplicationEventPublisherAware{

    private ApplicationEventPublisher publisher;
    /**
     * 事件发布
     * @param event
     */
    public  void publishEvent(AppEventAbstract event){
        //log.info("事件:"+event.getEventPoJo().getEventName()+"开始发布");
        StopWatch stopWatch = new StopWatch(event.getEventPoJo().getEventName());
        stopWatch.start();
        this.publisher.publishEvent(event);
        stopWatch.stop();
        log.info(stopWatch.prettyPrint());
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.publisher = applicationEventPublisher;
    }
}

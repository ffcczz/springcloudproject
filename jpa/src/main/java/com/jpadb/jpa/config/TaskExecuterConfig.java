package com.jpadb.jpa.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Component;

/**
 * 线程池定义
 */
@Configuration
@Component
public class TaskExecuterConfig {
        @Bean(name="publishPools")
        public ThreadPoolTaskExecutor getAsyncExecutor() {
            ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
            taskExecutor.setCorePoolSize(5);//线程池维护线程的最少数量
            taskExecutor.setMaxPoolSize(10);//线程池维护线程的最大数量
            taskExecutor.setQueueCapacity(25);//线程池所使用的缓冲队列
            taskExecutor.initialize();
            return taskExecutor;
    }
}

package com.lion.springboot;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by yinxin on 17-12-8.
 */
/*
    配置类
    通过@EnableSchedulerConfig注解开启对计划任务的支持
 */
@Configuration
@ComponentScan("com.lion.springboot")
@EnableScheduling   //1
public class TaskSchedulerConfig {
}

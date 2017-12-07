package com.lion.springboot;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by yinxin on 17-12-7.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(EventConfig.class);

        DemoPublisher demoPublisher = context.getBean(DemoPublisher.class);

        demoPublisher.publish("hello application event");

        context.close();
    }
}

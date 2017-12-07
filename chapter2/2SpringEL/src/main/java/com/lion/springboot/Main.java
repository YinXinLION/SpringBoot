package com.lion.springboot;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * Created by yinxin on 17-12-6.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ElConfig.class);

        ElConfig resourceService = context.getBean(ElConfig.class);

        resourceService.outputResource();

        context.close();
    }
}

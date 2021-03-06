package com.lion.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created by yinxin on 17-12-7.
 */
//事件发布类
@Component
public class DemoPublisher {
    @Autowired
    ApplicationContext applicationContext;//注入ApplicationContext用来发布事件

    public void publish(String msg){
        //使用ApplicationContext的publishEvent方法来发布
        applicationContext.publishEvent(new DemoEvent(this, msg));
    }
}

package com.lion.springboot.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by yinxin on 17-12-13.
 */

/**
 * 根据HelloServiceProperties提供的参数，并通过@ConditionalOnClass判断HelloService这个类是否
 * 在类路径中存在，且当容器中没有这个Bean的情况下自动配置这个Bean.
 */
@Configuration//1
@EnableConfigurationProperties(HelloServiceProperties.class)//2
@ConditionalOnClass(HelloService.class)//3
@ConditionalOnProperty(prefix = "hello",value = "enabled",matchIfMissing=true)//4
public class HelloServiceAutoConfiguration {
    @Autowired
    private HelloServiceProperties helloServiceProperties;

    @Bean
    @ConditionalOnMissingBean(HelloService.class)
    public HelloService helloService(){
        HelloService helloService = new HelloService();
        helloService.setMsg(helloServiceProperties.getMsg());
        return helloService;
    }
}

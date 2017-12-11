package com.lion.springboot;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by yinxin on 17-12-11.
 */
/*
    1.在Junit环境下提供Spring TestContext Framework的功能。
    2.用来加载配置Application Context，classes加载配置类
    3.@ActiveProfiles声明活动的profile
    4.@Autowried注入Bean
    5.通过Junit的Assert校验结果是否和预期一致。
 */
@RunWith(SpringRunner.class) //1
@ContextConfiguration(classes = TestConfig.class)//2
@ActiveProfiles("prod")//3
public class DemoBeanIntegrationTests {
    @Autowired//4
    private TestBean testBean;

    @Test//5
    public void prodBeanShouldInject() {
        String expected = "from production profile";
        String actual = testBean.getContent();
        Assert.assertEquals(expected, actual);
    }
}
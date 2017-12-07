package com.lion.springboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by yinxin on 17-12-6.
 */
@Service
public class DemoService {
    @Value("其他类的属性") // 注入普通字符串
    private String another;

    public String getAnother() {
        return another;
    }

    public void setAnother(String another) {
        this.another = another;
    }
}

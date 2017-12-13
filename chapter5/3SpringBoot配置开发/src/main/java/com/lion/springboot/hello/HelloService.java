package com.lion.springboot.hello;

/**
 * Created by yinxin on 17-12-13.
 */

/**
 * 判断依据类
 */
public class HelloService {
    private String msg;
    public String sayHello() {
        return "Hello" + msg;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg){
        this.msg = msg;
    }
}

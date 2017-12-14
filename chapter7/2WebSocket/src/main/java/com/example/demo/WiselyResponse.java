package com.example.demo;

/**
 * Created by yinxin on 17-12-14.
 */
//服务端向浏览器发送的此类的信息
public class WiselyResponse {

    private String responseMessage;

    public WiselyResponse(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public String getResponseMessage() {
        return responseMessage;
    }
}

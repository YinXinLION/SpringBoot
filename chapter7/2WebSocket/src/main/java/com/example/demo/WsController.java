package com.example.demo;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

/**
 * Created by yinxin on 17-12-14.
 */
@Controller
public class WsController {
    /*
        跟RequestMapping类似，地址映射
        当服务器有消息时，会对订阅了@SendTo中的路径的浏览器发送消息
     */
    @MessageMapping("/welcome")
    @SendTo("/topic/getResponse")
    public WiselyResponse say(WiselyMessage message) throws Exception {
        Thread.sleep(3000);
        return new WiselyResponse("welcome, " + message.getName() + "!");
    }
}

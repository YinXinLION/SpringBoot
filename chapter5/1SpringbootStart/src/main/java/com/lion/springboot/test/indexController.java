package com.lion.springboot.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yinxin on 17-12-12.
 */
@RestController
public class indexController {
    @RequestMapping("/index")
    @ResponseBody
    public String index(){
        return "hello";
    }
}

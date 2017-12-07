package com.lion.springboot;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created by yinxin on 17-12-6.
 */
@Service()
@Scope("prototype")    //多例
public class DemoPrototypeService {
}

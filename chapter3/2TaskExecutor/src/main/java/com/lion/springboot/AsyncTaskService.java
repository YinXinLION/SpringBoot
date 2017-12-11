package com.lion.springboot;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * Created by yinxin on 17-12-8.
 */

/*
    通过@Async注解表明该方法是异步的，如果注解在类级别，表示类所有方法都是异步的
    这里方法自动被植入使用ThreadPoolTaskExecutor作为TaskExecutor。
 */
@Service
public class AsyncTaskService {
    @Async  //1
    public void executeAsyncTask(Integer i) {
        System.out.println("执行异步任务: " + i);
    }
    @Async
    public void executeAsyncTaskPlus(Integer i) {
        System.out.println("执行异步任务+1: " + (i + 1));
    }
}

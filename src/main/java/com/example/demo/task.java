package com.example.demo;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * <pre>
 *    author  : wangyp
 *    time    : 2017/10/11下午3:57
 *    desc    : desc
 *    version : v1.0
 * </pre>
 */
@Component
public class task {

    @Scheduled(cron="14 0 0 * * ?")
    public void mytask(){
        System.out.print(new Date());
    }

    @Scheduled(fixedRate=1000)
    public void mytest(){
        System.out.print("现在时间是"+System.currentTimeMillis());

    }

}

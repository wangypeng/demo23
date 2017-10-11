package com.example.demo.common;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


/**
 * <pre>
 *    author  : wangyp
 *    time    : 2017/10/11下午5:25
 *    desc    : desc
 *    version : v1.0
 * </pre>
 */
@Component
@ConfigurationProperties(prefix="constant")
public class Constant {

    private static String MONGO_POOL_NUM;

    public static String getMongoPoolNum() {
        return MONGO_POOL_NUM;
    }

    public static void setMongoPoolNum(String mongoPoolNum) {
        MONGO_POOL_NUM = mongoPoolNum;
    }

    public static String getOutTime() {
        return OUT_TIME;
    }

    public static void setOutTime(String outTime) {
        OUT_TIME = outTime;
    }

    private static String OUT_TIME;

}

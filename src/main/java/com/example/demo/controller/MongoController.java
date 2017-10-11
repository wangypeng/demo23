package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.common.Constant;
import com.example.demo.dao.AccountRepository;
import com.example.demo.model.Account;
import com.example.demo.mongo.MyMongoDBFactory;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

/**
 * Created by wangyp on 2017/10/11.
 */
@RestController
public class MongoController {

    private static Logger log = Logger.getLogger(MongoController.class.getName());

    @Value("${constant.OUT_TIME}")
    private String pool;

    @Autowired
    private Constant constant;

    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private MyMongoDBFactory myMongoDBFactory;

    @RequestMapping("/index")
    public JSONObject index(String db){
        log.info("this is index start log ...");
        DBObject query = new BasicDBObject();
        query.put("_id","N00000000422");
        DBObject dbNames = myMongoDBFactory.getDb(db).getCollection("platform_account").findOne(query);
        JSONObject result = new JSONObject();
        result.put("result",dbNames);
        log.info("this is index end log ...");
        return result;
    }

//    @RequestMapping("/account")
//    public JSONObject getAccount(){
//        JSONObject result = new JSONObject();
//        Account account = accountRepository.findByFirstname("N00000000422");
//        result.put("result",account);
//        return result;
//    }

    @RequestMapping("/test")
    public JSONObject test(){
        JSONObject result = new JSONObject();
        result.put("constant", constant.getMongoPoolNum());
        System.out.print(pool);
        return result;
    }
}

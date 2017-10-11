package com.example.demo.mongo;

import com.mongodb.DB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.stereotype.Component;

/**
 * Created by wangyp on 2017/10/11.
 */
@Component
public class MyMongoDBFactory {

    private final MongoDbFactory mongo;

    @Autowired
    public MyMongoDBFactory(MongoDbFactory mongo) {
        this.mongo = mongo;
    }

    public DB getDb(String DbName){
        return mongo.getDb(DbName);
    }

}

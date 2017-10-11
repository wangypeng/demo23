package com.example.demo.dao;

import com.example.demo.model.Account;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by wangyp on 2017/10/11.
 */
public interface AccountRepository extends MongoRepository<Account, String>{

//    public Account findByFirstname(String firstname);
//
//    public List<Account> findBySecondname(String secondname);

}

package com.example.demo.model;

import org.springframework.data.annotation.Id;

/**
 * Created by wangyp on 2017/10/11.
 */
public class Account {

    @Id
    private String id;

    private String companyName;

    private String name;

    private String managerPassword;

    public void setId(String id) {
        this.id = id;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setManagerPassword(String managerPassword) {
        this.managerPassword = managerPassword;
    }

    public String getId() {
        return id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getName() {
        return name;
    }

    public String getManagerPassword() {
        return managerPassword;
    }
}

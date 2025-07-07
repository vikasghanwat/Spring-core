package com.dao;

import javax.annotation.PostConstruct;

public class Dao {
    private String connection;

    public void test1() {
        System.out.println("DAO Method() " + connection);
    }

    @PostConstruct
    public String init() {
        String connection = "connection established";
//        this.connection = connection;
//        return connection;
        this.connection = null;
        return null;
    }
}

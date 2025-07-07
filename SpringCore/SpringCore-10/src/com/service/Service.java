package com.service;

import com.dao.Dao;

public class Service {

    private Dao dao;

    public void setDao(Dao dao) {
        this.dao = dao;
    }

    public void test1() {
        System.out.println("SERVICE Method()");
        dao.test1();
    }
}

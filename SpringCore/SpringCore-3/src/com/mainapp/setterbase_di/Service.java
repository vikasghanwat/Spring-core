package com.mainapp.setterbase_di;

public class Service {

    private Dao dao;

    public void setDao(Dao dao) {
        this.dao = dao;
    }

    void test1() {
        System.out.println("SERVICE-1 Method()");
        dao.test1();
    }

    void test2() {
        System.out.println("SERVICE-2 Method()");
        dao.test2();
    }
}

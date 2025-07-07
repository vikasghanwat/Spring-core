package com.mainapp.contructorbase_di;

public class Service {

    private Dao dao;

    public Service(Dao dao) {
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

package com.mainapp.beanfactory;

public class Demo {

    static {
        System.out.println("Demo bean Loading");
    }

    Demo() {
        System.out.println("Demo bean initialization ");
    }

    public int test() {
        System.out.println("Demo bean Done");
        return 1000;
    }
}

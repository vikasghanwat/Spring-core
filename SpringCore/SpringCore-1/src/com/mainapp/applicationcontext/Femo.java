package com.mainapp.applicationcontext;

public class Femo {

    static {
        System.out.println("Femo bean Loading");
    }

    Femo() {
        System.out.println("Femo bean initialization ");
    }

    public void test() {
        System.out.println("Femo bean done");
    }
}

package com.mainapp;

public class EmpBean {

    private String code;

    static {
        System.out.println("Emp bean initialise");
    }

    public EmpBean(String code) {
        this.code = code;
        System.out.println(this.code + " Emp bean initialise");
    }

    public EmpBean() {
        System.out.println("0 param const");
    }

    public void test() {
        System.out.println("utility method called - " + code);
    }


}

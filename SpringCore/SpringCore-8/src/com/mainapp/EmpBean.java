package com.mainapp;

import java.util.Scanner;

public class EmpBean {

    private String code;

    static {
        System.out.println("Emp bean initialise");
    }

    public EmpBean(String code) {
        this.code = code;
        System.out.println(this.code+" Emp bean initialise");
    }

    public EmpBean() {
        System.out.println("0 param const");
    }

    public void test() {
        System.out.println("utility method called - " + code);
    }

    public static EmpBean createObj() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter key");
        EmpBean emp;
        int key = scanner.nextInt();
        if (key == 1234) {
            emp = new EmpBean("XYZ");
        } else {
            emp = new EmpBean("ABC");
        }
        return emp;
    }

}

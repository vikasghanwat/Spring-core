package com.mainapp;

import java.util.Scanner;

public class ObjFactoryBean {
    public EmpBean createObj() {
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

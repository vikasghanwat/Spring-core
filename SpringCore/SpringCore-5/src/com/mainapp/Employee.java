package com.mainapp;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Employee {

    static {
        System.out.println("Employee bean Loading");
    }

    Employee() {
        System.out.println("Employee bean initialization ");
    }

    /*public void xmlinItMethod() {
            System.out.println("Resource Allocation for Employee Bean");
        }*/

    @PostConstruct
    public void xmlinItMethod() {
        System.out.println("Resource Allocation for Employee Bean");
    }

    public void test() {
        System.out.println("Employee Custom Utility method");
    }

    /*public void xmlDestroyMethod() {
        System.out.println("Resource De-Allocation for Employee Bean");
    }*/

    @PreDestroy
    public void xmlDestroyMethod() {
        System.out.println("Resource De-Allocation for Employee Bean");
    }
}

package com.mainapp;

public class Employee {

    static {
        System.out.println("Employee bean Loading");
    }

    Employee() {
        System.out.println("Employee bean initialization ");
    }

    public void xmlinItMethod() { //not mandatory inIt() method name can be anything
        System.out.println("Resource Allocation for Employee Bean");
    }

    public void test() {
        System.out.println("Employee Custom Utility method");
    }

    public void xmlDestroyMethod() { //destroy() name can be anything
        System.out.println("Resource De-Allocation for Employee Bean");
    }
}

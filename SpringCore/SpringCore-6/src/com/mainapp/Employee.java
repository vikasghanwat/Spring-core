package com.mainapp;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee implements InitializingBean, DisposableBean {

    static {
        System.out.println("Employee bean Loading");
    }

    Employee() {
        System.out.println("Employee bean initialization ");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Resource Allocation for Employee Bean");
    }

    public void test() {
        System.out.println("Employee Custom Utility method");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Resource De-Allocation for Employee Bean");
    }
}

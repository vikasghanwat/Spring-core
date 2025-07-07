package com.mainapp;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Employee implements InitializingBean, DisposableBean {

    static {
        System.out.println("Employee bean Loading");
    }

    Employee() {
        System.out.println("Employee bean initialization ");
    }

    public void xmlinitMethod() {
        System.out.println("Resource Allocation for Employee Bean XML");
    }

    @PostConstruct
    public void annoInitMethod() {
        System.out.println("Resource Allocation for Employee Bean Anno");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Resource Allocation for Employee Bean Call Back");
    }

    public void test() {
        System.out.println("Employee Custom Utility method");
    }

    public void xmlDestroyMethod() {
        System.out.println("Resource De-Allocation for Employee Bean");
    }

    @PreDestroy
    public void annoDestroyMethod() {
        System.out.println("Resource De-Allocation for Employee Bean Anno");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Resource De-Allocation for Employee Bean Call Back");
    }
}

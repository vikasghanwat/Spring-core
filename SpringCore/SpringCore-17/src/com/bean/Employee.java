package com.bean;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component
//@Lazy  //it will create bean when ask to create
@Scope(scopeName = "prototype")
//@Scope("prototype")
public class Employee {

    static {
        System.out.println("BEAN LOADING");
    }

    public Employee() {
        System.out.println("BEAN INITIALIZATION");
    }

    @PostConstruct
    public void init() {
        System.out.println("INIT bean");
    }

    public void test() {
        System.out.println("BEAN Method CALLED");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("DESTROY bean");
    }
}

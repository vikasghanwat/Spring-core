package com.mainapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Launch {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");

        Employee emp = (Employee) ac.getBean("emp");
        emp.test();

        ac.close(); //if we didn't close ac then destroy() will not invoked

    }
}

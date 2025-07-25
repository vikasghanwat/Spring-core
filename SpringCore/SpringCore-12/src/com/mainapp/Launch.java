package com.mainapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Launch {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        Employee employee = (Employee) ac.getBean("employee");
        employee.seteId(11);
        employee.setEname("koo");
        System.out.println(employee);

        //this will tell us its internally by default using ArrayList class
        System.out.println(employee.getDefaultListBooks().getClass());
    }
}

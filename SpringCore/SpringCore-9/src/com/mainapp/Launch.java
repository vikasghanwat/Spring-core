package com.mainapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Launch {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        EmpBean empBean = (EmpBean) ac.getBean("emp");
        empBean.test();

        System.out.println("Exit");
    }
}

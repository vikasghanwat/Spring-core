package com.mainapp;

import com.controller.Controller;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Launch {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        Controller controller = (Controller) ac.getBean("controller");
        controller.doPost();
    }
}

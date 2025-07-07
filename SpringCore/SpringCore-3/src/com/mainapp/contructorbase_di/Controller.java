package com.mainapp.contructorbase_di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Controller {
    private Service service;

    public Controller(Service service) {
        this.service = service;
    }

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean_1.xml");

        Controller controller = (Controller) ac.getBean("controller");

        controller.doPost();
        System.out.println();
        controller.doGet();
    }

    void doPost() {
        System.out.println("Controller doPost()");
        service.test1();
    }

    void doGet() {
        System.out.println("Controller doGet()");
        service.test2();
    }
}

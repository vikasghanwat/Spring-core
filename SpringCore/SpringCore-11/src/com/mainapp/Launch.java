package com.mainapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Launch {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        Employee employee = (Employee) ac.getBean("employee");
        employee.seteId(11);
        employee.setEname("koo");
        System.out.println(employee);

        Student student = (Student) ac.getBean("student");
        student.setsId(12);
        student.setSname("foo");
        System.out.println(student);

        Client client = (Client) ac.getBean("client");
        client.setcId(13);
        client.setcName("boo");
        System.out.println(client);
    }
}

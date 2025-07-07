package com.mainapp;

import com.config.MyConfig;
import com.controller.Controller;
import com.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Launch {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MyConfig.class);
        Employee employeeBean = ac.getBean(Employee.class);

        employeeBean.setEid(18);
        employeeBean.setName("virat.kohli");
        employeeBean.setAddress("RCB");

        //System.out.println(employeeBean);

        Controller controllerBean = ac.getBean(Controller.class);

        String msg = controllerBean.doPost(employeeBean);

        System.out.println(msg);
    }
}

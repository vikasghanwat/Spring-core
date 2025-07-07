package com.mainapp.singleton;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Launch {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");

        Account acc1 = (Account) ac.getBean("acc");

        acc1.setAccNo(1234);
        acc1.setName("vikas");
        acc1.setType("saving");
        acc1.setAddress("pune");

        System.out.println(acc1);

        Account acc2 = (Account) ac.getBean("acc");

        /*setter method overing values
         * so here we are getting diff data*/

        acc2.setAccNo(4567);
        acc2.setName("virat");
        acc2.setType("current");
        acc2.setAddress("delhi");

        System.out.println(acc2);

        System.out.println("Printing both the objects");

        /*here by default scope is singleton
         * every time bean return same object
         * we can see below result both obj returning same value*/

        System.out.println(acc1);
        System.out.println(acc2);

    }
}

package com.mainapp.prototype;

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

        acc2.setAccNo(4567);
        acc2.setName("virat");
        acc2.setType("current");
        acc2.setAddress("delhi");



        System.out.println(acc2);

        System.out.println("Printing both the objects");

        /*here scope is prototype so when we invoked a getbean method
         * will get new object l.e bean
         * prototype scope is by default lazy loading
         * it will create bean when getBean() invoked
         * reason is it not sure how may time we are going to invoke the getBean()*/

        System.out.println(acc1);
        System.out.println(acc2);


    }
}

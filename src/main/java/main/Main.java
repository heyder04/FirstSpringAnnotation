package main;

import az.company.customer.services.CustomerServices;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args)
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("Spring-AutoScan.xml");
//        Object obj=factory.getBean(Object.class);
        CustomerServices cust=(CustomerServices)context.getBean("customerService");
        System.out.println(cust);
    }
}
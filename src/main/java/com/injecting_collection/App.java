package com.injecting_collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Emp emp1 = (Emp) context.getBean("emp1");
        System.out.println("Name : "+emp1.getName());
        System.out.println("mobile numbers : "+emp1.getMobile());
        System.out.println("Addresses : "+emp1.getAddresses());
        System.out.println("Courses with Duration : "+emp1.getCourses());
    }
}

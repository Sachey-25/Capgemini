package org.capge.springcore_collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context =
    			 new ClassPathXmlApplicationContext("config.xml");
    	//Object for Class - Order.java
    	Order order = (Order) context.getBean("ord");
    	System.out.println(order.getOrderId());
    	System.out.println(order.getOrderName());
    	System.out.println(order.getOrderCity());
    	
        //Object created for spring application 
        // I need to connect this with JavaClass.    	   
    	//Object for Class - Emp.class
    	Emp emp = (Emp) context.getBean("emp");
    	System.out.println(emp.getName());
    	System.out.println(emp.getPhones());
    	System.out.println(emp.getCourses());
    	System.out.println(emp.getAddresses());
    	((AbstractApplicationContext) context).close();
    }
}
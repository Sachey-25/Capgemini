package org.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	//Create an objec to the spring context container
	public static void main(String[] args) {
			ApplicationContext context =
				new ClassPathXmlApplicationContext
					("org/springcore/standalone/collections/Config.xml");
			
			//Call the class where the data is present
			Person person=context.getBean("person",Person.class);
			System.out.println(person);
			System.out.println(person.getFriends().getClass().getName());
			
			System.out.println("*******************************************");
			System.out.println(person.getFeestructure());
			System.out.println(person.getFeestructure().getClass().getName());
			
			System.out.println("*******************************************");
			System.out.println(person.getProperties());
			System.out.println(person.getProperties().getClass().getName());
					
			((AbstractApplicationContext) context).close();
	}
}
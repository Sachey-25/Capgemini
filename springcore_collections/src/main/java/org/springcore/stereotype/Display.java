package org.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Display {
	
	public static void main(String[] args) {
		
		ApplicationContext context = 
		new ClassPathXmlApplicationContext("org/springcore/stereotype/Config.xml");
		
		//Object 
		Student student = context.getBean("Personal",Student.class);
		System.out.println(student);
		System.out.println(student.getAddress());
		System.out.println(student.getAddress().getClass());
		
		
		
		((AbstractApplicationContext) context).close();
	}
}

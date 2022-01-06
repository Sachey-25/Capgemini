package org.capge.springcore_reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext
				("org/capge/springcore_reference/ConfigReference.xml");
		
		A temp = (A) context.getBean("aref");
		System.out.println(temp.getX());
		
		System.out.println(temp.getOb().getY());
		System.out.println(temp);
		((AbstractApplicationContext) context).close();
	}
}

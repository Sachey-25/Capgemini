package org.springcore.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=
				new ClassPathXmlApplicationContext
						("org/springcore/constructorInjection/configConstructor.xml");
		
		Person p=(Person) context.getBean("person");
		System.out.println(p);
		((AbstractApplicationContext) context).close();
	}
}
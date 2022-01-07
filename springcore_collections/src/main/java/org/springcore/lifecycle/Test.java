package org.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("org/springcore/lifecycle/confi.xml");
		
//		//registering shutdown hook
//		context.registerShutdownHook();
//		//		Samosa samosa = (Samosa) context.getBean("samosa");
//		System.out.println(samosa);
///		System.out.println("***************************");
//		//		Pepsi p = (Pepsi) context.getBean("pepsi");
//		System.out.println(p);
		
		Example example = (Example) context.getBean("example");
		System.out.println(example);
		
		
		
		
		
		
		
		context.close();
	}
}

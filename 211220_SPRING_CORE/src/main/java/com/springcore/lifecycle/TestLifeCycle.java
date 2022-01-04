package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLifeCycle {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = 	new ClassPathXmlApplicationContext("com/springcore/lifecycle/lcconfig.xml");
//		Samosa samosa1 = 	 (Samosa) context.getBean("samosa1");
//		System.out.println(samosa1);
//		//Registering Shutdown Hook. 
		context.registerShutdownHook();
//		
//		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
//		
//		Pepsi pepsi1 = 	(Pepsi) context.getBean("pepsi1");
//		System.out.println(pepsi1);

		
		Example example = 	 (Example) context.getBean("example1");
		System.out.println(example);
	}

}

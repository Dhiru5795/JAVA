package com.springcore.auto.wire.annotation18;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireTest {

	public static void main(String[] args) {
		
	ApplicationContext context = 	new ClassPathXmlApplicationContext("com/springcore/auto/wire/annotation18/annotationautowireconfig.xml");
	Emp emp1 = 	context.getBean("emp1",Emp.class);
	System.out.println(emp1);
	}

}

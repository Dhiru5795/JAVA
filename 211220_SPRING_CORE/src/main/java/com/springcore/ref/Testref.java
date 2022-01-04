package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testref {

	public static void main(String[] args) {
		
		
	 ApplicationContext context = 	new ClassPathXmlApplicationContext("com/springcore/ref/refconfig.xml");
	 A val = 	(A) context.getBean("aref");
	 
	 System.out.println(val.getX());
	 
	 System.out.println(val.getOb().getY());
	 System.out.println(val);
	} 

}

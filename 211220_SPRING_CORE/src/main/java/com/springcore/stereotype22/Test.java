package com.springcore.stereotype22;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stereotype22/stereotypeconfig.xml");
//	Student student =  context.getBean("student",Student.class); //by default class name ko hi camel case me use karta hai. 
	Student student =  context.getBean("jonaamhumdenge",Student.class);
	System.out.println(student);
	System.out.println(student.getAddress());
	System.out.println(student.getAddress().getClass().getName());
	System.out.println(student.hashCode());
	
	Student student1 =  context.getBean("jonaamhumdenge",Student.class);
	System.out.println(student1.hashCode());

	System.out.println("++++++++++++++++++++++++++++++++++++++++++");
	Teacher teacher = 	context.getBean("teacher",Teacher.class);
	System.out.println(teacher.hashCode());
	
	Teacher teacher1 = 	context.getBean("teacher",Teacher.class);
	System.out.println(teacher1.hashCode());
	}
	


	
	
}

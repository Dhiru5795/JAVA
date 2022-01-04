package com.springcore.javaconfig28;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaconfigTest {

	public static void main(String[] args) {
	//	ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/javaconfig28/config.xml");
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class );
	//	Student student = 	context.getBean("firststudent",Student.class);
		Student student = 	context.getBean("con",Student.class);
		System.out.println(student);
		student.study();
	}

}

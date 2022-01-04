package com.springcore.javaconfig28;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
// @ComponentScan(basePackages = "com.springcore.javaconfig28")
public class JavaConfig {
	
	@Bean
	public Samosa getSamosa() {
		return new Samosa();
	}
	
	@Bean(name = {"student","temp","con"})
	public Student  getStudent() {
		
		// Creating a new Student Object  
		Student student = new Student(getSamosa());
		return student;
	}
	

}

package com.spring.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.model.Student;

public class StudentApp {
	
	public static void main(String[] args) {
		
		
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationcontext.xml");	
		
	Student student = applicationContext.getBean("student", Student.class);
	
	System.out.println(student.getStudentDetails());
	
	
		
	}

}

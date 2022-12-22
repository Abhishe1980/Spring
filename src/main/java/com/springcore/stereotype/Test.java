package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	ApplicationContext con= new ClassPathXmlApplicationContext("com/springcore/stereotype/stereoconfig.xml");
	
	  Student student=con.getBean("student",Student.class);
	  
		/*
		 * System.out.println(student); System.out.println(student.getAddress());
		 * System.out.println(student.getAddress().getClass().getName());
		 */
	  System.out.println(student.hashCode());
	  System.out.println("Abhishek");
	  System.out.println("Yogesh");
	  System.out.println("Kishan");
	  System.out.println("Ramesh");
	  
	}

}

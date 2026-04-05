package com.training.si;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
	public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("com/training/si/Config.xml");
	Student s1 = (Student) context.getBean("Student1");
	System.out.println(s1);

	}

}

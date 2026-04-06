package com.training.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/training/autowire/Config.xml");
		
		Emp emp = (Emp) context.getBean("emp");
		System.out.println(emp);

		
		
	}
}
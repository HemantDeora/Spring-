package com.training.lcXml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
	public static void main(String[] args) {
	AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/training/lcInterface/config.xml");
	Samosa s = (Samosa) context.getBean("samosa");
	
	System.out.println(s);
	context.registerShutdownHook();
	

	}

}

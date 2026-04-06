package com.training.lcInterface;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.si.Student;


public class App {
	public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("com/training/si/Config.xml");
	Samosa samosa = (Samosa) context.getBean("samosa");
	System.out.println(samosa);

	}

}

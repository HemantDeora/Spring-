package com.training.lcXml;
import org.springframework.beans.BeansException;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
	public static void main(String[] args) {
	try (AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/training/lcInterface/config.xml")) {
		Samosa s = (Samosa) context.getBean("samosa");
		
		System.out.println(s);
		context.registerShutdownHook();
	} catch (BeansException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	

	}

}

package com.training.component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/training/component/config.xml");
    	
//    	694452085 = Singleton 
    	Student s1 = (Student)  context.getBean("ob");
    	System.out.println(s1);
    	
    
    	
    	
    }
}

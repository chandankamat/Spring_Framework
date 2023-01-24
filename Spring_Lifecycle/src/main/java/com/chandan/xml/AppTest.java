package com.chandan.xml;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {
	
public static void main(String[] args) {
	
	AbstractApplicationContext context = new 
			ClassPathXmlApplicationContext("com/chandan/xml/SpringConfig.xml");
     
	context.registerShutdownHook();
	Student st=context.getBean("st1",Student.class);
	System.out.println(st);
}

}

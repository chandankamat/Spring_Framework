package com.chandan.collection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new 
				ClassPathXmlApplicationContext("com/chandan/collection/Config.xml");
		
		
		
	Student st1=	context.getBean("st4",Student.class);
	
	System.out.println(st1);
	
	}

}

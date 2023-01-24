package com.chandan.primitive;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new 
				ClassPathXmlApplicationContext("com/chandan/primitive/Config.xml");
	  
		Student st=context.getBean("st1",Student.class);
		Student stu=context.getBean("st2",Student.class);

		
		System.out.println(st);
		System.out.println(stu);
		
		
		
	}

}

package com.chandan.ci;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext cn= new
				ClassPathXmlApplicationContext("com/chandan/ci/Spring_Config.xml");
		Student stu=cn.getBean("st",Student.class);
		System.out.println(stu);

	}

}

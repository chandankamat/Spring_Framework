package com.chandan.ref;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext cn= new
				ClassPathXmlApplicationContext("com/chandan/ref/Spring_Config.xml");
		
	Student st=	cn.getBean("st",Student.class);
		
	
	System.out.println(st.getName());
	System.out.println(st.getAddress().getCity());
	}

}

package com.chandan;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

     ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/chandan/Config.xml");
      System.out.println(context);
  
      Ram r1=context.getBean("person",Ram.class);
      r1.eat();
      r1.sleep();
      
     Shyam sh=context.getBean("person1",Shyam.class);
     sh.eat();
     sh.sleep();
    }
}

package com.ved.springIOC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
   public static void main(String[] args) {
	
//	Sim a=new Airtel();
//	a.calling();
//	a.data();
	   
	// APPLYING SPRING CONCEPT SO THAT SPRING CAN CREATE AND MANAGE OBJECTS
	   
	   ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	   Sim s=context.getBean("sim", Sim.class);
	   s.calling();
	   s.data();
	   
}
}

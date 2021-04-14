package com.ved.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	public static void main(String[] args) {
		
		//Student studentObj =new Student();
		//studentObj.setStudentName("Ved");
		
		ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
		Student s = context.getBean("sObj",Student.class);
		
		s.displayStudentInfo();
		 
	}
}

package com.ved.diObjType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {

//		Student s = new Student();
//		MathCheat m = new MathCheat();
//		s.setObjMathCheat(m);
//		s.studentCheatmethod();
// Applying Spring Concept
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		Student st = context.getBean("std", Student.class);

		st.studentCheatmethod();
	}

}
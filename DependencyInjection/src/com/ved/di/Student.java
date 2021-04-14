package com.ved.di;

public class Student {

	private String studentName;
	private String studentSchoolName;
	
	
	// BELOW ARE USED AS SETTER INJECTION
	public void setStudentSchoolName(String studentSchoolName) {
		this.studentSchoolName = studentSchoolName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	// BELOW ARE USED AS CONSTRUCTION INJECTION
	
//	public Student(String studentName, String studentSchoolName) {
//		super();
//		this.studentName = studentName;
//		this.studentSchoolName = studentSchoolName;
//	}

	public void displayStudentInfo()
	{
		System.out.println(" Student name is: "+ studentName +" and school name is : "+ studentSchoolName);
	}
	
}

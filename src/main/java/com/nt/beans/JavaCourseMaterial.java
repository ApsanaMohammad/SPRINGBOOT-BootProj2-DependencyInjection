package com.nt.beans;

import org.springframework.stereotype.Component;

@Component("java")
public class JavaCourseMaterial implements ICourseMaterial {
	
	

	public JavaCourseMaterial() {
		System.out.println("java course material");
	}

	public String courseContent() {
		return "1.Introduction to Programming Concepts,2.Object-Oriented Programming (OOP),3.Java Standard Library (java.lang, java.util, etc.)";
	}

	public double price() {
		
		return 400;
	}

}

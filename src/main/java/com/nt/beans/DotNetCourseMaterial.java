package com.nt.beans;

import org.springframework.stereotype.Component;

@Component("dotnet")
public class DotNetCourseMaterial implements ICourseMaterial {
	
	

	public DotNetCourseMaterial() {
		System.out.println("dotnet course material");
	}

	public String courseContent() {
		return "######1.Introduction to Programming Concepts,2.Object-Oriented Programming (OOP),3.Java Standard Library (java.lang, java.util, etc.)";

	}

	public double price() {
		
		return 400;
	}

}

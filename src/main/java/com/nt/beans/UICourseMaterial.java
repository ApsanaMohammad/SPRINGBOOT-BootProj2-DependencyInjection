package com.nt.beans;

import org.springframework.stereotype.Component;

@Component("ui")
public class UICourseMaterial implements ICourseMaterial {
	
	

	public UICourseMaterial() {
		System.out.println("UI course material");
	}

	public String courseContent() {
		return "html,css,javascript";
	}

	public double price() {
		
		return 300;
	}

}

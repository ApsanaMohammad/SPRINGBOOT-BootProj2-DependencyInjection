package com.nt.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("stud")
public class Student {
	
	@Autowired
	@Qualifier("courseid")
    private ICourseMaterial material;
	
	public void preparation(String examName) {
		System.out.println("preparation started for "+examName);
		String cc=material.courseContent();
		double p=material.price();
		System.out.println("preparation going on using "+cc+"and its price is "+p);
		System.out.println("preparation is completed for exam");
	}
}

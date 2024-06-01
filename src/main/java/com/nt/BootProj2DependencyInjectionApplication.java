package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.nt.beans.Student;

@SpringBootApplication
@ImportResource("com/nt/cfgs/applicationContext.xml")
public class BootProj2DependencyInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext ctx =SpringApplication.run(BootProj2DependencyInjectionApplication.class, args);
		Student s=ctx.getBean("stud",Student.class);
		s.preparation("CTS-interview");
		((ConfigurableApplicationContext) ctx).close();
		
	}

}

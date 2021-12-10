package com.springcourse.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		
		// Load the Spring configuration file
		ClassPathXmlApplicationContext context =
			new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Retrieve bean from Spring container
		Coach theCoach = context.getBean("theTennisCoach", Coach.class);
		Coach alphaCoach = context.getBean("theTennisCoach", Coach.class);
		
		// Check if the objects are the same
		System.out.println("Pointing to the same object: " + (theCoach == alphaCoach));
		
		// Print the memory locations
		System.out.println("Memory location for theCoach: " + theCoach);
		System.out.println("Memory location for alphaCoach: " + alphaCoach);
		
		// Close the context
		context.close();
	}
}

package com.springcourse.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LiteralValueInjectionDemoApp {

	public static void main(String[] args) {
		// Load the Spring configuration file
		ClassPathXmlApplicationContext context =
			new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Retrieve bean from Spring container
		CricketCoach theCoach = context.getBean("cricketCoach", CricketCoach.class);
		
		// Call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getEmailAddress());
		System.out.println(theCoach.getTeam());
		
		// Close the context
		context.close();

	}

}

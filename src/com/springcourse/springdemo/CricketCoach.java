package com.springcourse.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
	
	// Injecting literal values using Java Annotations
	@Value("${foo.emailAddress}")
	private String emailAddress;
	
	@Value("${foo.team}")
	private String team;
	
	// Default constructor
	public CricketCoach() {
		System.out.println("CricketCoach: inside default constructor");
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes.";
	}

	@Override
	public String getDailyFortune() {
		return null;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeam() {
		return team;
	}
}

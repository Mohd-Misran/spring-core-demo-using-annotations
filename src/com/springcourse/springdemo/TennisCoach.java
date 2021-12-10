package com.springcourse.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// INVERSION OF CONTROL using Java Annotations

// Note:
// If you don't explicitly specify the bean ID
// to the Component Annotation, Spring supports
// default bean IDs.
// In this case, the class TennisCoach will have
// bean ID tennisCoach.

// Spring will automatically register this bean
@Component("theTennisCoach")
@Scope("singleton") // Explicitly specify bean scope using Annotations
public class TennisCoach implements Coach {
	
	// Field Injection using Autowiring
	@Autowired
	@Qualifier("randomFortuneService") // Qualifier to specify which dependency to inject
	private FortuneService fortuneService;
	
	// Default constructor
	public TennisCoach() {
		System.out.println("TennisCoach: inside default constructor");
	}
	
	/* 
	// Constructor Injection using Autowiring
	@Autowired
	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	*/
	
	/*
	// Setter Injection using Autowiring
	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("TennisCoach: inside setFortuneService()");
		this.fortuneService = fortuneService;
	}
	*/
	
	/*
	// Method Injection using Autowiring
	@Autowired
	public void doSomeCrazyStuff(FortuneService fortuneService) {
		System.out.println("TennisCoach: inside doSomeCrazyStuff()");
		this.fortuneService = fortuneService;
	}
	*/

	@Override
	public String getDailyWorkout() {
		return "Practice running the lines for 15 minutes.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	// Bean Lifecycle methods using Annotations
	// NOTE: @PostConstruct and @PreDestroy have been
	// deprecated in Java 9 or higher
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println("TennisCoach: inside doMyStartupStuff()");
	}
	
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println("TennisCoach: inside doMyCleanupStuff()");
	}
	
}

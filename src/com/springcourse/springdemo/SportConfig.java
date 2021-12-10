package com.springcourse.springdemo;

import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
//@ComponentScan("com.springcourse.springdemo")
//@PropertySource("classpath:sport.properties")
@PropertySources({
	@PropertySource("classpath:mylogger.properties"),
	@PropertySource("classpath:sport.properties")
})
public class SportConfig {
	
	// Define methods to expose beans (if component scan is disabled)
	
	// Bean for our sad fortune service
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	
	// Bean for our swim coach and inject dependency
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}
	
	
	// Explicitly define bean for logger configuration
	@Bean
	public JavaConfigLogger javaLoggerConfig() {
		return new JavaConfigLogger();
	}
	

}

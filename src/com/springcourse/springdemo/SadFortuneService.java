package com.springcourse.springdemo;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is a very unlucky day!!";
	}

}

package com.sood.vaibhav;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringApp {

	public static void main(String[] args) {
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
	
	Coach c = context.getBean("myCoach",Coach.class);
	System.out.println(c.getDailyWorkout());
	System.out.println(c.getTheFt().getDailyFortune());
	context.close();
	}

}

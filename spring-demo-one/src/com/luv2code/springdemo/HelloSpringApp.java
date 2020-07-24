package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach myCoach1 = context.getBean("myCoach1", Coach.class);
		System.out.println(myCoach1.getDailyWorkout());
		System.out.println(myCoach1.getDailyFortune());
		SwimmingCoach myCoach2 = context.getBean("myCoach2", SwimmingCoach.class);
		System.out.println(myCoach2.getDailyWorkout());
		System.out.println(myCoach2.getDailyFortune());
		System.out.println(myCoach2.getEmailAddress());
		System.out.println(myCoach2.getTeam());
		context.close();
	}

}

package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
		Coach myCoach = context.getBean("myCoach", Coach.class);
		Coach yourCoach = context.getBean("myCoach", Coach.class);
		System.out.println(myCoach == yourCoach);
		context.close();
	}

}

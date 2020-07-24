package com.luv2code.springdemo;

import java.util.ArrayList;
import java.util.Random;

public class RandomFortuneService implements FortuneService {
	
	ArrayList<String> fortunes = new ArrayList<>(); 

	public RandomFortuneService() {
		fortunes.add("Bad luck");
		fortunes.add("Just normal day");
		fortunes.add("Crazy luck");
	}

	@Override
	public String getFortune() {
		Random rand = new Random();
		return fortunes.get(rand.nextInt(3));
	}

}

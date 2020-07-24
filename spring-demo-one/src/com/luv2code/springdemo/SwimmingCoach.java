package com.luv2code.springdemo;

public class SwimmingCoach implements Coach {

	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	
	public SwimmingCoach() {
		System.out.println("No args constructor");
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Warm 10mins before getting into the pool";
	}

	@Override
	public String getDailyFortune() {
		return "Just do it, " + fortuneService.getFortune();
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}
	
}

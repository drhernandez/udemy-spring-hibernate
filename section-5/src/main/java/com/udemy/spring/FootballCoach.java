package com.udemy.spring;

public class FootballCoach implements Coach {

    private FortuneService fortuneService;

    public FootballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Throw 100 penalties";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}

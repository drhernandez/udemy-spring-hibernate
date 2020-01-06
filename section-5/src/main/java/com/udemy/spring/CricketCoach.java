package com.udemy.spring;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Do something of cricket";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}

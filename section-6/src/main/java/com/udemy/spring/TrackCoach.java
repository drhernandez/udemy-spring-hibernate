package com.udemy.spring;

public class  TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    private void onInit() {
        System.out.println("TrackCoach: inside method onInit()");
    }

    private void onDestroy() {
        System.out.println("TrackCoach: inside method onDestroy()");
    }
}

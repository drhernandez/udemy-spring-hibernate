package com.udemy.spring;

public class FootballCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Throw 100 penalties";
    }
}

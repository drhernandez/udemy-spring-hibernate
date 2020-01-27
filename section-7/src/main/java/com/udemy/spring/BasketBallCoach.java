package com.udemy.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BasketBallCoach implements Coach {

    FortuneService fortuneService;

    @Autowired
    public void init(@Qualifier("unHappyFortuneService") FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your jumps";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}

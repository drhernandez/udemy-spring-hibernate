package com.udemy.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {

    @Value("${name}")
    private String name;

    @Value("${lastname}")
    private String lastname;

    @Autowired @Qualifier("myRandomConfiguration")
    private String randomConfig;

    @Autowired @Qualifier("happyFortuneService")
    private FortuneService fortuneService;

    @Override
    public String getDailyWorkout() {
        return "Pratice your free kicks " + name + " " + lastname;
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune() + ". Random config: " + randomConfig;
    }
}

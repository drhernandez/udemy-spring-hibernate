package com.udemy.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("prototype") // it will create a new instance every time
public class TennisCoach implements Coach {

    FortuneService fortuneService;

    @Autowired
    public TennisCoach(@Qualifier("unHappyFortuneService") FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @PostConstruct
    private void doSomethingOnStart() {
        System.out.println("Starting bean..");
    }

    @Override
    public String getDailyWorkout() {
        return "Practices your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    @PreDestroy
    private void doSomethingAtTheEnd() {
        System.out.println("Destroying bean..");
    }
}

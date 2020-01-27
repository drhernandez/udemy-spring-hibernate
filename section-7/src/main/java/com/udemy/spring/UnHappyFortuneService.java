package com.udemy.spring;

import org.springframework.stereotype.Component;

@Component
public class UnHappyFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Today is NOT your lucky day! :(";
    }
}

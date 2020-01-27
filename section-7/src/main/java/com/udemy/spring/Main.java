package com.udemy.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        Coach theTennisCoach = context.getBean("tennisCoach", Coach.class);
        Coach theFootballCoach = context.getBean("footballCoach", Coach.class);

        System.out.println(theTennisCoach.getDailyWorkout());
        System.out.println(theTennisCoach.getDailyFortune());

        System.out.println("------------------------------------");

        System.out.println(theFootballCoach.getDailyWorkout());
        System.out.println(theFootballCoach.getDailyFortune());

        context.close();
    }
}

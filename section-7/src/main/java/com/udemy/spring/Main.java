package com.udemy.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach theTennisCoach = context.getBean("tennisCoach", Coach.class);
        Coach theFootballCoach = context.getBean("footballCoach", Coach.class);
        Coach theBasketBallCoach = context.getBean("basketBallCoach", Coach.class);

        System.out.println(theTennisCoach.getDailyWorkout());
        System.out.println(theTennisCoach.getDailyFortune());

        System.out.println("------------------------------------");

        System.out.println(theFootballCoach.getDailyWorkout());
        System.out.println(theFootballCoach.getDailyFortune());

        System.out.println("------------------------------------");

        System.out.println(theBasketBallCoach.getDailyWorkout());
        System.out.println(theBasketBallCoach.getDailyFortune());

        context.close();
    }
}

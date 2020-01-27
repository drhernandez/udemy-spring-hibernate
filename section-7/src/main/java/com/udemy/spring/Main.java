package com.udemy.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach theTennisCoach = context.getBean("tennisCoach", Coach.class);
        Coach theSecondTennisCoach = context.getBean("tennisCoach", Coach.class);

        System.out.println(theTennisCoach.getDailyWorkout());
        System.out.println(theTennisCoach.getDailyFortune());
        System.out.println(theTennisCoach.toString());

        System.out.println("------------------------------------");

        System.out.println(theSecondTennisCoach.getDailyWorkout());
        System.out.println(theSecondTennisCoach.getDailyFortune());
        System.out.println(theSecondTennisCoach.toString());

        context.close();
    }
}

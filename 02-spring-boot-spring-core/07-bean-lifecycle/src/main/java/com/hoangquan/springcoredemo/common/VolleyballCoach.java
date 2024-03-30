package com.hoangquan.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class VolleyballCoach implements Coach{
    public VolleyballCoach() {
        System.out.println("In constructor: " + getClass().getName());
    }
    @Override
    public String getDailyWorkout() {
        return "Practice backhand volley for 30 minutes!";
    }

    // define init method
    @PostConstruct
    public void doMyInitializeStuff() {
        System.out.println("In initialization of bean: " + getClass().getName());
    }

    // define destroy method
    @PreDestroy
    public void doMyCleanupStuff() {
        System.out.println("In destruction of bean: " + getClass().getName());
    }
}

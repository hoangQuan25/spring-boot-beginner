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

}

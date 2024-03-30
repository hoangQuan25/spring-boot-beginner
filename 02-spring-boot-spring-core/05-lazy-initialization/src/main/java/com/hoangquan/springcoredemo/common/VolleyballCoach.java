package com.hoangquan.springcoredemo.common;

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

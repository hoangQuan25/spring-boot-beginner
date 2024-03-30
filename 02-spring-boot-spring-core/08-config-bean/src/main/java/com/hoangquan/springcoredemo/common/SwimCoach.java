package com.hoangquan.springcoredemo.common;

public class SwimCoach implements Coach{
    public SwimCoach() {
        System.out.println("In constructor: " + getClass().getName());
    }
    @Override
    public String getDailyWorkout() {
        return "Practice butterfly swim for 30 minutes";
    }
}

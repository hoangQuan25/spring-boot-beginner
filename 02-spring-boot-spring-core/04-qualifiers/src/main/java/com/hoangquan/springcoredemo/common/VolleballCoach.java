package com.hoangquan.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class VolleballCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Practice backhand volley for 30 minutes!";
    }
}

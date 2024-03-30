package com.hoangquan.springcoredemo;

import org.springframework.stereotype.Component;

@Component
public class SoccerCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Practice shooting for 15 minutes!!!";
    }
}

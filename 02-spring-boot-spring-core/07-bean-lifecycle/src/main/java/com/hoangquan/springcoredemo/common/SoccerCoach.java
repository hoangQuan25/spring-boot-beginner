package com.hoangquan.springcoredemo.common;

import com.hoangquan.springcoredemo.common.Coach;
import org.springframework.stereotype.Component;

@Component
public class SoccerCoach implements Coach {
    public SoccerCoach() {
        System.out.println("In constructor: " + getClass().getName());
    }
    @Override
    public String getDailyWorkout() {
        return "Practice shooting for 15 minutes!";
    }
}

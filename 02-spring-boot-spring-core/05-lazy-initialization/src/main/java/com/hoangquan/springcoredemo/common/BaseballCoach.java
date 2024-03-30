package com.hoangquan.springcoredemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach{
    public BaseballCoach() {
        System.out.println("In constructor: " + getClass().getName());
    }
    @Override
    public String getDailyWorkout() {
        return "Play baseballs for 30 minutes";
    }
}

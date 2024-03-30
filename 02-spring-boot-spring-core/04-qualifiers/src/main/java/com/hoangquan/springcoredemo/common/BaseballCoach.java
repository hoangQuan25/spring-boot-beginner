package com.hoangquan.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Play baseballs for 30 minutes";
    }
}

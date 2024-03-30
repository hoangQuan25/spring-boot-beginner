package com.hoangquan.springcoredemo.rest;

import com.hoangquan.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Coach myCoach;

    // constructor injection - recommended by spring.io dev team
    /*
    @Autowired
    public DemoController(Coach theCoach) {
        myCoach = theCoach;
    }
     */

    // setter injection
    @Autowired
    public void setCoach(Coach theCoach) {
        myCoach = theCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}

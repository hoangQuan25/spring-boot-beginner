package com.hoangquan.springcoredemo.rest;

import com.hoangquan.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Coach myCoach;
    private Coach anotherCoach;

    // constructor injection - recommended by spring.io dev team
    @Autowired
    public DemoController(
            @Qualifier("volleyballCoach") Coach theCoach,
            @Qualifier("volleyballCoach") Coach theAnotherCoach
    ) { // first character lowercase
        System.out.println("In constructor: " + getClass().getName());
        myCoach = theCoach;
        anotherCoach = theAnotherCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/check")
    public String check() {
        return "Checking: myCoach == anotherCoach: " + (myCoach == anotherCoach);
    }
}

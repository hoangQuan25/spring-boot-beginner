package com.hoangquan.springboot.demo.demoapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // inject my properties here
    @Value("${coach.name}")
    private String coachName;

    @Value("${coach.name}")
    private String teamName;

    // expose endpoint for "teaminfo"
    @GetMapping("/teaminfo")
    public String getTeamInfo() {
        return "Coach: " + coachName + ", Team name: " + teamName;
    }

    @GetMapping("/") // function handling the GET method
    public String sayHello() {
        return "Hello world!";
    }

    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Run a hard workout";
    }
}

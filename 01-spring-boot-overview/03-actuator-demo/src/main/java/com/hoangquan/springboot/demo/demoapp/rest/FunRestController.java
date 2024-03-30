package com.hoangquan.springboot.demo.demoapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @GetMapping("/") // function handling the GET method
    public String sayHello() {
        return "Hello world!";
    }

    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Run a hard workout";
    }
}

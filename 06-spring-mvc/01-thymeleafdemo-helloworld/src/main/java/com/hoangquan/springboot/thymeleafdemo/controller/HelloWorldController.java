package com.hoangquan.springboot.thymeleafdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
    // controller method to show form
    @RequestMapping("/showForm")
    public String showForm() {
        return "helloworld-form";
    }

    // controller to process form
    @RequestMapping("/processForm")
    public String processForm() {
        return "helloworld";
    }
}

package com.hoangquan.springboot.thymeleafdemo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
    // controller method to show form
    @GetMapping("/showForm")
    public String showForm() {
        return "helloworld-form";
    }

    // controller to process form
    @PostMapping("/processForm")
    public String processForm(@RequestParam("studentName") String theName, Model model) {
        theName = theName.toUpperCase();
        String result = "Hii! " + theName;
        model.addAttribute("message", result);

        return "helloworld";
    }
}

package com.hoangquan.springboot.thymeleafdemo.controller;


import com.hoangquan.springboot.thymeleafdemo.model.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class StudentController {
    @Value("${countries}")
    private List<String> countries;

    @Value("${languages}")
    private List<String> languages;

    @Value("${os}")
    private List<String> os;

    @GetMapping("/showStudentForm")
    public String showForm(Model theModel) {
        //create student object
        Student theStudent = new Student();
        // add student object to the model
        theModel.addAttribute("student", theStudent);
        // add list of countries to form
        theModel.addAttribute("countries", countries);
        // add list of languages to form
        theModel.addAttribute("languages", languages);
        // add list of operating systems
        theModel.addAttribute("os", os);

        return "student-form";
    }

    @PostMapping("/processStudentForm")
    public String processForm(@ModelAttribute("student") Student theStudent) {
        // log output data
        System.out.println("The student: " + theStudent.getFirstName() + " " + theStudent.getLastName());
        return "student-confirmation";
    }
}

package com.hoangquan.springboot.crud.controller;

import com.hoangquan.springboot.crud.entity.Employee;
import com.hoangquan.springboot.crud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    public EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService theEmployeeService) {
        employeeService = theEmployeeService;
    }

    // add mapping for '/list'
    @GetMapping("/list")
    public String listEmployee(Model theModel) {
        // get the data from db
        List<Employee> theEmployees = employeeService.findAll();

        // add to model
        theModel.addAttribute("employees", theEmployees);

        return "list-employees";
    }
}

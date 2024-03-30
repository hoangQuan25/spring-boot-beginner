package com.hoangquan.springboot.crud.rest;

import com.hoangquan.springboot.crud.entity.Employee;
import com.hoangquan.springboot.crud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeRestController(EmployeeService theEmployeeService) {
        employeeService = theEmployeeService;
    }

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee theEmployee) {
        return employeeService.save(theEmployee);
    }

    @PutMapping("/employees/{employeeId}")
    public Employee updateEmployee(@PathVariable int employeeId, @RequestBody Employee updatedEmployee) {
        return employeeService.updateEmployee(employeeId, updatedEmployee);
    }
}

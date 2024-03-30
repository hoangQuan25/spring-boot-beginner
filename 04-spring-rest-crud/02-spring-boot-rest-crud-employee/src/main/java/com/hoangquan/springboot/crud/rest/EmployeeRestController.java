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

    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        return employeeService.findAll();
    }

    @GetMapping("/employees/{employeeId}")
    public Employee getEmployee(@PathVariable int employeeId) {
        return employeeService.findById(employeeId);
    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee theEmployee) {
        return employeeService.save(theEmployee);
    }

    @DeleteMapping("/employees/{employeeId}")
    public String deleteEmployee(@PathVariable int employeeId) {
        Employee tempEmployee = employeeService.findById(employeeId);

        if (tempEmployee == null) {
            throw new RuntimeException("Employee is not found - " + employeeId);
        }

        employeeService.deleteById(employeeId);
        return "Deleted employee with id " + employeeId;
    }
}

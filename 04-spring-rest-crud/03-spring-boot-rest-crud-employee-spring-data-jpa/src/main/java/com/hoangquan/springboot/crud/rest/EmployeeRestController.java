package com.hoangquan.springboot.crud.rest;

import com.hoangquan.springboot.crud.entity.Employee;
import com.hoangquan.springboot.crud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
    public Optional<Employee> getEmployee(@PathVariable int employeeId) {
        return employeeService.findById(employeeId);
    }

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee theEmployee) {
        return employeeService.save(theEmployee);
    }

    @PutMapping("/employees/{employeeId}")
    public Employee updateEmployee(@RequestBody Employee theEmployee, @PathVariable int employeeId) {
        return  employeeService.update(theEmployee, employeeId);
    }

    @DeleteMapping("/employees/{employeeId}")
    public String deleteEmployee(@PathVariable int employeeId) {
        Optional<Employee> tempEmployee = employeeService.findById(employeeId);

        if (tempEmployee.isEmpty()) {
            throw new RuntimeException("Employee is not found - " + employeeId);
        }

        employeeService.deleteById(employeeId);
        return "Deleted employee with id " + employeeId;
    }

    @DeleteMapping("/employees")
    public String deleteAllEmployees() {
        employeeService.deleteAll();
        return "Deleted all employees";
    }
}

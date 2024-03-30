package com.hoangquan.springboot.crud.service;

import com.hoangquan.springboot.crud.dao.EmployeeRepository;
import com.hoangquan.springboot.crud.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository theEmployeeRepository) {

        employeeRepository = theEmployeeRepository;
    }


    @Override
    public Employee updateEmployee(int employeeId, Employee updatedEmployee) {
        // Retrieve the employee by ID
        Optional<Employee> optionalEmployee = employeeRepository.findById(employeeId);

        // Check if the employee exists
        if (optionalEmployee.isEmpty()) {
            throw new RuntimeException("Employee not found with id: " + employeeId);
        }

        // Get the existing employee from Optional
        Employee existingEmployee = optionalEmployee.get();

        // Update the employee information
        existingEmployee.setFirstName(updatedEmployee.getFirstName());
        existingEmployee.setLastName(updatedEmployee.getLastName());
        existingEmployee.setEmail(updatedEmployee.getEmail());
        // You can update other fields as needed

        // Save the updated employee
        return employeeRepository.save(existingEmployee);
    }

    @Override
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }
}
